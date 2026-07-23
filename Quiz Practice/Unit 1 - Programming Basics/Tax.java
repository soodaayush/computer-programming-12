/*******************************************
 * TOTAL COST WITH TAX CALCULATOR           *
 * AAYUSH SOOD                              *
 * OCTOBER 6, 2025                          *
 *                                           *
 * PURPOSE: TO CALCULATE THE TOTAL          *
 * COST OF AN ITEM INCLUDING TAX            *
 * BASED ON THE USER'S ORIGINAL             *
 * PRICE AND TAX RATE                       *
 *********************************************/
//---------------------------------------
import java.util.Scanner;
import java.text.NumberFormat;
//---------------------------------------
public class Tax {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR ORIGNIAL PRICE, TAX RATE, ITEM NAME, AND TOTAL COST
        double dblOriginalPrice = 0, dblTaxRate = 0, dblTotalCost = 0;
        String strItemName, strFlush = "";

        Scanner scrInput = new Scanner(System.in);
        NumberFormat nbfMoney = NumberFormat.getCurrencyInstance();

        // PROMPT USER FOR ORIGINAL PRICE, TAX RATE, AND ITEM NAME
        System.out.print("What is the price of the item to buy?: ");
        dblOriginalPrice = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        System.out.print("What is the tax rate? Enter as a decimal value (ex: 25% = 0.25): ");
        dblTaxRate = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        System.out.print("What is being purchased?: ");
        strItemName = scrInput.nextLine();

        // PERFORM TOTAL COST WITH TAX CALCULATION
        dblTotalCost = dblOriginalPrice + (dblOriginalPrice * dblTaxRate);

        // OUTPUT TOTAL COST WITH TAX
        System.out.println("\n\nYour " + strItemName + " will cost " + nbfMoney.format(dblTotalCost) + " after tax.");
    }
}
