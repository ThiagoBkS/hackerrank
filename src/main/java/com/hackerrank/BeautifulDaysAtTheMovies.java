package com.hackerrank;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        int result = solution(13, 45, 3);
        System.out.println(result);
    }

    public static int reverseNumber(int number) {
        String num = Integer.toString(number);
        int result = 0;

        for (int charIndex = num.length() - 1; charIndex >= 0; charIndex--) {
            int value = Integer.valueOf(String.valueOf(num.charAt(charIndex)));
            int decimalPoint = charIndex;

            int calc = (int) Math.floor(value * (Math.pow(10, decimalPoint)));
            result += calc;
        }

        return result;
    }

    public static int solution(int startDay, int endDay, int divisor) {
        int beautifulDays = 0;

        for (int day = startDay; day <= endDay; day++) {
            int reversed = reverseNumber(day);
            if (Math.abs((day - reversed)) % divisor == 0)
                beautifulDays++;
        }

        return beautifulDays;
    }

}
