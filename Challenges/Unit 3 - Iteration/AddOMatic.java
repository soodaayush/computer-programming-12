/****************************
 * ADD-O-MATIC                *
 * AAYUSH SOOD                *
 * OCTOBER 10, 2025           *
 *                             *
 * PURPOSE: A PROGRAM THAT    *
 * ASKS THE USER FOR TWO      *
 * INTEGERS AND PROVIDES      *
 * THE SUM OF THE TWO         *
 * NUMBERS AS WELL AS A       *
 * MATHEMATICAL EQUATION OF   *
 * THE SUM                    *
 ******************************/
//-------------------------
import java.util.Scanner;
//-------------------------
public class AddOMatic {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR STARTING NUMBER, ENDING NUMBER, AND SUM
        int intStartingNumber, intEndingNumber, intSum, intMathematicalSum = 0;

        Scanner scrInput = new Scanner(System.in);

        // PROMPT THE USER FOR THE STARTING AND ENDING NUMBER
        System.out.println("The amazing \"Add-O-Matic\"! It adds stuff!");

        System.out.print("\nEnter a starting number: ");
        intStartingNumber = scrInput.nextInt();

        System.out.print("Enter an ending number: ");
        intEndingNumber = scrInput.nextInt();

        System.out.println("\nProcessing....");
        System.out.println("Done processing!");

        // CALCULATE THE SUM OF THE TWO NUMBERS
        do {
            intMathematicalSum = intMathematicalSum + intStartingNumber;

            intStartingNumber++;
        } while (intStartingNumber <= intEndingNumber);

        // SHOW THE MATHEMATICAL EQUATION OF THE SUM
        System.out.print("Equation-->");

        do {
            if (intStartingNumber == intEndingNumber) {
                System.out.print(" " + intStartingNumber + " = " + intMathematicalSum);
            } else {
                System.out.print(" " + intStartingNumber + " +");
            }

            intStartingNumber++;
        } while (intStartingNumber <= intEndingNumber);
    }
}
