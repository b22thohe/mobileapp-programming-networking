package com.example.networking;

public class Mountain {
    // Member variables
    private String name;
    private String location;
    private int height;

    // Default Constructor
    public Mountain() {
        name = "Namn saknas";
        location = "Saknar plats";
        height = -1;
    }

    // Constructor with parameters or creating new Mountain
    public Mountain(String n, String l, int h) {
        name = n;
        location = l;
        height = h;
    }

    public String showInfo() {
        String tmp = new String();
        tmp += " is located in mountain range " + location + " and reaches " + height + "m above sea level.";
        return tmp;
    }

    // Setters for member variables
    public void setName(String n) {
        name = n;
    }

    public void setLocation(String l) {
        location = l;
    }

    public void setHeight(int h) {
        height = h;
    }

    // Getters for member variables
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getHeight() {
        return height;
    }
}
