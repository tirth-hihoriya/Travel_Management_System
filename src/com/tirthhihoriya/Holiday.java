package com.tirthhihoriya;

import java.util.*;
class Holiday
{
    int destination;
    public void menu()
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("1: Kerela");
        System.out.println("2: Dubai");
        System.out.println("3: Bali");
        System.out.println("4: Goa");
        System.out.println("");
        System.out.print("Enter your choice : ");
        destination = sca.nextInt();

        switch(destination)
        {
            case 1:
                Destination Kerela = new Destination("national"); break;
            case 2:
                Destination Dubai = new Destination("international"); break;
            case 3:
                Destination Bali = new Destination("international"); break;
            case 4:
                Destination Goa = new Destination("national"); break;

        }



    }

}