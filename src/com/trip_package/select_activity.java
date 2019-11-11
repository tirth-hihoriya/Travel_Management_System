package com.trip_package;

import java.util.Scanner;

public class select_activity extends basic_utility{

    public void select_activities(String dest,Package p) {

        p.setT_a_price(0);
        if(dest.equals("Bali")) {

            activities_Bali(p);
        }
        else if(dest.equals("Dubai")) {
            activities_Dubai(p);
        }
        else if(dest.equals("Singapore")) {
            activities_Singapore(p);

        }
        else if(dest.equals("Bhutan")) {
            activities_Bhutan(p);

        }



    }

    private void activities_Bali(Package p)
    {
        final int n= 5;
        Activities[] a = new Activities[n];
        a[0] = new Activities("Party ",940,false);
        a[1] = new Activities("Zecto",1940,false);
        a[2] = new Activities("Party2",2940,false);
        a[3] = new Activities("Zecto3",3940,false);
        a[4] = new Activities("Party4",4940,false);

        ask_choice(a,n,p);


    }

    private void activities_Dubai(Package p)
    {
        final int n= 5;
        Activities[] a = new Activities[n];
        a[0] = new Activities("Party ",940,false);
        a[1] = new Activities("sky diving",1940,false);
        a[2] = new Activities("Surfing",2940,false);
        a[3] = new Activities("Zecto3",3940,false);
        a[4] = new Activities("Party4",4940,false);

        ask_choice(a,n,p);

    }

    private void activities_Singapore(Package p)
    {
        final int n= 5;
        Activities[] a = new Activities[n];
        a[0] = new Activities("Party ",940,false);
        a[1] = new Activities("sky diving",1940,false);
        a[2] = new Activities("Surfing",2940,false);
        a[3] = new Activities("Party3",3940,false);
        a[4] = new Activities("Zecto4",4940,false);

        ask_choice(a,n,p);

    }

    private void activities_Bhutan(Package p)
    {

        final int n= 5;

        Activities[] a = new Activities[n];
        a[0] = new Activities("Surfing ",940,false);
        a[1] = new Activities("sky diving",1940,false);
        a[2] = new Activities("Party",2940,false);
        a[3] = new Activities("Zecto",3940,false);
        a[4] = new Activities("Party2",4940,false);

        ask_choice(a,n,p);

    }




}
