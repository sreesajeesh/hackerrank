package org.example.challenges.distance;

import java.util.List;
import java.util.Objects;

public class MinimumDistance {

    public static void main(String[] args) {
        List<Integer> arr = List.of(7, 1, 3, 4, 1, 7);
        System.out.println(getMinimumDistance(arr));
    }

    public static int getMinimumDistance(List<Integer> a){
        if(a.size() < 2) return -1;
        int minValue = Integer.MAX_VALUE;
        int right = a.size() - 1;
        boolean flag = false;
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if(Objects.equals(a.get(i), a.get(j))){
                    flag = true;
                    minValue = Math.min(minValue, j - i);
                }
            }
        }
        if(!flag)
            return -1;
        return minValue;
    }
}
