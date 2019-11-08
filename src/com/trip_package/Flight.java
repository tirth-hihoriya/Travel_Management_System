package com.trip_package;


class Flight {
    private String company;
    private String fd_departure_time;
    private String fd_landing_time;
    private String ld_departure_time;
    private String ld_landing_time;
    private int price;

    public Flight(String company, String fd_departure_time, String fd_landing_time, String ld_departure_time, String ld_landing_time, int price) {
        this.company = company;
        this.fd_departure_time = fd_departure_time;
        this.fd_landing_time = fd_landing_time;
        this.ld_departure_time = ld_departure_time;
        this.ld_landing_time = ld_landing_time;
        this.price = price;
    }
    public Flight()
    {}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFd_departure_time() {
        return fd_departure_time;
    }

    public void setFd_departure_time(String fd_departure_time) {
        this.fd_departure_time = fd_departure_time;
    }

    public String getFd_landing_time() {
        return fd_landing_time;
    }

    public void setFd_landing_time(String fd_landing_time) {
        this.fd_landing_time = fd_landing_time;
    }

    public String getLd_departure_time() {
        return ld_departure_time;
    }

    public void setLd_departure_time(String ld_departure_time) {
        this.ld_departure_time = ld_departure_time;
    }

    public String getLd_landing_time() {
        return ld_landing_time;
    }

    public void setLd_landing_time(String ld_landing_time) {
        this.ld_landing_time = ld_landing_time;
    }


}

