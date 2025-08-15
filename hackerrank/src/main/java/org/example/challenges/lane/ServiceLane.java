package org.example.challenges.lane;

import java.util.ArrayList;
import java.util.List;

public class ServiceLane {

    public static void main(String[] args) {

    }

    public static List<Integer> getMinimumWidth(int n, List<List<Integer>> cases, List<Integer> width){
        List<Integer> minWidths = new ArrayList<>();
        for(List<Integer> eachCase : cases){
            int min = Integer.MAX_VALUE;
            for (int i = eachCase.get(0); i <= eachCase.get(1); i++) {
                min = Math.min(min, width.get(i));
            }
            minWidths.add(min);
        }
        return minWidths;
    }
}
