/*******************************
 * FLIBBER ME JIBBETS!          *
 * AAYUSH SOOD                  *
 * OCTOBER 30, 2025             *
 *                               *
 * PURPOSE: TO PRINT A          *
 * BOAT'S SAIL DEPENDING        *
 * OF A SIZE DEFINED BY THE     *
 * USER                         *
 *********************************/
//---------------------------
import java.util.Scanner;
//---------------------------
public class FlibberMeJibbets {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR SAIL SIZE, SAIL STRING, AND SCANNER
        int intSailSize = 0;
        String strSail = "";

        Scanner scrInput = new Scanner(System.in);

        // PROMPT USER FOR THE SAIL SIZE
        System.out.println("Fibber me jibbets! Hoist the main sail ya scurvy seadog!");

        System.out.print("What size sail captain?: ");
        intSailSize = scrInput.nextInt();

        // CREATE THE SAIL USING A LOOP BASED ON THE VALUE OF THE SAIL SIZE
        if (intSailSize > 0) {
            for (int i = 1; i <= intSailSize; i++) {
                // IF SAIL SIZE IS POSITIVE, PRINT EACH ROW OF THE FLAG
                // STARTING AT THE SHORTEST ROW OF STARS AT THE TOP AND
                // INCREASE THE NUMBER OF STARS IN EACH ROW BY 1 UNTIL
                // THE LONGEST ROW OF STARS IS PRINTED AT THE BOTTOM
                for (int j = 0; j < i; j++) {
                    // ADD NEW STARS TO THE CURRENT ROW DEPENDING ON
                    // ITS SIZE
                    strSail = strSail + "*";
                }

                // ADD A NEW LINE AFTER EVERY ROW IS PRINTED
                if (i != intSailSize) {
                    strSail = strSail + "\n";
                }
            }

            // OUTPUT THE SAIL TO THE USER
            System.out.print(strSail);
        } else if (intSailSize < 0) {
            for (int i = intSailSize * -1; i >= 0; i--) {
                // IF SAIL SIZE IS NEGATIVE, PRINT EACH ROW OF THE FLAG
                // STARTING WITH THE LONGEST ROW OF STARS AT THE TOP AND
                // DECREASE THE NUMBER OF STARS IN EACH ROW BY 1 UNTIL
                // THE SHORTEST ROW OF STARTS IS PRINTED AT THE BOTTOM
                for (int j = 0; j < i; j++) {
                    // ADD NEW STARS TO THE CURRENT ROW DEPENDNIG ON
                    // ITS SIZE
                    strSail = strSail + "*";
                }

                // ADD A NEW LINE AFTER EVERY ROW IS PRINTED
                if (i != 0) {
                    strSail = strSail + "\n";
                }
            }

            // OUTPUT THE SAIL TO THE USER, WITH A SPECIAL MESSAGE INSTRUCTING
            // THE USER TO WALK THE PLANK
            System.out.print(strSail);
            System.out.print("That's it ya have ta walk the plank!");
        }
    }
}
