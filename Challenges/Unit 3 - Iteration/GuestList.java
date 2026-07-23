/**************************
 * GUEST LIST                *
 * AAYUSH SOOD                *
 * OCTOBER 15, 2025            *
 *                              *
 * PURPOSE: TO ALLOW A         *
 * USER TO INPUT THEIR         *
 * LIST OF GUESTS AND          *
 * PRINT THE LIST IN           *
 * ITS ORIGINAL ORDER          *
 * AND IN REVERSE ORDER        *
 ********************************/
//-----------------------
import java.util.Scanner;
//-----------------------
public class GuestList {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR GUEST LIST, NUMBER OF GUESTS, AND SCANNER
        String strGuestList = "", strReversedGuestList = "", strGuestName = "", strFlush = "";
        int intNumberOfGuests = 0;

        Scanner scrInput = new Scanner(System.in);

        // PROMPT USER FOR THE NUMBER OF GUESTS ATTENDING AND THE LIST OF GUESTS
        System.out.println("Build your guest list!");

        System.out.print("\nHow many guests will be attending? ");
        intNumberOfGuests = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        System.out.print("\n");

        // ASK THE USER FOR THE NAME OF EACH GUEST
        for (int i = 0; i < intNumberOfGuests; i++) {
            // CREATE LIST OF GUESTS
            System.out.print("Enter guest name: ");
            strGuestName = scrInput.nextLine();
            strGuestList = strGuestList + (i + 1) + ".  " + strGuestName + "\n";

            // REVERSE THE LIST
            strReversedGuestList = (intNumberOfGuests - i) + ".  " + strGuestName + "\n" + strReversedGuestList;
        }

        // OUTPUT THE GUEST LIST IN ITS ORIGINAL ORDER
        System.out.println("\nYour guest list: \n" + strGuestList);

        // OUTPUT THE REVERSED GUEST LIST
        System.out.println("\nYour reversed guest list: \n" + strReversedGuestList);
    }
}
