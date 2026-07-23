/* ***********************************************
 * THREE TRUTHS, ONE LIE (title)                  *
 * Aayush Sood (name)                             *
 * September 4, 2025 (date)                       *
 *                                                 *
 * PURPOSE: PLAY A GAME INWHICH                    *
 * THE PROGRAM WILL DISPLAY THREE                  *
 * FACTS ABOUT ME AND ONE                          *
 * BOLD FACED LIE                                  *
 ***************************************************/
//---------------------------------------------
import java.util.Scanner;
//---------------------------------------------
public class ThreeTruths {
    public static void main(String args[]) {

        //CREATE A SCANNER TO ACCEPT INPUT
        Scanner scrInput = new Scanner(System.in); //need to accept input
        String strPause = ""; //used to hold the user keypress


        //OUTPUT A GREETING TO THE USER
        System.out.println("\n\n\n\t\tWelcome to Aayush's");
        System.out.println("\t\tThree \"Truths\", One Lie");

        //OUTPUT THE FACTS AND THE NASTY LIE
        System.out.println("\n\nWhich of these statements about Aayush is a lie?");
        System.out.println("\na) I taught at a Stanford University programming course.");
        System.out.println("b) I am an only child.");
        System.out.println("c) I practice Brazilian Jiu-Jitsu.");
        System.out.println("d) My birthday is in September.");

        //PUT A PAUSE IN THE PROGRAM AND SHOW THE ANSWER
        System.out.println("\nPress any key to continue.....");

        //ACCEPT THE USER KEY PRESS
        strPause = scrInput.nextLine();

        //SHOW THE ANSWER
        System.out.println("\n\nThe lie was: d) My birthday is in September");
    }
}


