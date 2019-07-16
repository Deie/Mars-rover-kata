package com.company;

import java.util.Objects;

public class Grid {

    public int pointX;
    public int pointY;
    public int maxX;
    public int maxY;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Grid(int x, int y, int xx, int yy) {
        pointX = x;
        pointY = y;
        maxX = xx;
        maxY = yy;
    }



}
