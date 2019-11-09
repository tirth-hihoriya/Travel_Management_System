package com.trip_package;

public class Activities {
    private String name;
    private int a_price;
    private boolean includes;

    public Activities(String name, int a_price, boolean includes) {
        this.name = name;
        this.a_price = a_price;
        this.includes = includes;
    }
    Activities(){}

    public boolean isIncludes() {
        return includes;
    }

    public void setIncludes(boolean includes) {
        this.includes = includes;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA_price() {
        return a_price;
    }

    public void setA_price(int a_price) {
        this.a_price = a_price;
    }

    public void activity_details(Activities a)
    {
        System.out.println("<<<<<<<  " + a.name + "  >>>>>>>           -->  + ₹" +  a.a_price );
    }

}

