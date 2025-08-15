package org.example.challenges.triplets;

import java.util.Arrays;
import java.util.List;

public class BeautifulTriplets {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 3,4,5};
        List<Integer> arrList = Arrays.stream(arr).boxed().toList();
        System.out.println(getTriplets(1, arrList));
    }

    public static int getTriplets(int d, List<Integer> arr){
        int tripletCount = 0;
        for (int right = arr.size() - 1; right > 1; right--) {
            for (int middle = right - 1; middle > 0 ; middle--) {
                if(arr.get(right) - arr.get(middle) == d){
                    for (int left = middle - 1; left >=0 ; left--) {
                        if(arr.get(middle) - arr.get(left) == d){
                            ++tripletCount;
                        }
                    }
                }
            }
        }
        return tripletCount;
    }
}
