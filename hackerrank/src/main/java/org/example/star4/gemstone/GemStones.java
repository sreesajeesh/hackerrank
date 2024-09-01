package org.example.star4.gemstone;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GemStones {

    public static void main(String[] args) {

        List<String> arr = Arrays.asList("abcdde", "baccd", "eeabdg");
        System.out.println(findGemStones(arr));

    }

    public static int findGemStones(List<String> arr){
        Set<Character> gemSet = new HashSet<>();
        int count = 0;
        int numberOfGems = 0;
        for(String gemStr : arr){
            for (int i = 0; i < gemStr.length(); i++) {
                gemSet.add(gemStr.charAt(i));
            }
        }
        for(Character ch : gemSet){
            for(String gemStr : arr){
                if(gemStr.contains(ch + ""))
                    count++;
            }
            if(count == arr.size())
                numberOfGems++;
            count = 0;
        }
        return numberOfGems;
    }
}
