/*****************************
 * RED RUM PART 2               *
 * AAYUSH SOOD                  *
 * NOVEMBER 9, 2025              *
 *                                *
 * PURPOSE: A PROGRAM THAT       *
 * REVERSES THE USER'S           *
 * DESIRED TEXT, WITH THE        *
 * EXCEPTION OF                  *
 * EXCLAMATION POINTS            *
 **********************************/
//----------------------------
import java.util.Scanner;
//----------------------------
public class Redrum_again {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR TEXT, REVERSED TEXT, AND SCANNER
        String strText = "", strReversedText = "";

        Scanner scrInput = new Scanner(System.in);

        // PROMPT USER FOR THEIR TEXT
        System.out.print("Enter the text: ");
        strText = scrInput.nextLine().toLowerCase();

        // REVERSE THE TEXT
        for (int i = 0; i < strText.length(); i++) {
            // GET CURRENT CHARACTER IN THE STRING
            char charCurrentCharacter = strText.charAt(i);

            // CHECK IF THE CURRENT CHARACTER IS NOT EQUAL TO AN EXCLAMATION
            // POINTS
            if (strText.charAt(i) != '!') {
                if (i == strText.length() - 2) {
                    // TAKES THE CHARACTER BEFORE THE EXCLAMATION POINT
                    // AND CAPITALIZES IT
                    strReversedText = Character.toUpperCase(charCurrentCharacter) + strReversedText;
                } else {
                    // OTHERWISE, ADDS CHARACTERS REGULARLY
                    strReversedText = charCurrentCharacter + strReversedText;
                }
            } else if (strText.charAt(i) == '!') {
                // REVERSES THE STRING AS LONG AS THE CURRENT CHARACTER
                // IS NOT AN EXCLAMATION POINT, AS THAT IS THE
                // EXCEPTION
                strReversedText = strReversedText + strText.charAt(i);
            }
        }

        // OUTPUT THE REVERSED TEXT
        System.out.println("\nReversed text: " + strReversedText);
    }
}
