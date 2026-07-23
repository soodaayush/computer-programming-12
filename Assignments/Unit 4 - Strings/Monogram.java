/***************************
 * MONOGRAM                    *
 * AAYUSH SOOD                 *
 * NOVEMBER 8, 2025              *
 *                                *
 * PURPOSE: TO CREATE           *
 * A MONOGRAM OF THE            *
 * USER'S NAME BASED ON         *
 * A SET OF RULES               *
 *********************************/
//------------------------
import java.util.Scanner;
//------------------------
public class Monogram {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR INPUTTED NAME, MONOGRAM, AND SCANNER
        String strUserName = "", strFirstInitial = "", strLastInitial = "", strMiddleInitial = "";

        Scanner scrInput = new Scanner(System.in);

        // PROMPT USER FOR THEIR NAME
        System.out.print("Enter your first, middle, and last name: ");
        strUserName = scrInput.nextLine().trim(); // TRIM REMOVES ALL TRAILING WHITESPACE

        // GET THE FIRST, LAST, AND MIDDLE INITIALS FROM THEIR NAME
        // GET THE FIRST INITIAL OF THE NAME
        strFirstInitial = strUserName.substring(0, 1).toLowerCase();

        // LOOP THROUGH THE NAME TO FIND THE MIDDLE AND LAST INITIALS
        for (int i = 0; i < strUserName.length(); i++) {
            char charCurrentLetter = strUserName.charAt(i);

            if (charCurrentLetter == ' ') { // CHECKS IF CHARACTER IN STRING IS A SPACE
                if (!strMiddleInitial.equals("")) {
                    // IF MIDDLE INITIAL IS ALREADY DEFINED, THAT MUST MEAN
                    // THE INITIAL IS THE LAST INITIAL
                    strLastInitial = strUserName.substring(i + 1, i + 2).toUpperCase();
                } else {
                    // IF THE MIDDLE INITIAL HAS NOT BEEN FOUND, DEFINE
                    // THE INITIAL AS THE MIDDLE INITIAL
                    strMiddleInitial = strUserName.substring(i + 1, i + 2).toLowerCase();
                }
            }
        }

        // PRINT MONOGRAM BASED ON THESE RULES:
        // FIRST INITIAL (LOWER CASE)
        // LAST INITIAL (UPPER CASE)
        // MIDDLE INITIAL (LOWER CASE)
        System.out.println("Your Monogram is: " + strFirstInitial + strLastInitial + strMiddleInitial);
    }
}
