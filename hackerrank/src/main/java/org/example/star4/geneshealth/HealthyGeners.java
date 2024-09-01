package org.example.star4.geneshealth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HealthyGeners {
    static long min = Long.MAX_VALUE;
    static long max = Long.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> genes = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(Collectors.toList());

        List<Integer> health = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int s = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, s).forEach(sItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int first = Integer.parseInt(firstMultipleInput[0]);

                int last = Integer.parseInt(firstMultipleInput[1]);

                String d = firstMultipleInput[2];
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
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        System.out.println(min + " " + max);
        bufferedReader.close();
    }
}
