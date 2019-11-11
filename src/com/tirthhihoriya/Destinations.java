package com.tirthhihoriya;


import java.io.Serializable;

public class Destinations implements Serializable
{
    private String description;

    public Destinations(String description) {
        setDescription(description);

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
