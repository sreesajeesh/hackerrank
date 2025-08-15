package org.example.star5.scoresrecord;

import java.util.ArrayList;
import java.util.List;

public class ScoresRecord {

    public static void main(String[] args) {
        System.out.println(breakingRecords(List.of(12, 24, 10, 24)));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        if(scores.isEmpty())
            return new ArrayList<>();
        int highCount = 0;
        int lowCount = 0;
        int highScore = scores.get(0);
        int lowScore = scores.get(0);

        for (int i = 1; i < scores.size(); i++) {
            if(scores.get(i) > highScore){
                highCount++;
                highScore = scores.get(i);
            } else if(scores.get(i) < lowScore){
                lowCount++;
                lowScore = scores.get(i);
            }

        }
        return List.of(highCount, lowCount);
    }
}
