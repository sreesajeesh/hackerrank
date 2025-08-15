package org.example.challenges.feast;

public class ChocolateFeast {

    public static void main(String[] args) {
        System.out.println(chocolateFeast(15,3,2));
    }

    public static int chocolateFeast(int n, int c, int m) {
        int bars = n / c;
        int noOfWrappers = bars;

        while(noOfWrappers >= m)
        {
            int newBars = (noOfWrappers / m);
            bars += newBars;
            noOfWrappers = noOfWrappers % m + newBars;
        }
        return bars;
    }
}
