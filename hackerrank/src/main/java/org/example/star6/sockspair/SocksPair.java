package org.example.star6.sockspair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SocksPair {

    public static void main(String[] args) {
        System.out.println(sockMerchant(3, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Long> socks = ar.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long pairCount = 0;
        for(int num : socks.keySet()){
            if(socks.get(num) > 1){
                pairCount = pairCount + socks.get(num)/2;
            }
        }
        return (int)pairCount;
    }

    //Only Stream usage
    public static int sockMerchants(int n, List<Integer> ar) {
        return ar.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .mapToInt(count -> (int) (count/2))
                .sum();
    }

    //Best Performance
    public static int sockMerchant2(int n, List<Integer> ar) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int pairs = 0;

        for (int sock : ar) {
            countMap.put(sock, countMap.getOrDefault(sock, 0) + 1);
            if (countMap.get(sock) % 2 == 0) {
                pairs++; // found a pair
            }
        }
        return pairs;
    }
}
