package tdd_kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.practice.tdd_kata.MarsRover;

import static org.junit.jupiter.api.Assertions.assertEquals;

//  given an input 'MMRMMLM' then the output should be '2:3:N'
public class MarsRoverTest {

    private MarsRover marsRover;

    @BeforeEach
    void setUp() {
        marsRover = new MarsRover(0, 0, 'N', 10, 10);
    }

    @Test
    void shouldReturnInitialPositionWhenNoCommandGiven() {
        assertEquals("0:0:N", marsRover.execute(""));
    }

    @Test
    void shouldMoveNorthWhenCommandIsM() {
        assertEquals("0:1:N", marsRover.execute("M"));
    }

    @Test
    void shouldTurnEastWhenFacingNorthAndCommandIsR() {
        assertEquals("0:0:E", marsRover.execute("R"));
    }

    @Test
    void shouldTurnWestWhenFacingNorthAndCommandIsL() {
        assertEquals("0:0:W", marsRover.execute("L"));
    }

    @Test
    void shouldMoveEastWhenFacingEastAndCommandIsM() {
        MarsRover rover = new MarsRover(0, 0, 'E', 10, 10);

        String position = rover.execute("M");

        assertEquals("1:0:E", position);
    }

    @Test
    void shouldMoveSouthWhenFacingSouthAndCommandIsM() {
        MarsRover rover = new MarsRover(0, 0, 'S', 10, 10);

        String position = rover.execute("M");

        assertEquals("0:9:S", position); // wrap around
    }

    @Test
    void shouldMoveWestWhenFacingWestAndCommandIsM() {
        MarsRover rover = new MarsRover(0, 0, 'W', 10, 10);

        String position = rover.execute("M");

        assertEquals("9:0:W", position); // wrap around
    }

    @Test
    void shouldProcessSequenceOfCommands() {
        assertEquals("2:3:N", marsRover.execute("MMRMMLM"));
    }

}
