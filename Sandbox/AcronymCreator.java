/********************************
 * ACRONYM CREATOR              *
 * AAYUSH SOOD                  *
 * DECEMBER 15, 2025            *
 *                              *
 * PURPOSE: A PROGRAM WHERE A   *
 * USER ENTERS A PHRASE AND THE *
 * PROGRAM WILL TAKE THE FIRST  *
 * LETTER OF EVERY WORD AND     *
 * ASSEMBLE THEM TO FORM AN     *
 * ACRONYM                      *
 *******************************/
 //------------------------------
 import java.util.Scanner;
 //------------------------------
public class AcronymCreator {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR USER PHRASE, PHRASE LENGTH, ACRONYM STRING
        // AND SCANNER
            String strUserPhrase = "", strAcronym = "";
            int intPhraseLength = 0;
            
            Scanner scrInput = new Scanner(System.in);
            
        // PROMPT USER FOR PHRASE
            System.out.print("Enter a phrase: ");
            strUserPhrase = scrInput.nextLine();
            intPhraseLength = strUserPhrase.length();
            
        // LOOP THROUGH STRING TO FORM AN ACRONYM
            for (int i = 0; i < intPhraseLength; i++) {
                // GET CURRENT CHARACTER IN THE STRING
                    char charCurrentCharacter = strUserPhrase.charAt(i);
                
                // CHECK IF CURRENT CHARACTER IS THE FIRST LETTER IN THE STRING
                    if (i == 0) {
                        strAcronym += Character.toUpperCase(charCurrentCharacter) + ".";   
                    } else if (charCurrentCharacter == ' ') {
                        strAcronym += strUserPhrase.substring(i + 1, i + 2).toUpperCase() + ".";
                    }
            }
            
        System.out.println(strAcronym);
    }
}