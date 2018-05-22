package com.example.demo.domain;

public class FizzBuzz {

    public static String of(int num) {
        String result = "";

        if(num % 3 == 0) {
            result += "Fizz";
        }

        if(num % 5 == 0) {
            result += "Buzz";
        }

        if(result.equals("")) {
            result = "" + num;
        }

        return result;
    }
}
