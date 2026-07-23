/****************************
 * PHRASE SCORE             *
 * AAYUSH SOOD              *
 * DECEMBER 15, 2025        *
 *                          *
 * PURPOSE: A PROGRAM WHERE *
 * A USER ENTERS A PHRASE   *
 * AND IT CALCULATES THE    *
 * WORD SCORE BY FINDING    *
 * THE SUM OF ALL CAPITAL   *
 * ASCII NUMBERS            *
 ***************************/
 //--------------------------
 import java.util.Scanner;
 //--------------------------
public class PhraseScore {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR USER PHRASE, WORD SCORE, WORD LENGTH AND 
        // SCANNER
            String strUserPhrase = "";
            int intWordScore = 0, intPhraseLength = 0;
            
            Scanner scrInput = new Scanner(System.in);
            
        // PROMPT USER FOR PHRASE
            System.out.print("Enter a phrase: ");
            strUserPhrase = scrInput.nextLine().toUpperCase();
            intPhraseLength = strUserPhrase.length();
            
        // LOOP THROUGH PHRASE TO CALCULATE WORD SCORE
            for (int i = 0; i < intPhraseLength; i++) {
                // GET CURRENT CHARACTER IN THE LOOP
                    char charCurrentCharacter = strUserPhrase.charAt(i);
                    
                // ADD ASCII VALUE TO THE WORD SCORE SUM AS LONG AS THE CURRENT
                // CHARACTER IS AN UPPERCASE LETTER
                    if (Character.isUpperCase(charCurrentCharacter)) {
                        intWordScore += (int)charCurrentCharacter;
                    }
            }
            
        // OUTPUT RESULTS
            System.out.println("\nWord:\t" + strUserPhrase);
            System.out.println("Score:\t" + intWordScore);
    }
}