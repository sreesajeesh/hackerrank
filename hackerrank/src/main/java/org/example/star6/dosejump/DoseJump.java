package org.example.star6.dosejump;

import java.util.List;

public class DoseJump {

    public static void main(String[] args) {

        System.out.println(hurdleRace(1, List.of(1,2,3,3,2)));
        System.out.println(hurdleRace(4, List.of(1,6,3,5,2)));
        System.out.println(hurdleRace(7, List.of(2,5,4,5,2)));

    }

    public static int hurdleRace(int k, List<Integer> height) {
        int max = height.stream().mapToInt(s ->(int)s)
                .max().getAsInt();
        return (k > max)? 0 : max -k;
    }
}
