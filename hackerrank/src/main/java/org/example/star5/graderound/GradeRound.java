package org.example.star5.graderound;

import java.util.ArrayList;
import java.util.List;

public class GradeRound {

    public static void main(String[] args) {
        System.out.println(gradingStudents(List.of(73,67,38,33)));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> gradeList = new ArrayList<>();
        for (Integer grade : grades){
            if(grade%5 < 3 || grade < 38)
                gradeList.add(grade);
            else {
                grade = (grade/5 + 1) * 5;
                gradeList.add(grade);
            }
        }
        return gradeList;
    }

    public static List<Integer> gradingStudentsUsingStreams(List<Integer> grades) {
        return grades.stream()
                .map(grade -> {
                    if(grade%5 < 3 || grade < 38)
                        return grade;
                    else {
                        return  (grade/5 + 1) * 5;
                    }
                })
                .toList();
    }
}
