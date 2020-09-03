package com.company;

import java.util.HashSet;

public class Main {

    static int missingInteger(int[] array) {
        int result = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int numbers : array) {
            set.add(numbers);
        }
        for (int i = 1; i <= array.length + 1; i++) {
            if (!set.contains(i))

                result = i;
        }
        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {

        int[] arr = {5,6,3,2,1};
        missingInteger(arr);

    }
}
