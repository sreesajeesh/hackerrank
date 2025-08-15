package org.example.star6.saveprisoner;

import java.util.stream.IntStream;

public class SavePrisoner {

    public static void main(String[] args) {
        System.out.println(simulateDistribution(5,2,1));
    }

    public static int saveThePrisoner(int n, int m, int s) {
        int savePrisoner = (s + m -1)%n;
        return savePrisoner == 0? n:savePrisoner;
    }

    public static int simulateDistribution(int n, int m, int s) {
        int current = s;
        for (int i = 1; i <= m; i++) {
            System.out.println("Candy " + i + " → Prisoner " + current);
            current++;
            if (current > n) current = 1; // wrap around
        }
        return current - 1 == 0? n:current-1;
    }

    public static int saveThePrisonerStream(int n, int m, int s) {
        return IntStream.iterate(s, i -> i % n + 1) // cycle through prisoners
                .limit(m)                           // only distribute m candies
                .peek(prisoner -> System.out.println("Candy → Prisoner " + prisoner))
                .reduce((first, last) -> last)      // keep the last prisoner
                .orElse(s);
    }
}
