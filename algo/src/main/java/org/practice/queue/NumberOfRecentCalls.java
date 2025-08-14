package org.practice.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class NumberOfRecentCalls {

    private Queue<Integer> queue;

    public NumberOfRecentCalls() {

        this.queue = new ArrayDeque<>();
    }


    public int countRecentCalls(int t) {
        queue.offer(t);

        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }

}
