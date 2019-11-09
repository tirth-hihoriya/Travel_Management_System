package com.tirthhihoriya;
import com.filters.*;
import com.trip_package.*;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        display_title();


        Holiday h1 = new Holiday();
        Destinations d = h1.menu();
        System.out.println(h1.getDestinations());
        System.out.println("\n ---------------------------------------------------------");
        System.out.println(" |  ++++++++++++++++++  SET FILTERS  ++++++++++++++++++  |");
        System.out.println(" ---------------------------------------------------------");
        budget_filter bf = new budget_filter();
        bf.setBudget();

        night_filter nf = new night_filter();
        nf.setNights();

        Select_package sp = new Select_package();
        Package pack = sp.selection(h1.getDestinations(),bf.getBudget(),nf.getNights());
        System.out.println();
        System.out.println("\n" + pack.getDescribe());
        System.out.println(pack.getFacilities());
        System.out.println(pack.getNights());
        System.out.println("₹ " + pack.getTotal_price());


        int c;
        do{
            menu();

            System.out.print("Enter your choice : ");
            c = sca.nextInt();
            switch(c)
            {
                case 1:
                    h1 = new Holiday();
                    d = h1.menu();
                    System.out.println(h1.getDestinations());
                    break;
                case 2:

                    bf.setBudget();
                    break;

                case 3:

                    nf.setNights();
                    break;


                case 4:

                    pack = sp.selection(h1.getDestinations(),bf.getBudget(),nf.getNights());
                    System.out.println("\n" + pack.getDescribe());
                    System.out.println(pack.getFacilities());
                    System.out.println(pack.getNights());
                    System.out.println("₹ " + pack.getTotal_price());
                    break;

                case 5:
                    Select_Flight sf = new Select_Flight();
                    sf.select_flights(h1.getDestinations());

                    break;

                case 6:
                    select_activity sa = new select_activity();
                    sa.select_activities(h1.getDestinations());







            }

        }while(c !=0);

    }

    public static void display_title()
    {
        System.out.println("\n\n________________________________________________   \uD83E\uDD29 Your Destinations is Waiting for you \uD83E\uDD29   ______________________________________________\n");
        System.out.println("__          __ ______  _        _____   ____   __  __  ______   _______  ____    _______  _____   _____  _____   __          __           _      _   ™");
        System.out.println("\\ \\        / /|  ____|| |      / ____| / __ \\ |  \\/  ||  ____| |__   __|/ __ \\  |__   __||  __ \\ |_   _||  __ \\  \\ \\        / /          | |    | |");
        System.out.println(" \\ \\  /\\  / / | |__   | |     | |     | |  | || \\  / || |__       | |  | |  | |    | |   | |__) |  | |  | |__) |  \\ \\  /\\  / /___   _ __ | |  __| |" + " ");
        System.out.println("  \\ \\/  \\/ /  |  __|  | |     | |     | |  | || |\\/| ||  __|      | |  | |  | |    | |   |  _  /   | |  |  ___/    \\ \\/  \\/ // _ \\ | '__|| | / _` |");
        System.out.println("   \\  /\\  /   | |____ | |____ | |____ | |__| || |  | || |____     | |  | |__| |    | |   | | \\ \\  _| |_ | |         \\  /\\  /| (_) || |   | || (_| |");
        System.out.println("    \\/  \\/    |______||______| \\_____| \\____/ |_|  |_||______|    |_|   \\____/     |_|   |_|  \\_\\|_____||_|          \\/  \\/  \\___/ |_|   |_| \\__,_|");

    }

    public static void menu()
    {
        System.out.print("\n____________________________________________");
        System.out.println("\n➤ Enter 1 to change Destinations");
        System.out.println("         2 to change BUDGET_filter ₹");
        System.out.println("         3 to change NIGHTs_filter");
        System.out.println("         4 to change trip Package");
        System.out.println("         5 to select flight  ✈");
        System.out.println("         6 to add/remove Activities  \n");
        System.out.println("         7 to Book now");


        System.out.println("         0 to Exit");
        System.out.println("-------------------------------------------");
    }
}
