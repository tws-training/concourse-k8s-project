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
}
