package org.practice.tdd_kata;

import java.time.LocalTime;
import java.util.Map;

public class MorningRoutine {

    Map<Integer, String> activityMap = Map.of(
            6, "Do exercise",
            7, "Read and study",
            8, "Have breakfast"
    );

    public String whatShouldIDoNow(LocalTime localTime) {
        return activityMap.getOrDefault(localTime.getHour(), "No activity");
    }

}
