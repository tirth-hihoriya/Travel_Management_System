package com.tirthhihoriya;

class Package{
    private String describe;
    private int nights;
    private String facilities;
    private int total_price;

    public Package(String describe, int nights, String facilities, int total_price) {
        this.describe = describe;
        this.nights = nights;
        this.facilities = facilities;
        this.total_price = total_price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }
    Package()
    {

    }



}

class Select_package
{
    private int t_p_price;

    public int getT_p_price() {
        return t_p_price;
    }

    public void setT_p_price(int t_p_price) {
        this.t_p_price = t_p_price;
    }

    public Package selection(String destination, int budget, int night)
    {
       Package p = new Package();
        if(destination.equals("Bali"))
        {
            if (budget == 1)   // 1: 25,00 to 50,000
            {
                if (night == 1)  // 1: 5 Night, 6 Days
                {
                    p = new Package("Amazing Holiday in Goa", 5, "Hotel + FLight + Transfer", 14890);
                } else if (night == 2) // 2: 6 Night, 7 Days
                {
                    p = new Package("Romantic Holiday in Goa", 6, "Hotel + FLight + Transfer", 19362);
                } else   // 3: 7 Night, 8 Days
                {
                    p = new Package("Free Sightseeing - Goan Holiday with Family", 7, "Hotel + FLight + Transfer", 24570);
                }
            } else if (budget == 2)  // 2: 50,001 to 75,000
            {
                if (night == 1) {
                    p = new Package("Amazing Holiday in Goa", 5, "Hotel + FLight + Transfer", 54570);
                } else if (night == 2) {
                    p = new Package("Romantic Holiday in Goa", 6, "Hotel + FLight + Transfer + Activities", 64780);
                } else           // 3: 75,001 and above
                {
                    p = new Package("Free Sightseeing - Goan Holiday with Family", 7, "Hotel + FLight + Transfer + Activities", 70362);
                }

            }
        }

    return p;
    }
}