/****************************
 * A VERY BAD VIRUS            *
 * AAYUSH SOOD                 *
 * NOVEMBER 10, 2025           *
 *                              *
 * PURPOSE: A VIRUS THAT       *
 * REPLACES A SPECIFIED        *
 * WORD WITHIN A MESSAGE       *
 * WITH SOME VERY MEAN         *
 * WORDS FOR THE RECIPIENT     *
 ******************************/
//---------------------------
import java.util.Scanner;
//---------------------------
public class AVeryBadProgram {
    public static void main(String args[]) {
        // DEFINE VARIABLES TO HOLD MESSAGE, WORD TO REPLACE, AND INSULT
        // AS WELL AS OTHER BITS AND BOBS TO MAKE THIS HAPPEN
        String strOriginalMessage = "", strWorkingMessage = "", strWordToReplace = "", strInsult = "";
        String strFront = "", strBack = "";

        int intWordPosition = -1, intWordLength = 0, intRandomInsult = 0;

        Scanner scrInput = new Scanner(System.in);

        // ASK FOR THE ORIGINAL MESSAGE
        System.out.print("Enter the message: ");
        strOriginalMessage = scrInput.nextLine();
        strWorkingMessage = strOriginalMessage.toUpperCase();

        // ASK FOR THE WORD TO BE REPLACED
        System.out.print("Enter the word you want to replace: ");
        strWordToReplace = scrInput.nextLine().toUpperCase(); // SOOD
        intWordLength = strWordToReplace.length(); // 4

        /**********************************************************
         * USE A DO LOOP TO:                                       *
         * 1) FIND EVERY EXAMPLE OF THE WORD TO BE REPLACED        *
         * 2) BREAK THE TEXT INTO TWO PARTS                        *
         *    TEXT BEFORE THE WORD                                 *
         *    TEXT AFTER THE WORD                                  *
         * 3) GENERATE A RANDOM INSULT                              *
         * 4) UPDATE THE MESSAGE WITH A RANDOM INSULT               *
         ************************************************************/

        do {
            // SEARCH FOR THE WORD
            intWordPosition = strWorkingMessage.indexOf(strWordToReplace);

            // IF THE WORD IS FOUND - IT IS TIME TO CHOP UP THE STRING (PARSE)
            if (intWordPosition != -1) {
                // GET TEXT BEFORE THE WORD
                strFront = strWorkingMessage.substring(0, intWordPosition);

                // GET TEXT AFTER THE WORD
                strBack = strWorkingMessage.substring(intWordPosition + intWordLength);

                // GENERATE A RANDOM INSULT
                intRandomInsult = (int)((4 - 1 + 1) * Math.random() + 1);

                if (intRandomInsult == 1) {
                    strInsult = "Potato Head";
                } else if (intRandomInsult == 2) {
                    strInsult = "Banana Man";
                } else if (intRandomInsult == 3) {
                    strInsult = "Space Cadet";
                } else if (intRandomInsult == 4) {
                    strInsult = "Kurby Cat";
                }

                // ADD THE INSULT TO THE MESSAGE
                strWorkingMessage = strFront + strInsult + strBack;
            }
        } while (intWordPosition != -1);

        // OUTPUT THE FINAL MESSAGE
        System.out.print("\n\n\n" + strWorkingMessage);
    }
}
