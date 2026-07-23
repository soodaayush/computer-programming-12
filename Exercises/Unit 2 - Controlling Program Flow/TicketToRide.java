/**************************************
 * TICKET TO RIDE                     *
 * AAYUSH SOOD                        *
 * SEPTEMBER 25, 2025`                *
 *                                     *
 * PURPOSE: TO JUDGE                  *
 * IF A CHILD CAN MEET                *
 * THE REQUIREMENT FOR                *
 * A RIDE                             *
 ****************************************/
//-----------------------
import java.util.Scanner;
//-----------------------
public class TicketToRide {
    public static void main(String args[]) {
        // DEFINE VARIABLES TO GET THE CHILD'S STATS
        int intAge = 0, intWeight = 0;

        Scanner scrInput = new Scanner(System.in);
        String strFlush = "";

        // OUTPUT GREETING AND ASK FOR THE CHILD'S AGE
        System.out.println("\t\tWelcome to \"Stinky's\" Amusements!");

        System.out.print("\n\nEnter the child's age: ");
        intAge = scrInput.nextInt(); // 15
        strFlush = scrInput.nextLine();

        System.out.print("Enter the child's weight (kg): ");
        intWeight = scrInput.nextInt(); // 30
        strFlush = scrInput.nextLine();

        // EVALUATE IF THE CHILD CAN GET ON THE RIDE
        // MUST BE BETWEEN 6-14 YEARS OF AGE
        // MUST WEIGH BETWEEN 20-40 KG
        if ((intAge >= 6 && intAge <= 14) && (intWeight >= 20 && intWeight <= 40)) {
            System.out.println("\nYippy they can get on the ride. Enjoy");
        } else {
            System.out.println("\nSorry, you cannot get on this ride!");
        }
    }
}
