package com.example.demo.pp;

import com.example.demo.pp.FizzBuzz;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_itself_given_number_not_divisible_by_neither_3_nor_5() throws Exception {
        int number = 1;
        String result = FizzBuzz.fizzBuzz(number);
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void should_return_fizz_given_number_divisible_by_five(){
        int number = 5;
        String result = FizzBuzz.fizzBuzz(number);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void should_return_fizz_given_number_divisible_by_three(){
        int number = 3;
        String result = FizzBuzz.fizzBuzz(number);
        assertThat(result).isEqualTo("Fizz");
    }
}
