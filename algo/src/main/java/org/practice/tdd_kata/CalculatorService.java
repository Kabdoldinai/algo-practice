package org.practice.tdd_kata;

public class CalculatorService {

    public int add(String number) {
        int sum = 0;
        if (number.isEmpty()) {
            return sum;
        }

        for (String strNum : number.split("[,;\\n]")) {
            sum += Integer.parseInt(strNum);
        }
        return sum;
    }

}
