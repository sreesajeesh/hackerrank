package org.example.challenges.spacestation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatLandSpaceStation {

    public static void main(String[] args) {
        int[] arr = new int[]{13,1,11,10,6};
        System.out.println(flatlandSpaceStations(20, arr));
    }

    public static int flatlandSpaceStations(int n, int[] c) {
        List<Integer> intList = Arrays.stream(c).boxed().collect(Collectors.toList());
        int max = -1;
        int minDistance = 0;
        for (int i = 0; i < n; i++) {
            minDistance = Integer.MAX_VALUE;
            for (int station : intList) {
                    minDistance = Math.min(minDistance, Math.abs(i - station));
            }
            max = Math.max(max, minDistance);
            if(max == Integer.MAX_VALUE)
                return 0;
        }
        return max;
    }
}
