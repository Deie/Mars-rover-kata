package com.company;

public class Rover {


    private Orientation orientation;
    private Position position;
    private Grid grid;


    // TURN LEFT AND RIGHT---------------------------------------
    public void turnRight() {
        orientation = orientation.turnRight();
    }

    public void turnLeft() {
        orientation = orientation.turnLeft();
    }


    // MOVE FORWARD AND BACKWARD--------------------------------------
    public Position moveForward() {
        return position = orientation.moveForward(position);
    }

    public Position moveBackward() {
        return position = orientation.moveBackward(position);
    }


    // SET POSITION AND ORIENTATION-----------------------------------------
    public void setPosition(Position position) {
        this.position = position;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }


    // GET POSITION AND ORIENTATION--------------------------------------
    public Position getPosition() {
        return position;
    }

    public Orientation getOrientation() {
        return orientation;
    }


    // GET THE GRID----------------------------------------------------
    public Grid getGrid(Grid grid) {
        return grid;
    }


    // COMMANDS-----------------------------------------------------

    public void execute(String commands) {
        for (int index = 0; index < commands.length(); ++index) {
            execute(commands.charAt(index));
        }
    }

    public void execute(Character command){
        if(command.equals('L')){
            turnLeft();
        }else if(command.equals('R')){
            turnRight();
        }else if(command.equals('F')){
            position = orientation.moveForward(position);
        }else if(command.equals('B')){
            position = orientation.moveBackward(position);
        }else {
            throw new AssertionError("Oops wrong command, try again" );
        }
    }


}
