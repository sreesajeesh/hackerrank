package org.example.star5.birdtype;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BirdType {

    public static void main(String[] args) {
        System.out.println(migratoryBirds(List.of(1,1,2,2,2,3,3,3)));
    }

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Long> birdMap = arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        long max = birdMap.values()
                .stream()
                .mapToLong(Long::longValue)
                .max()
                .orElse(0);

        return birdMap.entrySet()
                .stream()
                .filter(s -> s.getValue() == max)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

    }
}
