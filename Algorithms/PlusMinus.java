package com.hackerrank;

import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> array = List.of(-4,3,-9,0,4,1);
        solution(array);
    }

    public static void solution(List<Integer> array) {
        int arraySize = array.size();
        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for (int value : array) {
            if (value > 0) positives++;
            else if (value < 0) negatives++;
            else zeros++;
        }

        System.out.printf("%.6f\n", (double) positives / arraySize);
        System.out.printf("%.6f\n", (double) negatives / arraySize);
        System.out.printf("%.6f\n", (double) zeros / arraySize);
    }
}
