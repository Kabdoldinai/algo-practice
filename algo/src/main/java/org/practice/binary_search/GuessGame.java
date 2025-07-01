package org.practice.binary_search;

public class GuessGame {

    private int pickedNumber;

    public GuessGame(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    public int guess(int num) {
        if (num == pickedNumber) return 0;
        else if (num > pickedNumber) return -1;
        else return 1;
    }
}
