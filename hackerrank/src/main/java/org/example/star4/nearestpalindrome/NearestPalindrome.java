package org.example.star4.nearestpalindrome;

public class NearestPalindrome {

    public static void main(String[] args) {
        System.out.println(getPalindrome("uxxdlselxmwyiguugtpsypfudffswvwyswyyiiyywsywvsffdufpysptguugiywmxlesldxxu"));
    }

    public static int getPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left < right && s.charAt(left) == s.charAt(right)){
            left++;
            right--;
        }
        if(left >= right) return -1;
        if(isPalindrome(s, left + 1, right)) return left;
        if(isPalindrome(s, left, right -1)) return right;
        return -1;
    }

    public static boolean isPalindrome(String s, int left, int right){
        while (left < right && s.charAt(left) == s.charAt(right)){
            left++;
            right--;
        }
        return left >= right;
    }
}
