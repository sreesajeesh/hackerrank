package org.example.challenges.cavity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CavityMap {

    static int[][] directions = {{-1,0},{0,1},{1,0},{0,-1}};

    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("63456754");
        grid.add("68335522");
        grid.add("25482912");
        grid.add("54429472");
        grid.add("35416147");
        grid.add("75848666");
        grid.add("41633675");
        grid.add("82511989");
        for (String g : grid){
            System.out.println(g);
        }
        System.out.println("==============================");
        List<String> newGrid = cavityMap1(grid);
        System.out.println("==============================");
        for (String g : newGrid){
            System.out.println(g);
        }
    }

    public static List<String> cavityMap(List<String> grid) {
        if(grid.size() <= 2)
            return grid;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < grid.size(); i++) {
            if(i != 0 && i < grid.size() - 1){
                String str = grid.get(i);
                for (int j = 1; j < str.length() - 1; j++) {
                    int value = Character.getNumericValue(str.charAt(j));
                    boolean flag = true;
                    for (int[] direction : directions) {
                        int adjacentValue = Character.getNumericValue(grid.get(direction[0] + i).charAt(direction[1] + j));
                        if (adjacentValue >= value) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        List<Integer> intList = new ArrayList<>();
                        intList.add(i);
                        intList.add(j);
                        list.add(intList);
                    }
                }
            }
        }
        if(!list.isEmpty()) {
            for (List<Integer> intList : list) {
                StringBuilder stringBuilder = new StringBuilder(grid.get(intList.get(0)));
                stringBuilder.setCharAt(intList.get(1), 'X');
                grid.set(intList.get(0), stringBuilder.toString());
            }
        }
        return grid;
    }

    public static List<String> cavityMap1(List<String> grid) {
        // Write your code here
        for(int i=1; i<grid.size()-1; i++)
        {
            StringBuilder str=new StringBuilder(grid.get(i));
            for(int j=1; j<grid.get(i).length()-1; j++)
            {
                if(((int)grid.get(i).charAt(j) > (int)grid.get(i).charAt(j+1))
                        && ((int)grid.get(i).charAt(j) > (int)grid.get(i).charAt(j-1))
                        && ((int)grid.get(i).charAt(j) > (int)grid.get(i-1).charAt(j))
                        && ((int)grid.get(i).charAt(j) > (int)grid.get(i+1).charAt(j)))
                {
                    System.out.println(grid.get(i).charAt(j+1));
                    System.out.println(grid.get(i).charAt(j-1));
                    System.out.println(grid.get(i+1).charAt(j));
                    System.out.println(grid.get(i-1).charAt(j));
                    str.setCharAt(j, 'X');
                }

            }
            System.out.println("+++++++++++++++++++++++++++++++++");
            grid.set(i, str.toString());
        }
        return grid;
    }
}

//                        StringBuilder stringBuilder = new StringBuilder(str);
//                        stringBuilder.setCharAt(j, 'X');
//                        grid.set(i, stringBuilder.toString());