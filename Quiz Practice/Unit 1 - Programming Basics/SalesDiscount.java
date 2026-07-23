/*******************************************
 * SALE PRICE CALCULATOR                    *
 * AAYUSH SOOD                              *
 * OCTOBER 6, 2025                          *
 *                                           *
 * PURPOSE: TO ASK THE USER                 *
 * FOR THE ORIGINAL PRICE                   *
 * OF AN ITEM AND THE                       *
 * PERCENTAGE DISCOUNT TO                   *
 * APPLY. IT WILL THEN                      *
 * CALCULATE THE DISCOUNTED                 *
 * PRICE OF THE ITEM                        *
 *********************************************/
//---------------------------
import java.util.Scanner;
import java.text.NumberFormat;
//---------------------------
public class SalesDiscount {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR ORIGINAL PRICE, % DISCOUNT, AND DISCOUNTED PRICE
        double dblOriginalPrice = 0, dblDiscountedPrice = 0;
        int intPercentageDiscount = 0;

        Scanner scrInput = new Scanner(System.in);
        String strFlush = "";
        NumberFormat nbfMoney = NumberFormat.getCurrencyInstance();

        // PROMPT THE USER FOR THEIR ITEM'S ORIGINAL PRICE AND THEIR % DISCOUNT
        System.out.print("Please enter the item's original price: ");
        dblOriginalPrice = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        System.out.print("Please enter the % discount (to the nearest whole number): ");
        intPercentageDiscount = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        // CALCULATE THE DISCOUNTED PRICE OF THE ITEM
        dblDiscountedPrice = dblOriginalPrice - (dblOriginalPrice * ((double)intPercentageDiscount / 100));

        // OUTPUT THE DISCOUNTED PRICE OF THE ITEM
        System.out.println("\n\nWith a " + intPercentageDiscount + "%" + " discount your item will cost " + nbfMoney.format(dblDiscountedPrice));
    }
}
