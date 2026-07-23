/************************************************
 * ELECTRONIC LIST GENERATOR                      *
 * AAYUSH SOOD                                    *
 * OCTOBER 14, 2025                               *
 *                                                 *
 * PURPOSE: TO LET THE USER INPUT THEIR           *
 * TO-DO LIST AND PRINT IT OUT                    *
 ***************************************************/
//------------------------------------------------
import java.util.Scanner;
//------------------------------------------------
public class ElectronicListGenerator {
    public static void main(String args[]) {
        // DEFINE VARIABLES TO HOLD THE ITEMS & LIST TO BE GENERATED AND SCANNER
        String strItem = "", strList = "";
        int intItemNumber = 0;

        // NO FLUSH NEEDED AS WE ARE ONLY ASKING FOR TEXT INPUT
        Scanner scrInput = new Scanner(System.in);

        // ASK THE USER FOR AN ITEM TO BE ADDED TO THE LIST
        do {
            // ASK FOR SONG
            System.out.print("Enter the name of a great song (or type QUIT): ");

            // CHANGE THE INPUT TO UPPER CASE
            strItem = scrInput.nextLine().toUpperCase(); // I'M A GUMMY BEAR

            // ADD SONG TO THE LIST OF GREAT SONGS
            // USING A STRING ACCUMULATOR
            if (!strItem.equals("QUIT")) {
                intItemNumber++;
                strList = strList + intItemNumber + ") " + strItem + "\n";
            }

        } while (!strItem.equals("QUIT"));
        // IF THEY ENTER ANYTHING BUT QUIT, THE LOOP WILL REPEAT

        // RENDER THE LIST OF ITEMS
        System.out.println("\n\nYour list of \"AWESOME\" Songs!\n" + strList);
    }
}
