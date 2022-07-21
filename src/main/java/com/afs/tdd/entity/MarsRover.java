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
        String direction = location.getDirection();
        if(direction.equals("N")){
            location.setDirection("E");
        }else if(direction.equals("S")){
            location.setDirection("W");
        }else if(direction.equals("E")){
            location.setDirection("S");
        }else if(direction.equals("W")){
            location.setDirection("N");
        }
    }

    private void turnLeft() {
        String direction = location.getDirection();
        if(direction.equals("N")){
            location.setDirection("W");
        }else if(direction.equals("S")){
            location.setDirection("E");
        }else if(direction.equals("E")){
            location.setDirection("N");
        }else if(direction.equals("W")){
            location.setDirection("S");
        }
    }

    private void move() {
        String direction = location.getDirection();
        if (direction.equals("N")) {
            location.setLocationY(location.getLocationY() + 1);
        }else if(direction.equals("S")){
            location.setLocationY(location.getLocationY() - 1);
        }else if(direction.equals("E")){
            location.setLocationX(location.getLocationX() + 1);
        }else if(direction.equals("W")){
            location.setLocationX(location.getLocationX() - 1);
        }
    }


}
