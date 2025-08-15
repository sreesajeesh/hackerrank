package org.example.star6.hikers;

public class Hikers {

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "DDUUUUDD"));
    }

    public static int countingValleys(int steps, String path) {
        int meetingPoint = 0;
        int stepCount = 0;
        int valleyCount = 0;

        for(char step : path.toCharArray()){
            if(step == 'U'){
                stepCount++;
                if(stepCount == meetingPoint)
                    valleyCount++;
            } else if(step == 'D')
                stepCount--;
        }
        return valleyCount;
    }
}
