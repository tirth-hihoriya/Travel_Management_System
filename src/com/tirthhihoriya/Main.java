package com.tirthhihoriya;
import com.filters.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        Holiday h1 = new Holiday();
        Destination d = h1.menu();
        System.out.println(h1.getDestination());

        budget_filter bf = new budget_filter();
        bf.setBudget();

        night_filter nf = new night_filter();
        nf.setNights();

        Select_package sp = new Select_package();
        Package pack = sp.selection(h1.getDestination(),bf.getBudget(),nf.getNights());
        System.out.println(pack.getDescribe());
        System.out.println(pack.getFacilities());
        System.out.println(pack.getNights());
        System.out.println(pack.getTotal_price());


        int c;
        do{
            System.out.println("____________________________________________");
            System.out.println("\nEnter 1 to change Destination");
            System.out.println("Enter 2 to change BUDGET_filter");
            System.out.println("Enter 3 to change NIGHTs_filter");
            System.out.println("Enter 4 to change trip Package");
            System.out.println("Enter 5 to select flight");
            System.out.println("Enter 0 to Exit");



            System.out.print("Enter your choice : ");
            c = sca.nextInt();
            switch(c)
            {
                case 1:
                    h1 = new Holiday();
                    d = h1.menu();
                    System.out.println(h1.getDestination());
                    break;
                case 2:

                    bf.setBudget();
                    break;

                case 3:

                    nf.setNights();
                    break;


                case 4:

                    pack = sp.selection(h1.getDestination(),bf.getBudget(),nf.getNights());
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
