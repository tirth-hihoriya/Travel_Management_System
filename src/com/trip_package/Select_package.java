package com.trip_package;

import java.util.Scanner;

public class Select_package {


    public Package selection(String dest, int budget, int night) {


        Package p = null;
        if (dest.equals("Bali")) {

            p = packages_Bali(budget, night);
        } else if (dest.equals("Dubai")) {
            p = packages_Dubai(budget, night);
        } else if (dest.equals("Singapore")) {
            p = packages_Singapore(budget, night);

        } else if (dest.equals("Bhutan")) {
            p = packages_Bhutan(budget, night);

        }
        return p;


    }


    private Package packages_Bali(int budget, int night) {
        Scanner sca = new Scanner(System.in);

        final int n = 13;
        int c;

        Package[] p = new Package[n];

        p[0] = new Package("Amazing hoiliday in Bali1", 5, "Hotel + FLight + Transfer ", 29780,false);
        p[1] = new Package("Amazing hoiliday in Bali2", 5, "Hotel + FLight + Transfer ", 34780,false);
        p[2] = new Package("Amazing hoiliday in Bali3", 5, "Hotel + FLight + Transfer ", 42780,false);
        p[3] = new Package("Amazing hoiliday in Bali4", 5, "Hotel + FLight + Transfer ", 63780,false);
        p[4] = new Package("Amazing hoiliday in Bali5", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[5] = new Package("Amazing hoiliday in Bali6", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[6] = new Package("Amazing hoiliday in Bali7", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[7] = new Package("Amazing hoiliday in Bali8", 6, "Hotel + FLight + Transfer ", 71780,false);
        p[8] = new Package("Amazing hoiliday in Bali9", 7, "Hotel + FLight + Transfer ", 75780,false);
        p[9] = new Package("Amazing hoiliday in Bali10", 7, "Hotel + FLight + Transfer ", 78780,false);
        p[10] = new Package("Amazing hoiliday in Bali11", 7, "Hotel + FLight + Transfer ", 81780,false);
        p[11] = new Package("Amazing hoiliday in Bali12", 7, "Hotel + FLight + Transfer ", 86780,false);
        p[12] = new Package("Amazing hoiliday in Bali13", 7, "Hotel + FLight + Transfer ", 91780,false);

        menu(p, budget, night, n);

        System.out.print("\nEnter your choice : ");
        c = sca.nextInt();
        // Inputmismatch Exception
        add_remove_changes(p, c - 1, n);


        return p[c - 1];
    }

    private Package packages_Dubai(int budget, int night) {
        Scanner sca = new Scanner(System.in);

        final int n = 5;
        int c;

        Package[] p = new Package[n];

        p[0] = new Package("Amazing hoiliday in Bali", 5, "Hotel + FLight + Transfer ", 29780, false);
        p[1] = new Package("Amazing hoiliday in Bali", 6, "Hotel + FLight + Transfer ", 34780, false);
        p[2] = new Package("Amazing hoiliday in Bali", 7, "Hotel + FLight + Transfer ", 42780, false);
        p[3] = new Package("Amazing hoiliday in Bali", 5, "Hotel + FLight + Transfer ", 63780, false);
        p[4] = new Package("Amazing hoiliday in Bali", 6, "Hotel + FLight + Transfer ", 71780, false);

        menu(p, budget, night, n);

        System.out.print("\nEnter your choice : ");
        c = sca.nextInt();
        // Inputmismatch Exception
        add_remove_changes(p, c - 1, n);


        return p[c - 1];
    }

    private Package packages_Singapore(int budget, int night) {
        Scanner sca = new Scanner(System.in);

        final int n = 5;
        int c;

        Package[] p = new Package[n];

        p[0] = new Package("Amazing hoiliday in Bali", 5, "Hotel + FLight + Transfer ", 29780, false);
        p[1] = new Package("Amazing hoiliday in Bali", 6, "Hotel + FLight + Transfer ", 34780, false);
        p[2] = new Package("Amazing hoiliday in Bali", 7, "Hotel + FLight + Transfer ", 42780, false);
        p[3] = new Package("Amazing hoiliday in Bali", 5, "Hotel + FLight + Transfer ", 63780, false);
        p[4] = new Package("Amazing hoiliday in Bali", 6, "Hotel + FLight + Transfer ", 71780, false);

        menu(p, budget, night, n);

        System.out.print("\nEnter your choice : ");
        c = sca.nextInt();
        // Inputmismatch Exception
        add_remove_changes(p, c - 1, n);

        return p[c - 1];
    }

    private Package packages_Bhutan(int budget, int night) {
        Scanner sca = new Scanner(System.in);

        final int n = 5;
        int c;

        Package[] p = new Package[n];

        p[0] = new Package("Amazing hoiliday in Bali", 5, "Hotel + FLight + Transfer ", 29780, false);
        p[1] = new Package("Amazing hoiliday in Bali", 6, "Hotel + FLight + Transfer ", 34780, false);
        p[2] = new Package("Amazing hoiliday in Bali", 7, "Hotel + FLight + Transfer ", 42780, false);
        p[3] = new Package("Amazing hoiliday in Bali", 5, "Hotel + FLight + Transfer ", 63780, false);
        p[4] = new Package("Amazing hoiliday in Bali", 6, "Hotel + FLight + Transfer ", 71780, false);

        menu(p, budget, night, n);

        System.out.print("\nEnter your choice : ");
        c = sca.nextInt();
        // Inputmismatch Exception
        add_remove_changes(p, c - 1, n);

        return p[c - 1];
    }


    private void add_remove_changes(Package[] a, int c, int n) {
        for (int i = 0; i < n; i++) {
            if (i == c)

                a[i].setIncludes(true);
            else
                a[i].setIncludes(false);
        }
    }

    private void menu(Package[] a, int budget, int night, int n) {
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
            System.out.println("No Packages found...!!  Change the filters");
        System.out.println("\n___________________________________________");
    }

    
}
