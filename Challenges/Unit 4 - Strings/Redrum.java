/***********************************
 * RED RUM, RED RUM, RED RUM!        *
 * AAYUSH SOOD                       *
 * NOVEMBER 7, 2025                  *
 *                                    *
 * PURPOSE: A PROGRAM THAT           *
 * REVERSES THE USER'S DESIRED       *
 * TEXT                              *
 *************************************/
//--------------------------------
import java.util.Scanner;
//--------------------------------
public class Redrum {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR TEXT, REVERSED TEXT, AND SCANNER
        String strText = "", strReversedText = "";

        Scanner scrInput = new Scanner(System.in);

        // PROMPT USER FOR THEIR TEXT
        System.out.print("Enter text to print backwards: ");
        strText = scrInput.nextLine();

        // REVERSE THE TEXT
        for (int i = 0; i < strText.length(); i++) {
            // REVERSE THE LETTERS AND APPEND THEM TO THE REVERSED TEXT
            strReversedText = strText.charAt(i) + strReversedText;
        }

        // OUTPUT THE REVERSED TEXT
        System.out.println("\nReversed Text: " + strReversedText);
    }
}
