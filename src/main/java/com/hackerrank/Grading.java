package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Grading {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();

        array.add(73);
        array.add(67);
        array.add(38);
        array.add(33);

        solution(array);
    }

    public static List<Integer> solution(List<Integer> grades) {
        List<Integer> finalGrade = new ArrayList<>();
        int nextMultiple = 5;
        int minimumGrade = 40;

        for (int index = 0; index < grades.size(); index++) {
            int value = grades.get(index);
            int difference = value % nextMultiple;

            if (difference < 3 || value < minimumGrade - 3) finalGrade.add(value);
            else finalGrade.add(value + difference - 1);
        }

        return finalGrade;
    }

}
