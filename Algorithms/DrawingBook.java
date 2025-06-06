package com.hackerrank;

public class DrawingBook {
    public static void main(String[] args) {
        System.out.println(solution(6, 5));
    }

    public static int solution(int totalPages, int targetPage) {
        int firstPageSteps = targetPage / 2;
        int lastPageSteps = firstPageSteps - totalPages / 2;

        return Math.min(firstPageSteps, lastPageSteps);
    }
}
