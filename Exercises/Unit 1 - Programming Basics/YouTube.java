/*******************************************
 * YOUTUBE PAYDAY!                          *
 * AAYUSH SOOD                              *
 * SEPTEMBER 10, 2025                       *
 *                                           *
 * PURPOSE: TO CALCULATE HOW MUCH           *
 * REVENUE CAN BE GENERATED FROM            *
 * A YOUTUBE CHANNEL BASED ON               *
 * VIDEO VIEWS. ROYALTIES ARE               *
 * #3.95 PER 1000 VIEWS                     *
 *********************************************/
//------------------------------------
import java.util.Scanner;
import java.text.NumberFormat; //Allow us to format numbers as currency
//------------------------------------
public class YouTube {
    public static void main(String args[]) {

        //DECLARE VARIABLES (i.e. name every location in the RAM)
        int intNumVideoViews = 0;
        double dblTotalPay = 0;

        //DECLARE SCANNER (it is a special type of variable)
        Scanner scrInput = new Scanner(System.in);
        String strFlush = "";
        NumberFormat nbfMoney = NumberFormat.getCurrencyInstance();

        //GREET USER & ASK FOR INPUT
        System.out.println("\t\tMy YouTube Royalty Calculator\n\n");

        System.out.print("Enter the number of videos viewed this month: ");

        intNumVideoViews = scrInput.nextInt(); //5000


        //CALCULATIONS OR MANIPULATION
        dblTotalPay = ((double)intNumVideoViews/1000)*3.95; //19.75

        //OUTPUT
        System.out.print("\n\nYou will earn: " + nbfMoney.format(dblTotalPay));
    }
}
