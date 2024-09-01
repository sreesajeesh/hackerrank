package org.example.star4.anagramstrings;

public class AnagramString {

    public static void main(String[] args) {

        System.out.println(getDeletions("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa"));

    }

    public static int getDeletions(String s1, String s2){
        String a;
        String b;
        if(s1.length() <= s2.length()){
            a = s1;
            b = s2;
        } else {
            a = s2;
            b = s1;
        }
        int i = a.length() - 1;
        while (i >= 0){
            char c = a.charAt(i);
            if(a.contains(c + "") && b.contains(c + "")) {
                a = a.replaceFirst(c + "", "");
                b = b.replaceFirst(c + "", "");
            }
            i--;
        }
        return a.length() + b.length();
    }
}
