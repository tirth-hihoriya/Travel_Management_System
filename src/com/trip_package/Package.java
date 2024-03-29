package com.trip_package;


import java.io.Serializable;

public class Package implements Serializable {
    private String name;
    private int nights;
    private String facilities;
    private int base_price;
    private int budget_category;
    private boolean includes;
    private boolean allowed;
    private int t_a_price;
    private int a_f_price;

    public Package(String name, int nights, String facilities, int base_price, boolean includes, boolean allowed) {
        this.name = name;
        this.nights = nights;
        this.facilities = facilities;
        this.base_price = base_price;
        this.budget_category = budget_category(base_price);
        this.includes = includes;
        this.allowed = allowed;
    }

    boolean isAllowed() {
        return allowed;
    }

    void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }

    public String getName() {
        return name;
    }


    int getNights() {
        return nights;
    }

    public String getFacilities() {
        return facilities;
    }


    public int getBase_price() {
        return base_price;
    }

    int getBudget_category() {
        return budget_category;
    }

    boolean isIncludes() {
        return includes;
    }

    void setIncludes(boolean includes) {
        this.includes = includes;
    }


    public int getT_a_price() {
        return t_a_price;
    }

    void setT_a_price(int t_a_price) {
        this.t_a_price = t_a_price;
    }

    public int getA_f_price() {
        return a_f_price;
    }

    void setA_f_price(int a_f_price) {
        this.a_f_price = a_f_price;
    }

    private int budget_category(int a) {
        if (a < 50000)
            return 1;
        else if (a < 75000)
            return 2;
        else return 3;
    }
}

