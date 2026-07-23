/*********************************
 * CHA CHING                     *
 * AAYUSH SOOD                   *
 * SEPTEMBER 16, 2025            *
 *                                *
 * PURPOSE: TO TELL A CASHIER   *
 * WHAT CHANGE TO RETURN TO A   *
 * CUSTOMER SO THEY GIVE BACK   *
 * THE SMALLEST NUMBER OF COINS *
 ***********************************/
//------------------------------------
import java.util.Scanner;
//------------------------------------
public class ChaChing {
    public static void main(String args[]) {
        // SCANNER
        Scanner scrInput = new Scanner(System.in);
        String strFlush = ""; // STRING WITH NO TEXT

        // DECLARE VARIABLES
        int intTotalChange = 0, intQuarters = 0, intDimes = 0, intNickels = 0, intPennies = 0;

        // ASK THE USER HOW MUCH CHANGE MUST BE RETURNED TO THE CUSTOMER
        System.out.print("How much change is the customer owed?: ");
        intTotalChange = scrInput.nextInt(); // 92

        // FLUSH INPUT STREAM
        strFlush = scrInput.nextLine(); // No more \n in our input stream

        // CALCULATIONS
        /* FIRST WAY WE SOLVED THIS PROBLEM
        intQuarters = intTotalChange / 25; // 92/25 = 3
        intDimes = (intTotalChange - (intQuarters * 25))/10;
        intNickels = (intTotalChange - ((intQuarters * 25) + (intDimes * 10))) / 5;
        intPennies = (intTotalChange - ((intQuarters * 25) + (intDimes * 10) + (intNickels * 5)));
        */

        // NEW APPROACH TO SOLVING THE PROBLEM
        intQuarters = intTotalChange / 25; // 3
        intDimes = (intTotalChange % 25) / 10; // 1
        intNickels = ((intTotalChange % 25) % 10) / 5; // 1
        intPennies = (((intTotalChange % 25) % 10) % 5); // 2

        // OUTPUT ANSWERS
        System.out.println("\n\nReturn the following coins:");
        System.out.println(intQuarters + " Quarters(s)");
        System.out.println(intDimes + " Dime(s)");
        System.out.println(intNickels + " Nickel(s)");
        System.out.println(intPennies + " Pennies");
    }
}
