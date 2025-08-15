package org.example.star6.jumpingonclouds;

import java.util.List;

public class JumpingOnCloud {

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(List.of(0, 0, 0, 1, 0, 0)));
    }

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int i = 0;
        int count = 0;
        while (i <= c.size() - 1){
            if(i+1 == c.size() )
                break;
            if(i+2 == c.size()){
                if(c.get(i+1) == 0)
                    count++;
                break;
            }
            if(c.get(i+2) == 0){
                i += 2;
            } else if (c.get(i + 1) == 0){
                i += 1;
            }
            count++;
        }
        return count;
    }

    public static int jumpingOnClouds1(List<Integer> c) {
        int jumps = 0;
        int i = 0;
        while (i < c.size() - 1){
            if(i+2 < c.size() && c.get(i+2) == 0){
                i +=2;
            } else {
                i += 1;
            }
            jumps++;
        }
        return jumps;
    }
}
