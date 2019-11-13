package com.trip_package;


public class Select_Flight extends basic_utility
{
    public void select_flights(String dest,Package p)
    {
        switch (dest) {
            case "Bali":

                flights_Bali(p);
                break;
            case "Dubai":
                flights_Dubai(p);
                break;
            case "Singapore":
                flights_Singapore(p);

                break;
            case "Bhutan":
                flights_Bhutan(p);

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + dest);
        }
    }

    private void flights_Bali(Package p)
    {
        final int n = 3;
        Flight[] f = new Flight[n];
        f[0] = new Flight("Malaysia Airlines", "03:15 New Delhi", "12:05 Denpasar Bali", "11:35 Denpasar Bali", "19:25 New Delhi", 0,true);
        f[1] = new Flight(" Zecto Airlines ", "03:15 New Delhi", "12:05 Denpasar Bali", "11:35 Denpasar Bali", "19:25 New Delhi", 1544,false);
        f[2] = new Flight("     Emirates   ", "03:15 New Delhi", "12:05 Denpasar Bali", "11:35 Denpasar Bali", "19:25 New Delhi", 1278,false);

        ask_choice(f,n,p);
    }

    private void flights_Dubai(Package p)
    {
        final int n = 3;
        Flight[] f = new Flight[n];
        f[0] = new Flight("Dubai Airlines", "03:15 New Delhi", "12:05 Dubai", "11:35 Dubai", "19:25 New Delhi", 0,true);
        f[1] = new Flight("Zecto Airlines", "03:15 New Delhi", "12:05 Dubai", "11:35 Dubai", "19:25 New Delhi", 1544,false);
        f[2] = new Flight("    Emirates  ", "03:15 New Delhi", "12:05 Dubai", "11:35 Dubai", "19:25 New Delhi", 1278,false);

        ask_choice(f,n,p);
    }

    private void flights_Singapore(Package p)
    {
        final int n = 3;
        Flight[] f = new Flight[n];
        f[0] = new Flight("Singapore Airlines", "03:15 New Delhi", "12:05 Singapore", "11:35 Singapore", "19:25 New Delhi", 0,true);
        f[1] = new Flight(" Zecto Airlines ", "03:15 New Delhi", "12:05 Singapore", "11:35 Singapore", "19:25 New Delhi", 1544,false);
        f[2] = new Flight("     Emirates   ", "03:15 New Delhi", "12:05 Singapore", "11:35 Singapore", "19:25 New Delhi", 1278,false);

        ask_choice(f,n,p);
    }

    private void flights_Bhutan(Package p)
    {
        final int n = 3;
        Flight[] f = new Flight[n];
        f[0] = new Flight("Bhutan Airlines", "03:15 New Delhi", "7:05 Bhutan", "11:35 Bhutan", "13:25 New Delhi", 0,true);
        f[1] = new Flight("Zecto Airlines", "03:15 New Delhi", "7:05 Bhutan", "11:35 Bhutan", "13:25 New Delhi", 1544,false);
        f[2] = new Flight("    Emirates  ", "03:15 New Delhi", "12:05 Bhutan", "11:35 Bhutan", "19:25 New Delhi", 1278,false);

        ask_choice(f,n,p);
    }


}
