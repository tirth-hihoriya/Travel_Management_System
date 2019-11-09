package com.filters;

import java.util.Scanner;

public class night_filter {
    Scanner sca = new Scanner(System.in);

    private int nights;

    public int getNights() {
        return nights;
    }

    public void setNights()
    {
        System.out.println("\n\n********* Set Number of NIGHTs ********* ");
        System.out.println("\n1: 5 Night, 6 Days");
        System.out.println("2: 6 Night, 7 Days");
        System.out.println("3: 7 Night, 8 Days");


        System.out.print("\nEnter your choice : ");
        nights = sca.nextInt();
    }
}
