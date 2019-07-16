package com.company;

public enum Orientation {

    NORTH {
        Orientation turnRight() {
            return EAST;
        }

        Orientation turnLeft() {
            return WEST;
        }

        Position moveForward(Position position) {
            return new Position(position.positionX, position.positionY + 1);
        }

        Position moveBackward(Position position) {
            return new Position(position.positionX, position.positionY - 1);
        }
    },
    EAST {
        Orientation turnRight() {
            return SOUTH;
        }

        Orientation turnLeft() {
            return NORTH;
        }

        Position moveForward(Position position) {
            return new Position(position.positionX + 1, position.positionY);
        }

        Position moveBackward(Position position) {
            return new Position(position.positionX - 1, position.positionY);
        }
    },
    SOUTH {
        Orientation turnRight() {
            return WEST;
        }

        Orientation turnLeft() {
            return EAST;
        }

        Position moveForward(Position position) {
            return new Position(position.positionX, position.positionY - 1);
        }

        Position moveBackward(Position position) {
            return new Position(position.positionX, position.positionY + 1);
        }
    },
    WEST {
        Orientation turnRight() {
            return NORTH;
        }

        Orientation turnLeft() {
            return SOUTH;
        }

        Position moveForward(Position position) {
            return new Position(position.positionX - 1, position.positionY);
        }

        Position moveBackward(Position position) {
            return new Position(position.positionX + 1, position.positionY);
        }
    };


    abstract Orientation turnRight();

    abstract Orientation turnLeft();

    abstract Position moveForward(Position position);

    abstract Position moveBackward(Position position);



}
