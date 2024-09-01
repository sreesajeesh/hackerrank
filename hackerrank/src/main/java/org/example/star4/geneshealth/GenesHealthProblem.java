package org.example.star4.geneshealth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GenesHealthProblem {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] genesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        Map<Integer, String> genes = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            genes.put(i, genesItems[i]);
//        }
        List<String> genes = Arrays.asList(genesItems);

        String[] healthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> health = Arrays.stream(healthItems).map(Integer::parseInt).collect(Collectors.toList());
//        Map<Integer, String> health = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            health.put(i, healthItems[i]);
//        }

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int sItr = 0; sItr < s; sItr++) {
            String[] firstLastd = scanner.nextLine().split(" ");

            int first = Integer.parseInt(firstLastd[0]);
            int last = Integer.parseInt(firstLastd[1]);
            String d = firstLastd[2];

            long sum = 0;
            for (int i = first; i <= last; i++) {
                for (int index = d.indexOf(genes.get(i)); index >= 0; index = d.indexOf(genes.get(i), index + 1)) {
                    sum += health.get(i);
                }
            }
            if (sum < min) {
                min = sum;
            }
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(min + " " + max);
        scanner.close();
    }
}
