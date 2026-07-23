/****************************
 * DIARY                    *
 * AAYUSH SOOD              *
 * OCTOBER 7, 2025          *
 *                          *
 * PURPOSE: TO PASSWORD     *
 * PROTECT OUR SENSITIVE    *
 * DIARY ABOUT OUR FAV.     *
 * SONG                     *    
 ***************************/
//---------------------------
import java.util.Scanner;
//---------------------------
public class Diary {
    public static void main(String[] args) {
        // DEFINE VARIABLES TO HOLD THE USERNAME AND PASSWORD NEEDED TO ACCESS OUR DIARY
            String strName, strPassword;
            
            Scanner scrInput = new Scanner(System.in);
            
        // ASK THE USER FOR THEIR NAME AND PASSWORD
            System.out.println("You want to enter my diary?");
            System.out.println("Only a fool would try unless they are me.\n\n");
            
            System.out.print("Enter your name: ");
            strName = scrInput.nextLine().toUpperCase();
            
            System.out.print("Enter your password: ");
            strPassword = scrInput.nextLine().toUpperCase();
            
        // CHECK TO SEE IF ITS ME OR A FOOL
            if (strName.equals("MR. K") && strPassword.equals("67")) {
                System.out.println("\n\nWelcome to my diary!");
                System.out.println("October 7th\nWow! Another 6 hours of Skibidi Toilet!");
                System.out.println("☠️☠️☠️☠️☠️ I'm SO HAPPY, another great day☠️☠️☠️☠️☠️! ");
            } else {
                System.out.print("\n\n☠️☠️☠️☠️☠️ KEEP OUT! ☠️☠️☠️☠️☠️☠️");
            }
        // ☠️
    }
}