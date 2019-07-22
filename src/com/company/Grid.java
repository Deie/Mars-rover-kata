package com.company;

import java.util.Objects;

public class Grid {

    private final int minX;
    private final int minY;
    private final int maxX;
    private final int maxY;


    public Grid(int minX, int minY, int maxX, int maxY) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }



    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grid grid = (Grid) o;
        return minX == grid.minX &&
                minY == grid.minY &&
                maxX == grid.maxX &&
                maxY == grid.maxY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minX, minY, maxX, maxY);
    }

    @Override
    public String toString() {
        return "Grid{" +
                "minX=" + minX +
                ", minY=" + minY +
                ", maxX=" + maxX +
                ", maxY=" + maxY +
                '}';
    }
}
