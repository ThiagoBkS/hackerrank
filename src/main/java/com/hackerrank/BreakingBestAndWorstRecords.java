package com.hackerrank;

import java.util.*;

public class BreakingBestAndWorstRecords {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();

        scores.add(3);
        scores.add(4);
        scores.add(21);
        scores.add(36);
        scores.add(10);
        scores.add(28);
        scores.add(35);
        scores.add(5);
        scores.add(24);
        scores.add(42);


        solution(scores);

    }

    public static List<Integer> solution(List<Integer> scores) {
        List<Integer> counter = new ArrayList<>(List.of(0,0));

        int highestScore = scores.get(0);
        int lowestScore = scores.get(0);

        for (int index = 1; index < scores.size(); index++) {
            int score = scores.get(index);

            if (score > highestScore) {
                counter.set(0, counter.get(0) + 1);
                highestScore = score;
            } else if (score < lowestScore) {
                counter.set(1, counter.get(1) + 1);
                lowestScore = score;
            }
        }

        return counter;
    }

}
