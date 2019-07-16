package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrientationTest {

    @Test
    public void should_set_orientation() {
        // given
        Rover rover = new Rover();

        // when
        rover.setOrientation(Orientation.SOUTH);
        final Orientation finalOrientation = rover.getOrientation();

        // then
        final Orientation expectedOrientation = Orientation.SOUTH;
        assertEquals(expectedOrientation, finalOrientation);

    }

}