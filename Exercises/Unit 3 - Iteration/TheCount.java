/****************************
 * THE COUNT                  *
 * AAYUSH SOOD                *
 * OCTOBER 10, 2025           *
 *                             *
 * PURPOSE: A PROGRAM THAT    *
 * HELPS CHILDREN LEARN HOW   *
 * TO COUNT                   *
 ******************************/
//---------------------------
import java.util.Scanner;
//---------------------------
public class TheCount {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR NUMBER RANGE AND SCANNER
        int intStartingNumber = 0, intEndingNumber = 0;
        boolean boolCountForward = false, boolCountBackward = false;

        Scanner scrInput = new Scanner(System.in);
        String strPause = "";

        // ASK FOR A STARTING AND STOPPING NUMBER
        System.out.print("Enter a starting number: ");
        intStartingNumber = scrInput.nextInt();

        System.out.print("Enter an ending number: ");
        intEndingNumber = scrInput.nextInt();
        strPause = scrInput.nextLine();

        // CHECK IF WE SHOULD COUNT FORWARD OR BACKWARD
        if (intStartingNumber <= intEndingNumber) {
            boolCountForward = true;
        } else if (intStartingNumber >= intEndingNumber) {
            boolCountBackward = true;
        }

        // OUTPUT EACH NUMBER BETWEEN STARTING AND STOPPING NUMBERS
        // WITH A PAUSE BETWEEN EACH NUMBER
        do {
            // DISPLAY THE CURRENT NUMBER
            System.out.println(intStartingNumber);

            // COUNT UP TO THE NEXT NUMBER
            intStartingNumber = (boolCountForward) ? intStartingNumber + 1 : intStartingNumber - 1;

            // PAUSE
            System.out.print("Press a key to continue");
            strPause = scrInput.nextLine();
        } while (boolCountForward ? intStartingNumber <= intEndingNumber : intStartingNumber >= intEndingNumber);
    }
}
