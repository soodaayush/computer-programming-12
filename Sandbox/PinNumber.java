/****************************
 * PIN NUMBER               *
 * AAYUSH SOOD              *
 * NOVEMBER 19, 2025        *
 *                          *
 * PURPOSE: A PROGRAM THAT  *
 * ALLOWS A USER TO ENTER   *
 * THEIR PIN NUMBER. IF     *
 * THEY FAIL TO DO THIS IN  *
 * THREE ATTEMPTS, THEIR    *
 * CARD WILL BE KEPT BY THE *
 * MACHINE                  *
 ***************************/
 //--------------------------
 import java.util.Scanner;
 //--------------------------
public class PinNumber {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR PIN NUMBER AND USER ANSWERS
            int intValidPIN = 5793, intUserPin = 0, intAttempts = 3;
            boolean blnValidPIN = false;
            
            Scanner scrInput = new Scanner(System.in);
            
        // INITIATE A LOOP
            do {
                // DECREASE THE NUMBER OF AVAILABLE ATTEMPTS
                    intAttempts--;
                
                // PROMPT USER FOR THEIR PIN
                    System.out.print("Enter your four digit PIN: ");
                    intUserPin = scrInput.nextInt();
                    
                    // CHECK IF PIN IS VALID
                        if (intUserPin == intValidPIN) {
                            blnValidPIN = true;
                        } else {
                            System.out.println("Sorry, incorrect PIN. You have " + intAttempts + " more attempts left.\n");
                        }
            } while (intAttempts > 0 && !blnValidPIN);
            
            // PROVIDE A MESSAGE DEPENDING ON WHETHER OR NOT THE USER
            // SUCCESSFULLY ENTERED THE CORRECT PIN
                if (blnValidPIN) {
                    System.out.println("\na) Deposit");
                    System.out.println("b) Withdraw Funds");
                    System.out.println("c) Transfer Funds");
                } else {
                    System.out.println("\nExceeded allowable PIN entry attmepts.");
                    System.out.println("This bank card is being kept.");
                    System.out.println("If the card is yours, please contact the bank.");
                }
    }
}