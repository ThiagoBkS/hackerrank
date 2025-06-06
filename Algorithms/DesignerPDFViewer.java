package com.hackerrank;

import java.util.List;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        System.out.println(solution(List.of(1,3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7), "zaba"));
    }

    public static int solution(List<Integer> heights, String word) {
        int startAscii = 97;
        int biggest = 0;

        for (char character : word.toCharArray()) {
            int index = Integer.valueOf(character) - startAscii;
            int value = heights.get(index);

            if (value > biggest) biggest = value;
        }

        return word.length() * biggest;
    }
}
