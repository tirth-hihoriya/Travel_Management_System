package com.trip_package;

import com.tirthhihoriya.*;



public class Select_Flight
{
    public Flight select_flights(Destinations dest)
    {
        Flight f = new Flight();
        if(dest.equals("Kerela"))
            System.out.println("\n\nSucess");
        else
            System.out.println("\n\nunsucess");




        return f;
    }
}
