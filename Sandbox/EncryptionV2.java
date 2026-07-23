/****************************
 * ENCRYPTION V2            *
 * AAYUSH SOOD              *
 * DECEMBER 15, 2025        *
 *                          *
 * PURPOSE: A PROGRAM THAT  *
 * ENCRYPTS YOUR MESSAGE BY *
 * ADDING SPACES EVERY X    *
 * LETTER, WHERE X IS A     *
 * RANDOMLY GENERATED       *
 * NUMBER                   *
 ***************************/
 //--------------------------
 import java.util.Scanner;
 //--------------------------
public class EncryptionV2 {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR USER MESSAGE, MESSAGE LENGTH, RANDOMLY GENERATED
        // NUMBER AND SCANNER
            String strUserText = "", strFront = "", strBack = "", strEncryptedText = "";
            int intTextLength = 0, intRandomNumber = 0;
            
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

        // GENERATE A RANDOM NUMBER
            intRandomNumber = (int)((5 - 3 + 1) * Math.random() + 3);
        
        // LOOP THROUGH STRING AGAIN TO ADD A SPACE EVERY X LETTERS
            for (int i = 0; i < intTextLength; i++) {
                // APPEND THE CURRENT CHARACTER TO THE ENCRYPTED STRING
                    strEncryptedText += strUserText.charAt(i);
                
                // ADD A SPACE FOR EVERY X POSITION AND MAKES SURE THAT THE
                // CURRENT CHARACTER IS NOT THE LAST ONE
                    if ((i + 1) % intRandomNumber == 0 && (i + 1) != intTextLength) {
                        strEncryptedText += " ";
                    }
            }
            
        // OUTPUT ENCRYPTED TEXT
            System.out.println("Encrypted Message: " + strEncryptedText);
    }
}