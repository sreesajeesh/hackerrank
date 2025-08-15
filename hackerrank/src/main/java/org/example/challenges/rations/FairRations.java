package org.example.challenges.rations;

import java.util.ArrayList;
import java.util.List;

public class FairRations {

    public static void main(String[] args) {
        List<Integer> intList = List.of(4, 5, 7, 8);
        System.out.println(fairRations(intList));
    }

    public static String fairRations(List<Integer> B) {
        List<Integer> integerList = new ArrayList<>(B);
        int loafCount = 0;
        for (int i = 0; i < integerList.size() - 1; i++) {
            if (integerList.get(i) % 2 == 1) {
                integerList.set(i, integerList.get(i) + 1);
                integerList.set(i+ 1, integerList.get(i+1) + 1);
                loafCount += 2;
            }
        }
        if (integerList.get(integerList.size() - 1) % 2 != 0) { return "NO"; }
        return String.valueOf(loafCount);
    }

    public static String fairRations1(List<Integer> B) {
        List<Integer> integerList = new ArrayList<>(B);
        if(B.size() == 2){
            if(Math.abs(B.get(1) - B.get(0))%2 == 1)
                return "NO";
            else
                return String.valueOf(2);
        }
        if(B.size() <=1)
            return "NO";
        int loafCount = 0;
        int i = 0;
        //2, 3, 4, 5, 6
        while (i < integerList.size() - 1){
            if(integerList.get(i) % 2 == 0 )
                i++;
            else {
                if(i == integerList.size() - 2){
                    if(Math.abs(integerList.get(i + 1) - integerList.get(i))%2 == 1)
                        return "NO";
                }
                integerList.set(i, integerList.get(i) + 1);
                integerList.set(i+1, integerList.get(i+1) + 1);
                loafCount = loafCount + 2;
            }
        }
        if(loafCount == 0)
            return "NO";
        return String.valueOf(loafCount);
    }

    public static String fairRations2(List<Integer> B) {
        int count = 0;
        for (int i = 0; i < B.size() - 1 ; i++) {
            if(B.get(i) % 2 != 0){
                B.set(i, B.get(i) + 1 );
                B.set(i + 1, B.get(i + 1) + 1);
                count += 2;
            }
        }
        if (B.get(B.size() - 1) % 2 != 0) { return "NO"; }
        return String.valueOf(count); }
}
