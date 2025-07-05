package org.practice.hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences {


    /**
     *
     Input: arr = [1,2,2,1,1,3]
     Output: true
     */
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> occurences = new HashSet<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (occurences.contains(map.get(key))) return false;
            occurences.add(map.get(key));
        }

        return true;
    }


}
