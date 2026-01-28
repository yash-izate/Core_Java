package oops.classes;

import java.util.Scanner;

class GuessTheNumber {

    private int noOfGuesses;
    private final int randomNumber;

    public GuessTheNumber() {
        this.noOfGuesses = 0;
        this.randomNumber = (int) (Math.random() * 101); // 0–100
    }

    /**
     * Processes a user's guess.
     *
     * @return true if guessed correctly, false otherwise
     */
    public boolean makeGuess(int guess) {
        noOfGuesses++;

        if (guess == randomNumber) {
            System.out.println("🎉 Congratulations! You won in "
                    + noOfGuesses + " guesses.");
            return true;
        }

        System.out.println(
                guess < randomNumber
                        ? "Please select a greater number!"
                        : "Please select a smaller number!"
        );
        return false;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }
}

public class PlayGuessTheNumber {

    public static void main(String[] args) {
        System.out.println("🎯 Welcome To Guess The Number Game!");

        GuessTheNumber game = new GuessTheNumber();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter your guess: ");
            int guess = sc.nextInt();

            if (game.makeGuess(guess)) {
                break;
            }
        }

        sc.close();
    }
}