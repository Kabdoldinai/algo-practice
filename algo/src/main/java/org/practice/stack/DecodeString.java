package org.practice.stack;

//Given an encoded string, return its decoded string.
//
//The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
//
//You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
//
//The test cases are generated so that the length of the output will never exceed 105.
//
//
//
//Example 1:
//
//Input: s = "3[a]2[bc]"
//Output: "aaabcbc"

import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {
        Stack<StringBuilder> strStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int k = 0;

        for (Character component : s.toCharArray()) {
            if (Character.isDigit(component)) {
                k = k * 10 + (component - '0');
            } else if (component == '[') {
                countStack.push(k);
                strStack.push(sb);
                sb = new StringBuilder();
                k = 0;
            } else if (component == ']') {
                StringBuilder decode = sb;
                sb = strStack.pop();
                int repeat = countStack.pop();

                for (int i = 0; i < repeat; i++) {
                    sb.append(decode);
                }
            } else {
                sb.append(component);
            }
        }
        return sb.toString();
    }

}


