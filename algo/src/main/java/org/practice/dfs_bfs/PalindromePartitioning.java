package org.practice.dfs_bfs;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> combination = new ArrayList<>();

        backtracking(s, result, combination, 0);
        return result;
    }


    private void backtracking(String s, List<List<String>> result, List<String> combination, int i) {
        if (i >= s.length()) {
            result.add(new ArrayList<>(combination));
            return;
        }

        for(int end = i; end < s.length(); end++) {
            String substring = s.substring(i, end + 1);
            if (isPalindrome(substring)) {
                combination.add(substring);
                backtracking(s, result, combination, end + 1);
                combination.remove(combination.size() - 1);
            }

        }
    }

    private boolean isPalindrome(String substr) {
        int left = 0, right = substr.length() - 1;
        boolean result = false;

        while (left < right) {
            while(substr.charAt(left) != substr.charAt(right)) return false;
            left++;
            right--;
        }


        return true;
    }
}
