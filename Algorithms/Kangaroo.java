package com.hackerrank;

public class Kangaroo {
    public static void main(String[] args) {
        String result = solution(0,3,4,2);

        System.out.println(result);
    }

    public static String solution(int x1, int v1, int x2, int v2) {
        int differenceX = x2 - x1;
        int differenceV = v1 - v2;

        if (v1 == v2)
            return x1 == x2 ? "YES" : "NO";
        if (differenceV == 0) return "NO";

        if (differenceX % differenceV == 0 && (differenceX / differenceV) >= 0)
            return "YES";

        return "NO";
    }
}
