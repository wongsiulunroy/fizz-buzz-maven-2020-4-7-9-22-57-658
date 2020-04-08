package com.oocl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_normal_number(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(1);
        assertThat(result, is("1"));
    }
    @Test
    public void should_return_Fizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(3);
        assertThat(result, is("Fizz"));
    }
    @Test
    public void should_return_Buzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(5);
        assertThat(result, is("Buzz"));
    }




}
