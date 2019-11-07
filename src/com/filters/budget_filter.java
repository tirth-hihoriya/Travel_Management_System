package com.filters;

import java.util.Scanner;

public class budget_filter {
    Scanner sca = new Scanner(System.in);

    private int budget;

    public int getBudget() {
        return budget;
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
