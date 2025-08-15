package org.example.star5.appleorange;

import java.util.List;

public class AppleAndOrange {

    public static void main(String[] args) {
        countApplesAndOranges(7, 11, 5, 15, List.of(-2,2,1), List.of(5,-6));
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        System.out.println(apples.stream()
                .filter(apple -> apple + a >= s && apple + a <= t)
                .count());
        System.out.println(oranges.stream()
                .filter(orange -> orange + b <= t && orange + b >= s)
                .count());
    }
}
