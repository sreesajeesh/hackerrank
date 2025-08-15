package org.example.star5.calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Calendar256 {

    public static void main(String[] args) {
        int year = 1800;
        Map<Integer, Integer> monthMap = new HashMap<>();
        //if year is not leap year use key 2 or key 13
        monthMap.put(1,31);
        monthMap.put(2,28);
        monthMap.put(3,31);
        monthMap.put(4,30);
        monthMap.put(5,31);
        monthMap.put(6,30);
        monthMap.put(7,31);
        monthMap.put(8,31);
        monthMap.put(9,30);
        monthMap.put(10,31);
        monthMap.put(11,30);
        monthMap.put(12,31);
        monthMap.put(13,29);

        //find the 256th day
        int count = 0;
        for (int i = 1; i <= 8; i++) {
            if(i == 2){
                if(year%4 == 0){
                    count = count + monthMap.get(13);
                } else {
                    count = count + monthMap.get(i);
                }
            } else
                count = count + monthMap.get(i);
        }
        //find the day
        int day = 256 - count;
        int month = 9;
        LocalDate date = LocalDate.of(year, month, day);
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println(formattedDate);
    }
}
