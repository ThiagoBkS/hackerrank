package com.hackerrank;

import java.util.List;

public class BonAppetit {
    public static void main(String[] args) {
        List<Integer> array = List.of(2, 4 ,6);
        solution(array, 2, 6);
    }

    public static void solution(List<Integer> bill, int notEaten, int contributed) {
        int splitValue = 0;

        for (int index = 0; index < bill.size(); index++)
            if (index != notEaten)
                splitValue+=bill.get(index);

        splitValue /= 2;

        if (splitValue == contributed)
            System.out.println("Bon Appetit");
        else
            System.out.println(contributed - splitValue);
    }

}
