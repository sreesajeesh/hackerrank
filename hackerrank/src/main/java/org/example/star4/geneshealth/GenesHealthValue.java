package org.example.star4.geneshealth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenesHealthValue {

    public static void main(String[] args) throws IOException {

        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;

        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> genes = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .toList();

        List<Integer> health = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();*/

        //int s = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> genes = Arrays.asList("a", "b", "c", "aa", "d", "b");
        List<Integer> health = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Integer, String> geneMap = new HashMap<>();
        int i = 0;
        for (String gene : genes){
            geneMap.put(i++, gene);
        }
        int maxLength = genes.stream().mapToInt(String::length).max().getAsInt();
        /*IntStream.range(0, s).forEach(sItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int first = Integer.parseInt(firstMultipleInput[0]);

                int last = Integer.parseInt(firstMultipleInput[1]);

                String d = firstMultipleInput[2];
                int value = getHealthValue(d,first,last,genes,health,geneMap, maxLength);
                max.set(Math.max(value, max.get()));
                min.set(Math.min(value, min.get()));

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }*/
        //});
        String[] inputStr = new String[]{"caaab", "xyz", "bcdybc"};
        int[] firstList = new int[]{1,0,2};
        int[] secondList = new int[]{5,4,4};
        for (int j = 0; j < firstList.length; j++) {
            int value = getHealthValue(inputStr[j], firstList[j], secondList[j], genes,health,geneMap, maxLength );
            max = Math.max(value, max);
            min = Math.min(value, min);
        }
        System.out.println(min + " " + max);
        //bufferedReader.close();

    }

    public static int getHealthValue(String d, int first, int last, List<String> geneList, List<Integer> healthList, Map<Integer, String> geneMap, int maxLength){
        List<String> geneHealthList = getSubString(d, maxLength);
        //List<String> geneHealthListRefined = new ArrayList<>(geneHealthList);
        List<Integer> allList = new ArrayList<>();
        int sum = 0;
//        for(String str : geneHealthList){
//            if(!geneList.contains(str))
//                geneHealthListRefined.remove(str);
//        }
        for(String str : geneHealthList){
            List<Integer> indexList = new ArrayList<>();
            if(geneMap.containsValue(str)){
                indexList = geneMap.entrySet().stream().filter(a -> a.getValue().equals(str))
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());
            }
            if(!indexList.isEmpty()) {
                for (Integer value : indexList) {
                    if(!(value < first || value > last))
                        allList.add(value);
                }
            }
        }
        System.out.println(allList);

        for(Integer value : allList){
            sum = sum + healthList.get(value);
        }
        System.out.println(sum);
        return sum;
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
