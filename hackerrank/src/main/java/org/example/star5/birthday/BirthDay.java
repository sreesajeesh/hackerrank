package org.example.star5.birthday;

import java.util.List;
import java.util.stream.IntStream;

public class BirthDay {

    public static void main(String[] args) {
        System.out.println(birthday(List.of(4), 4,1));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        if(m > 12)
            return -1;
        if(s.size() < m)
            return -1;

        int count = 0;
        int temp = 0;

        for (int i = 0; i < s.size(); i++) {
            if(m + i <= s.size()){
                temp = m +i;
                int sums = IntStream.range(i, temp)
                        .reduce(0, (sum, k) -> sum += s.get(k));
                if(sums == d)
                    count++;
            }
        }
        return count;
    }
}
