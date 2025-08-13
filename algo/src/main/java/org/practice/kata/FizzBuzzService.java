package org.practice.kata;


public class FizzBuzzService {

    public String fizzBuzz(int num) {
        StringBuilder sb = new StringBuilder();

        if (num % 3 == 0) sb.append("Fizz");
        if (num % 5 == 0) sb.append("Buzz");
        if (num % 7 == 0) sb.append("Buzz");

        return !sb.isEmpty() ? sb.toString() : String.valueOf(num);
    }

}
