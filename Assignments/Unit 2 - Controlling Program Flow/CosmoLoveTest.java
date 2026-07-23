/*******************************
 * COSMO LOVE TEST                *
 * AAYUSH SOOD                    *
 * SEPTEMBER 27, 2025             *
 *                                 *
 * PURPOSE: TO DETERMINE IF YOUR  *
 * BOYFRIEND IS A HUNK OR JUNK,   *
 * WHICH WILL BE DETERMINED THROUGH*
 * A SERIES OF QUESTIONS THAT WILL*
 * DECIDE HIS HUNK AND JUNK FACTOR*
 ***********************************/
//------------------------------
import java.util.Scanner;
//------------------------------
public class CosmoLoveTest {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR HUNK & JUNK FACTOR AS WELL AS THE USER'S RESPONSE TO THE QUESTIONNAIRE
        int intHunkFactor = 0, intJunkFactor = 0;
        String strUserResponse = "";

        Scanner scrInput = new Scanner(System.in);

        // INTRODUCE THE PROGRAM TO THE USER
        System.out.println("\t\"Cosmo Love Test\"");
        System.out.println("\tIs your guy Hunk or is he Junk?");

        // OUTPUT QUESTIONS AND ADJUST HUNK AND JUNK FACTOR AS THE USER ANSWERS THESE QUESTIONS WITH A YES OR NO RESPONSE
        System.out.print("\n1. Does he smell like his hockey bag? ");
        strUserResponse = scrInput.nextLine().toUpperCase();

        if (strUserResponse.equals("YES")) {
            intJunkFactor += 10;
        } else if (strUserResponse.equals("NO")) {
            intHunkFactor += 10;
        }

        System.out.print("2. Does he remember your birthday? ");
        strUserResponse = scrInput.nextLine().toUpperCase();

        if (strUserResponse.equals("YES")) {
            intHunkFactor += 10;
        } else if (strUserResponse.equals("NO")) {
            intJunkFactor += 10;
        }

        System.out.print("3. Is he rude to your parents? ");
        strUserResponse = scrInput.nextLine().toUpperCase();

        if (strUserResponse.equals("YES")) {
            intJunkFactor += 10;
        } else if (strUserResponse.equals("NO")) {
            intHunkFactor += 10;
        }

        System.out.print("4. Is his definition of \"Fine Food\" Micky D's? ");
        strUserResponse = scrInput.nextLine().toUpperCase();

        if (strUserResponse.equals("YES")) {
            intJunkFactor += 10;
        } else if (strUserResponse.equals("NO")) {
            intHunkFactor += 10;
        }

        System.out.print("5. Does he buy you flowers other than on special occasions? ");
        strUserResponse = scrInput.nextLine().toUpperCase();

        if (strUserResponse.equals("YES")) {
            intHunkFactor += 10;
        } else if (strUserResponse.equals("NO")) {
            intJunkFactor += 10;
        }

        System.out.print("6. Does he even remember special occasions? ");
        strUserResponse = scrInput.nextLine().toUpperCase();

        if (strUserResponse.equals("YES")) {
            intHunkFactor += 10;
        } else if (strUserResponse.equals("NO")) {
            intJunkFactor += 10;
        }

        System.out.print("7. Does he make you laugh? ");
        strUserResponse = scrInput.nextLine().toUpperCase();

        if (strUserResponse.equals("YES")) {
            intHunkFactor += 10;
        } else if (strUserResponse.equals("NO")) {
            intJunkFactor += 10;
        }

        System.out.print("8. Does he get along with your friends? ");
        strUserResponse = scrInput.nextLine().toUpperCase();

        if (strUserResponse.equals("YES")) {
            intHunkFactor += 10;
        } else if (strUserResponse.equals("NO")) {
            intJunkFactor += 10;
        }

        System.out.print("9. Does he pay his own way? ");
        strUserResponse = scrInput.nextLine().toUpperCase();

        if (strUserResponse.equals("YES")) {
            intHunkFactor += 10;
        } else if (strUserResponse.equals("NO")) {
            intJunkFactor += 10;
        }

        System.out.print("10. Do you like this guy? ");
        strUserResponse = scrInput.nextLine().toUpperCase();

        if (strUserResponse.equals("YES")) {
            intHunkFactor += 10;
        } else if (strUserResponse.equals("NO")) {
            intJunkFactor += 10;
        }

        // CALCULATE HUNK & JUNK FACTOR BASED ON USER'S RESPONSES AND OUTPUT RESULTS
        System.out.println("\nYour guy's hunk score is " + intHunkFactor + "%");
        System.out.println("Your guy's junk score is " + intJunkFactor + "%");
        System.out.print("Our advice: ");

        if (intHunkFactor <= 100 && intHunkFactor >= 80) {
            System.out.print("He is a keeper! You should LOVE him.");
        } else if (intHunkFactor <= 70 && intHunkFactor >= 60) {
            System.out.print("HE has potential! LOVE HIM... FOR NOW.");
        } else if (intHunkFactor == 50) {
            System.out.print("Tough call. Follow your heart...but proceed with caution.");
        } else if (intHunkFactor == 40) {
            System.out.print("It will be a lot of work to love him. We say LEAVE HIM.");
        } else if (intHunkFactor <= 30 && intHunkFactor >= 0) {
            System.out.print("You should LEAVE HIM...NOW!");
        }
    }
}
