/****************************
 * PRIME NUMBERS            *
 * AAYUSH SOOD              *
 * NOVEMBER 20, 2025        *
 *                          *
 * PURPOSE: A PROGRAM THAT  *
 * ALLOWS THE USER TO INPUT *
 * A NUMBER, AND IT WILL    *
 * TELL YOU IF ITS A PRIME  *
 * NUMBER                   *
 ***************************/
 //--------------------------
 import java.util.Scanner;
 //--------------------------
public class PrimeNumbers {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR USER'S NUMBER, BOOLEAN, AND SCANNER
            int intNumber = 0, intDivisor = 1;
            boolean blnIsPrime = false;
            
            Scanner scrInput = new Scanner(System.in);
            
        // LET USER INPUT NUMBERS AND CHECK IF IT IS A PRIME
            do {
                intDivisor = 1;
                
                // ASK USER FOR THEIR NUMBER
                    System.out.print("Enter a positive number without decimals: ");
                    intNumber = scrInput.nextInt();
                
                if (intNumber > 1) {
                    // NUMBER IS ASSUMED TO BE PRIME BEFORE CHECKING IF IT IS NOT
                        blnIsPrime = true;
                    
                    // CHECK IF NUMBER HAS OTHER FACTORS
                        for (int i = 0; i < intNumber; i++) {
                            // IF THERE IS A FACTOR THAT IS NOT EQUAL TO 1 OR THE
                            // NUMBER, THE NUMBER IS NOT A PRIME
                                if ((intNumber % intDivisor == 0) && (intDivisor != 1 && intDivisor != intNumber)) {
                                    blnIsPrime = false;
                                }
                            
                            // INCREMENT DIVISOR BY 1
                                intDivisor++;
                        }
                }
                
            } while (!blnIsPrime);
            
            // PRINT THE PRIME NUMBER
                System.out.println(intNumber + " is PRIME!");
    }
}