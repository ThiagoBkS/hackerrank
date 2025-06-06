package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] args) {
        solution(List.of(5, 6, 7), List.of(3, 6, 10));
    }

    public static List<Integer> solution(List<Integer> tripletA, List<Integer> tripletB) {
        List<Integer> scores = new ArrayList<>(Arrays.asList(0, 0));

        for (int index = 0; index < 3; index++) {
            int aScore = tripletA.get(index);
            int bScore = tripletB.get(index);


            if (aScore > bScore) scores.set(0, scores.get(0) + 1);
            else if (aScore < bScore) scores.set(1, scores.get(1) + 1);
        }

        return scores;
    }
}
