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
}
