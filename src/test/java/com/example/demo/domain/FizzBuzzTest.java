package com.example.demo.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    //3*
    @Test
    public void should_return_fizz_when_given_3(){
        String result = FizzBuzz.run(3);
        assertEquals("Fizz", result);
    }
    //5*
    @Test
    public void should_return_buzz_when_given_5(){
        String result = FizzBuzz.run(5);
        assertEquals("Buzz", result);
    }
    //3* && 5*
    @Test
    public void should_return_fizzbuzz_when_given_15(){
        String result = FizzBuzz.run(15);
        assertEquals("FizzBuzz", result);
    }


    @Test
    public void should_return_1_when_given_1(){
        String result = FizzBuzz.run(1);
        assertEquals("1", result);
    }

    @Test
    public void should_return_unsupport0_when_given_0(){
        String result = FizzBuzz.run(0);
        assertEquals("unsupport 0", result);
    }
    //others
}
