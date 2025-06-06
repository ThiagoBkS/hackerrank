package com.hackerrank;

public class UtopianTree {
    public static void main(String[] args) {
        System.out.println(solution(0));
        System.out.println(solution(1));
        System.out.println(solution(4));
    }

    public static int solution(int cycles) {
        int height = 1;

        for (int cycle = 0; cycle < cycles; cycle++) {
            if (cycle % 2 == 0) height *= 2;
            else height++;
        }

        return height;
    }
}
