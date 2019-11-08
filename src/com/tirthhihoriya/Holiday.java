package com.tirthhihoriya;


import java.util.*;
class Holiday
{
    private String Destinations;


    public String getDestinations() {
        return Destinations;
    }

    public void setDestinations(String Destinations) {
        this.Destinations = Destinations;
    }

    public Destinations menu()
    {
        int dest;
        Scanner sca = new Scanner(System.in);
        System.out.println("\n\n________________TRENDING Destinations______________\n");

        System.out.println("\n1: Kerela");
        System.out.println("2: Dubai");
        System.out.println("3: Bali");
        System.out.println("4: Goa\n");

        System.out.print("Enter your choice : ");
        dest = sca.nextInt();

        switch(dest)
        {
            case 1:
                Destinations Kerela = new Destinations("South_indian place","national");
                setDestinations("Kerela");
                return Kerela;
            case 2:
                Destinations Dubai = new Destinations("South_indian place","international");
                setDestinations("Dubai");
                return Dubai;

            case 3:
                Destinations Bali = new Destinations("South_indian place","international");
                setDestinations("Bali");
                return Bali;
            case 4:
                Destinations Goa = new Destinations("South_indian place","national");
                setDestinations("Goa");
                return Goa;
            default:
                System.out.println("Enter valid input...!!!");

        }

    Destinations Kerela = new Destinations("South_indian place","national");
    return Kerela;
    }

}