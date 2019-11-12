package com.trip_package;


class Flight {
    private String company;
    private String fd_departure_time;
    private String fd_landing_time;
    private String ld_departure_time;
    private String ld_landing_time;
    private int f_price;
    private boolean  includes;

    Flight(String company, String fd_departure_time, String fd_landing_time, String ld_departure_time, String ld_landing_time, int f_price, boolean includes) {
        this.company = company;
        this.fd_departure_time = fd_departure_time;
        this.fd_landing_time = fd_landing_time;
        this.ld_departure_time = ld_departure_time;
        this.ld_landing_time = ld_landing_time;
        this.f_price = f_price;
        this.includes = includes;
    }


    String getCompany() {
        return company;
    }

    String getFd_departure_time() {
        return fd_departure_time;
    }


    String getFd_landing_time() {
        return fd_landing_time;
    }


    String getLd_departure_time() {
        return ld_departure_time;
    }


    String getLd_landing_time() {
        return ld_landing_time;
    }

    int getF_price() {
        return f_price;
    }


    boolean isIncludes() {
        return includes;
    }

    void setIncludes(boolean includes) {
        this.includes = includes;
    }



}

