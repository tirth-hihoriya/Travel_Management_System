package com.tirthhihoriya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        Holiday h1 = new Holiday();
        Destination d = h1.menu();
        System.out.println(h1.getDestination());

        Filters f = new Filters();
        f.setBudget();
        f.setNights();

        Select_package sp = new Select_package();
        Package pack = sp.selection(h1.getDestination(),f.getBudget(),f.getNights());
        System.out.println(pack.getDescribe());
        System.out.println(pack.getFacilities());
        System.out.println(pack.getNights());
        System.out.println(pack.getTotal_price());


        int c;
        do{
            System.out.println("Enter 1 to select Destination");
            System.out.println("Enter 2 to adjust Filters");
            System.out.println("Enter 3 to select trip Package");
            System.out.println("Enter 4 to select flight");
            System.out.println("Enter 0 to Exit");



            System.out.print("Enter your choice : ");
            c = sca.nextInt();
            switch(c)
            {
                case 1:
                    h1 = new Holiday();
                    d = h1.menu();
                    System.out.println(h1.getDestination());
//                    break;
//                case 2:
                    f = new Filters();
                    f.setBudget();
                    f.setNights();
//                    break;
//                case 3:
                    sp = new Select_package();
                    pack = sp.selection(h1.getDestination(),f.getBudget(),f.getNights());
                    System.out.println(pack.getDescribe());
                    System.out.println(pack.getFacilities());
                    System.out.println(pack.getNights());
                    System.out.println(pack.getTotal_price());
                    break;
                case 2:

                    f.setBudget();
                    f.setNights();
                    break;
                case 3:

                    pack = sp.selection(h1.getDestination(),f.getBudget(),f.getNights());
                    System.out.println(pack.getDescribe());
                    System.out.println(pack.getFacilities());
                    System.out.println(pack.getNights());
                    System.out.println(pack.getTotal_price());
                    break;




            }

        }while(c !=0);



//        Select_package_Goa g = new Select_package_Goa();
//        g.selection(g.getBudget(),g.getNights());
    }
}
