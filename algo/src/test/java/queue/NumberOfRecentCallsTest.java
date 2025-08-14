package queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.queue.NumberOfRecentCalls;

class NumberOfRecentCallsTest {

    @Test
    void shouldReturnOneWhenGivenThreeNumsInOneCall() {
        NumberOfRecentCalls numberOfRecentCalls = new NumberOfRecentCalls();
        Assertions.assertEquals(1, numberOfRecentCalls.countRecentCalls(1));
        Assertions.assertEquals(2, numberOfRecentCalls.countRecentCalls(100));
        Assertions.assertEquals(3, numberOfRecentCalls.countRecentCalls(3001));
        Assertions.assertEquals(3, numberOfRecentCalls.countRecentCalls(3002));
    }


}
