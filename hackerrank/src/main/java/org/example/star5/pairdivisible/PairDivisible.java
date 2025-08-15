package org.example.star5.pairdivisible;

import java.util.Arrays;
import java.util.List;

public class PairDivisible {

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 5, List.of(1,2,3,4,5,6)));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int[] freq = new int[k];
        int count = 0;
        for(int num : ar){
            freq[num%k]++;
        }
        //System.out.println("0th element : " + freq[0]);
        count += freq[0] * (freq[0] - 1)/2;

        //System.out.println(Arrays.toString(freq));
        for (int i = 1; i <= k/2; i++) {
            if(i == k - i){
                //System.out.println(i + "th element in if loop : " + freq[i]);
                count += freq[i] * (freq[i] - 1) / 2;
            } else if(i < k - i){
                /*System.out.println(i + "th element in else loop : " + freq[i]);
                System.out.println(k - i + "th element in else loop : " + freq[k - i]);*/
                count += freq[i] * freq[k - i];
                System.out.println(count);
            }
        }
        return count;
    }

}
