package org.example.challenges.halloween;

public class HalloweenSales {

    public static void main(String[] args) {
        System.out.println(howManyGames(16, 2, 1, 9981));
    }

    public static int howManyGames(int p, int d, int m, int s) {
        int count = 0;
        while(s >= p){
            s = s - p;
            count++;
            p = Math.max(m, p - d);
        }
        return count;
    }
}
