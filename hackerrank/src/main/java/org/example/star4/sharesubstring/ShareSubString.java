package org.example.star4.sharesubstring;

import java.util.Set;
import java.util.stream.Collectors;

public class ShareSubString {

    public static void main(String[] args) {
        System.out.println(checkSubString("hi", "world"));
    }

    public static String checkSubString(String s1, String s2){
        String a;
        String b;
        if(s1.length() <= s2.length()){
            a = s1;
            b = s2;
        } else {
            a = s2;
            b = s1;
        }
        Set<Character> setChar = a.chars().mapToObj(chr -> (char)chr).collect(Collectors.toSet());
        Set<Character> bSetChar = b.chars().mapToObj(chr ->(char)chr).collect(Collectors.toSet());
        for(Character c : setChar){
            if(bSetChar.contains(c)) {
                return "YES";
            }
        }
        return "NO";
    }
}
