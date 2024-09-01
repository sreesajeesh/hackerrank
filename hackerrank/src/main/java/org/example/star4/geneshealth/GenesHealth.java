package org.example.star4.geneshealth;

import jdk.jshell.EvalException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenesHealth {

    static List<String> geneList;
    static List<Integer> healthList;
    public static void main(String[] args) {
        geneList = Arrays.asList("a", "b", "c", "aa", "d", "b");
        healthList = Arrays.asList(1, 2, 3, 4, 5, 6);
        String geneStr = "bcdybc";
        Map<Integer, String> geneMap = new HashMap<>();
        int i = 0;
        for (String gene : geneList){
            geneMap.put(i++, gene);
        }

        int maxLength = geneList.stream().mapToInt(String::length).max().getAsInt();
        int sum = 0;
        int start = 2;
        int end = 4;
        List<String> geneHealthList = getSubString(geneStr, maxLength);
        List<String> geneHealthListRefined = new ArrayList<>(geneHealthList);
        List<Integer> allList = new ArrayList<>();
        for(String str : geneHealthList){
            if(!geneList.contains(str))
                geneHealthListRefined.remove(str);
        }
        System.out.println(geneHealthListRefined);
        for(String str : geneHealthListRefined){
            List<Integer> indexList = new ArrayList<>();
            if(geneMap.containsValue(str)){
                indexList = geneMap.entrySet().stream().filter(a -> a.getValue().equals(str))
                        .map(Map.Entry::getKey)
                        .toList();
            }
            if(!indexList.isEmpty()) {
                for (Integer value : indexList) {
                    if(!(value < start || value > end))
                        allList.add(value);
                }
            }
        }
        System.out.println(allList);

        for(Integer value : allList){
            sum = sum + healthList.get(value);
        }
        System.out.println(sum);
    }

    public static int getHealthValue(String d, int first, int last){
        return 0;
    }

    public static List<String> getSubString(String geneStr, int maxLength){
        List<String> geneStrings = new ArrayList<>();
        for (int j = 0; j < geneStr.length(); j++) {
            for (int i = maxLength; i >= 0; i--) {
                if(j + maxLength - 1 < geneStr.length()) {
                    String substring = geneStr.substring(j, i + j);
                    if(!substring.isBlank())
                        geneStrings.add(substring);
                }
            }
        }
        geneStrings.add(geneStr.substring(geneStr.length() -1));
        return geneStrings;
    }

}
