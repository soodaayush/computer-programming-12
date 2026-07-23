/******************************
 * EGGS                        *
 * AAYUSH SOOD                 *
 * SEPTEMBER 24, 2025          *
 *                              *
 * PURPOSE: TO PROMPT THE      *
 * USER FOR THE NUMBER OF      *
 * EGGS, AND CALCULATES THE    *
 * BILL                        *
 ********************************/
//---------------------------
import java.util.Scanner;
import java.text.NumberFormat;
//---------------------------
public class Eggs {
    public static void main(String args[]) {
        // DEFINE VARIABLES
        int intNumberOfEggs = 0, intEggDifference = 0;
        double dblPricePerDozen = 0, dblBill = 0;

        Scanner scrInput = new Scanner(System.in);
        String strFlush = "";

        NumberFormat nbfMoney = NumberFormat.getCurrencyInstance();

        // PROMPT THE USER FOR NUMBER OF EGGS
        System.out.print("Enter the number of eggs purchased: ");
        intNumberOfEggs = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        // PERFORM COST CALCULATIONS
        if (intNumberOfEggs < 48 && intNumberOfEggs >= 0) {
            dblPricePerDozen = 0.50;
            dblBill = (intNumberOfEggs / 12.0) * dblPricePerDozen;
        } else if (intNumberOfEggs < 72 && intNumberOfEggs >= 48) {
            dblPricePerDozen = 0.45;
            dblBill = (intNumberOfEggs / 12.0) * dblPricePerDozen;
        } else if (intNumberOfEggs < 132 && intNumberOfEggs >= 72) {
            dblPricePerDozen = 0.40;
            dblBill = (intNumberOfEggs / 12.0) * dblPricePerDozen;
        } else if (intNumberOfEggs >= 132) {
            dblPricePerDozen = 0.35;
            intEggDifference = intNumberOfEggs - 132;
            dblBill = (11 * dblPricePerDozen) + (intEggDifference * ((double)1/12 * dblPricePerDozen));
        }

        // OUTPUT COSTS
        System.out.println("The bill is equal to: " + nbfMoney.format(dblBill));
    }
}
