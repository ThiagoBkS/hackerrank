package com.hackerrank;

public class StrangeAdvertising {
    public static void main(String[] args) {
        int result = solution(5);
        System.out.println(result);
    }

    public static int solution(int days) {
        int shares = 5;
        int cumulative = 0;

        for (int day = 0; day < days; day++) {
            int likes = shares / 2;
            cumulative += likes;
            shares = likes * 3;
        }

        return cumulative;
    }
}
