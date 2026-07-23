/*****************************
 * TELEPATHIC TERRY            *
 * AAYUSH SOOD                 *
 * OCTOBER 16, 2025            *
 *                              *
 * PURPOSE: TO LET THE USER    *
 * INPUT AN INTEGER AND        *
 * TERRY WILL TRY TO GUESS     *
 * THE USER'S NUMBER UNTIL     *
 * HE IS SUCCESSFUL            *
 *******************************/
//-------------------------
import java.util.Scanner;
//-------------------------
public class TelepathicTerry {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR THE USER'S NUMBER, THE RANDOMLY GENERATED NUMBER, AND THE NUMBER OF GUESSES MADE
        int intNumber = 0, intRandomNumber = 0, intNumberOfGuesses = 0;

        Scanner scrInput = new Scanner(System.in);

        // PROMPT THE USER FOR THEIR DESIRED NUMBER
        System.out.println("\t\t\"Telepathic \" Terry");
        System.out.println("\t\twill READ your mind");

        do {
            System.out.print("\nEnter a number between 1-10 (no decimals please): ");
            intNumber = scrInput.nextInt();

            if (intNumber < 1 || intNumber > 10) {
                System.out.println("Please try again.");
            }
        } while (intNumber < 1 || intNumber > 10);

        // TERRY WILL GUESS THE NUMBER UNTIL HE MAKES A SUCCESSFUL GUESS

        System.out.println("");

        do {
            // GENERATES A RANDOM NUMBER
            intRandomNumber = (int)((10 - 1 + 1) * Math.random() + 1);
            System.out.println("Terry says your number is: " + intRandomNumber);

            // NUMBER OF GUESSES INCREASES BY 1 EACH TIME
            intNumberOfGuesses++;
        } while (intRandomNumber != intNumber);

        // OUTPUT THE NUMBER OF GUESSES TERRY MADE UNTIL GUESSING THE USER'S NUMBER
        // OUTPUT A MESSAGE FOR TERRY DEPENDING ON THE NUMBER OF GUESSES HE MADE
        if (intNumberOfGuesses == 1) {
            System.out.println("Terry you are amazing.");
        } else if (intNumberOfGuesses == 2 || intNumberOfGuesses == 3) {
            System.out.println("everyone has a bad day. I still believe in you.");
        } else if (intNumberOfGuesses >= 4 && intNumberOfGuesses <= 10) {
            System.out.println("Well, you got my number....good for you Terry.");
        } else {
            System.out.println("I don't think telepathic means what you think it means Terry.");
        }
    }
}
