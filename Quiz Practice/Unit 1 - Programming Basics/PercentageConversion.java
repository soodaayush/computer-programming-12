/*******************************************
 * PERCENT TO DECIMAL CALCULATOR            *
 * AAYUSH SOOD                              *
 * OCTOBER 6, 2025                          *
 *                                           *
 * PURPOSE: TO CONVERT A USER'S             *
 * DESIRED PERCENTAGE INTO A                *
 * DECIMAL                                  *
 *********************************************/
//------------------------------------
import java.util.Scanner;
//------------------------------------
public class PercentageConversion {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR THE PROMPED PERCENTAGE AND ITS DECIMAL VALUE
        int intPercentage;
        double dblDecimal;

        Scanner scrInput = new Scanner(System.in);
        String strFlush = "";

        // PROMPT THE USER FOR THEIR PERCENTAGE TO BE CONVERTED TO A DECIMAL
        System.out.print("Please enter the percentage to convert: ");
        intPercentage = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        // CONVERT THE PERCENTAGE INTO A DECIMAL VALUE
        // CONVERSION: PERCENTAGE / 100
        dblDecimal = intPercentage / 100.0;

        // OUTPUT THE DECIMAL VALUE OF THE PERCENTAGE
        System.out.println("\n" + intPercentage + "%" + " is " + dblDecimal + " as a decimal value.");
    }
}
