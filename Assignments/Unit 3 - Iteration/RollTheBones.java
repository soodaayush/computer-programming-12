/*************************
 * ROLL THE BONES          *
 * AAYUSH SOOD             *
 * OCTOBER 16, 2025        *
 *                          *
 * PURPOSE: A PROGRAM      *
 * THAT LETS THE USER      *
 * PROVIDE THE NUMBER      *
 * OF SIDES ON THEIR       *
 * DICES AND ROLLS THE     *
 * TWO DICES UNTIL IT      *
 * ROLLS A PAIR OF         *
 * NUMBERS                 *
 ***************************/
//----------------------
import java.util.Scanner;
//----------------------
public class RollTheBones {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR THE NUMBER OF SIDES OF THE USER'S DIE, THE
        // VALUES OF THE TWO DIE, AND THE NUMBER OF ROLLS TO GET A PAIR
        int intNumberOfSides = 0, intFirstDice = 0, intSecondDice = 0, intNumberOfRolls = 0;

        Scanner scrInput = new Scanner(System.in);

        // PROMPT THE USER FOR THE NUMBER OF SIDES OF THEIR DIE
        // THE NUMBER OF SIDES HAS TO BE AT LEAST 4
        do {
            System.out.print("How many sides does each die contain: ");
            intNumberOfSides = scrInput.nextInt();
        } while (intNumberOfSides < 4);

        // ROLL THE DIE UNTIL A PAIR IS ROLLED
        System.out.println("Let's Roll!");

        System.out.println("\n\t\tDie1\t\tDie2");
        System.out.println("\t\t****\t\t****");

        do {
            // GENERATE RANDOM VALUES FOR THE TWO DIE FROM 1 TO THE NUMBER OF SIDES
            intFirstDice = (int)((intNumberOfSides - 1 + 1) * Math.random() + 1);
            intSecondDice = (int)((intNumberOfSides - 1 + 1) * Math.random() + 1);

            // PRINT THE RESULTS OF THE ROLLED DICE
            System.out.println("\t\t " + intFirstDice + "\t\t " + intSecondDice);

            // INCREMENT THE NUMBER OF ROLLS MADE BY 1
            intNumberOfRolls++;
        } while (intFirstDice != intSecondDice);

        // OUTPUT THE PAIR THAT WAS ROLLED ALONG WITH THE NUMBER OF ROLLS
        System.out.println("\nYou rolled a pair of " + intFirstDice + "'s " + "in " + intNumberOfRolls + " rolls!");
    }
}
