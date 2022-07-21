package com.afs.tdd.entity;

public class Location {
    private int locationX;
    private int locationY;
    private String direction;

    public Location(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return locationX +" "+ locationY +" "+ direction ;
    }
}
