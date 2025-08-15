package org.example.star6.bigintfactorial;

import java.math.BigInteger;

public class BigIntFactorial {

    public static void main(String[] args) {
        extraLongFactorials(25);
    }

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger prod = BigInteger.valueOf(1);
        for (int i = 1; i <= n ; i++) {
            prod = prod.multiply(BigInteger.valueOf(i)) ;
        }
        System.out.println(prod);
    }
}
