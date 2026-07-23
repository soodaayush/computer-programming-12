/**********************************
 * NUMBER GUESSING GAME             *
 * AAYUSH SOOD                      *
 * OCTOBER 10, 2025                 *
 *                                   *
 * PURPOSE: TO PROMPT THE USER      *
 * TO GUESS THE RANDOMLY            *
 * GENERATED NUMBER AND STOP        *
 * THE PROGRAM WHEN THEY MAKE       *
 * A CORRECT GUESS                  *
 *************************************/
//-------------------------------
import java.util.Scanner;
//-------------------------------
public class GuessingGame {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR RANDOMLY GENERATED NUMBER AND USER ANSWER
        int intRandomNumber, intUserGuess;
        boolean boolCorrectGuess = false;

        Scanner scrInput = new Scanner(System.in);

        // CREATE A LOOP WHERE THE USER GUESSES THE RANDOM NUMBER UNTIL A CORRECT GUESS IS MADE
        intRandomNumber = (int)((20 - 1 + 1) * Math.random() + 1);

        do {
            System.out.print("Enter a number between 1 and 20: ");
            intUserGuess = scrInput.nextInt();

            if (intUserGuess == intRandomNumber) {
                boolCorrectGuess = true;
                System.out.println("You won!");
            } else {
                System.out.println("Try again.");
            }
        } while (!boolCorrectGuess);
    }
}
