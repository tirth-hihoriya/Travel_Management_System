package com.tirthhihoriya;

import java.util.Scanner;

interface filters_applied
{
    public void setNights();
    public void setBudget();

}

public class Filters {
    Scanner sca = new Scanner(System.in);

    private int budget;
    private int nights;

    public int getBudget() {
        return budget;
    }


    public int getNights() {
        return nights;
    }

    public void setNights()
    {
        System.out.println("--------- Set Number of NIGHTs ----------- ");
        System.out.println("1: 5 Night, 6 Days");
        System.out.println("2: 6 Night, 7 Days");
        System.out.println("3: 7 Night, 8 Days");


        System.out.print("Enter your choice : ");
        nights = sca.nextInt();
    }

    public void setBudget()
    {
        System.out.println("--------------  SET BUDGET LIMIT  per person --------------");

        System.out.println("1: 25,00 to 50,000");
        System.out.println("2: 50,001 to 75,000");
        System.out.println("3: 75,001 and above");

        System.out.print("Enter your choice : ");
        budget = sca.nextInt();

    }
}
