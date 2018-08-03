package com.example.shara.tourguideapp;

public class Tour {
    private int imageid;
    private String eventName;
    private String restName;


    public Tour(int image, String entName, String rstName) {
        eventName = entName;
        restName = rstName;

        imageid = image;

    }

    public int getImageid() {
        return imageid;
    }


    public String getEventName() {
        return eventName;
    }

    public String getRestName() {
        return restName;
    }
}



