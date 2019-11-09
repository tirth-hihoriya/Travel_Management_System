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

        System.out.println("\n1: Bali");
        System.out.println("2: Dubai");
        System.out.println("3: Singapore");
        System.out.println("4: Bhutan\n");

        System.out.print("Enter your choice : ");
        dest = sca.nextInt();

        switch(dest)
        {
            case 1:
                Destinations Bali = new Destinations("South_indian place");
                setDestinations("Bali");
                return Bali;
            case 2:
                Destinations Dubai = new Destinations("South_indian place");
                setDestinations("Dubai");
                return Dubai;

            case 3:
                Destinations Singapore = new Destinations("South_indian place");
                setDestinations("Singapore\n");
                return Singapore
                        ;
            case 4:
                Destinations Bhutan = new Destinations("South_indian place");
                setDestinations("Bhutan");
                return Bhutan;
            default:
                System.out.println("Enter valid input...!!!");

        }

    Destinations Kerela = new Destinations("South_indian place");
    return Kerela;
    }

}