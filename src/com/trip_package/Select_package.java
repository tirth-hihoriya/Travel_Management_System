package com.trip_package;

import java.util.InputMismatchException;
import java.util.Scanner;


class OutOfRange extends Exception
{
    OutOfRange(String a)
    {
        super(a);
    }
}

interface sp
{
    Package selection(String dest, int budget, int night);
    Package packages_Bali(int budget, int night);
    Package packages_Dubai(int budget, int night);
    Package packages_Singapore(int budget, int night);
    Package packages_Bhutan(int budget, int night);
    void add_remove_changes(Package[] a, int c, int n);
    void menu(Package[] a, int budget, int night, int n);

}

public class Select_package implements sp{


    public Package selection(String dest, int budget, int night) {


        Package p;
        switch (dest) {
            case "Bali":

                p = packages_Bali(budget, night);
                break;
            case "Dubai":
                p = packages_Dubai(budget, night);
                break;
            case "Singapore":
                p = packages_Singapore(budget, night);

                break;
            case "Bhutan":
                p = packages_Bhutan(budget, night);

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + dest);
        }
        return p;


    }


    public Package packages_Bali(int budget, int night) {
        Scanner sca = new Scanner(System.in);

        final int n = 20;
        int c;

        Package[] p = new Package[n];

        p[0] = new Package("Amazing holiday in Bali1", 5, "Hotel + FLight + Transfer ", 29780,false, false);
        p[1] = new Package("Amazing holiday in Bali2", 5, "Hotel + FLight + Transfer ", 34780,false, false);
        p[2] = new Package("Amazing holiday in Bali3", 5, "Hotel + FLight + Transfer ", 45780,false, false);
        p[3] = new Package("Amazing holiday in Bali4", 5, "Hotel + FLight + Transfer ", 53780,false, false);
        p[4] = new Package("Amazing holiday in Bali5", 5, "Hotel + FLight + Transfer ", 68780,false, false);
        p[5] = new Package("Amazing holiday in Bali6", 5, "Hotel + FLight + Transfer ", 78780,false, false);
        p[6] = new Package("Amazing holiday in Bali7", 6, "Hotel + FLight + Transfer ", 29780,false, false);
        p[7] = new Package("Amazing holiday in Bali8", 6, "Hotel + FLight + Transfer ", 34780,false, false);
        p[8] = new Package("Amazing holiday in Bali9", 6, "Hotel + FLight + Transfer ", 45780,false, false);
        p[9] = new Package("Amazing holiday in Bali10", 6, "Hotel + FLight + Transfer ", 53780,false, false);
        p[10] = new Package("Amazing holiday in Bali11", 6, "Hotel + FLight + Transfer ", 68780,false, false);
        p[11] = new Package("Amazing holiday in Bali12", 6, "Hotel + FLight + Transfer ", 72780,false, false);
        p[12] = new Package("Amazing holiday in Bali13", 6, "Hotel + FLight + Transfer ", 79780,false, false);
        p[13] = new Package("Amazing holiday in Bali14", 6, "Hotel + FLight + Transfer ", 86780,false, false);
        p[14] = new Package("Amazing holiday in Bali15", 7, "Hotel + FLight + Transfer ", 29780,false, false);
        p[15] = new Package("Amazing holiday in Bali16", 7, "Hotel + FLight + Transfer ", 34780,false, false);
        p[16] = new Package("Amazing holiday in Bali17", 7, "Hotel + FLight + Transfer ", 53780,false, false);
        p[17] = new Package("Amazing holiday in Bali18", 7, "Hotel + FLight + Transfer ", 68780,false, false);
        p[18] = new Package("Amazing holiday in Bali19", 7, "Hotel + FLight + Transfer ", 79780,false, false);
        p[19] = new Package("Amazing holiday in Bali20", 7, "Hotel + FLight + Transfer ", 86780,false, false);

        menu(p, budget, night, n);

        do {
            try {
                System.out.print("\nEnter your choice : ");

                c = sca.nextInt();

                if(!(c>0 && c<=n) || !(p[c-1].isAllowed())) {

                    throw new OutOfRange("Not in range");
                }
            } catch (InputMismatchException e) {
                sca.nextLine();
                System.out.println("Invalid input...!!!");
                c = -1;
            }
            catch (OutOfRange e)
            {
                System.out.println("Invalid ....!!!  --> Enter the valid integer.");
                c=-1;
            }
        }while(c==-1);

        add_remove_changes(p, c - 1, n);


        return p[c - 1];
    }

    public Package packages_Dubai(int budget, int night) {
        Scanner sca = new Scanner(System.in);

        final int n = 20;
        int c;

        Package[] p = new Package[n];

        p[0] = new Package("Amazing holiday in Dubai1", 5, "Hotel + FLight + Transfer ", 29780,false, false);
        p[1] = new Package("Amazing holiday in Dubai2", 5, "Hotel + FLight + Transfer ", 34780,false, false);
        p[2] = new Package("Amazing holiday in Dubai3", 5, "Hotel + FLight + Transfer ", 45780,false, false);
        p[3] = new Package("Amazing holiday in Dubai4", 5, "Hotel + FLight + Transfer ", 53780,false, false);
        p[4] = new Package("Amazing holiday in Dubai5", 5, "Hotel + FLight + Transfer ", 68780,false, false);
        p[5] = new Package("Amazing holiday in Dubai6", 5, "Hotel + FLight + Transfer ", 78780,false, false);
        p[6] = new Package("Amazing holiday in Dubai7", 6, "Hotel + FLight + Transfer ", 29780,false, false);
        p[7] = new Package("Amazing holiday in Dubai8", 6, "Hotel + FLight + Transfer ", 34780,false, false);
        p[8] = new Package("Amazing holiday in Dubai9", 6, "Hotel + FLight + Transfer ", 45780,false, false);
        p[9] = new Package("Amazing holiday in Dubai10", 6, "Hotel + FLight + Transfer ", 53780,false, false);
        p[10] = new Package("Amazing holiday in Dubai11", 6, "Hotel + FLight + Transfer ", 68780,false, false);
        p[11] = new Package("Amazing holiday in Dubai12", 6, "Hotel + FLight + Transfer ", 72780,false, false);
        p[12] = new Package("Amazing holiday in Dubai13", 6, "Hotel + FLight + Transfer ", 79780,false, false);
        p[13] = new Package("Amazing holiday in Dubai14", 6, "Hotel + FLight + Transfer ", 86780,false, false);
        p[14] = new Package("Amazing holiday in Dubai15", 7, "Hotel + FLight + Transfer ", 29780,false, false);
        p[15] = new Package("Amazing holiday in Dubai16", 7, "Hotel + FLight + Transfer ", 34780,false, false);
        p[16] = new Package("Amazing holiday in Dubai17", 7, "Hotel + FLight + Transfer ", 53780,false, false);
        p[17] = new Package("Amazing holiday in Dubai18", 7, "Hotel + FLight + Transfer ", 68780,false, false);
        p[18] = new Package("Amazing holiday in Dubai19", 7, "Hotel + FLight + Transfer ", 79780,false, false);
        p[19] = new Package("Amazing holiday in Dubai20", 7, "Hotel + FLight + Transfer ", 86780,false, false);
        
    menu(p, budget, night, n);

        do {
            try {
                System.out.print("\nEnter your choice : ");

                c = sca.nextInt();

                if(!(c>0 && c<=n) || !(p[c-1].isAllowed())) {

                    throw new OutOfRange("Not in range");
                }
            } catch (InputMismatchException e) {
                sca.nextLine();
                System.out.println("Invalid input...!!!");
                c = -1;
            }
            catch (OutOfRange e)
            {
                System.out.println("Invalid ....!!!  --> Enter the valid integer.");
                c=-1;
            }
        }while(c==-1);

        add_remove_changes(p, c - 1, n);


        return p[c - 1];
    }

    public Package packages_Singapore(int budget, int night) {
        Scanner sca = new Scanner(System.in);

        final int n = 20;
        int c;

        Package[] p = new Package[n];

        p[0] = new Package("Amazing holiday in Singapore1", 5, "Hotel + FLight + Transfer ", 29780,false, false);
        p[1] = new Package("Amazing holiday in Singapore2", 5, "Hotel + FLight + Transfer ", 34780,false, false);
        p[2] = new Package("Amazing holiday in Singapore3", 5, "Hotel + FLight + Transfer ", 45780,false, false);
        p[3] = new Package("Amazing holiday in Singapore4", 5, "Hotel + FLight + Transfer ", 53780,false, false);
        p[4] = new Package("Amazing holiday in Singapore5", 5, "Hotel + FLight + Transfer ", 68780,false, false);
        p[5] = new Package("Amazing holiday in Singapore6", 5, "Hotel + FLight + Transfer ", 78780,false, false);
        p[6] = new Package("Amazing holiday in Singapore7", 6, "Hotel + FLight + Transfer ", 29780,false, false);
        p[7] = new Package("Amazing holiday in Singapore8", 6, "Hotel + FLight + Transfer ", 34780,false, false);
        p[8] = new Package("Amazing holiday in Singapore9", 6, "Hotel + FLight + Transfer ", 45780,false, false);
        p[9] = new Package("Amazing holiday in Singapore10", 6, "Hotel + FLight + Transfer ", 53780,false, false);
        p[10] = new Package("Amazing holiday in Singapore11", 6, "Hotel + FLight + Transfer ", 68780,false, false);
        p[11] = new Package("Amazing holiday in Singapore12", 6, "Hotel + FLight + Transfer ", 72780,false, false);
        p[12] = new Package("Amazing holiday in Singapore13", 6, "Hotel + FLight + Transfer ", 79780,false, false);
        p[13] = new Package("Amazing holiday in Singapore14", 6, "Hotel + FLight + Transfer ", 86780,false, false);
        p[14] = new Package("Amazing holiday in Singapore15", 7, "Hotel + FLight + Transfer ", 29780,false, false);
        p[15] = new Package("Amazing holiday in Singapore16", 7, "Hotel + FLight + Transfer ", 34780,false, false);
        p[16] = new Package("Amazing holiday in Singapore17", 7, "Hotel + FLight + Transfer ", 53780,false, false);
        p[17] = new Package("Amazing holiday in Singapore18", 7, "Hotel + FLight + Transfer ", 68780,false, false);
        p[18] = new Package("Amazing holiday in Singapore19", 7, "Hotel + FLight + Transfer ", 79780,false, false);
        p[19] = new Package("Amazing holiday in Singapore20", 7, "Hotel + FLight + Transfer ", 86780,false, false);
        
    menu(p, budget, night, n);

        do {
            try {
                System.out.print("\nEnter your choice : ");

                c = sca.nextInt();

                if(!(c>0 && c<=n) || !(p[c-1].isAllowed())) {

                    throw new OutOfRange("Not in range");
                }
            } catch (InputMismatchException e) {
                sca.nextLine();
                System.out.println("Invalid input...!!!");
                c = -1;
            }
            catch (OutOfRange e)
            {
                System.out.println("Invalid ....!!!  --> Enter the valid integer.");
                c=-1;
            }
        }while(c==-1);

        add_remove_changes(p, c - 1, n);

        return p[c - 1];
    }

    public Package packages_Bhutan(int budget, int night) {
        Scanner sca = new Scanner(System.in);

        final int n = 20;
        int c;

        Package[] p = new Package[n];

        p[0] = new Package("Amazing holiday in Bhutan1", 5, "Hotel + FLight + Transfer ", 29780,false, false);
        p[1] = new Package("Amazing holiday in Bhutan2", 5, "Hotel + FLight + Transfer ", 34780,false, false);
        p[2] = new Package("Amazing holiday in Bhutan3", 5, "Hotel + FLight + Transfer ", 45780,false, false);
        p[3] = new Package("Amazing holiday in Bhutan4", 5, "Hotel + FLight + Transfer ", 53780,false, false);
        p[4] = new Package("Amazing holiday in Bhutan5", 5, "Hotel + FLight + Transfer ", 68780,false, false);
        p[5] = new Package("Amazing holiday in Bhutan6", 5, "Hotel + FLight + Transfer ", 78780,false, false);
        p[6] = new Package("Amazing holiday in Bhutan7", 6, "Hotel + FLight + Transfer ", 29780,false, false);
        p[7] = new Package("Amazing holiday in Bhutan8", 6, "Hotel + FLight + Transfer ", 34780,false, false);
        p[8] = new Package("Amazing holiday in Bhutan9", 6, "Hotel + FLight + Transfer ", 45780,false, false);
        p[9] = new Package("Amazing holiday in Bhutan10", 6, "Hotel + FLight + Transfer ", 53780,false, false);
        p[10] = new Package("Amazing holiday in Bhutan11", 6, "Hotel + FLight + Transfer ", 68780,false, false);
        p[11] = new Package("Amazing holiday in Bhutan12", 6, "Hotel + FLight + Transfer ", 72780,false, false);
        p[12] = new Package("Amazing holiday in Bhutan13", 6, "Hotel + FLight + Transfer ", 79780,false, false);
        p[13] = new Package("Amazing holiday in Bhutan14", 6, "Hotel + FLight + Transfer ", 86780,false, false);
        p[14] = new Package("Amazing holiday in Bhutan15", 7, "Hotel + FLight + Transfer ", 29780,false, false);
        p[15] = new Package("Amazing holiday in Bhutan16", 7, "Hotel + FLight + Transfer ", 34780,false, false);
        p[16] = new Package("Amazing holiday in Bhutan17", 7, "Hotel + FLight + Transfer ", 53780,false, false);
        p[17] = new Package("Amazing holiday in Bhutan18", 7, "Hotel + FLight + Transfer ", 68780,false, false);
        p[18] = new Package("Amazing holiday in Bhutan19", 7, "Hotel + FLight + Transfer ", 79780,false, false);
        p[19] = new Package("Amazing holiday in Bhutan20", 7, "Hotel + FLight + Transfer ", 86780,false, false);
        menu(p, budget, night, n);

        do {
            try {
                System.out.print("\nEnter your choice : ");

                c = sca.nextInt();

                if(!(c>0 && c<=n) || !(p[c-1].isAllowed())) {

                    throw new OutOfRange("Not in range");
                }
            } catch (InputMismatchException e) {
                sca.nextLine();
                System.out.println("Invalid input...!!!");
                c = -1;
            }
            catch (OutOfRange e)
            {
                System.out.println("Invalid ....!!!  --> Enter the valid integer.");
                c=-1;
            }
        }while(c==-1);

        add_remove_changes(p, c - 1, n);

        return p[c - 1];
    }


    public void add_remove_changes(Package[] a, int c, int n) {
        for (int i = 0; i < n; i++) {
            if (i == c)

                a[i].setIncludes(true);
            else
                a[i].setIncludes(false);
        }
    }

    public void menu(Package[] a, int budget, int night, int n) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("___________Amazing Packages___________");
        System.out.println();

        boolean flag=true;
        for (int i = 0; i < n; i++) {
            if (a[i].getNights() == night + 4 && a[i].getBudget_category() == budget) {
                flag=false;
                a[i].setAllowed(true);
                if (a[i].isIncludes())
                    System.out.println("☑ " + (i + 1) + ": " + a[i].getName() + "           " + a[i].getFacilities() + "       -> ₹" + a[i].getBase_price());
                else
                    System.out.println("⬜ " + (i + 1) + ": " + a[i].getName() + "           " + a[i].getFacilities() + "       -> ₹" + a[i].getBase_price());
            }

        }
        if(flag)
            System.out.println("No Packages found...!!  Change the filters  ");
        System.out.println("\n___________________________________________");
    }

    
}
