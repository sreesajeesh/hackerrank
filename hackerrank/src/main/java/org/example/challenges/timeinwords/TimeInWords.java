package org.example.challenges.timeinwords;

import java.util.HashMap;

public class TimeInWords {

    static HashMap<Integer, String> minutesMap = new HashMap<>();

    static {
        minutesMap.put(0, "zero");
        minutesMap.put(1, "one");
        minutesMap.put(2, "two");
        minutesMap.put(3, "three");
        minutesMap.put(4, "four");
        minutesMap.put(5, "five");
        minutesMap.put(6, "six");
        minutesMap.put(7, "seven");
        minutesMap.put(8, "eight");
        minutesMap.put(9, "nine");
        minutesMap.put(10, "ten");
        minutesMap.put(11, "eleven");
        minutesMap.put(12, "twelve");
        minutesMap.put(13, "thirteen");
        minutesMap.put(14, "fourteen");
        minutesMap.put(15, "quarter");
        minutesMap.put(16, "sixteen");
        minutesMap.put(17, "seventeen");
        minutesMap.put(18, "eighteen");
        minutesMap.put(19, "nineteen");
        minutesMap.put(20, "twenty");
        minutesMap.put(21, "twenty one");
        minutesMap.put(22, "twenty two");
        minutesMap.put(23, "twenty three");
        minutesMap.put(24, "twenty four");
        minutesMap.put(25, "twenty five");
        minutesMap.put(26, "twenty six");
        minutesMap.put(27, "twenty seven");
        minutesMap.put(28, "twenty eight");
        minutesMap.put(29, "twenty nine");
        minutesMap.put(30, "half");
    }

    public static void main(String[] args) {
        System.out.println(timeInWords(5,28));
    }

    public static String timeInWords(int h, int m) {
        StringBuilder stringBuilder = new StringBuilder();
        if(m <= 30){
            if(m != 15 && m != 30 && m != 0){
                stringBuilder.append(minutesMap.get(m));
                if(m == 1)
                    stringBuilder.append(" minute past ");
                else
                    stringBuilder.append(" minutes past ");
                stringBuilder.append(minutesMap.get(h));
            } else if(m == 15 || m == 30){
                stringBuilder.append(minutesMap.get(m))
                        .append(" past ")
                        .append(minutesMap.get(h));
            } else {
                stringBuilder.append(minutesMap.get(h))
                        .append(" o' clock");
            }
        } else {
            int k = 60 - m;
            if(k == 15){
                stringBuilder.append(minutesMap.get(k))
                        .append(" to ")
                        .append(minutesMap.get(h + 1));
            } else {
                stringBuilder.append(minutesMap.get(k))
                        .append(" minutes to ")
                        .append(minutesMap.get(h + 1));
            }
        }
        return stringBuilder.toString();
    }
}
