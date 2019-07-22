package com.company;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoverTest {


    @Test
    public void should_move_forward() {
        // given
        Rover rover = Rover.create(Orientation.SOUTH, 3, 6, new Grid(0, 0, 10, 10));

        // when
        rover.moveForward();

        // then
        final Rover expectedRover = Rover.create(Orientation.SOUTH, 3,5, new Grid(0, 0, 10, 10));
        assertEquals(expectedRover, rover);

    }

    @Test
    public void should_move_backward() {
        // given
        Rover rover = Rover.create(Orientation.WEST, 8, 8, new Grid(0, 0, 10, 10));


        // given
        rover.moveBackward();

        // then
        final Rover expectedRover = Rover.create(Orientation.WEST, 9,8, new Grid(0, 0, 10, 10));
        assertEquals(expectedRover, rover);

    }

    @Test
    public void should_turn_to_the_right() {
        // given
        Rover rover = Rover.create(Orientation.SOUTH, 3, 6, new Grid(0, 0, 10, 10));

        // when
        rover.turnRight();

        // then
        final Rover expectedRover = Rover.create(Orientation.WEST, 3,6, new Grid(0, 0, 10, 10));
        assertEquals(expectedRover, rover);

    }

    @Test
    public void should_turn_to_the_left() {
        // given
        Rover rover = Rover.create(Orientation.WEST, 3, 6, new Grid(0, 0, 10, 10));

        // when
        rover.turnLeft();

        // then
        final Rover expectedRover = Rover.create(Orientation.SOUTH, 3,6, new Grid(0, 0, 10, 10));
        assertEquals(expectedRover, rover);

    }

    @Test
    public void should_take_an_order_one_at_a_time() {
        // given
        Rover rover = Rover.create(Orientation.NORTH, 8, 8, new Grid(0, 0, 10, 10));

        // when
        rover.execute("L");


        // then
        final Rover expectedRover = Rover.create(Orientation.WEST, 8,8, new Grid(0, 0, 10, 10));
        assertEquals(expectedRover, rover);

        rover.execute("L");
        final Rover expectedRover1 = Rover.create(Orientation.SOUTH, 8,8, new Grid(0, 0, 10, 10));
        assertEquals(expectedRover1, rover);

        rover.execute("L");
        final Rover expectedRover2 = Rover.create(Orientation.EAST, 8,8, new Grid(0, 0, 10, 10));
        assertEquals(expectedRover2, rover);

    }

    @Test
    public void should_take_a_list_of_orders_moving_forward() {
        //given
        Rover rover = Rover.create(Orientation.NORTH, 1, 2, new Grid(0, 0, 10, 10));


        // when
        rover.execute("LFLFLFLFF");

        //then
        final Rover expectedRover = Rover.create(Orientation.NORTH, 1,3, new Grid(0, 0, 10, 10));
        assertEquals(expectedRover, rover);

    }

    @Test
    public void should_take_a_list_of_orders_moving_backward() {
        // given
        Rover rover = Rover.create(Orientation.EAST, 3, 3, new Grid(0, 0, 10, 10));


        /// when
        rover.execute("FFRFFRFRRF");

        // then
        final Rover expectedRover = Rover.create(Orientation.EAST, 5,1, new Grid(0, 0, 10, 10));
        assertEquals(expectedRover, rover);


    }

    @Test(expected = RuntimeException.class)
    public void should_be_blocked_at_grid_border_when_goes_too_forward_left() {
        // given
        Rover rover = Rover.create(Orientation.NORTH, 3, 10, new Grid(0, 0, 10, 10));


        /// when
        rover.moveForward();

        // then
        //expected

    }

    @Test(expected = RuntimeException.class)
    public void should_be_blocked_at_grid_border_when_goes_too_forward_right() {
        // given
        Rover rover = Rover.create(Orientation.SOUTH, 3, 0, new Grid(0, 0, 10, 10));


        /// when
        rover.moveForward();

        // then
        //expected

    }
}

