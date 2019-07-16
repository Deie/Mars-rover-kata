package com.company;

import java.util.Objects;

public class Position {

    public int positionX;
    public int positionY;

    public Position(int x, int y){
        this.positionX = x;
        this.positionY = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return positionX == position.positionX &&
                positionY == position.positionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionX, positionY);
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Position{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
