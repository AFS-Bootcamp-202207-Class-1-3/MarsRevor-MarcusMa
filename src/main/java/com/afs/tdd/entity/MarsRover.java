package com.afs.tdd.entity;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }


    public void executeCommand(String command) {
        if (command.equals("M")) {
            move();
        }
    }

    private void move() {
        if (location.getDirection().equals("N")) {
            location.setLocationY(location.getLocationY() + 1);
        }
    }


}
