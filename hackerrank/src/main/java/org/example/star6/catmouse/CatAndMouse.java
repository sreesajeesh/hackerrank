package org.example.star6.catmouse;

public class CatAndMouse {

    public static void main(String[] args) {
        System.out.println(catAndMouse(2,5,4));
        System.out.println(catAndMouse(1,2,3));
        System.out.println(catAndMouse(1,3,2));
    }

    public static String catAndMouse(int x, int y, int z) {
        int disA = Math.abs(x - z);
        int disB = Math.abs(y - z);

        if(disA < disB) return "Cat A";
        if(disB < disA) return "Cat B";
        return "Mouse C";
    }
}
