/*******************************
 * SKINNER BOX SLOTS             *
 * AAYUSH SOOD                   *
 * OCTOBER 20, 2025               *
 *                                 *
 * PURPOSE: TO CREATE A           *
 * SIMPLE SLOT MACHINE TO         *
 * DEMONSTRATE THE DANGERS        *
 * OF GAMBLING, SOMETHING         *
 * ALL STUDENTS PLEDGE            *
 * NEVER TO DO                    *
 * "\ud83c\udf49" "\ud83c\udf52" "\ud83c\udf4d" "\ud83e\udd5d"                *
 ***********************************/
//------------------------------
import java.util.Scanner;
//------------------------------
public class SkinnerBoxSlots {
    public static void main(String[] args) throws InterruptedException {
        Scanner scrInput = new Scanner(System.in);

        // SCANNER & VARIABLES TO HOLD NAME, SYMBOLS, ETC.
        String strName = "", strSlots = "", strPlayAgain = "";
        int intWallet = 0, intSlot1 = 0, intSlot2 = 0, intSlot3 = 0;

        // GET THE PLAYER'S NAME & GIVE THEM SOME MONEY
        intWallet = (int)((1000 - 500 + 1) * Math.random() + 500);

        System.out.println("\t\tSkinner Box Slots\n");

        System.out.print("Enter your name: ");
        strName = scrInput.nextLine();

        System.out.println("\n\nLET'S PLAY!!");

        // PLAY THE GAME
        do {
            // SPIN THE SLOTS 15 TIMES
            for (int i = 0; i < 15; i++) {
                // SPIN THE SLOT WHEELS
                intSlot1 = (int)((4 - 1 + 1) * Math.random() + 1);
                intSlot2 = (int)((4 - 1 + 1) * Math.random() + 1);
                intSlot3 = (int)((4 - 1 + 1) * Math.random() + 1);

                // ASSIGN A FRUIT TO EACH SLOT
                // SLOT 1
                if (intSlot1 == 1) { // Watermelon
                    strSlots = strSlots + "\ud83c\udf49\t";
                } else if (intSlot1 == 2) { // Cherries
                    strSlots = strSlots + "\ud83c\udf52\t";
                } else if (intSlot1 == 3) { // Pineapple
                    strSlots = strSlots + "\ud83c\udf4d\t";
                } else { // Kiwi
                    strSlots = strSlots + "\ud83e\udd5d\t";
                }

                // SLOT 2
                if (intSlot2 == 1) { // Watermelon
                    strSlots = strSlots + "\ud83c\udf49\t";
                } else if (intSlot2 == 2) { // Cherries
                    strSlots = strSlots + "\ud83c\udf52\t";
                } else if (intSlot2 == 3) { // Pineapple
                    strSlots = strSlots + "\ud83c\udf4d\t";
                } else { // Kiwi
                    strSlots = strSlots + "\ud83e\udd5d\t";
                }

                // SLOT 3
                if (intSlot3 == 1) { // Watermelon
                    strSlots = strSlots + "\ud83c\udf49\t";
                } else if (intSlot3 == 2) { // Cherries
                    strSlots = strSlots + "\ud83c\udf52\t";
                } else if (intSlot3 == 3) { // Pineapple
                    strSlots = strSlots + "\ud83c\udf4d\t";
                } else { // Kiwi
                    strSlots = strSlots + "\ud83e\udd5d\t";
                }

                // OUTPUT THE RESULTS OF THE SPIN
                System.out.println("\n\n" + strSlots);

                // NAP BEFORE SPINNING AGAIN
                Thread.sleep(200); // 1/5 OF A SECOND

                // CLEAR MY SCREEN OF ALL PREVIOUS OUTPUT &
                // CLEAR MY STRING ACCUMULATOR
                if (i != 14) {
                    strSlots = ""; // REMOVE PREVIOUS SLOTS
                    System.out.print("\033[H\033[2J"); // CLEAR THE SCREEN
                }

            } // SPINNING LOOP ENDS HERE

            // WHEN PLAYER WON & UPDATE THE WALLET
            if (intSlot1 == 1 && intSlot2 == 1 && intSlot3 == 1) {
                intWallet += 2;
            } else if (intSlot1 == 2 && intSlot2 == 2 && intSlot3 == 2) {
                intWallet += 500;
            } else if (intSlot1 == 3 && intSlot2 == 3 && intSlot3 == 3) {
                intWallet += 200;
            } else if (intSlot1 == 4 && intSlot2 == 4 && intSlot3 == 4) {
                intWallet += 100;
            } else {
                intWallet = intWallet - 10; // SORRY, TRY AGAIN
            }

            // SHOW THEIR WALLET
            System.out.println("\n" + "Wallet = $" + intWallet);

            // ASK THE USER TO PLAY AGAIN
            System.out.print("Play again? (yes/no): ");
            strPlayAgain = scrInput.nextLine();

            strPlayAgain = strPlayAgain.toLowerCase();

            // CLEAR OUR STRING ACCUMULATOR
            strSlots = "";

        } while (strPlayAgain.equals("yes"));
    }
}
