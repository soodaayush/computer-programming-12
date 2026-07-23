/*******************************************
 * DIVISION AND MODULUS DIVISION            *
 * AAYUSH SOOD                              *
 * SEPTEMBER 18, 2025                       *
 *                                           *
 * PURPOSE: AN APPLICATION THAT             *
 * PROMPTS THE USER FOR TWO                 *
 * INTEGERS AND DISPLAYS THE RESULT         *
 * OF INTEGER AND MODULUS DIVISION          *
 *********************************************/
//------------------------------------
import java.util.Scanner;
//------------------------------------
public class Divisions {
    public static void main(String args[]) {
        // INITIALIZE VARIABLES
        int intFirstInt, intSecondInt;
        int intFirstDivisionResult, intFirstModulusResult, intSecondDivisionResult, intSecondModulusResult;

        String strFlush = "";

        Scanner scrInput = new Scanner(System.in);

        // PROMPT USER FOR TWO INTEGERS
        System.out.print("Enter an integer: ");
        intFirstInt = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        System.out.print("Enter a second integer: ");
        intSecondInt = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        // DIVISION & MODULUS CALCULATIONS
        intFirstDivisionResult = intFirstInt / intSecondInt;
        intFirstModulusResult = intFirstInt % intSecondInt;

        intSecondDivisionResult = intSecondInt / intFirstInt;
        intSecondModulusResult = intSecondInt % intFirstInt;

        // OUTPUT CALCULATIONS
        System.out.println("\n" + intFirstInt + " / " + intSecondInt + " = " + intFirstDivisionResult);
        System.out.println(intFirstInt + " % " + intSecondInt + " = " + intFirstModulusResult);

        System.out.println("\n" + intSecondInt + " / " + intFirstInt + " = " + intSecondDivisionResult);
        System.out.println(intSecondInt + " % " + intFirstInt + " = " + intSecondModulusResult);
    }
}
