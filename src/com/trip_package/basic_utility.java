package com.trip_package;

import java.util.InputMismatchException;
import java.util.Scanner;


class basic_utility {

    private void menu(Activities[] a, int n)
    {
        System.out.println();
        System.out.println();
        System.out.println("___________####   Exiting Activities    ####___________");
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

    private void menu(Flight[] a, int n)
    {
        System.out.println();
        System.out.println();
        System.out.println("___________✈✈✈✈   Flight Options   ✈✈✈✈___________");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.println("\n  ✈"  + (i+1));
            System.out.println();
            flight_details(a[i]);
        }

    }

    private void flight_details(Flight f)
    {
        System.out.println("\n                      <<<<<<<<<<   "+ f.getCompany() + "   >>>>>>>>>>");
        System.out.println();
        System.out.println("First day :  "+ f.getFd_departure_time() + " _________✈_________" + f.getFd_landing_time() + "      ---> additional price: "+f.getF_price());
        System.out.println();
        System.out.println("Last day :  "+ f.getLd_departure_time() + " _________✈_________" + f.getLd_landing_time());
        System.out.println();
        System.out.println();
    }

    void ask_choice(Activities[] a, int n, Package p)
    {
        Scanner sca = new Scanner(System.in);

        int c;



        do {
            menu(a,n);

            do {
                try {
                    System.out.print("\nEnter your choice : ");
                    c = sca.nextInt();
                    if(!(c>=0 && c<=n))
                        throw  new OutOfRange("Not in range");
                } catch (InputMismatchException e) {
                    sca.nextLine();
                    System.out.println("Invalid input...!!!");
                    c = -1;
                }
                catch (OutOfRange e)
                {
                    System.out.println("Invalid ....!!!  -->Enter the integer between 0 & " + n);
                    c=-1;
                }
            }while(c==-1);



            for(int i=0;i<n;i++)
            {
                if(c-1==i)
                    add_remove_changes(p,a[c-1]);
                else if(c!=0)
                    System.out.println("Enter valid input");

            }
        }while(c!=0);


    }

    void ask_choice(Flight[] a, int n, Package p)
    {
        Scanner sca = new Scanner(System.in);


        int c;

        menu(a,n);

        do {

            try {
                System.out.print("\nEnter your choice : ");
                c = sca.nextInt();
                if(!(c>=0 && c<=n))
                {
                    System.out.println("Invalid...!!   --> Enter integer between 1 & " + n);
                    c=-1;
                }

            } catch (InputMismatchException e) {
                sca.nextLine();
                System.out.println("Invalid...!!   --> Enter integer between 1 & " + n);
                c = -1;
            }

        }while(c==-1);

        for(int i=0;i<n;i++)
        {
            if(c-1!=i)
                a[i].setIncludes(false);
            else
                a[i].setIncludes(true);
        }

        for(int i=0;i<n;i++)
        {
            if(c-1==i)
                add_remove_changes(p,a[c-1]);

        }



    }


    private void add_remove_changes(Package p, Activities a)
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


    private void add_remove_changes(Package p, Flight a)
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
