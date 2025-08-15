package org.example.star6.divisordigits;

public class DivisorDigits {

    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }

    public static int findDigits(int n) {
        // Write your code here
        int k = n;
        int digitCount = 0;
        while (k > 0){
            int digit = k%10;
            if(digit != 0 && n%digit == 0)
                digitCount++;
            k /=10;
        }
        return digitCount;
    }
}
