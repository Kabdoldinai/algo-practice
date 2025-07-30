package org.practice.stack;


import java.util.Stack;


public class SimplifyPath {

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");

        for (String component : arr) {
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!component.equals(".") && !component.isEmpty()) {
                stack.push(component);
            }
        }

        return "/" + String.join("/", stack);
    }

}
