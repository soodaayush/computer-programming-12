/************************
 * COMMAS               *
 * AAYUSH SOOD          *
 * NOVEMBER 20, 2025    *
 *                      *
 * PURPOSE: A PROGRAM   *
 * WHERE A USER ENTERS  *
 * A NUMBER, AND IT     *
 * WILL BE FORMATTED    *
 * USING COMMAS         *
 ***********************/
 //----------------------
 import java.util.Scanner;
 //----------------------
public class Commas {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR NUMBER, AND SCANNER
            int intNumber = 0, intCount = 0;
            String strNumber = "", strFormattedNumber = "";
            
            boolean blnNegative = false;
            
            Scanner scrInput = new Scanner(System.in);
            
        // PROMPT USER FOR THEIR NUMBER
            System.out.print("Enter a number: ");
            intNumber = scrInput.nextInt();
            
        // CHECK IF NUMBER IS NEGATIVE
            if (intNumber < 0) {
                blnNegative = true;
                intNumber = -intNumber;
            }
            
        // CONVERT INTEGER NUMBER TO STRING
            strNumber = strNumber + intNumber;
            
        // CHECK IF NUMBER IS GREATER THAN THREE DIGITS
            if (strNumber.length() > 3) {
                for (int i = strNumber.length() - 1; i >= 0; i--) {
                    // APPEND CURRENT DIGIT TO FORMATTED NUMBER
                        strFormattedNumber = strNumber.charAt(i) + strFormattedNumber;
                    
                    // INCREMENT THE COUNT OF THE AMOUNT OF DIGITS LOOPED
                    // THROUGH
                        intCount++;
                    
                    // FOR EVERY THREE DIGITS IN THE NUMBER, INSERT A COMMA
                        if (intCount == 3 && i != 0) {
                            strFormattedNumber = "," + strFormattedNumber;
                            intCount = 0;
                        }
                }
            } else {
                // IF NUMBER LENGTH IS LESS THAN FOUR, SIMPLY PRINT THE
                // ORIGINAL NUMBER
                    System.out.println(strNumber);
            }
            
        // ATTACH NEGATIVE SIGN TO NUMBER IF IT IS NEGATIVE
            if (blnNegative) {
                strFormattedNumber = "-" + strFormattedNumber;
            }
            
        // PRINT FORMATTED NUMBER
            System.out.println("Formatted Number: " + strFormattedNumber);
    }
}