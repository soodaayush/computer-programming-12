/*************************
 * SIGNATURE                *
 * AAYUSH SOOD               *
 * DECEMBER 8, 2025           *
 *                             *
 * PURPOSE: A PROGRAM         *
 * THAT ALLOWS A USER         *
 * TO ADD THEIR               *
 * SIGNATURE TO EVERY         *
 * PROGRAM THEY MAKE          *
 *******************************/
//----------------------
import java.util.Scanner;
//----------------------
public class Signature {
    public static void main(String args[]) {
        // DEFINE VARIABLES
        System.out.println("Welcome to Zombo.com");
        System.out.println("You can do anything at Zombo.com");

        // ADD OUR SIGNATURE TO THE END OF THE PROGRAM
        signature();
        signature("Kaiyu Tamura");
        signature("Kaiyu Tamura", 2025);

        System.out.println("\n\nThanks for visiting!");
    }

    /****************************************
     * SIGNATURE                              *
     * PRE CONDITION: NONE                    *
     * POST CONDITION: YOUR NAME WILL         *
     * BE PRINTED                             *
     ******************************************/

    public static void signature() {
        System.out.println("\n\nAnother fine program brought to you by: Aayush Sood");
    }

    // METHOD OVERLOADING --> MEANING
    // NEW METHOD BUT WITH THE SAME NAME
    // COMPILER WILL DETERMINE WHICH METHOD TO RUN
    // BASED ON THE PARAMETERS/ARGUMENTS
    public static void signature(String strName) {
        System.out.println("\n\nAnother fine program brought to you by: " + strName);
    }

    public static void signature(String strName, int intYear) {
        System.out.println("\n\nAnother fine program brought to you by: " + strName + (char)169 + intYear);
    }
}
