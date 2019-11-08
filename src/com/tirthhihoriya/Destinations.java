package com.tirthhihoriya;


public class Destinations
{

    public Destinations(String description, String category) {
        setDescription(description);
        setCategory(category);
    }

    private String description;
    private String category;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



}
