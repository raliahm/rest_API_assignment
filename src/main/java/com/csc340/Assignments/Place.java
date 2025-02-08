package com.csc340.Assignments;

public class Place{
    String name;
    String address;
    boolean house;
    boolean landmark;
    boolean road;

    public Place(String name, String address) {
        this.name = name;
        this.address = address;
        this.house = false;
        this.landmark = false;
        this.road = false;
    }
    public Place(String name, String address, boolean house, boolean landmark, boolean road) {
        this.name = name;
        this.address = address;
        this.house = house;
        this.landmark = landmark;
        this.road = road;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public boolean isHouse() {
        return house;
    }
    public void setHouse(boolean house) {
        this.house = house;
    }
    public boolean isLandmark() {
        return landmark;
    }
    public void setLandmark(boolean landmark) {
        this.landmark = landmark;
    }
    public boolean isRoad() {
        return road;
    }
    public void setRoad(boolean road) {
        this.road = road;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}