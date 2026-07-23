/*---------------------------------
- AVITAR
- A. KICENIUK
- SEPT. 23, 2025
-
- PURPOSE: TO CREATE A CHARACTER
- FOR A SIMPLE RPG
---------------------------------*/
//---------------------------------
import java.util.Scanner;
//---------------------------------
public class Avitar {
    public static void main(String args[]){

        //VARIABLES TO HOLD CHARACTER TRAITS
        int intAge, intGP, intHP, intBonusGold;
        String strName;

        //UTILITY OBJECTS
        Scanner scrInput = new Scanner(System.in);
        String strFlush;

        //OUTPUT PROGRAM TITLE
        System.out.println("\t\t\"Avitar\" Generator\n\n\n");

        //GENERATE SOME STATS FOR OUR CHARACTER
        //NOTE: GOLD: 5 - 79;  HIT POINTS: 20-45; BONUS GOLD: 10 - 99

        //GOLD
        intGP = (int)((79 - 5 + 1) * Math.random() + 5);

        //HIT POINTS
        intHP = (int)((45 - 20 + 1) * Math.random() + 20);

        //BONUS GOLD - THEY GET IT IF THEY WIN THE COIN TOSS
        int intHeadsTails;

        //TOSS THE COIN
        intHeadsTails = (int)((2 - 1 + 1) * Math.random() + 1);

        if (intHeadsTails == 1){  //HEADS THEY WIN
            intBonusGold = (int)((99 - 10 + 1) * Math.random() + 10);
        }
        else { //TAILS THEY LOSE
            intBonusGold = 0;
        }

        //UPDATE GOLD VALUE WITH ACCUMULATOR


        //ASK FOR THE CHARACTER AGE AND NAME
        System.out.print("Enter your avitar's age: ");
        intAge = scrInput.nextInt();
        strFlush = scrInput.nextLine();

        System.out.print("Enter a name for your avitar: ");
        strName = scrInput.nextLine();

        //OUTPUT THE CHARACTER PROFILE
        System.out.println("\n\n\nYour Character Profile:");
        System.out.println("Name: " + strName);
        System.out.println("Bonus Gold: " + intBonusGold);
        System.out.println("Total Gold: " + intGP);
        System.out.println("Hit Points: " + intHP);
    }
}
