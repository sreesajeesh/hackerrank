package org.example.star6.libraryfine;

public class LibraryFine {

    public static void main(String[] args) {
        System.out.println(libraryFine(15,7,2014, 1, 7, 2015));
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here

        if(y1 > y2)
            return 10000;
        else if (y1 == y2){
            if (m1 > m2)
                return 500 * (m1 - m2);
            else if(m1 == m2){
                if (d1 > d2)
                    return 15 * (d1 - d2);
                else
                    return 0;
            } else
                return 0;
        } else {
            return 0;
        }
    }

    public static int libraryFine1(int d1, int m1, int y1, int d2, int m2, int y2) {
        if(y1 < y2 || (y1 == y2 && m1 < m2) || (y1 == y2 && m1 == m2 && d1 <= d2))
            return 0;
        else if(y1 > y2)
            return 10000;
        else {
            if (m1 > m2)
                return 500 * (m1 - m2);
            else {
                return 15 * (d1 - d2);
            }
        }
    }

    public static int libraryFine2(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) return 10000;
        if (y1 < y2) return 0;

        // Same year
        if (m1 > m2) return 500 * (m1 - m2);
        if (m1 < m2) return 0;

        // Same month & year
        return (d1 > d2) ? 15 * (d1 - d2) : 0;
    }
}
