package org.example.alphaheight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlphaHeight {

    public static void main(String[] args) {
        List<Integer> height = List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);

    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        Map<Character, Integer> alphaMap = new HashMap<>();

        for (int i = 0; i < h.size(); i++) {
            alphaMap.put((char) ('a' + i), h.get(i));
        }
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            System.out.println(alphaMap.get(word.charAt(i)));
            max = Math.max(alphaMap.get(word.charAt(i)), max);
        }
        return  max * word.length();
    }

    public static int designerPdfViewer1(List<Integer> h, String word) {
        int maxHeight = 0;
        for (char c : word.toCharArray()) {
            int height = h.get(c - 'a'); // direct index lookup
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight * word.length();
    }
}
