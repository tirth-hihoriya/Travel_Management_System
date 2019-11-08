package com.tirthhihoriya;

import java.util.*;
class Holiday
{
    private String destination;


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Destination menu()
    {
        int dest;
        Scanner sca = new Scanner(System.in);
        System.out.println("\n________________TRENDING DESTINATIONs______________\n");

        System.out.println("\n1: Kerela");
        System.out.println("2: Dubai");
        System.out.println("3: Bali");
        System.out.println("4: Goa\n");

        System.out.print("Enter your choice : ");
        dest = sca.nextInt();

        switch(dest)
        {
            case 1:
                Destination Kerela = new Destination("South_indian place","national");
                setDestination("Kerela");
                return Kerela;
            case 2:
                Destination Dubai = new Destination("South_indian place","international");
                setDestination("Dubai");
                return Dubai;

            case 3:
                Destination Bali = new Destination("South_indian place","international");
                setDestination("Bali");
                return Bali;
            case 4:
                Destination Goa = new Destination("South_indian place","national");
                setDestination("Goa");
                return Goa;
            default:
                System.out.println("Enter valid input...!!!");

        }

    Destination Kerela = new Destination("South_indian place","national");
    return Kerela;
    }

}