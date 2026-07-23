/****************************
 * SCRABBLE WORD SCORE      *
 * AAYUSH SOOD              *
 * DECEMBER 15, 2025        *
 * PURPOSE: A PROGRAM WHERE *
 * A USER ENTERS TEXT AND   *
 * THE SUM OF THE LETTERS   *
 * ASCII VALUES WILL BE     *
 * CALCULATED USING         *
 * CAPITALIZED VALUES       *
 ***************************/
 //--------------------------
 import java.util.Scanner;
 //--------------------------
public class ScrabbleWordScore {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR THE USER ENTERED STRING, THE SUM OF ALL 
        // ASCII VALUES AND SCANNER
            String strUserText = "";
            int intASCIISum = 0, intTextLength = 0;
            
            Scanner scrInput = new Scanner(System.in);
            
        // PROMPT USER FOR STRING
            System.out.print("Enter a word: ");
            strUserText = scrInput.nextLine().toUpperCase();
            intTextLength = strUserText.length();
            
        // LOOP THROUGH STRING TO CALCULATE ASCII VALUE SUM
            for (int i = 0; i < intTextLength; i++) {
                // GET CURRENT CHARACTER IN THE LOOP
                    char charCurrentCharacter = strUserText.charAt(i);
                    
                // ADD ASCII VALUES TO THE SUM
                    intASCIISum += (int)charCurrentCharacter;
            }
            
        // PRINT THE WORD AND ASCII VALUE SUM
            System.out.println("\nWord:\t" + strUserText);
            System.out.println("Score:\t" + intASCIISum);
    }
}