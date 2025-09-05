package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_normal_number_when_input_normal_number() {
        //Given
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result = fizzBuzz.countOff(number);
        //Then
        assertEquals("1", result);
    }

    @Test
    public void should_return_Fizz_when_input_multiple_Of_3() {
        //Given
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result = fizzBuzz.countOff(number);
        //Then
        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_when_input_multiple_Of_5() {
        //Given
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result = fizzBuzz.countOff(number);
        //Then
        assertEquals("Buzz", result);
    }

    @Test
    public void should_return_Buzz_when_input_multiple_Of_7() {
        //Given
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result = fizzBuzz.countOff(number);
        //Then
        assertEquals("Whizz", result);
    }

    @Test
    public void should_return_Buzz_when_input_multiple_Of_3_and_5() {
        //Given
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result = fizzBuzz.countOff(number);
        //Then
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_Buzz_when_input_multiple_Of_3_and_7() {
        //Given
        int number = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result = fizzBuzz.countOff(number);
        //Then
        assertEquals("FizzWhizz", result);
    }
}
