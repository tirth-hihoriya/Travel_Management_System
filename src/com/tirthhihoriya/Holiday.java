package com.tirthhihoriya;


import java.util.*;

class OutOfRange extends Exception
{
    OutOfRange(String a)
    {
        super(a);
    }
}



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
        int c;
        Scanner sca = new Scanner(System.in);

        do {
            System.out.println("\n\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");

            System.out.println("\n________________#####->   TRENDING Destinations   <-#####______________\n");
            try {
                System.out.println("\n➤ Enter 1: Bali");
                System.out.println("         2: Dubai");
                System.out.println("         3: Singapore");
                System.out.println("         4: Bhutan\n");


                System.out.print("\nEnter your choice : ");
                c = sca.nextInt();
                if(!(c>0 && c<=4))
                    throw  new OutOfRange("Not in range");
            } catch (InputMismatchException e) {
                sca.nextLine();
                System.out.println("Invalid input...!!!");
                c = -1;
            }
            catch (OutOfRange e)
            {
                System.out.println("Invalid ....!!!  -->Enter the integer between 1 & " + 4);
                c=-1;
            }
        }while(c==-1);
        switch(c)
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