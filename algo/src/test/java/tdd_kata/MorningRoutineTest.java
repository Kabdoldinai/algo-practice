package tdd_kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.practice.tdd_kata.MorningRoutine;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorningRoutineTest {

    private MorningRoutine morningRoutine;
    @BeforeEach
    void onSetUp() {
        morningRoutine = new MorningRoutine();
    }

    @Test
    void shouldDoExerciseBetween6And7() {
        LocalTime currentTime = LocalTime.of(6, 30);
        assertEquals("Do exercise", morningRoutine.whatShouldIDoNow(currentTime));
    }

    @Test
    void shouldReadAndStudyBetween7And8() {
        LocalTime currentTime = LocalTime.of(7, 20);
        assertEquals("Read and study", morningRoutine.whatShouldIDoNow(currentTime));
    }

    @Test
    void shouldHaveBreakfastBetween8And9() {
        LocalTime currentTime = LocalTime.of(8, 30);
        assertEquals("Have breakfast", morningRoutine.whatShouldIDoNow(currentTime));
    }

    @Test
    void shouldDoNothing() {
        LocalTime currentTime = LocalTime.of(10, 30);
        assertEquals("No activity", morningRoutine.whatShouldIDoNow(currentTime));
    }

//    // :TODO make the test pass
//    @Test
//    void shouldTakeAShowerAfterSixFourtyFive() {
//        LocalTime currentTime = LocalTime.of(06, 50);
//        assertEquals("Take a shower", morningRoutine.whatShouldIDoNow(currentTime));
//    }

}
