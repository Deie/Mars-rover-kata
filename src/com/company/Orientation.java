package com.company;

public enum Orientation {

    NORTH {
        Orientation turnRight() {
            return EAST;
        }

        Orientation turnLeft() { return WEST; }

        Position moveForward(Position position, Grid grid) {

            if(position.y < grid.getMaxY() && position.y > grid.getMinY()) {
                return new Position(position.x, position.y + 1);
            }
            throw new RuntimeException("Oops you out the grid" );
        }

        Position moveBackward(Position position, Grid grid) {
            if(position.y < grid.getMaxY() && position.y > grid.getMinY()) {
                return new Position(position.x, position.y - 1);
            }
            throw new RuntimeException("Oops you out the grid" );

        }
    },
    EAST {
        Orientation turnRight() {
            return SOUTH;
        }

        Orientation turnLeft() {
            return NORTH;
        }

        Position moveForward(Position position, Grid grid) {

            if(position.x < grid.getMaxX() && position.x > grid.getMinX()) {
                return new Position(position.x + 1, position.y);
            }
            throw new RuntimeException("Oops you out the grid" );
        }

        Position moveBackward(Position position, Grid grid) {

            if(position.x < grid.getMaxX() && position.x > grid.getMinX()) {
                return new Position(position.x - 1, position.y);
            }
            throw new RuntimeException("Oops you out the grid" );

        }
    },
    SOUTH {
        Orientation turnRight() {
            return WEST;
        }

        Orientation turnLeft() {
            return EAST;
        }

        Position moveForward(Position position, Grid grid) {

            if(position.y < grid.getMaxY() && position.y > grid.getMinY()) {
                return new Position(position.x, position.y - 1);
            }
            throw new RuntimeException("Oops you out the grid" );
        }

        Position moveBackward(Position position, Grid grid) {

            if(position.y < grid.getMaxY() && position.y > grid.getMinY()) {
                return new Position(position.x, position.y + 1);
            }
            throw new RuntimeException("Oops you out the grid" );
        }
    },
    WEST {
        Orientation turnRight() {
            return NORTH;
        }

        Orientation turnLeft() {
            return SOUTH;
        }

        Position moveForward(Position position, Grid grid) {

            if(position.x < grid.getMaxX() && position.x > grid.getMinX()) {
                return new Position(position.x - 1, position.y);
            }
            throw new RuntimeException("Oops you out the grid" );

        }

        Position moveBackward(Position position, Grid grid) {

            if(position.x < grid.getMaxX() && position.x > grid.getMinX()) {
                return new Position(position.x + 1, position.y);
            }
            throw new RuntimeException("Oops you out the grid" );

        }
    };


    abstract Orientation turnRight();

    abstract Orientation turnLeft();

    abstract Position moveForward(Position position, Grid grid);

    abstract Position moveBackward(Position position, Grid grid);



}
