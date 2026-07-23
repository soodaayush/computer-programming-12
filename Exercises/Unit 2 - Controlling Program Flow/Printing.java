/*****************************
 * PRINTING                   *
 * AAYUSH SOOD                *
 * SEPTEMBER 24, 2025         *
 *                             *
 * PURPOSE: TO PROVIDE        *
 * PRINTING PRICES IN TERMS   *
 * OF COST PER PAPER AND      *
 * TOTAL COST BASED ON THE    *
 * NUMBER OF COPIES TO BE     *
 * PRINTED                    *
 *******************************/
//-------------------------
import java.util.Scanner;
import java.text.NumberFormat;
//-------------------------
public class Printing {
    public static void main(String args[]) {
        // DECLARE VARIABLES
        int intNumberOfCopies;
        double dblPricePerCopy = 0, dblTotalCost = 0;

        Scanner scrInput = new Scanner(System.in);
        String strFlush = "";

        NumberFormat nbfMoney = NumberFormat.getCurrencyInstance();

        // PROMPT USER FOR NUMBER OF COPIES
        System.out.print("Enter the number of copies to be printed: ");
        intNumberOfCopies = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        // PERFORM COST CALCULATIONS
        if (intNumberOfCopies <= 99 && intNumberOfCopies >= 0) {
            dblPricePerCopy = 0.30;
        } else if (intNumberOfCopies <= 499 && intNumberOfCopies >= 100) {
            dblPricePerCopy = 0.28;
        } else if (intNumberOfCopies <= 749 && intNumberOfCopies >= 500) {
            dblPricePerCopy = 0.27;
        } else if (intNumberOfCopies <= 1000 && intNumberOfCopies >= 750) {
            dblPricePerCopy = 0.26;
        } else if (intNumberOfCopies > 1000) {
            dblPricePerCopy = 0.25;
        }

        dblTotalCost = dblPricePerCopy * intNumberOfCopies;

        // OUTPUT COSTS TO USER
        System.out.println("Price per copy is: " + nbfMoney.format(dblPricePerCopy));
        System.out.println("Total cost is: " + nbfMoney.format(dblTotalCost));
    }
}
