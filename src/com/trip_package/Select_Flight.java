package com.trip_package;

import com.tirthhihoriya.*;



public class Select_Flight
{
    public Flight select_flights(String dest)
    {
        Flight f = new Flight();
        if(dest.equals("Bali")) {

            f = new Flight("Malaysia Airlines", "03:15 New Delhi", "12:05 Denpasar Bali", "11:35 Denpasar Bali", "19:25 New Delhi", 4544);
            f.flight_details(f);
        }
        else if(dest.equals("Dubai"))
            f = new Flight("Malaysia Airlines","03:15 New Delhi","12:05 Denpasar Bali","11:35 Denpasar Bali","19:25 New Delhi",4544);
        else if(dest.equals("Singapore"))
            f = new Flight("Malaysia Airlines","03:15 New Delhi","12:05 Denpasar Bali","11:35 Denpasar Bali","19:25 New Delhi",4544);
        else if(dest.equals("Bhutan"))
            f = new Flight("Malaysia Airlines","03:15 New Delhi","12:05 Denpasar Bali","11:35 Denpasar Bali","19:25 New Delhi",4544);
        return f;

    }


}
