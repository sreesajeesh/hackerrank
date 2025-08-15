package org.example.star6.appenddelete;

public class AppendAndDelete {

    public static void main(String[] args) {
        System.out.println(appendAndDelete("hackerhappy", "ash", 2));
    }

    public static String appendAndDelete(String s, String t, int k) {
        int commonLength = 0;
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                commonLength++;
            } else {
                break;
            }
        }
        int minOps = (s.length() - commonLength) + (t.length() - commonLength);
        if(k >= s.length() + t.length())
            return "Yes";
        return (k >= minOps && (k - minOps)%2 == 0)? "Yes": "No";
    }

    public static String appendAndDelete1(String s, String t, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        while (s.charAt(i) == t.charAt(j)){
            i++;
            j++;
            if(i >= s.length() || j >= t.length())
                break;
        }
        int l = s.length() - i;
        int m = t.length() - j;
        return (l + m <= k) ? "Yes" : "No";
    }
}
