package com.trip_package;

import java.util.Scanner;

public class basic_utility {

    public void menu(Activities[] a,int n)
    {
        System.out.println();
        System.out.println();
        System.out.println("___________Exiting Activities___________");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            if(a[i].isIncludes())
                System.out.println("☑ " + (i+1) + ": " + a[i].getName() + "       -> ₹" + a[i].getA_price());
            else
                System.out.println("⬜ " + (i+1) + ": " + a[i].getName() + "       -> ₹" + a[i].getA_price());
        }
        System.out.println("\nEnter 0 to confirm all changes\n");
    }

    public void menu(Flight[] a,int n)
    {
        System.out.println();
        System.out.println();
        System.out.println("___________Flight Options___________");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            if(a[i].isIncludes())
                System.out.println("\n ⬤ "  + (i+1));

            else
                System.out.println("\n ◯ "  + (i+1));
            flight_details(a[i]);
        }
        System.out.println("\nEnter 0 to confirm all changes\n");
    }

    public void flight_details(Flight f)
    {
        System.out.println("\n                      <<<<<<<<<<   "+ f.getCompany() + "   >>>>>>>>>>");
        System.out.println();
        System.out.println("First day :  "+ f.getFd_departure_time() + " _________✈_________" + f.getFd_landing_time() + "      ---> additional price: "+f.getF_price());
        System.out.println();
        System.out.println("Last day :  "+ f.getLd_departure_time() + " _________✈_________" + f.getLd_landing_time());
    }

    public void ask_choice(Activities[] a, int n, Package p)
    {
        Scanner sca = new Scanner(System.in);

        int c;
        do {
            menu(a,n);

            System.out.print("Enter your choice : ");
            c = sca.nextInt();                 // Inputmismatch Exception


            for(int i=0;i<n;i++)
            {
                if(c-1==i)
                    add_remove_changes(p,a[c-1]);
                else if(c!=0)
                    System.out.println("Enter valid input");

            }
        }while(c!=0);
    }

    public void ask_choice(Flight[] a, int n, Package p)
    {
        Scanner sca = new Scanner(System.in);



        int c;
        do {
            menu(a,n);

            System.out.print("Enter your choice : ");
            c = sca.nextInt();                 // Inputmismatch Exception


            for(int i=0;i<n;i++)
            {
                if(c-1==i)
                    add_remove_changes(p,a[c-1]);
                else if(c>n && c<1)
                    System.out.println("Enter valid input...!!!");

            }
            for(int i=0;i<n;i++)
            {
                if(c-1!=i)
                    a[i].setIncludes(false);
            }
        }while(c!=0);
    }


    public void add_remove_changes(Package p, Activities a)
    {
        if(a.isIncludes()) {
            a.setIncludes(false);
            p.setT_a_price(p.getT_a_price()-a.getA_price());
        }
        else{
            a.setIncludes(true);
            p.setT_a_price((p.getT_a_price()+a.getA_price()));
        }
    }


    public void add_remove_changes(Package p, Flight a)
    {

        if(a.isIncludes()) {
            a.setIncludes(false);
            p.setA_f_price(a.getF_price());
        }
        else{
            a.setIncludes(true);
            p.setA_f_price(a.getF_price());
        }
    }




}
