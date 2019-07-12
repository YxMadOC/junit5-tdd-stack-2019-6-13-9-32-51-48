package com.thoughtworks.tdd;

public class FizzBuzz {

    public String convert(int number){
        if(number % 3 == 0){
            return "fizz";
        }
        if(number % 5 == 0){
            return "buzz";
        }
        return "" + number;
    }

}
