package com.filters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class night_filter {
    private Scanner sca = new Scanner(System.in);

    private int nights;

    public int getNights() {
        return nights;
    }

    public void setNights()
    {
        final int n = 3;
        System.out.println("\n\n\n    *********## Set Number of NIGHTs ##********* ");
        System.out.println("\n\n➤ Enter 1: 5 Night, 6 Days");
        System.out.println("        2: 6 Night, 7 Days");
        System.out.println("        3: 7 Night, 8 Days");


        do {
            try {
                System.out.print("\n\nEnter your choice : ");

                nights = sca.nextInt();

                if(!(nights>0 && nights<=n)) {

                    throw new OutOfRange("@Not in range");
                }
            } catch (InputMismatchException e) {
                sca.nextLine();
                System.out.println("@ Invalid input...!!!");
                nights = -1;
            }
            catch (OutOfRange e)
            {
                System.out.println("@ Invalid ....!!!  -->Enter the integer between 1 & " + n);
                nights=-1;
            }
        }while(nights==-1);

    }
}
