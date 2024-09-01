package org.example.star4.anagram;

public class AnagramSolution {

    public static void main(String[] args) {

        System.out.println(anagram("sajesh"));

    }

    public static int anagram(String s){
        if(s.length()%2 == 1) return -1;
        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2);
        for (int i = 0; i < s2.length() ; i++) {
            char ch = s2.charAt(i);
            if(s1.contains(ch + "")){
                s1 = s1.replaceFirst(ch + "", "");
            }
        }
        return s1.length();
    }
}
