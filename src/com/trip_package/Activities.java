package com.trip_package;

class Activities {
    private String name;
    private int a_price;
    private boolean includes;



    Activities(String name, int a_price, boolean includes) {
        this.name = name;
        this.a_price = a_price;
        this.includes = includes;
    }


    boolean isIncludes() {
        return includes;
    }

    void setIncludes(boolean includes) {
        this.includes = includes;
    }


    String getName() {
        return name;
    }

    int getA_price() {
        return a_price;
    }


}

