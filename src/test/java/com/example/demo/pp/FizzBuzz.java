package com.example.demo.pp;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        if (number % 3 == 0){
            return "Fizz";
        }
        return "" + number;
    }
}
