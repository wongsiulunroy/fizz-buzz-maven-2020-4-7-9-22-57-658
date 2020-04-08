package com.oocl;

public class FizzBuzz {


    public String say(int inputNumber) {
        if (inputNumber % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(inputNumber);
    }
}
