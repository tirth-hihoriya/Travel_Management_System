package com.trip_package;

import java.util.InputMismatchException;
import java.util.Scanner;

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

        p[0] = new Package("Amazing hoiliday in Bali1", 5, "Hotel + FLight + Transfer ", 29780,false);
        p[1] = new Package("Amazing hoiliday in Bali2", 5, "Hotel + FLight + Transfer ", 34780,false);
        p[2] = new Package("Amazing hoiliday in Bali3", 5, "Hotel + FLight + Transfer ", 45780,false);
        p[3] = new Package("Amazing hoiliday in Bali4", 5, "Hotel + FLight + Transfer ", 53780,false);
        p[4] = new Package("Amazing hoiliday in Bali5", 5, "Hotel + FLight + Transfer ", 68780,false);
        p[5] = new Package("Amazing hoiliday in Bali6", 5, "Hotel + FLight + Transfer ", 71780,false);
        p[6] = new Package("Amazing hoiliday in Bali7", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[7] = new Package("Amazing hoiliday in Bali8", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[8] = new Package("Amazing hoiliday in Bali9", 6, "Hotel + FLight + Transfer ", 75780,false);
        p[9] = new Package("Amazing hoiliday in Bali10", 6, "Hotel + FLight + Transfer ", 78780,false);
        p[10] = new Package("Amazing hoiliday in Bali11", 6, "Hotel + FLight + Transfer ", 81780,false);
        p[11] = new Package("Amazing hoiliday in Bali12", 6, "Hotel + FLight + Transfer ", 86780,false);
        p[12] = new Package("Amazing hoiliday in Bali13", 6, "Hotel + FLight + Transfer ", 91780,false);
        p[13] = new Package("Amazing hoiliday in Bali14", 6, "Hotel + FLight + Transfer ", 91780,false);
        p[14] = new Package("Amazing hoiliday in Bali15", 7, "Hotel + FLight + Transfer ", 91780,false);
        p[15] = new Package("Amazing hoiliday in Bali16", 7, "Hotel + FLight + Transfer ", 91780,false);
        p[16] = new Package("Amazing hoiliday in Bali17", 7, "Hotel + FLight + Transfer ", 91780,false);
        p[17] = new Package("Amazing hoiliday in Bali18", 7, "Hotel + FLight + Transfer ", 91780,false);
        p[18] = new Package("Amazing hoiliday in Bali19", 7, "Hotel + FLight + Transfer ", 91780,false);
        p[19] = new Package("Amazing hoiliday in Bali20", 7, "Hotel + FLight + Transfer ", 91780,false);

        menu(p, budget, night, n);

        try{
            System.out.print("\nEnter your choice : ");
            c = sca.nextInt();
        }
        catch (InputMismatchException e)
        {
            c=0;
            System.out.println("## Invalid input ...!!!");
        }

        add_remove_changes(p, c - 1, n);


        return p[c - 1];
    }

    public Package packages_Dubai(int budget, int night) {
        Scanner sca = new Scanner(System.in);

        final int n = 13;
        int c;

        Package[] p = new Package[n];

        p[0] = new Package("Amazing hoiliday in Dubai1", 5, "Hotel + FLight + Transfer ", 29780,false);
        p[1] = new Package("Amazing hoiliday in Dubai2", 5, "Hotel + FLight + Transfer ", 34780,false);
        p[2] = new Package("Amazing hoiliday in Dubai3", 5, "Hotel + FLight + Transfer ", 42780,false);
        p[3] = new Package("Amazing hoiliday in Dubai4", 5, "Hotel + FLight + Transfer ", 63780,false);
        p[4] = new Package("Amazing hoiliday in Dubai5", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[5] = new Package("Amazing hoiliday in Dubai6", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[6] = new Package("Amazing hoiliday in Dubai7", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[7] = new Package("Amazing hoiliday in Dubai8", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[8] = new Package("Amazing hoiliday in Dubai9", 7, "Hotel + FLight + Transfer ", 75780,false);
        p[9] = new Package("Amazing hoiliday in Dubai10", 7, "Hotel + FLight + Transfer ", 78780,false);
        p[10] = new Package("Amazing hoiliday in Dubai11", 7, "Hotel + FLight + Transfer ", 81780,false);
        p[11] = new Package("Amazing hoiliday in Dubai12", 7, "Hotel + FLight + Transfer ", 86780,false);
        p[12] = new Package("Amazing hoiliday in Dubai13", 7, "Hotel + FLight + Transfer ", 91780,false);

        menu(p, budget, night, n);

        do {
            try {
                System.out.print("\nEnter your choice : ");
                c = sca.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input...!!!");
                c = -1;
            }
        }while(c==-1);


        add_remove_changes(p, c - 1, n);


        return p[c - 1];
    }

    public Package packages_Singapore(int budget, int night) {
        Scanner sca = new Scanner(System.in);

        final int n = 13;
        int c;

        Package[] p = new Package[n];

        p[0] = new Package("Amazing hoiliday in Singapore1", 5, "Hotel + FLight + Transfer ", 29780,false);
        p[1] = new Package("Amazing hoiliday in Singapore2", 5, "Hotel + FLight + Transfer ", 34780,false);
        p[2] = new Package("Amazing hoiliday in Singapore3", 5, "Hotel + FLight + Transfer ", 42780,false);
        p[3] = new Package("Amazing hoiliday in Singapore4", 5, "Hotel + FLight + Transfer ", 63780,false);
        p[4] = new Package("Amazing hoiliday in Singapore5", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[5] = new Package("Amazing hoiliday in Singapore6", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[6] = new Package("Amazing hoiliday in Singapore7", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[7] = new Package("Amazing hoiliday in Singapore8", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[8] = new Package("Amazing hoiliday in Singapore9", 7, "Hotel + FLight + Transfer ", 75780,false);
        p[9] = new Package("Amazing hoiliday in Singapore10", 7, "Hotel + FLight + Transfer ", 78780,false);
        p[10] = new Package("Amazing hoiliday in Singapore11", 7, "Hotel + FLight + Transfer ", 81780,false);
        p[11] = new Package("Amazing hoiliday in Singapore12", 7, "Hotel + FLight + Transfer ", 86780,false);
        p[12] = new Package("Amazing hoiliday in Singapore13", 7, "Hotel + FLight + Transfer ", 91780,false);

        menu(p, budget, night, n);
        do {
            try {
                System.out.print("\nEnter your choice : ");
                c = sca.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input...!!!");
                c = -1;
            }
        }while(c==-1);


        return p[c - 1];
    }

    public Package packages_Bhutan(int budget, int night) {
        Scanner sca = new Scanner(System.in);

        final int n = 13;
        int c;

        Package[] p = new Package[n];

        p[0] = new Package("Amazing hoiliday in Bhutan1", 5, "Hotel + FLight + Transfer ", 29780,false);
        p[1] = new Package("Amazing hoiliday in Bhutan2", 5, "Hotel + FLight + Transfer ", 34780,false);
        p[2] = new Package("Amazing hoiliday in Bhutan3", 5, "Hotel + FLight + Transfer ", 42780,false);
        p[3] = new Package("Amazing hoiliday in Bhutan4", 5, "Hotel + FLight + Transfer ", 63780,false);
        p[4] = new Package("Amazing hoiliday in Bhutan5", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[5] = new Package("Amazing hoiliday in Bhutan6", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[6] = new Package("Amazing hoiliday in Bhutan7", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[7] = new Package("Amazing hoiliday in Bhutan8", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[8] = new Package("Amazing hoiliday in Bhutan9", 7, "Hotel + FLight + Transfer ", 75780,false);
        p[9] = new Package("Amazing hoiliday in Bhutan10", 7, "Hotel + FLight + Transfer ", 78780,false);
        p[10] = new Package("Amazing hoiliday in Bhutan11", 7, "Hotel + FLight + Transfer ", 81780,false);
        p[11] = new Package("Amazing hoiliday in Bhutan12", 7, "Hotel + FLight + Transfer ", 86780,false);
        p[12] = new Package("Amazing hoiliday in Bhutan13", 7, "Hotel + FLight + Transfer ", 91780,false);
        menu(p, budget, night, n);

        do {
            try {
                System.out.print("\nEnter your choice : ");
                c = sca.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input...!!!");
                c = -1;
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
