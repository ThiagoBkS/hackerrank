package com.hackerrank;

public class Staircase {
    public static void main(String[] args) {
        solution(4);
    }

    public static void solution(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (column < size - row - 1)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }

            System.out.println();
        }
    }
}
