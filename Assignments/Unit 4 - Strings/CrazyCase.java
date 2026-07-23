/****************************
 * CRAZY CASE                  *
 * AAYUSH SOOD                 *
 * NOVEMBER 8, 2025              *
 *                                *
 * PURPOSE: TO REFORMAT THE      *
 * TEXT THE USER INPUTS TO       *
 * ALTERNATE BETWEEN LOWER       *
 * UPPERCASE LETTERS BASED       *
 * ON USER PREFERENCE            *
 **********************************/
//---------------------------
import java.util.Scanner;
//---------------------------
public class CrazyCase {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR USER INPUT, FORMATTED TEXT, AND CASE PREFERENCE
        String strUserText = "", strFormattedText = "", strCasePreference = "";
        boolean blnUpper = false;

        Scanner scrInput = new Scanner(System.in);

        // INTRODUCE PROGRAM AND PROMPT THE USER FOR THEIR TEXT AND CASE
        // PREFERENCE
        System.out.println("  \"Crazy Case\"");

        System.out.print("Enter text to be formatted: ");
        strUserText = scrInput.nextLine();

        // PROMPT THE USER FOR THEIR CASE PREFERENCE UNTIL THEY ANSWER WITH
        // A VALID INPUT
        do {
            System.out.print("Do you want crazy upper case or crazy lower case? ");
            strCasePreference = scrInput.nextLine().toUpperCase();
        } while (!strCasePreference.equals("UPPER") && !strCasePreference.equals("LOWER"));

        // DETERMINE WHETHER OR NOT THE CASE IS UPPER OR LOWER
        blnUpper = strCasePreference.equals("UPPER");

        // LOOP THROUGH STRING TO FORMAT AS "CRAZY CASE"
        for (int i = 0; i < strUserText.length(); i++) {
            // GET CURRENT CHARACTER IN THE USER'S TEXT, STARTING FROM
            // THE FIRST CHARACTER AND MOVING UNTIL THE LAST
            char charCurrentCharacter = strUserText.charAt(i);

            // ALTERNATE BETWEEN UPPER AND LOWER CASE CHARACTERS BASED
            // ON EVEN AND ODD POSITIONS
            if (i % 2 == 0) {
                // DEPENDING UPON CASE PREFERENCE, ADD AN UPPER OR
                // LOWER CASE OF THE CURRENT CHARACTER
                strFormattedText += blnUpper ? Character.toUpperCase(charCurrentCharacter) : Character.toLowerCase(charCurrentCharacter);
            } else {
                strFormattedText += blnUpper ? Character.toLowerCase(charCurrentCharacter) : Character.toUpperCase(charCurrentCharacter);
            }
        }

        // PRINT THE CRAZY CASE
        System.out.println("Your text is: " + strFormattedText);
    }
}
