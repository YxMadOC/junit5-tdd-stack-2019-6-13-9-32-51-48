package com.thoughtworks.tdd;

public class FizzBuzz {

    public String convert(int number){
        if(number % 3 == 0){
            return "fizz";
        }
        return "" + number;
    }

}
