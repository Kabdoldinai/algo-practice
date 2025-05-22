package org.example.dfs_bfs;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, 0, target, new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(int[] candidates, int start, int target, List<Integer> currentCombination, int sum) {
        if (target == sum) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            currentCombination.add(candidates[i]);
            backtrack(candidates, i, target, currentCombination, sum + candidates[i]);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
