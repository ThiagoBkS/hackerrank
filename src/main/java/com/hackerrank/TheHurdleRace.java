package com.hackerrank;

import java.util.List;

public class TheHurdleRace {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 4, 5, 2);

        int result = solution(7, numbers);
        System.out.println(result);
    }


    public static int solution(int maxJump, List<Integer> obstacles) {
        int biggestObstacle = 0;

        for (int obstacleHeight : obstacles)
            biggestObstacle = Math.max(biggestObstacle, obstacleHeight);

        return Math.max(biggestObstacle - maxJump, 0);
    }
}
