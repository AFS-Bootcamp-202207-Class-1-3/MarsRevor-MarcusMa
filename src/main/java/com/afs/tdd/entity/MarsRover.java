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
        }else if(command.equals("L")){
            turnLeft();
        }else if(command.equals("R")){
            turnRight();
        }
    }
//    duplicateCode
    private void turnRight() {
        if(location.getDirection().equals("N")){
            location.setDirection("E");
        }
    }

    private void turnLeft() {
        if(location.getDirection().equals("N")){
            location.setDirection("W");
        }
    }

    private void move() {
        if (location.getDirection().equals("N")) {
            location.setLocationY(location.getLocationY() + 1);
        }
    }


}
