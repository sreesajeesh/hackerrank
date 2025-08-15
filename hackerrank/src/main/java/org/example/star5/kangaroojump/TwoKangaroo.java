package org.example.star5.kangaroojump;

public class TwoKangaroo {

    public static void main(String[] args) {
        System.out.println(kangaroo(112, 9563, 8625, 244));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if(v1 == v2)
            return (x1 == x2)? "YES" : "NO";
        System.out.println(x2 - x1);
        System.out.println(v1 - v2);
        System.out.println((x2 - x1)%(v1 - v2));
        System.out.println((x2 - x1)/(v1 - v2));
        if((x2 - x1)%(v1 - v2) == 0 && (x2 - x1)/(v1 - v2) > 0){
            return "YES";
        }
        return "NO";
    }
}
