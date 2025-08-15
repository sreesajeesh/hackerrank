package org.example.star6.findsquares;

public class FindSquares {

    public static void main(String[] args) {
        System.out.println(squares1(17,24));
    }

    public static int squares(int a, int b) {
        int count = 0;
        int c = (int)Math.sqrt(a);
        System.out.println(c);
        if(c*c == a) {
            count++;
        }
        int d = (int)Math.sqrt(b);
        if(d * d == b){
            count++;
            d--;
        }
        return count + d - c;
    }

    public static int squares1(int a, int b) {
        int start = (int) Math.ceil(Math.sqrt(a)); // first perfect square ≥ a
        System.out.println(start);
        int end = (int) Math.floor(Math.sqrt(b));  // last perfect square ≤ b
        System.out.println(end);
        return Math.max(0, end - start + 1);
    }
}
