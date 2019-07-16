package com.company;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoverTest {


    @Test
    public void should_move_forward() {
        // given
        Rover rover = new Rover();
        Grid grid = new Grid(10, 10, -10, -10);
        rover.getGrid(grid);
        rover.setOrientation(Orientation.SOUTH);
        Position position = new Position(3,6);
        rover.setPosition(position);

        // when
        rover.moveForward();

        // then
        final Position expectedPosition = new Position(3, 5);
        final Position finalPosition = rover.getPosition();

        assertEquals(expectedPosition, finalPosition);

    }

    @Test
    public void should_move_backward() {
        // given
        Rover rover = new Rover();
        Grid grid = new Grid(10, 10, -10, -10);
        rover.getGrid(grid);
        rover.setOrientation(Orientation.WEST);
        Position position = new Position(8,8);
        rover.setPosition(position);

        // given
        rover.moveBackward();

        // then
        final Position expectedPosition = new Position(9, 8);
        final Position finalPosition = rover.getPosition();

        assertEquals(expectedPosition, finalPosition);

    }

    @Test
    public void should_turn_to_the_right() {
        // given
        Rover rover = new Rover();
        Grid grid = new Grid(10, 10, -10, -10);
        rover.getGrid(grid);
        rover.setOrientation(Orientation.SOUTH);
        rover.getOrientation();

        // when
        rover.turnRight();

        // then
        final Orientation expectedOrientation = Orientation.WEST;
        final Orientation finalOrientation = rover.getOrientation();

        assertEquals(expectedOrientation, finalOrientation);

    }

    @Test
    public void should_turn_to_the_left() {
        Rover rover = new Rover();
        Grid grid = new Grid(10, 10, -10, -10);
        rover.getGrid(grid);
        rover.setOrientation(Orientation.WEST);

        // when
        rover.turnLeft();

        // then
        final Orientation expectedOrientation = Orientation.SOUTH;
        final Orientation finalOrientation = rover.getOrientation();

        assertEquals(expectedOrientation, finalOrientation);

    }

    @Test
    public void should_take_an_order_one_at_a_time() {
        // given
        Rover rover = new Rover();
        rover.setOrientation(Orientation.NORTH);
        Position position = new Position(8,8);
        rover.setPosition(position);

        // when
        rover.execute("L");

        // then
        final Orientation firstExpectedOrientation = Orientation.WEST;
        final Orientation firstFinalOrientation = rover.getOrientation();
        assertEquals(firstExpectedOrientation, firstFinalOrientation);

        rover.execute("L");
        final Orientation secondExpectedOrientation = Orientation.SOUTH;
        final Orientation secondFinalOrientation = rover.getOrientation();
        assertEquals(secondExpectedOrientation, secondFinalOrientation);

        rover.execute("L");
        final Orientation thirdExpectedOrientation = Orientation.EAST;
        final Orientation thirdFinalOrientation = rover.getOrientation();
        assertEquals(thirdExpectedOrientation, thirdFinalOrientation);

    }

    @Test
    public void should_take_a_list_of_orders_moving_forward() {
        //given
        Rover rover = new Rover();
        rover.setOrientation(Orientation.NORTH);
        Position position = new Position(1,2);
        rover.setPosition(position);

        // when
        rover.execute("LFLFLFLFF");

        ///then
        final Position expectedPosition = new Position(1,3);
        final Orientation expectedOrientation = Orientation.NORTH;

        final Position finalPosition = rover.getPosition();
        final Orientation finalOrientation = rover.getOrientation();
        System.out.println(finalPosition + " " + finalOrientation);

        assertEquals(expectedOrientation, finalOrientation);
        assertEquals(expectedPosition, finalPosition);
    }

    @Test
    public void shouldTakeAListOfOrdersMovingBackward() {
        // given
        Rover rover = new Rover();

        rover.setOrientation(Orientation.EAST);
        Position position = new Position(3,3);
        rover.setPosition(position);

        /// when
        rover.execute("FFRFFRFRRF");

        // then
        final Orientation expectedOrientation = Orientation.EAST;
        final Position expectedPosition = new Position(5, 1);

        final Position finalPosition = rover.getPosition();
        final Orientation finalOrientation = rover.getOrientation();
        System.out.println(finalPosition + " " + finalOrientation);


        assertEquals(expectedOrientation, finalOrientation);
        assertEquals(expectedPosition, finalPosition);

    }
}

