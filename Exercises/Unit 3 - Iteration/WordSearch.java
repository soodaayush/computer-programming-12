/******************************
 * WORD SEARCH                  *
 * AAYUSH SOOD                  *
 * OCTOBER 29, 2025              *
 *                                *
 * PURPOSE: TO CREATE A          *
 * RANDOM WORD SEARCH GAME       *
 * BOARD                         *
 **********************************/
//---------------------------
import java.util.Scanner;
//---------------------------
public class WordSearch {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR WORD SEARCH GAME BOARD LENGTH & WIDTH, RANDOMLY
        // GENERATED NUMBER, THE LETTER IN THE GAME BOARD,  THE GAME BOARD
        // STRING ACCUMULATOR, AND SCANNER
        int intColumns = 0, intRows = 0, intASCIILetterCode = 0;
        char charLetter;
        String strGameBoard = "";

        Scanner scrInput = new Scanner(System.in);

        // PROMPT THE USER ABOUT THE WORD SEARCH BOARD'S LENGTH & WIDTH
        System.out.print("Enter the length of the game board: ");
        intColumns = scrInput.nextInt();

        System.out.print("Enter the width of the game board: ");
        intRows = scrInput.nextInt();

        // BUILD A GAME BOARD
        // PRINT ONE LINE OF LETTERS
        for (int r = 0; r < intRows; r++) { // PRINT ONE ROW
            for (int c = 0; c < intColumns; c++) { // PRINT COLUMNS OF LETTERS
                // GENERATE A RANDOM ASCII CODE FOR A LETTER
                intASCIILetterCode = (int)((90 - 65 + 1) * Math.random() + 65);

                // CHANGE THE NUMBER TO A LETTER AND ADD IT TO THE GAME
                // BOARD
                strGameBoard = strGameBoard + (char)intASCIILetterCode;
            }

            // MOVE THE CURSOR DOWN A LINE TO CREATE A NEW ROW
            strGameBoard = strGameBoard + "\n";
        }

        System.out.println("\n\n" + strGameBoard + "\n\n");
    }
}
