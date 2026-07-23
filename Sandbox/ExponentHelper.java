/****************************
 * EXPONENT HELPER          *
 * AAYUSH SOOD              *
 * NOVEMBER 19, 2025        *
 *                          *
 * A PROGRAM THAT ALLOWS    *
 * YOU TO ENTER A BASE AND  *
 * EXPONENT AND EVALUATE    *
 * THE EXPRESSION           *
 ***************************/
 //--------------------------
 import java.util.Scanner;
 //--------------------------
public class ExponentHelper {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR BASE, EXPONENT, ANSWER, SCANNER
            int intBase = 0, intExponent = 0, intAnswer = 0;
            String strEquation = "";
            
            Scanner scrInput = new Scanner(System.in);
            
        // PROMPT USER FOR BASE AND EXPONENT
            System.out.print("Enter the base: ");
            intBase = scrInput.nextInt();
            
            System.out.print("Enter the power/exponent: ");
            intExponent = scrInput.nextInt();
            
        // EVALUATE THE EXPRESSION
            if (intExponent > 0) {
                for (int i = 0; i < intExponent; i++) {
                    if (i == 0) {
                        intAnswer = intBase;
                    } else {
                        intAnswer = intAnswer * intBase;
                    }
                    
                    if (strEquation.length() > 0) {
                        strEquation = strEquation + " x ";
                    }
                    
                    strEquation = strEquation + intBase;
                }
            
                System.out.println(strEquation + " = " + intAnswer);
            } else if (intExponent == 0) {
                System.out.println("= 1");
            }
    }
}