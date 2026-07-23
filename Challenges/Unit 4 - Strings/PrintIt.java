/**************************
 * PRINT IT!                  *
 * AAYUSH SOOD                *
 * NOVEMBER 6, 2025            *
 *                              *
 * PURPOSE: A PROGRAM          *
 * THAT PROMPTS THE            *
 * USER FOR A MESSAGE          *
 * AND PRINTS IT               *
 * VERTICALLY AND              *
 * HORIZONTALLY                *
 ********************************/
//-----------------------
import java.util.Scanner;
//-----------------------
public class PrintIt {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR THE MESSAGE, VERTICAL MESSAGE, DIAGONAL
        // MESSAGE, AND SCANNER
        String strMessage = "", strVerticalMessage = "", strDiagonalMessage = "";

        Scanner scrInput = new Scanner(System.in);

        // PROMPT USER FOR THEIR MESSAGE
        System.out.println("\t\t\tWork It!");
        System.out.println("\t\t      Text Creations");

        System.out.print("\nType your message: ");
        strMessage = scrInput.nextLine();

        // PRINT THE MESSAGE VERTICALLY & DIAGONALLY
        for (int i = 0; i < strMessage.length(); i++) {
            // LOOP THROUGH THE STRING AND ADD ITS INDIVIDUAL LETTERS TO THE
            // VERTICAL MESSAGE
            strVerticalMessage = strVerticalMessage + strMessage.substring(i, i + 1) + "\n";

            for (int j = 0; j < i; j++) {
                // ADD SPACES BEFORE THE DIAGONAL LETTER DEPENDING ON THE
                // POSITION OF THE LETTER IN THE USER'S MESSAGE
                strDiagonalMessage = strDiagonalMessage + " ";
            }

            // ADD DIAGONAL CHARACTER AFTER THE SPACES
            strDiagonalMessage = strDiagonalMessage + strMessage.substring(i, i + 1) + "\n";
        }

        // PRINT BOTH VERTICAL AND DIAGONAL MESSAGES
        System.out.println("Vertically!\n***********");
        System.out.println(strVerticalMessage);
        System.out.println("Diagonally!\n***********");
        System.out.println(strDiagonalMessage);
    }
}
