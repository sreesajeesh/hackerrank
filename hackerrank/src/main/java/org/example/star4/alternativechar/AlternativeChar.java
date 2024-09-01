package org.example.star4.alternativechar;

public class AlternativeChar {

    public static void main(String[] args) {
        String s = "AAABBB";
        System.out.println(noOfDeletion(s));
    }

    public static int noOfDeletion(String s){
        int deleteCount = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                deleteCount++;
            }
        }
        return deleteCount;
    }
}
