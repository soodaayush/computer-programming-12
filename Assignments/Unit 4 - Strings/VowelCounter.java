/*******************************
 * VOWEL COUNTER                  *
 * AAYUSH SOOD                    *
 * NOVEMBER 8, 2025                *
 *                                  *
 * PURPOSE: TO COUNT THE           *
 * NUMBER OF VOWELS IN A           *
 * USER'S TEXT                     *
 ************************************/
//---------------------------
import java.util.Scanner;
//---------------------------
public class VowelCounter {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR THE USER'S TEXT, A VOWEL COUNTER, AND SCANNER
        String strUserText = "";
        int intVowelCounter = 0, intYCounter = 0;

        Scanner scrInput = new Scanner(System.in);

        // INTRODUCE PROGRAM AND PROMPT USER
        System.out.println("\tVowel Counter");

        System.out.print("\nEnter text to analyze: ");
        strUserText = scrInput.nextLine().toLowerCase();

        // COUNT THE NUMBER OF VOWELS BY LOOPING THROUGH THE USER'S TEXT
        for (int i = 0; i < strUserText.length(); i++) {
            char charCurrentCharacter = strUserText.charAt(i);

            // COUNT AMOUNT OF REGULAR VOWELS AND 'Y' AS THE LOOP RUNS
            // THROUGH THE STRING
            if (charCurrentCharacter == 'a' || charCurrentCharacter == 'e' || charCurrentCharacter == 'i' || charCurrentCharacter == 'o' || charCurrentCharacter == 'u') {
                intVowelCounter++;
            } else if (charCurrentCharacter == 'y') {
                intYCounter++;
            }
        }

        // OUTPUT THE NUMBER OF VOWELS IN THE USER'S TEXT
        if (intVowelCounter == 0 && intYCounter > 0) {
            // CHECKS IF NO OTHER VOWELS OTHER THAN 'Y' ARE COUNTED
            if (intYCounter == 1) {
                System.out.println("\nThere is " + intYCounter + " vowel in: " + "\"" + strUserText + "\"");
            } else if (intYCounter > 1) {
                System.out.println("\nThere are " + intYCounter + " vowels in: " + "\"" + strUserText + "\"");
            }
        } else if (intVowelCounter > 0) {
            // CHECKS IF VOWELS OTHER THAN 'Y' HAVE BEEN COUNTED IF THE
            // ABOVE CONDITION FAILS
            if (intVowelCounter == 1) {
                System.out.println("\nThere is " + intVowelCounter + " vowel in: " + "\"" + strUserText + "\"");
            } else if (intVowelCounter > 1) {
                System.out.println("\nThere are " + intVowelCounter + " vowels in: " + "\"" + strUserText + "\"");
            }
        } else {
            // PRINT A MESSAGE STATING THAT THERE ARE 0 VOWELS IN THE TEXT
            // IF ALL CONDITIONS ABOVE FAIL
            System.out.println("\nThere are 0 vowels in: " + "\"" + strUserText + "\"");
        }
    }
}
