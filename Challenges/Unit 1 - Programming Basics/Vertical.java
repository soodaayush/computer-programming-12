/*******************************************
 * VERTICALLY PRINTED NUMBERS               *
 * AAYUSH SOOD                              *
 * SEPTEMBER 12, 2025                       *
 *                                           *
 * PURPOSE: TO PROMPT THE USER              *
 * TO ENTER A NON-DECIMAL FIVE              *
 * DIGIT NUMBER, AND PRINT                  *
 * EVERY INDIVIDUAL DIGIT                   *
 * VERTICALLY                               *
 *********************************************/
//------------------------------------
import java.util.Scanner;
//------------------------------------
public class Vertical {
    public static void main(String args[]) {
        // INITIALIZE VARIABLES
        Scanner scrInput = new Scanner(System.in);

        int intFiveDigitNumber;

        int intFirstDigit;
        int intSecondDigit;
        int intThirdDigit;
        int intFourthDigit;
        int intFifthDigit;

        String strFlush = "";

        // PROMPT THE USER ABOUT THEIR NUMBER
        System.out.println("Please enter a positive five digit number");
        System.out.print("without decimals: ");

        intFiveDigitNumber = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        // GET INDIVIDUAL DIGITS
        intFifthDigit = intFiveDigitNumber % 10;
        intFiveDigitNumber = intFiveDigitNumber / 10;

        intFourthDigit = intFiveDigitNumber % 10;
        intFiveDigitNumber = intFiveDigitNumber / 10;

        intThirdDigit = intFiveDigitNumber % 10;
        intFiveDigitNumber = intFiveDigitNumber / 10;

        intSecondDigit = intFiveDigitNumber % 10;
        intFiveDigitNumber = intFiveDigitNumber / 10;

        intFirstDigit = intFiveDigitNumber % 10;

        // PRINT INDIVIDUAL DIGITS
        System.out.println("Your number is:");
        System.out.println("\t" + intFirstDigit);
        System.out.println("\t" + intSecondDigit);
        System.out.println("\t" + intThirdDigit);
        System.out.println("\t" + intFourthDigit);
        System.out.println("\t" + intFifthDigit);
    }
}
