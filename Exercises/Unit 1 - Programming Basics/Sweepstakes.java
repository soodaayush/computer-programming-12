/*******************************************************
 * SWEEPSTAKES                                          *
 * AAYUSH SOOD                                          *
 * SEPTEMBER 9, 2025                                    *
 *                                                       *
 * PURPOSE: IS TO PRESENT A CUSTOMER                    *
 * WITH A SKILL TESTING QUESTION                        *
 * FOR A CONTEST                                        *
 *********************************************************/
//---------------------------------------------------
import java.util.Scanner;
//---------------------------------------------------
public class Sweepstakes {
    public static void main(String args[]) {
        //CREATE A SCANNER TO ACCEPT INPUT AND PAUSE PROGRAM
        Scanner scrInput = new Scanner(System.in);
        String strPause = "";

        //OUTPUT THE CONTEST DETAILS
        System.out.println("\t\t\"Greasy Garry's Giveaway\"");
        System.out.println("\n\t\t   !!YOU WIN!!");
        System.out.println("\t\t     (a donut)");

        //OUTPUT SKILL TESTING QUESTION
        System.out.println("to claim your prize answer this question:");
        System.out.println("127 divided by 2, add 5, subtract 8, multiply by 5 = ?  ");

        //PAUSE PROGRAM
        strPause = scrInput.nextLine();

        //ANSWER
        System.out.println("\nThe answer is: " + ((((127/2.0)+5)-8)*5));
    }
}
