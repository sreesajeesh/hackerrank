package org.example.star6.angryprofessor;

import java.util.List;

public class AngryProfessor {

    public static void main(String[] args) {

    }

    public static String angryProfessor(int k, List<Integer> a) {
        int arrivalCount = 0;
        for(int arrival : a){
            if(arrival <= 0)
                arrivalCount++;
        }
        return arrivalCount < k? "YES":"NO";
    }

    public static String angryProfessor1(int k, List<Integer> a) {

         return a.stream()
                .filter(s -> s <= 0)
                .count() < k? "YES":"NO";
    }

    public static String angryProfessor2(int k, List<Integer> a) {
        int count = 0;
        for (int arrival : a) {
            if (arrival <= 0 && ++count >= k) {
                return "NO"; // Class is not cancelled
            }
        }
        return "YES"; // Class is cancelled
    }
}
