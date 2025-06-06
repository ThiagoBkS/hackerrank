package com.hackerrank;

public class FindDigits {
    public static void main(String[] args) {
        int result = solution(1012);
        System.out.println(result);
    }

    public static int  solution(int number) {
        String stringValue = Integer.toString(number);
        int divisors = 0;

        for (int index = 0; index < stringValue.length(); index++) {
            int value = Character.getNumericValue(stringValue.charAt(index));

            if (value != 0 && number % value == 0)
                divisors++;
        }

        return divisors;
    }
}
