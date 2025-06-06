package com.hackerrank;

import java.util.List;

public class AngryProfesor {
    public static void main(String[] args) {
        List<Integer> array = List.of(0,-1,2,1);

        String result = solution(2, array);
        System.out.println(result);
    }


    public static String solution(int minStudentsPresents, List<Integer> times) {
        int currentlyPresents = 0;
        for (int time : times)
            if (time <= 0) currentlyPresents++;

        return currentlyPresents < minStudentsPresents ? "YES" : "NO";
    }

}
