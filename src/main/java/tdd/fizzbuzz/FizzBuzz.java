package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOffOld(int number) {
        if(number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            return "FizzBuzzWhizz";
        } else if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if(number % 3 == 0 && number % 7 == 0) {
            return "FizzWhizz";
        } else if(number % 5 == 0 && number % 7 == 0) {
            return "BuzzWhizz";
        } else if(number % 3 == 0) {
            return "Fizz";
        } else if(number % 5 == 0) {
            return "Buzz";
        } else if(number % 7 == 0) {
            return "Whizz";
        } else {
            return String.valueOf(number);
        }
    }

    public String countOff(int number) {
        String result = "";
        if(number % 3 == 0){
            result += "Fizz";
        }
        if(number % 5 == 0){
            result += "Buzz";
        }
        if(number % 7 == 0){
            result += "Whizz";
        }
        if(number % 3 != 0 && number % 5 != 0 && number % 7 != 0){
            result += String.valueOf(number);
        }
        return result;
    }
}
