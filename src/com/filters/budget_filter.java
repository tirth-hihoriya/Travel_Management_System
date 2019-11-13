package com.filters;

import java.util.InputMismatchException;
import java.util.Scanner;
class OutOfRange extends Exception
{
    OutOfRange(String a)
    {
        super(a);
    }
}


public class budget_filter {
    private Scanner sca = new Scanner(System.in);

    private int budget;

    public int getBudget() {
        return budget;
    }

    public void setBudget()
    {
        final int n = 3;
        System.out.println("\n\n    *********##  SET BUDGET LIMIT  per person ##*********");

        System.out.println("\n\n➤ Enter 1: 25,00 to 50,000");
        System.out.println("        2: 50,001 to 75,000");
        System.out.println("        3: 75,001 and above");

        do {
            try {
                System.out.print("\n\nEnter your choice : ");

                budget = sca.nextInt();

                if(!(budget>0 && budget<=n)) {

                    throw new OutOfRange("@ Not in range");
                }
            } catch (InputMismatchException e) {
                sca.nextLine();
                System.out.println("@ Invalid input...!!!");
                budget = -1;
            }
            catch (OutOfRange e)
            {
                System.out.println("@ Invalid ....!!!  -->Enter the integer between 1 & " + n);
                budget=-1;
            }
        }while(budget==-1);

    }
}
