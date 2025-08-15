package org.example.star6.cutsticks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CutTheSticks {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 4, 4, 2, 2, 8));
        System.out.println(cutTheSticks1(arr));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> countList = new ArrayList<>();
        countList.add(arr.size());
        while (!arr.isEmpty()){
            int min = Collections.min(arr);
            arr.removeIf(n -> n == min);
            for(int value : arr){
                arr.set(arr.indexOf(value), value -min);
            }
            if(!arr.isEmpty())
                countList.add(arr.size());
        }
        return countList;
    }

    public static List<Integer> cutTheSticks1(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        Collections.sort(arr); // Sort once
        System.out.println(arr);
        int n = arr.size();
        result.add(n); // Initial count

        for (int i = 1; i < n; i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                System.out.println(n - i);
                result.add(n - i); // Remaining sticks after cutting
                System.out.println(result);
            }
        }

        return result;
    }
}
