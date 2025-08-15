package org.example.star6.repeatedstring;

import java.util.Arrays;

public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(repeatedString("ababa", 3L));
    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        int len = s.length();
        long count = s.chars()
                .filter(c -> c == 'a')
                .count();
        long sum = 0;
        if(n >= len){
            sum = count * (n/len);
            long k = n%len;
            if(k != 0) {
                sum += s.substring(0,(int) k).chars()
                        .filter(c -> c == 'a')
                        .count();
            }
        } else {
            sum = s.substring(0,(int)n).chars()
                    .filter(c -> c == 'a')
                    .count();
        }
        return sum;
    }

    public static long repeatedString1(String s, long n) {
        long len = s.length();
        long count = 0;
        for(char c : s.toCharArray()){
            if(c == 'a')
                count++;
        }
        long totalCount = count * (n/len);
        for (int i = 0; i < n%len; i++) {
            if(s.charAt(i) == 'a')
                totalCount++;
        }
        return totalCount;
    }
}
