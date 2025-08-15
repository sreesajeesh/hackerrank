package org.example.star6.beautifuldays;

public class BeautifulDays {

    public static void main(String[] args) {
        System.out.println(beautifulDays(13,45,3));
    }

    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int l = i; l <= j; l++) {
            int reverse = Integer.parseInt(new StringBuilder(String.valueOf(l)).reverse().toString());
            if (Math.abs(l - reverse)%k == 0)
                count++;
        }
        return count;
    }

    public static int beautifulDays1(int i, int j, int k) {
        int count = 0;
        for (int l = i; l <= j; l++) {
            int reverseNum = reverse(l);
            if (Math.abs(l - reverseNum)%k == 0)
                count++;
        }
        return count;
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
}
