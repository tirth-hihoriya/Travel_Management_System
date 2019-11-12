package com.tirthhihoriya;


import java.util.*;
class Holiday
{
    private String Destinations;


    String getDestinations() {
        return Destinations;
    }

    void setDestinations(String Destinations) {
        this.Destinations = Destinations;
    }

    void menu()
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
                setDestinations("Bali");
                break;
            case 2:
                setDestinations("Dubai");
                break;

            case 3:
                setDestinations("Singapore");
                break;
            case 4:
                setDestinations("Bhutan");
                break;
            default:
                System.out.println("Enter valid input...!!!");

        }

    }

}