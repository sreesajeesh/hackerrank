package org.example.star6.jumpingclouds;

public class JumpingOnClouds {

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));
    }

    public static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int i = 0;
        while(true){
            if(i == 0 && c[i] == 1)
                energy -= 2;
            int endPoint = (i + k)%c.length;
            if(endPoint != 0){
                energy += c[endPoint] == 1 ?  -3 : -1;
            } else {
                energy -=1;
                break;
            }
            i = endPoint;
        }
        return energy;
    }

    public static int jumpingOnClouds1(int[] c, int k) {
        int energy = 100;
        int n = c.length;
        int pos = 0;

        do {
            pos = (pos + k) % n;
            energy -= (c[pos] == 1) ? 3 : 1; // 1 for move + 2 if thundercloud
        } while (pos != 0);

        return energy;
    }

}

/*if(c[endPoint] == 1){
                    energy = energy - 3;
                } else {
                    energy = energy - 1;
                }*/