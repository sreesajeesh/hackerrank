package org.example.star6.viraladv;

public class ViralAdv {

    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
    }

    public static int viralAdvertising(int n) {
        // Write your code here
        int count = 0;
        int value = 5;

        for (int i = 1; i <= n; i++) {
            int k = (value / 2);
            count += k;
            value = k * 3;
        }
        return count;
    }

    public static int viralAdvertising1(int n) {
        int totalLikes = 0;
        int shared = 5; // Initial shares on day 1

        for (int day = 1; day <= n; day++) {
            int likes = shared / 2;    // Half of the shared people like it
            totalLikes += likes;       // Accumulate total likes
            shared = likes * 3;        // Each like leads to 3 shares next day
        }
        return totalLikes;
    }
}
