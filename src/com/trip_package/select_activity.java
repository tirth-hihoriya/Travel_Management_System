package com.trip_package;

import java.util.Scanner;

public class select_activity{

    private int t_a_price;

    public int getT_a_price() {
        return t_a_price;
    }

    public void setT_a_price(int t_a_price) {
        this.t_a_price = t_a_price;
    }


    public Activities select_activities(String dest) {

        Activities a = new Activities();
        if(dest.equals("Bali")) {

            activities_Bali();
        }
        else if(dest.equals("Dubai")) {

        }
        else if(dest.equals("Singapore")) {


        }
        else if(dest.equals("Bhutan")) {


        }
        return a;


    }

    public void activities_Bali()
    {
        Scanner sca = new Scanner(System.in);

        final int n= 5;
        int c;
        Activities[] a = new Activities[n];
        a[0] = new Activities("Party ",940,true);
        a[1] = new Activities("Party1",1940,false);
        a[2] = new Activities("Party2",2940,false);
        a[3] = new Activities("Party3",3940,true);
        a[4] = new Activities("Party4",4940,true);



        do {
            menu_activity(a,n);

            System.out.print("Enter your choice : ");
            c = sca.nextInt();                               // Inputmismatch Exception
            switch(c)
            {
                case 1: add_remove_changes(a[0]); break;
                case 2: add_remove_changes(a[1]); break;
                case 3: add_remove_changes(a[2]); break;
                case 4: add_remove_changes(a[3]); break;
                case 5: add_remove_changes(a[4]); break;

                default:
                    System.out.println("Enter valid input");
                    break;


            }


        }while(c!=0);

    }







    public void add_remove_changes(Activities a)
    {
        if(a.isIncludes())
            a.setIncludes(false);
        else
            a.setIncludes(true);
    }

    public void menu_activity(Activities[] a,int n)
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

}
