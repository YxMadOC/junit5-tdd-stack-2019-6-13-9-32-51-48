package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_convert_given_1(){
        //given
        int number = 1;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        assertEquals("1", result);
    }

    @Test
    public void should_return_fizz_when_convert_given_3(){
        //given
        int number = 3;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        // then
        assertEquals("fizz", result);
    }


    @Test
    public void should_return_buzz_when_convert_given_5(){
        //given
        int number = 5;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        // then
        assertEquals("buzz", result);
    }

    @Test
    public void should_return_fizzbuzz_when_convert_given_15(){
        //given
        int number = 15;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        // then
        assertEquals("fizzbuzz", result);
    }


}