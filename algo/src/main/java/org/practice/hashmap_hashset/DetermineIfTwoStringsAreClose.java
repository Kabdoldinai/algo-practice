package org.practice.hashmap_hashset;

import java.util.*;

public class DetermineIfTwoStringsAreClose {


    /**
     * Input: word1 = "abc", word2 = "bca"
     * Output: true
     *
     * Input: word1 = "a", word2 = "aa"
     * Output: false
    **/
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        Map<String, Integer> word1Map = new HashMap<>();
        Map<String, Integer> word2Map = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            String c1 = String.valueOf(word1.charAt(i));
            String c2 = String.valueOf(word2.charAt(i));

            word1Map.put(c1, word1Map.getOrDefault(c1, 0) + 1);
            word2Map.put(c2, word2Map.getOrDefault(c2, 0) + 1);
        }

        for (String elem : word1Map.keySet()) {
            if (!word2Map.containsKey(elem)) return  false;
        }

        List<Integer> freq1 = new ArrayList<>(word1Map.values());
        List<Integer> freq2 = new ArrayList<>(word2Map.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);
    }

}
