/*******************************************
 * SMARTIE DISTRIBUTION CALCULATOR          *
 * AAYUSH SOOD                              *
 * OCTOBER 6, 2025                          *
 *                                           *
 * PURPOSE: TO PROMPT THE USER FOR THE      *
 * NUMBER OF SMARTIES AND THE NUMBER OF     *
 * CHILDREN THEY HAVE TO CALCULATE THE      *
 * NUMBER OF SMARTIES PER CHILD AND         *
 * LEFTOVERS FOR YOU                        *
 *********************************************/
//----------------------------------------
import java.util.Scanner;
//----------------------------------------
public class Leftovers {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR NUMBER OF SMARTIES, CHILDREN, SMARTIES PER CHILD AND LEFTOVERS
        int intSmarties, intChildren, intSmartiesPerChild, intLeftovers;

        Scanner scrInput = new Scanner(System.in);
        String strFlush = "";

        // PROMPT USER FOR NUMBER OF CHILDREN AND SMARTIES
        System.out.print("How many smarties do you have?: ");
        intSmarties = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        System.out.print("How many children will you share them with?: ");
        intChildren = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        // CALCULATE SMARTIES PER CHILD AND LEFTOVERS
        intSmartiesPerChild = intSmarties / intChildren;
        intLeftovers = intSmarties % intChildren;

        // OUTPUT THE NUMBER OF SMARTIES PER CHILD AND LEFTOVERS
        System.out.println("\nSharing the smarties evenly with " + intChildren + " children");
        System.out.println("means that each child will get " + intSmartiesPerChild + " Smarties");
        System.out.println("There will also be " + intLeftovers + " Smarties leftover for you to eat :)");
    }
}
