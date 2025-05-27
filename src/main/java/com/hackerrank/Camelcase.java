package com.hackerrank;

public class Camelcase {
    public static void main(String[] args) {
        solution("saveChangesInTheEditor");
    }

    public static int solution(String word) {
        int camelcases = !word.isEmpty() ? 1 : 0;

        for (int index = 0; index < word.length(); index++) {
            int ascii = word.charAt(index);

            if (ascii >= 65 && ascii <= 90)
                camelcases++;
        }

        return camelcases;
    }
}
