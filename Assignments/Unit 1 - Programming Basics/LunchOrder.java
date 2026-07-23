/*******************************************
 * LUNCH ORDER CALCULATOR                   *
 * AAYUSH SOOD                              *
 * SEPTEMBER 11, 2025                       *
 *                                           *
 * PURPOSE: THIS PROGRAM CALCULATES         *
 * THE TOTAL BILL, TAX, AND CHANGE          *
 * FOR A LUNCH ORDER BASED ON USER          *
 * INPUT FOR BURGERS, FRIES, SODAS          *
 * AND FINAL COST                           *
 *********************************************/
//------------------------------------
import java.util.Scanner;
import java.text.NumberFormat;
//------------------------------------
public class LunchOrder {
    public static void main(String args[]) {
        // INITIALIZE VARIABLES
        double dblBurgerCost = 1.69;
        double dblFriesCost = 1.09;
        double dblSodaCost = 0.99;

        int intBurgerCount;
        int intFriesCount;
        int intSodaCount;

        double dblTotalBeforeTax;
        double dblTax;
        double dblFinalTotal;

        double dblAmountTendered;
        double dblChange;

        String strFlush = "";

        Scanner scrInput = new Scanner(System.in);
        NumberFormat nbfMoney = NumberFormat.getCurrencyInstance();

        // PROMPT USER FOR LUNCH ORDER
        System.out.print("Enter the number of burgers: ");
        intBurgerCount = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        System.out.print("Enter the number of fries: ");
        intFriesCount = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        System.out.print("Enter the number of sodas: ");
        intSodaCount = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        // TOTAL BEFORE TAX, TAX, & FINAL TOTAL CALCULATIONS
        dblTotalBeforeTax = ((double)intBurgerCount * dblBurgerCost) + ((double)intFriesCount * dblFriesCost) + ((double)intSodaCount * dblSodaCost);
        dblTax = 0.065 * dblTotalBeforeTax;
        dblFinalTotal = dblTotalBeforeTax + dblTax;

        // OUTPUT COSTS
        System.out.println("Total before tax: " + nbfMoney.format(dblTotalBeforeTax));
        System.out.println("Tax: " + nbfMoney.format(dblTax));
        System.out.println("Final total: " + nbfMoney.format(dblFinalTotal));

        // PROMPT USER FOR AMOUNT TENDERED
        System.out.print("\nEnter amount tendered: $");
        dblAmountTendered = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        // CALCULATE CHANGE
        dblChange = dblAmountTendered - dblFinalTotal;

        // OUTPUT CHANGE
        System.out.println("Change: " + nbfMoney.format(dblChange));
    }
}
