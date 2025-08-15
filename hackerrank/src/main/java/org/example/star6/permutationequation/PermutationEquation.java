package org.example.star6.permutationequation;

import java.util.ArrayList;
import java.util.List;

public class PermutationEquation {

    public static void main(String[] args) {
        System.out.println(permutationEquation(List.of(4,3,5,1,2)));
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 1; i <= p.size(); i++) {
            int index = p.indexOf(i);
            int secondIndex = p.indexOf(index+1);
            newList.add(secondIndex+1);
        }
        return newList;
    }

    public static List<Integer> permutationEquation1(List<Integer> p) {
        int n = p.size();
        int[] position = new int[n + 1]; // 1-based indexing

        // Store the position of each number
        for (int i = 0; i < n; i++) {
            position[p.get(i)] = i + 1; // store index + 1
        }

        List<Integer> result = new ArrayList<>(n);
        for (int x = 1; x <= n; x++) {
            result.add(position[position[x]]);
        }

        return result;
    }
}
