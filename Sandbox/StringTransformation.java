import java.util.Scanner;

public class StringTransformation {
    public static void main(String[] args) throws InterruptedException {
        // DEFINE VARIABLES
            String strMessage = "", strFormattedMessage = "";
            
            Scanner scrInput = new Scanner(System.in);
            
        // INTRODUCE PROGRAM
            System.out.print("Enter Message: ");
            strMessage = scrInput.nextLine().toLowerCase();
            
        // FORMAT MESSAGE TO REMOVE ALL SAPCES
            for (int i = 0; i < strMessage.length(); i++) {
                // APPEND ALL CHARACTERS TO FORMATTED STRING BUT SPACES
                    char charLetter = strMessage.charAt(i);
                    
                    if ((int)charLetter != 32) {
                        strFormattedMessage = strFormattedMessage + charLetter;   
                    }
            }
            
        // LOOP THROUGH FORMATTED STRING TO PRINT EVERY INDIVIDUAL LETTER
            for (int i = 0; i < strFormattedMessage.length(); i++) {
                char charLetter = strFormattedMessage.charAt(i);
                
                System.out.println(charLetter);
                Thread.sleep(300);
            }
            
        System.out.println("\n\n");
            
        // PRINT REVERSED STRING
            for (int i = strFormattedMessage.length() - 1; i > -1; i--) {
                char charLetter = strFormattedMessage.charAt(i);
                
                System.out.println(charLetter);
                Thread.sleep(300);
            }
    }
}