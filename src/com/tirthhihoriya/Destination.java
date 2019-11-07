package com.tirthhihoriya;

import java.util.*;
class Destination
{
    private String destription;
    private String category;
    private int budget;

    private int goingWith;

    public String getDestription() {
        return destription;
    }

    public void setDestription(String destription) {
        this.destription = destription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getGoingWith() {
        return goingWith;
    }

    public void setGoingWith(int goingWith) {
        this.goingWith = goingWith;
    }

    Scanner sca = new Scanner(System.in);

    Destination(String category)
    {
        this.category = category;
        setGoingWith();
        setBudget();

    }

    // ---------  Filters ---------

    public void setGoingWith()
    {
        System.out.println("Set Going With - ");
        System.out.println("1: Couple");
        System.out.println("2: Families");
        System.out.println("3: Friends");
        System.out.print("Enter your choice : ");
        goingWith = sca.nextInt();
    }

    public void setBudget()
    {
        System.out.println("Set Budget per person - ");
        if(category.equals("national"))
        {
            System.out.println("1: 10,000 to 25,000");
            System.out.println("2: 25,001 to 50,000");
            System.out.println("3: 50,001 and above");
        }
        else
        {
            System.out.println("1: 25,00 to 50,000");
            System.out.println("2: 50,001 to 75,000");
            System.out.println("3: 75,001 and above");
        }
        System.out.print("Enter your choice : ");
        budget = sca.nextInt();

    }
}