package oops.practice;

import java.util.Scanner;

class GuessTheNumber {
    private int noOfGuesses;
    private final int randomNumber;

    public GuessTheNumber() {
        this.noOfGuesses = 0;
        this.randomNumber = (int) (Math.random() * 101);
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void makeGuess(int n) {
        if (n == randomNumber) {
            noOfGuesses++;
            System.out.println("Congratulation! You Won in " + noOfGuesses + " guesses.");
        } else if (n < randomNumber) {
            System.out.println("Please select a greater number!");
            noOfGuesses++;
        } else {
            System.out.println("Please select a smaller number!");
            noOfGuesses++;
        }
    }
}

public class PlayGuessTheNumber {
    public static void main(String[] args) {
        System.out.println("\nWelcome To Guessing Number Game !");

        GuessTheNumber game = new GuessTheNumber();
        int myNumber;

//        System.out.print("Number to Guess: " + game.getRandomNumber());
        do {
            System.out.print("\nPlease enter a number: ");
            myNumber = game.takeUserInput();
            game.makeGuess(myNumber);

        } while (myNumber != game.getRandomNumber());

    }
}