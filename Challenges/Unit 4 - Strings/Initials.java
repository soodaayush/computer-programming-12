/***************************
 * INITIALS                    *
 * AAYUSH SOOD                 *
 * NOVEMBER 7, 2025             *
 *                               *
 * PURPOSE: A PROGRAM           *
 * THAT TAKES A USER'S          *
 * FULL NAME AND PRINTS         *
 * THEIR INITIALS               *
 *********************************/
//------------------------
import java.util.Scanner;
//------------------------
public class Initials {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR FULL NAME, INITIALS, AND SCANNER
        String strFullName = "", strFirstInitial = "", strLastInitial = "";
        int intSpacePosition = 0;

        Scanner scrInput = new Scanner(System.in);

        // PROMPT THE USER FOR THEIR NAME
        System.out.print("Enter your first and last name: ");
        strFullName = scrInput.nextLine();

        // TAKE THE FIRST LETTERS FROM FIRST AND LAST NAME
        strFirstInitial = strFullName.substring(0, 1);
        intSpacePosition = strFullName.indexOf(" ");
        strLastInitial = strFullName.substring(intSpacePosition + 1, intSpacePosition + 2);

        // PRINT THE INITIALS
        System.out.println(strFirstInitial + strLastInitial);
    }
}
