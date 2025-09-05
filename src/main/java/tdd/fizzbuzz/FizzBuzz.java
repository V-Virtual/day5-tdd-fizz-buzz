package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number) {
        if(number % 3 != 0 && number % 5 != 0) {
            return String.valueOf(number);
        }
        return null;
    }
}
