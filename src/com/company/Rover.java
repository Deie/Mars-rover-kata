package com.company;

import java.util.Objects;

public class Rover {



    private Orientation orientation;
    private Position position;
    private Grid grid;

    private Rover(){

    }

    public static Rover create(Orientation orientation, int x, int y, Grid grid) {

        final Rover rover = new Rover();
        rover.grid = grid;
        rover.position = new Position(x, y);
        rover.orientation = orientation;
        return rover;
    }

    // TURN LEFT AND RIGHT---------------------------------------
    public void turnRight() {
        orientation = orientation.turnRight();
    }

    public void turnLeft() {
        orientation = orientation.turnLeft();
    }


    // MOVE FORWARD AND BACKWARD--------------------------------------
    public void moveForward() {
        position = orientation.moveForward(position, grid);
    }

    public void moveBackward() {
        position = orientation.moveBackward(position, grid);
    }


    // GET POSITION AND ORIENTATION--------------------------------------
    public Position getPosition() {
        return position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    // COMMAND---------------------------------------------------------------
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
            position = orientation.moveForward(position, grid);
        }else if(command.equals('B')){
            position = orientation.moveBackward(position, grid);
        }else {
            throw new AssertionError("Oops wrong command, try again" );
        }
    }

    @Override
    public String toString() {
        return "Rover{" +
                "orientation=" + orientation +
                ", position=" + position +
                ", grid=" + grid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return orientation == rover.orientation &&
                Objects.equals(position, rover.position) &&
                Objects.equals(grid, rover.grid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orientation, position, grid);
    }

}
