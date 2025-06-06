package com.hackerrank;

import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        System.out.println(solution(List.of(3,2,1,3)));
    }

    public static int solution(List<Integer> candles) {
        int bigger = 0;
        int count = 0;

        for (int index = 0; index < candles.size(); index++) {
            if (candles.get(index) == bigger) count++;
            else if (candles.get(index) > bigger) {
                bigger = candles.get(index);
                count = 1;
            }
        }

        return count;
    }
}
