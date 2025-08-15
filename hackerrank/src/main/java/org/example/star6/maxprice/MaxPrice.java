package org.example.star6.maxprice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxPrice {

    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{3,1}, new int[]{5,2,8}, 10));
    }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Integer[] keys = Arrays.stream(keyboards)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(keys, Collections.reverseOrder());
        Integer[] drivers = Arrays.stream(drives)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(drivers, Collections.reverseOrder());
        List<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < keys.length; i++) {
            for (int j = 0; j < drivers.length; j++) {
                if(keys[i] + drivers[j] <= b){
                    maxList.add(keys[i] + drivers[j]);
                    break;
                }
            }
        }
        if(maxList.isEmpty())
            return -1;
        return maxList.stream().mapToInt(s -> (int)s ).max().getAsInt();
    }
}
