package org.practice.dfs_bfs;

import java.util.*;

public class WordBreak {

        public boolean wordBreak(String s, List<String> wordDict) {
            Set<String> wordDictSet = new HashSet<>(wordDict);
            return dfs(s, wordDictSet, 0, new HashMap<>());
        }

        // bfs - составить строку
        // dfs -
        private boolean dfs(String s, Set<String> dict, int start, Map<Integer, Boolean> memo) {
            if (start == s.length()) return true;
            if (memo.containsKey(start)) return memo.get(start);

            StringBuilder temp = new StringBuilder();
            for (int i = start; i < s.length(); i++) {
                temp.append(s.charAt(i));
                if (dict.contains(temp.toString())) {
                    if (dfs(s, dict, i + 1, memo)) {
                        memo.put(start, true);
                        return true;
                    }
                }
            }

            memo.put(start, false);
            return false;
        }
//new ArrayList<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
}
