package org.example.star4.lettermystery;

import java.util.Arrays;

public class LetterMystery {

    public static void main(String[] args) {

        String s = "cba";
        System.out.println(loveLetterMystery(s));

    }

    public static int loveLetterMystery(String s){
        int count = 0;
        if(isPalindrome(s))
            return count;
        int i = 0;
        int k = s.length() - 1;
        char[] charArray = s.toCharArray();
        while(i <= k){
            while (charArray[i] < charArray[k]){
                count++;
                charArray[k] = (char)(charArray[k] - 1);
                if(charArray[k] == charArray[i]){
                    String m = Arrays.toString(charArray);
                    if(isPalindrome(m))
                        return count;
                }
            }
            while (charArray[i] > charArray[k]){
                count++;
                charArray[i] = (char)(charArray[i] - 1);
                if(charArray[k] == charArray[i]){
                    String m = Arrays.toString(charArray);
                    if(isPalindrome(m))
                        return count;
                }
            }
            i++;
            k--;
        }
        return count;
    }

    public static int letterMystery(String s){
        int count = 0;
        if(s.length() == 1)
            return 1;
        if(isPalindrome(s))
            return count;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length()/2; i++) {
            char ch = charArray[s.length() - i - 1];
            while (charArray[i] < ch){
                ch = (char)(ch - 1);
                count++;
                charArray[s.length() - i - 1] = ch;
                if(charArray[i] == ch){
                    String k = Arrays.toString(charArray);
                    if(isPalindrome(k))
                        return count;
                }
            }
            while (charArray[i] > ch){
                char chFirst = (char)(charArray[i] - 1);
                count++;
                charArray[i] = chFirst;
                if(ch == chFirst){
                    String k = Arrays.toString(charArray);
                    if(isPalindrome(k))
                        return count;
                }
            }
            String k = Arrays.toString(charArray);
            if(isPalindrome(k))
                return count;
        }
        return count;
    }

    private static boolean isPalindrome(String s) {
        return s.contentEquals(new StringBuilder(s).reverse());
    }
}
