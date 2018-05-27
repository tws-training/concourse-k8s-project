package com.example.demo.dji;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_itself_given_number_not_divisible_by_neither_3_nor_5() throws Exception {
        int number = 2;
        String result = FizzBuzz.fizzBuzz(number);
        assertThat(result).isEqualTo("2");
    }

    @Test
    public void should_return_Fizz_given_number_divisible_by_3() throws Exception {
        int number = 3;
        String result = FizzBuzz.fizzBuzz(number);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_given_number_divisible_by_5() throws Exception {
        int number = 5;
        String result = FizzBuzz.fizzBuzz(number);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void should_return_FizzBuzz_given_number_divisible_by_3_and_5() throws Exception {
        int number = 15;
        String result = FizzBuzz.fizzBuzz(number);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void should_return_FizzBuzz_given_number_0() throws Exception {
        int number = 0;
        String result = FizzBuzz.fizzBuzz(number);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_given_negative_number() throws Exception {
        int number = -1;
        String result = FizzBuzz.fizzBuzz(number);
    }


    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_given_number_greater_than_100() throws Exception {
        int number = 101;
        String result = FizzBuzz.fizzBuzz(number);
    }
}
