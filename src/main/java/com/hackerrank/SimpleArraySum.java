package com.hackerrank;

import java.util.List;

public class SimpleArraySum {
    public static void main(String[] args) {
        int result = solution(List.of(1, 2, 3));
        System.out.println(result);
    }

    public static int solution(List<Integer> array) {
        return array.stream()
                .reduce(0, (n1, n2) -> n1 + n2);
    }
}
