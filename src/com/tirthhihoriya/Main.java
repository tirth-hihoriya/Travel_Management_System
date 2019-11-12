package com.tirthhihoriya;
import com.filters.*;
import com.trip_package.*;
import com.trip_package.Package;


import java.io.*;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) throws IOException {
        Scanner sca = new Scanner(System.in);

        Login u = new Login();
        display_title();
        int a;
        do{
        System.out.println("\n➤ Enter 1 to LOGIN   for existing user");
        System.out.println("         2 to REGISTER   for new user");
        a = sca.nextInt();
    
        if (a == 2) {
            u.register(u);
            Holiday h1 = new Holiday();
            h1.menu();
            System.out.println(h1.getDestinations());
            System.out.println("\n\n\n\t\t\t\t\t ---------------------------------------------------------");
            System.out.println("\t\t\t\t\t |  ++++++++++++++++++  SET FILTERS  ++++++++++++++++++  |");
            System.out.println("\t\t\t\t\t ---------------------------------------------------------");
            budget_filter bf = new budget_filter();
            bf.setBudget();

            night_filter nf = new night_filter();
            nf.setNights();

            Select_package sp = new Select_package();
            Package pack = sp.selection(h1.getDestinations(), bf.getBudget(), nf.getNights());
            System.out.println();
            System.out.println();
            System.out.println();

            int c;
            do {
                menu();

                System.out.print("Enter your choice : ");
                c = sca.nextInt();
                switch (c) {
                    case 1:
                        h1 = new Holiday();
                        h1.menu();
                        System.out.println(h1.getDestinations());
                        pack = sp.selection(h1.getDestinations(), bf.getBudget(), nf.getNights());

                        break;
                    case 2:

                        bf.setBudget();
                        pack = sp.selection(h1.getDestinations(), bf.getBudget(), nf.getNights());
                        break;

                    case 3:

                        nf.setNights();
                        pack = sp.selection(h1.getDestinations(), bf.getBudget(), nf.getNights());
                        break;


                    case 4:

                        pack = sp.selection(h1.getDestinations(), bf.getBudget(), nf.getNights());
                        break;

                    case 5:
                        Select_Flight sf = new Select_Flight();
                        sf.select_flights(h1.getDestinations(), pack);

                        break;

                    case 6:
                        select_activity sa = new select_activity();
                        sa.select_activities(h1.getDestinations(), pack);
                        break;

                    case 7:
                        System.out.println("\n\n\n\n\t\t\t\t\t\t$$$$$$$$$$$$$$$$$$$$$$      Total Price   -per person      $$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println();
                        System.out.println("\t\t\t\t\t\t\t\tBase price                = ₹" + pack.getBase_price());
                        System.out.println("\t\t\t\t\t\t\t\tActivities price          = ₹" + pack.getT_a_price());
                        System.out.println("\t\t\t\t\t\t\t\tAdditional price(flight)  = ₹" + pack.getA_f_price());
                        System.out.println();
                        System.out.println("\t\t\t\t\t\t_____________________________________________________________________");
                        System.out.println("\t\t\t\t\t\t\t\tFinal price               = ₹" + (pack.getBase_price() + pack.getT_a_price() + pack.getA_f_price()));
                        System.out.println("\t\t\t\t\t\t_____________________________________________________________________");
                        break;

                    case 8:
                        System.out.print("\n\n\t\t\t\t\t\tEnter number of members \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66 : ");
                        int m = sca.nextInt();


                        System.out.println("\n\n\t\t\t\t\t\t_________________________________________________________________________");
                        System.out.println("\t\t\t\t\t\t\t\tFinal price =  ₹" + ((pack.getBase_price() + pack.getT_a_price()) + pack.getA_f_price()) * m);
                        System.out.println("\t\t\t\t\t\t__________________________________________________Thank you for visiting_____\n\n");
                        c = 0;

                        try {
                            FileOutputStream fo = new FileOutputStream("./" + u.uid + "/package.txt");
                            ObjectOutputStream out = new ObjectOutputStream(fo);
                            out.writeObject(pack);
                            out.close();
                            fo.close();

                            write_file(u,"destination",h1.getDestinations());

                        }
                        catch (Exception e)
                        {
                            e.printStackTrace();
                        }
                        break;

                    default:
                        System.out.print("\nEnter valid input...!!!");


                }

            } while (c != 0);

        } else if (a == 1) {
            boolean flag;
            do {
                flag = u.login(u);
                if(!flag) {
                    System.out.println("________________________________________________________________________________________\n\n");
                    System.out.println("Enter valid user name or password ...!!!");
                }
            }while(!flag);


                Holiday h1 = new Holiday();
                budget_filter bf = new budget_filter();
                night_filter nf = new night_filter();
                Select_package sp = new Select_package();
                Package pack = null;
                try {
                    FileInputStream fi = new FileInputStream("./" + u.uid + "/package.txt");
                    ObjectInputStream in = new ObjectInputStream(fi);
                    pack = (Package) in.readObject();
                    in.close();
                    fi.close();

                    h1.setDestinations(read_file(u,"destination"));

                } catch (Exception e) {
                    System.out.println("___________exception____________");
                }

                System.out.println();
                System.out.println();
                System.out.println();

                int c;
                do {
                    menu();

                    System.out.print("Enter your choice : ");
                    c = sca.nextInt();
                    switch (c) {
                        case 1:
                            h1 = new Holiday();
                            h1.menu();
                            System.out.println(h1.getDestinations());
                            bf.setBudget();
                            nf.setNights();
                            pack = sp.selection(h1.getDestinations(), bf.getBudget(), nf.getNights());

                            break;
                        case 2:

                            bf.setBudget();
                            pack = sp.selection(h1.getDestinations(), bf.getBudget(), nf.getNights());
                            break;

                        case 3:

                            nf.setNights();
                            pack = sp.selection(h1.getDestinations(), bf.getBudget(), nf.getNights());
                            break;


                        case 4:

                            pack = sp.selection(h1.getDestinations(), bf.getBudget(), nf.getNights());
                            break;

                        case 5:
                            Select_Flight sf = new Select_Flight();
                            sf.select_flights(h1.getDestinations(), pack);

                            break;

                        case 6:
                            select_activity sa = new select_activity();
                            if (pack == null) throw new AssertionError();
                            sa.select_activities(h1.getDestinations(), pack);
                            break;

                        case 7:
                            try {
                                System.out.println("\n\n\n\n\t\t\t\t\t\t$$$$$$$$$$$$$$$$$$$$$$      Total Price   -per person      $$$$$$$$$$$$$$$$$$$$$$");
                                System.out.println();
                                if (pack == null) throw new AssertionError();
                                System.out.println("\t\t\t\t\t\t\t\tBase price                = ₹" + pack.getBase_price());
                                System.out.println("\t\t\t\t\t\t\t\tActivities price          = ₹" + pack.getT_a_price());
                                System.out.println("\t\t\t\t\t\t\t\tAdditional price(flight)  = ₹" + pack.getA_f_price());
                                System.out.println();
                                System.out.println("\t\t\t\t\t\t_____________________________________________________________________");
                                System.out.println("\t\t\t\t\t\t\t\tFinal price               = ₹" + (pack.getBase_price() + pack.getT_a_price() + pack.getA_f_price()));
                                System.out.println("\t\t\t\t\t\t_____________________________________________________________________");
                            }
                            catch(Exception e)
                            {
                                System.out.println("_______exception_______");
                            }
                            break;

                        case 8:
                            System.out.print("\n\n\t\t\t\t\t\tEnter number of members \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66 : ");
                            int m = sca.nextInt();


                            System.out.println("\n\n\t\t\t\t\t\t_________________________________________________________________________");
                            assert pack != null;
                            System.out.println("\t\t\t\t\t\t\t\tFinal price =  ₹" + ((pack.getBase_price() + pack.getT_a_price()) + pack.getA_f_price()) * m);
                            System.out.println("\t\t\t\t\t\t__________________________________________________Thank you for visiting_____\n\n");
                            c = 0;
                            break;

                        case 0:
                            c=0;

                        default:
                            System.out.print("\nEnter valid input...!!!");


                    }

                } while (c != 0);

        }
            else System.out.println("Enter valid inut...!!!");
    }while(a!=1 && a!=2);
}




    private static void display_title()
    {
        System.out.println("\n\n________________________________________________   \uD83E\uDD29 Your Destinations is Waiting for you \uD83E\uDD29   ______________________________________________\n");
        System.out.println("__          __ ______  _        _____   ____   __  __  ______   _______  ____    _______  _____   _____  _____   __          __           _      _   ™");
        System.out.println("\\ \\        / /|  ____|| |      / ____| / __ \\ |  \\/  ||  ____| |__   __|/ __ \\  |__   __||  __ \\ |_   _||  __ \\  \\ \\        / /          | |    | |");
        System.out.println(" \\ \\  /\\  / / | |__   | |     | |     | |  | || \\  / || |__       | |  | |  | |    | |   | |__) |  | |  | |__) |  \\ \\  /\\  / /___   _ __ | |  __| |" + " ");
        System.out.println("  \\ \\/  \\/ /  |  __|  | |     | |     | |  | || |\\/| ||  __|      | |  | |  | |    | |   |  _  /   | |  |  ___/    \\ \\/  \\/ // _ \\ | '__|| | / _` |");
        System.out.println("   \\  /\\  /   | |____ | |____ | |____ | |__| || |  | || |____     | |  | |__| |    | |   | | \\ \\  _| |_ | |         \\  /\\  /| (_) || |   | || (_| |");
        System.out.println("    \\/  \\/    |______||______| \\_____| \\____/ |_|  |_||______|    |_|   \\____/     |_|   |_|  \\_\\|_____||_|          \\/  \\/  \\___/ |_|   |_| \\__,_|");

    }

    private static void menu()
    {
        System.out.print("\n\n\n____________________________________________");
        System.out.println("\n➤ Enter 1 to change Destinations");
        System.out.println("         2 to change BUDGET_filter ₹");
        System.out.println("         3 to change NIGHTs_filter");
        System.out.println("         4 to change trip Package");
        System.out.println("         5 to change flight  ✈");
        System.out.println("         6 to add/remove Activities  ");
        System.out.println("         7 to see total price");
        System.out.println("         8 to confirm booking");

        System.out.println("         0 to Exit");
        System.out.println("-------------------------------------------");
    }

    private static void write_file(Login u, String s, String w) throws IOException
    {
        File f= new File("./"+u.uid+"/"+s+".txt");
        boolean newFile = f.createNewFile();

        BufferedWriter bf =new BufferedWriter (new FileWriter(f));
        bf.write(w);
        bf.close();
    }

    private static String read_file(Login u, String s) throws IOException
    {

        BufferedReader br = new BufferedReader(new FileReader("./"+u.uid+"/"+s+".txt"));
        String read = br.readLine();
        br.close();
        return read;
    }

}
