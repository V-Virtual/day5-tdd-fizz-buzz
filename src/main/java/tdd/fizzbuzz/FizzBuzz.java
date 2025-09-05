package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number) {
        if(number % 3 != 0 && number % 5 != 0) {
            return String.valueOf(number);
        } else if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if(number % 3 == 0) {
            return "Fizz";
        } else{
            return "Buzz";
        }
    }
}
