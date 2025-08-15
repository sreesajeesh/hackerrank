package org.example.star6.utopiantree;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class UtopianTree {

    public static void main(String[] args) {
        System.out.println(utopianTree1(5));
    }

    public static int utopianTree(int n) {
        int sum = 1;
        for (int i = 1; i <= n ; i++) {
            if(i%2 == 0)
                sum = sum + 1;
            else
                sum += sum;
        }
        return sum;
    }

    public static int utopianTree1(int n) {
        AtomicInteger sum = new AtomicInteger(1);
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> {
                    if(i%2 == 0)
                        sum.getAndAdd(1);
                    else
                        sum.getAndAdd(sum.get());
                    return sum.get();
                }).sorted(Comparator.reverseOrder()).findFirst().get();



    }

    public static int utopianTree2(int n) {
        return (1 << ((n + 2) / 2 + 1)) - 1 + (n % 2);
    }
}
