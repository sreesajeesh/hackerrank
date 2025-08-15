package org.example.star6.rankplayer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RankPlayer {

    public static void main(String[] args) {
        System.out.println(climbingLeaderboard(List.of(100, 90, 90, 80), List.of(70, 80, 95, 105)));
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> rankList = ranked.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        int i = rankList.size() - 1;
        for(int score : player){
            while (i >= 0 && score >= rankList.get(i)){
                i--;
            }
            result.add(i +  2);
        }
        return result;
    }
}
