/**************************************
 * STAR WARS NAME GENERATOR             *
 * AAYUSH SOOD                          *
 * NOVEMBER 5, 2025                     *
 *                                       *
 * PURPOSE: TO MAKE A STAR WARS         *
 * NAME BASED ON A FORMULA FROM AN      *
 * INTERNET RUMOR                       *
 *****************************************/
//---------------------------------
import java.util.Scanner;
//---------------------------------
public class StarWars {
    public static void main(String args[]) {
        /*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        Name is based on the following formula
        First StarWars Name
        1st 3 letters of your last name +
        1st 2 letters of your first name

        Last StarWars Name
        1st 2 letters if your mother's maiden name +
        1st 3 letters of your city of birth
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*/

        // VARIABLE NEEDED TO MAKE THE STAR WARS NAME
        Scanner scrInput = new Scanner(System.in);

        String strFirst = "", strLast = "", strMaiden = "", strCity = "";
        String strStarWarsFirst = "", strStarWarsLast = "";

        // OUTPUT THE TITLE
        System.out.println("\t\t\tStar Wars");
        System.out.println("\t\t    Name Generator\n\n\n");

        // ASK THE USER FOR SOME INNAPROPRIATE INFORMATION
        // FIRST
        System.out.print("Enter your first name: ");
        strFirst = scrInput.nextLine();

        // LAST
        System.out.print("Enter your last name: ");
        strLast = scrInput.nextLine();

        // MOTHER'S MAIDEN NAME
        System.out.print("Enter your mother's maiden name: ");
        strMaiden = scrInput.nextLine();

        // CITY OF BIRTH
        System.out.print("Enter the city you were born in: ");
        strCity = scrInput.nextLine();

        /***************************************************
         * TIME TO MAKE A SUPER AWESOME STAR WARS NAME *
         ***************************************************/

        // STAR WARS FIRST NAME
        strStarWarsFirst = strLast.substring(0, 3) + strFirst.substring(0, 2).toLowerCase();

        // STAR WARS LAST NAME
        strStarWarsLast = strMaiden.substring(0, 2) + strCity.substring(0, 3).toLowerCase();

        // OUTPUT OUR STAR WARS NAME
        System.out.println("\n\nYour Awesome Star Wars Name is: " + strStarWarsFirst + " " + strStarWarsLast);
    }
}
