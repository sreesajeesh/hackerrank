package org.example.challenges.workbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WorkBook {

    public static void main(String[] args) {
        List<Integer> arr = List.of(4, 2, 6, 1, 10);
        System.out.println(workbook(5, 3, arr));
    }

    public static int workbook(int n, int k, List<Integer> arr) {
        List<List<Integer>> intList = new ArrayList<>();
        for(int problem : arr){
            if(problem < k){
                intList.add(IntStream.range(1, problem + 1).boxed().collect(Collectors.toList()));
                continue;
            }
            int temp = problem;
            int i = 1;
            while(temp/k >= 1){
                intList.add(IntStream.range(i, i + k).boxed().collect(Collectors.toList()));
                i = i + k;
                temp = temp - k;
            }
            if(temp != 0) {
                if (problem < i + k) {
                    intList.add(IntStream.range(i, problem + 1).boxed().collect(Collectors.toList()));
                }
            }
        }
        int count = 0;
        for (int i = 0; i < intList.size(); i++) {
            if(intList.get(i).contains(i+1)){
                count++;
            }
        }
        return count;
    }

    public static int workbook1(int n, int k, List<Integer> arr) {
        int pages = 0;
        int result = 0;
        for (int chapter : arr) {
            pages++;
            for (int i = 1; i <= chapter; i++) {
                if (pages == i) {
                    result++;
                }
                if (i % k == 0 && i < chapter) {
                    pages++;
                }
            }
        }
        return result;
    }
}
