package org.example.star6.nondivisiblesubset;

import java.util.Arrays;
import java.util.List;

public class NonDivisibleSubset {

    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(7, List.of(278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436)));
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        int[] remainderCount = new int[k];

        // Step 1: Count occurrences of each remainder
        for (int num : s) {
            remainderCount[num % k]++;
        }

        System.out.println(Arrays.toString(Arrays.stream(remainderCount).toArray()));
        // Step 2: Start with at most one element from remainder 0
        int count = Math.min(remainderCount[0], 1);
        System.out.println(count);
        // Step 3: Handle pairs of remainders
        for (int r = 1; r <= k / 2; r++) {
            if (r == k - r) {
                // Special case when k is even
                count += 1;
            } else {
                count += Math.max(remainderCount[r], remainderCount[k - r]);
            }
        }

        return count;
    }
}
