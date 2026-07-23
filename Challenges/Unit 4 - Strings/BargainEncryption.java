/*******************************
 * BARGAIN ENCRYPTION            *
 * AAYUSH SOOD                   *
 * DECEMBER 5, 2025               *
 *                                 *
 * PURPOSE: A SIMPLE              *
 * ENCRYPTION PROGRAM THAT        *
 * PLACES EACH LETTER IN A        *
 * USER'S STRING IN A             *
 * RANDOM POSITION                *
 ***********************************/
//------------------------------
import java.util.Scanner;
//------------------------------
public class BargainEncryption {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR USER'S TEXT, SCANNER
        String strUserText = "", strEncryptedString = "";
        int intStringLength = 0, intRandomPosition = 0;

        Scanner scrInput = new Scanner(System.in);

        // INTRODUCE PROGRAM AND ASK FOR INPUT
        System.out.println("Bargain \"Encryption\"");

        System.out.print("\n\nEnter text to be encrypted: ");
        strUserText = scrInput.nextLine().toUpperCase();
        intStringLength = strUserText.length();

        // LOOP THROUGH THE STRING AND REOGRANIZE LETTERS
        for (int i = intStringLength; i > 0; i--) {
            // GENERATE A RANDOM POSITION FOR THE CHARACTER
            int intRandomIndex = (int)(Math.random() * i);

            // ADD THE CHARACTER AT THE RANDOM POSITION TO THE ENCRYPTED
            // STRING
            strEncryptedString = strEncryptedString + strUserText.charAt(intRandomIndex);

            // REMOVE THE CHARACTER FROM THE ORIGINAL STRING
            strUserText = strUserText.substring(0, intRandomIndex) + strUserText.substring(intRandomIndex + 1);
        }

        // OUTPUT THE ENCRYPTED MESSAGE
        System.out.println("Your encrypted message is: " + strEncryptedString);
    }
}
