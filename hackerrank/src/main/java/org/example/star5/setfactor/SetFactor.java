package org.example.star5.setfactor;

import java.util.List;
import java.util.stream.IntStream;

public class SetFactor {

    public static void main(String[] args) {
        System.out.println(getTotalX(List.of(2,4), List.of(16,32,96)));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int maxA = a.stream().max(Integer::compareTo).get();
        int minB = b.stream().min(Integer::compareTo).get();

        return (int)IntStream.rangeClosed(maxA, minB)
                .filter(n -> a.stream().allMatch(x -> n%x == 0))
                .filter(n -> b.stream().allMatch(x -> x%n == 0))
                .count();
    }
}
