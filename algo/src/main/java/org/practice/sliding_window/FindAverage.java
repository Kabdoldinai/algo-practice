package org.practice.sliding_window;

public class FindAverage {

//    int[] input = new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2};
    //{2.2, 2.8, 2.4, 3.6, 2.8};
    public double[] findAverages(int K, int[] arr) {
        double[] result = new double[arr.length - K + 1];
        double windowSum = 0; // 1, 4, 6, 12, 11 - 1 = 10  / 14 / 11 / 12 / 10 / 18 / 14
        int windowStart = 0; // 1 / 2 , 3, 4, 5, 6
        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i]; // add the next element
            // slide the window, we don't need to slide if we've not hit the required
            // window size of 'k'
            if (i >= K - 1) { // 4
                result[windowStart] = windowSum / K; // calculate the average 2.2, 2.8, 2.4, 3.6, 2.8
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }

        return result;
    }

}
