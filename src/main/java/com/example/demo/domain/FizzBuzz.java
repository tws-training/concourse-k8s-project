package com.example.demo.domain;

public class FizzBuzz {
    public static String run(int i) {
        String result = "";



        if(i==0){
            return "unsupport 0";
        }

        if(i%15==0){
            return "FizzBuzz";
        }
        if(i%3==0){
            return "Fizz";
        }
        if(i%5==0){
            return "Buzz";
        }

        else {
            return String.valueOf(i);
        }

//        return null;
        //return result;
    }
}
