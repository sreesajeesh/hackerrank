package org.example.star6.bonappetite;

import java.util.List;

public class BonAppetite {

    public static void main(String[] args) {
        bonAppetit(List.of(3, 10, 2, 9), 1, 12);
        bonAppetit(List.of(3, 10, 2, 9), 1, 7);
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = bill.stream()
                .mapToInt(s -> s)
                .sum();
        total = total - bill.get(k);
        if(total/2 == b)
            System.out.println("Bon Appetit");
        else
            System.out.println(b - total/2);
    }

    public static void bonAppetite(List<Integer> bill, int k, int b){
        int annaShare = bill.stream()
                .filter(price -> bill.indexOf(price) != k)
                .mapToInt(Integer::intValue)
                .sum()/2;
        if(annaShare == b)
            System.out.println("Bon Appetit");
        else
            System.out.println(b - annaShare);
    }
}
