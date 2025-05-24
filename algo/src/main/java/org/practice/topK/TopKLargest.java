package org.practice.topK;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKLargest {

    public List<Integer> findTopKLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return new ArrayList<>(minHeap);
    }

}
