import java.util.Scanner;

public class EncryptionAlgorithm {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR MESSAGE, ENCRYPTED MESSAGE, AND SCANNER
            String strMessage = "", strEncryptedMessage = "";
            
            Scanner scrInput = new Scanner(System.in);
        
        // INTRODUCE PROGRAM AND TAKE IN INPUT
            System.out.print("Enter the message you want to encrypt: ");
            strMessage = scrInput.nextLine().toLowerCase();
        
        // FILTER MESSAGE TO REMOVE SPACES
            for (int i = 0; i < strMessage.length(); i++) {
                char charLetter = strMessage.charAt(i);
                
                if ((int)charLetter != 32) {
                    strEncryptedMessage = strEncryptedMessage + charLetter;
                }
            }
       
       // CHECK IF THERE ARE AN EVEN AMOUNT OF CHARACTERS IN THE MESSAGE
            if (strEncryptedMessage.length() % 2 == 0) {
                for (int i = 0; i < strEncryptedMessage.length(); i += 2) {
                    // SWAP EVEN-INDEXED CHARACTER WITH ODD-INDEXED CHARACTER
                        strEncryptedMessage = strEncryptedMessage.substring(0, i) + strEncryptedMessage.substring(i + 1, i + 2) + strEncryptedMessage.substring(i, i + 1) + strEncryptedMessage.substring(i + 2, strEncryptedMessage.length());
                }
            } else if (strEncryptedMessage.length() % 2 != 0) {
                for (int i = 0; i < strEncryptedMessage.length() - 1; i += 2) {
                    // SWAP EVEN-INDEXED CHARACTER WITH ODD-INDEXED CHARACTER
                    // UNITL LOOP REACHES SECOND-LAST CHARACTER
                        if (i != strEncryptedMessage.length() - 1) {
                            strEncryptedMessage = strEncryptedMessage.substring(0, i) + strEncryptedMessage.substring(i + 1, i + 2) + strEncryptedMessage.substring(i, i + 1) + strEncryptedMessage.substring(i + 2, strEncryptedMessage.length());
                        }
                }
                
                // READJUST ENCRYPTED MESSAGE BY PLACING LAST CHARACTER OF 
                // THE ORIGINAL MESSAGE AT THE START
                    strEncryptedMessage = strEncryptedMessage.substring(strEncryptedMessage.length() - 1, strEncryptedMessage.length()) + strEncryptedMessage.substring(0, strEncryptedMessage.length() - 1);
            }
        
        // OUTPUT ENCRYPTED MESSAGE
            System.out.println("\nYour encrypted message is shown below:\n" + strEncryptedMessage);
    }
}