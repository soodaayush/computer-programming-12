/* ***********************************
 * BALDERDASH                        *
 * Aayush Sood                       *
 * September 8, 2025                 *
 *                                    *
 * PURPOSE: PLAY A GAME INWHICH
 * YOU GUESS THE DEFINITION OF
 * A WORD                            *
 ***************************************/
//------------------------------------
import java.util.Scanner;
//------------------------------------
public class Balderdash {
    public static void main(String args[]) {

        //CREATE A SCANNER TO ACCEPT USER INPUT
        Scanner scrInput = new Scanner(System.in);
        String strPause = "";

        //OUTPUT A GREETING
        System.out.println("\t\t\tWELCOME TO BALDERDASH!!!");

        //OUTPUT THREE FAKE DEFINITIONS AND ONE REAL DEFINITION
        System.out.println("\nWhat is the definition of pulchritudinous?");
        System.out.println("a) A type of cancer cell.");
        System.out.println("b) A word used to describe something that is beautiful.");
        System.out.println("c) An object that allows you to safely observe solar eclipses.");
        System.out.println("d) The highest award a citizen can receive in Canada.");

        //PUT A PAUSE IN THE PROGRAM AND SHOW THE ANSWER
        System.out.println("\nPress any key to continue.......");

        //ACCEPT THE USER KEY PRESS
        strPause = scrInput.nextLine();

        //SHOW THE ANSWER
        System.out.println("\n\nThe definition is: b) A word used to describe something that is beautiful");
    }
}
