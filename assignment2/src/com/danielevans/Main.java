package com.danielevans;

public class Main {

    static String reversingString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i -= 1) {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);
        return reversed;
    }

    public static void main(String[] args) {

        reversingString("Today is on wednesday.");
    }
}
