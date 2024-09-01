package org.example.star4.binarystring;

public class BinaryString {

    public static void main(String[] args) {
        String s = "0101010";
        System.out.println(beautifulBinaryString(s));
    }

    public static int beautifulBinaryString(String s){
        String bStr = "010";
        int count = 0;
        while (true){
            if(s.contains(bStr)){
                s = s.replaceFirst(bStr, "011");
                count++;
            } else
                break;
        }
        return count;
    }
}
            /*System.out.println(s.substring(i, i+3));
            if(s.substring(i, i+3).equals(bStr)){
                s = s.replaceFirst("010", "011");
                count++;
            }*/