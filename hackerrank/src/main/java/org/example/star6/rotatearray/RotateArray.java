package org.example.star6.rotatearray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateArray {

    public static void main(String[] args) {

    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        List<Integer> values = new ArrayList<>();
        k = k%a.size();
        if(k != 0)
            Collections.rotate(a, k);
        for(int pos : queries){
                values.add(a.get(pos));
        }
        return values;
    }
}
