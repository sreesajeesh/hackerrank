package org.example.star6.pages;

public class Pages {

    public static void main(String[] args) {
        System.out.println(pageCount(6,5));
    }

    public static int pageCount(int n, int p) {
        int frontCount = p/2;
        int backCount = n/2 - p/2;
        return Math.min(frontCount, backCount);
    }
}
