package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {

    @Test
    public void should_set_position() {
        // given
        Rover rover = new Rover();
        final Position initPosition = new Position(7,8);

        // when
        rover.setPosition(initPosition);
        final Position finalPosition = rover.getPosition();

        // then
        final Position expectedPosition = new Position(7,8);
        assertEquals(expectedPosition, finalPosition);

    }

}