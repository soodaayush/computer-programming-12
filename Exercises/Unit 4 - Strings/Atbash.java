/****************************
 * ATBASH CIPHER               *
 * AAYUSH SOOD                 *
 * NOVEMBER 25, 2025            *
 *                               *
 * PURPOSE: A PROGRAM THAT      *
 * ENCRYPTS YOUR DESIRED        *
 * TEXT USING THE ATBASH        *
 * CIPHER                       *
 *********************************/
//---------------------------
import java.util.Scanner;
//---------------------------
public class Atbash {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR PLAINTEXTS
        String strCipherAlphabet = "ZYXWVUTSRQONMLKJIHGFEDCBA ,.!";
        String strPlainTextAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ,.!";

        String strPlainText = "", strEncryptedText = "";
        int intMessageLength = 0;

        Scanner scrInput = new Scanner(System.in);

        // PROMPT USER FOR MESSAGE & CONVERT TO UPPERCASE
        System.out.println("Please enter the message to be encrypted: ");
        strPlainText = scrInput.nextLine().toUpperCase();
        intMessageLength = strPlainText.length();

        // DETERMINE THE LENGTH OF THE MESSAGE, SO WE CAN WALK THROUGH THE
        // MESSAGE ONE CHARACTER AT A TIME

        // LOOP TO WALK THROUGH THE STRING ONE CHARACTER AT A TIME
        for (int i = 0; i < intMessageLength; i++) {
            // GET A CHAR FROM THE ORIGINAL MESSAGE
            char charCurrentLetter = strPlainText.charAt(i);

            // GET THE LOCATION OF THAT CHAR IN THE PLAINTEXT ALPHABET
            int intCharLocation = strPlainTextAlphabet.indexOf(charCurrentLetter);

            // GET A CHARACTER AT THE SAME LOCATION FROM THE CIPHER ALPHABET
            char charCipherLetter = strCipherAlphabet.charAt(intCharLocation);

            // ADD THE NEW CHAR TO THE ENCRYPTED STRING ACCUMULATOR
            strEncryptedText = strEncryptedText + charCipherLetter;
        }

        // OUPTUT THE ENCRYPTED MESSAGE
        System.out.println("\nYour encrypted message is: " + strEncryptedText);
    }
}
