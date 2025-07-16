package org.practice.arrays;

public class StringCompression {

    // ++ сначала запишет птм инкрементирует
    public int compress(char[] chars) {

        int left = 0, right = 0, write = 0;

        while (left < chars.length) {
            while (right < chars.length && chars[left] == chars[right]) right++;
            chars[write++] = chars[left];
            int count = right - left;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }

            left = right;
        }

        return write;
    }
}
