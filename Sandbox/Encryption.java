/********************************
 * ENCRYPTION                   *
 * AAYUSH SOOD                  *
 * DECEMBER 15, 2025            *
 *                              *
 * PURPOSE: A PROGRAM THAT      *
 * ENCRYPTS A USER'S TEXT BY    *
 * REMOVING ALL SPACES IN THE   *
 * TEXT                         *
 *******************************/
 //------------------------------
 import java.util.Scanner;
 //------------------------------
public class Encryption {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR USER'S MESSAGE, ENCRYPTED MESSAGE, USER MESSAGE
        // LENGTH AND SCANNER
            String strUserText = "", strFront = "", strBack = "";
            int intTextLength = 0;
            
            Scanner scrInput = new Scanner(System.in);
            
        // PROMPT USER FOR STRING
            System.out.print("Enter message to encrypt: ");
            strUserText = scrInput.nextLine().toUpperCase();
            intTextLength = strUserText.length();
            
        // LOOP THROUGH STRING TO REMOVE ALL SPACES
            for (int i = 0; i < intTextLength; i++) {
                // GET CURRENT CHARACTER
                    char charCurrentCharacter = strUserText.charAt(i);
                    
                // CHECK IF CURRENT CHARACTER IS A SPACE
                    if (charCurrentCharacter == ' ') {
                        // GET ALL TEXT BEFORE AND AFTER THE SPACE
                            strFront = strUserText.substring(0, i);
                            strBack = strUserText.substring(i + 1, intTextLength);
                        
                        // CHANGE THE USER TEXT TO REMOVE THE SPACE
                            strUserText = strFront + strBack;
                            
                        // UPDATE THE TEXT LENGTH AS IT HAS CHANGED
                            intTextLength = strUserText.length();
                            
                        // RESET THE LOOP SO NO SPACES ARE MISSED
                            i = -1;
                    }
            }
            
        // OUTPUT ENCRYPTED TEXT
            System.out.println("Encrypted Message: " + strUserText);
    }
}