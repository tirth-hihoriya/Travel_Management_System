package com.trip_package;


class Flight {
    private String company;
    private String fd_departure_time;
    private String fd_landing_time;
    private String ld_departure_time;
    private String ld_landing_time;
    private int f_price;

    public Flight(String company, String fd_departure_time, String fd_landing_time, String ld_departure_time, String ld_landing_time, int f_price) {
        this.company = company;
        this.fd_departure_time = fd_departure_time;
        this.fd_landing_time = fd_landing_time;
        this.ld_departure_time = ld_departure_time;
        this.ld_landing_time = ld_landing_time;
        this.f_price = f_price;
    }
    public Flight()
    {}

    public int getf_price() {
        return f_price;
    }

    public void setf_price(int f_price) {
        this.f_price = f_price;
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


    public void flight_details(Flight f)
    {
        System.out.println("\n                      <<<<<<<<<<   "+ f.getCompany() + "   >>>>>>>>>>");
        System.out.println();
        System.out.println("First day :  "+ f.getFd_departure_time() + " _________✈_________" + f.getFd_landing_time() + "      ---> additional price: "+f.f_price);
        System.out.println();
        System.out.println("Last day :  "+ f.getLd_departure_time() + " _________✈_________" + f.getLd_landing_time() + "      ---> additional price: "+f.f_price);
    }


}

