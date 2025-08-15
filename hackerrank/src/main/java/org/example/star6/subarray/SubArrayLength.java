package org.example.star6.subarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArrayLength {

    public static void main(String[] args) {
        System.out.println(pickingNumbers(List.of(1,1,2,2,4,4,5,5,5)));
    }

    public static int pickingNumbers(List<Integer> a) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int maxLen = 0;
        for (int num : freq.keySet()) {
            int currentLen = freq.get(num) + freq.getOrDefault(num + 1, 0);
            maxLen = Math.max(maxLen, currentLen);
        }
        return maxLen;
    }
}
