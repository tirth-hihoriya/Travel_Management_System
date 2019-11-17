package com.trip_package;


public class select_activity extends basic_utility{

    public void select_activities(String dest,Package p) {

        p.setT_a_price(0);
        switch (dest) {
            case "Bali":

                activities_Bali(p);
                break;
            case "Dubai":
                activities_Dubai(p);
                break;
            case "Singapore":
                activities_Singapore(p);

                break;
            case "Bhutan":
                activities_Bhutan(p);

                break;
        }



    }

    private void activities_Bali(Package p)
    {
        final int n= 5;
        Activities[] a = new Activities[n];
        a[0] = new Activities("Party ",940,false);
        a[1] = new Activities("sky diving",850,false);
        a[2] = new Activities("Club",999,false);
        a[3] = new Activities("Zecto",786,false);
        a[4] = new Activities("surfing",1259,false);

        ask_choice(a,n,p);


    }

    private void activities_Dubai(Package p)
    {
        final int n= 5;
        Activities[] a = new Activities[n];
        a[0] = new Activities("Party ",940,false);
        a[1] = new Activities("sky diving",850,false);
        a[2] = new Activities("Club",999,false);
        a[3] = new Activities("Zecto",786,false);
        a[4] = new Activities("surfing",1259,false);


        ask_choice(a,n,p);

    }

    private void activities_Singapore(Package p)
    {
        final int n= 5;
        Activities[] a = new Activities[n];
        a[0] = new Activities("Party ",940,false);
        a[1] = new Activities("sky diving",850,false);
        a[2] = new Activities("Club",999,false);
        a[3] = new Activities("Zecto",786,false);
        a[4] = new Activities("surfing",1259,false);


        ask_choice(a,n,p);

    }

    private void activities_Bhutan(Package p)
    {

        final int n= 5;

        Activities[] a = new Activities[n];
        a[0] = new Activities("Party ",940,false);
        a[1] = new Activities("sky diving",850,false);
        a[2] = new Activities("Club",999,false);
        a[3] = new Activities("Zecto",786,false);
        a[4] = new Activities("surfing",1259,false);


        ask_choice(a,n,p);

    }




}
