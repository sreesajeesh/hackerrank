package org.example.star4.palindromestring;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PalindromeString {

    public static String alphabets = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        System.out.println(gamesOfThrones2("cdefghmnopqrstuvw"));
    }

    public static String gamesOfThrones2(String s){
        int[] intArray = new int[26];
        int oddCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(s.substring(i).contains(ch + "")){
                intArray[ch - 'a']++;
            }
        }
        for (int j : intArray) {
            if (j % 2 == 1) {
                oddCount++;
            }
            if (oddCount > 1)
                return "NO";
        }
        return "YES";
    }

    public static String gamesOfThrones1(String s){
        int count = 0;
        int oddCount = 0;
        String str = s;
        int i = 0;
        while(i < str.length()){
            char ch = s.charAt(i);
            while (str.contains(ch + "")) {
                    str = str.replaceFirst(ch + "", "");
                    count++;
            }
            if(count != 0)
                if(count%2 == 1)
                    oddCount++;
            if(oddCount > 1)
                return "NO";
            count = 0;
            i++;
        }
        return "YES";
    }

    public static String gameOfThrones(String s){
        int count = 0;
        int oddCount = 0;
        String str = s;
        for (int i = 0; i < alphabets.length(); i++) {
            char ch = alphabets.charAt(i);
            if(str.contains(ch + "")) {
                while (true) {
                    if (str.contains(ch + "")) {
                        str = str.replaceFirst(ch + "", "-");
                        count++;
                    } else
                        break;
                }
            }
            if(count != 0)
                if(count%2 == 1)
                    oddCount++;
            count = 0;
        }
        if(oddCount > 1)
            return "NO";
        return "YES";
    }
}
