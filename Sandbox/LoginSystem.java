import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        // DEFINE VARIABLES
            String strValidUser = "admin", strValidPassword = "password", strUserInput = "";
            String strPasswordInput = "", strPasswordChange = "", strFlush = "";
            
            int intLoginAttempts = 3, intUserMenuOption = 0;
            boolean boolLoginSuccessful = false;
            
            Scanner scrInput = new Scanner(System.in);
            
        // INTRODUCE PROGRAM
            do {
                System.out.print("Username: ");
                strUserInput = scrInput.nextLine().toLowerCase();
                
                System.out.print("Password: ");
                strPasswordInput = scrInput.nextLine();
                
                if (strUserInput.equals(strValidUser) && strPasswordInput.equals(strValidPassword)) {
                    System.out.println("\nLogin successful!");
                    boolLoginSuccessful = true;
                } else {
                    intLoginAttempts--;
                    
                    if (intLoginAttempts == 0) {
                        System.out.println("\nAccess denied!");
                    } else {
                        System.out.println("\nIncorrect! " + intLoginAttempts + " attempts remaining!");
                    }
                }
            } while (!boolLoginSuccessful && intLoginAttempts != 0);
            
        if (boolLoginSuccessful) {
            do {
                System.out.println("\n1. View Profile");
                System.out.println("2. Change Password");
                System.out.println("3. Logout");
                
                System.out.print("\n\nSelect Option: ");
                intUserMenuOption = scrInput.nextInt();
                strFlush = scrInput.nextLine();
                
                if (intUserMenuOption == 1) {
                    System.out.println("\n\nHi " + strValidUser + " have a nice day!\n\n");
                } else if (intUserMenuOption == 2) {
                    System.out.print("\n\nNew Password: ");
                    strPasswordChange = scrInput.nextLine();
                    
                    if (strPasswordChange.length() < 8) {
                        System.out.println("Invalid password! Please make sure it is 8 characters long!");
                    } else {
                        strValidPassword = strPasswordChange;
                        System.out.println("Password change successful!");
                    }
                } else if (intUserMenuOption == 3) {
                    System.out.println("\n\nLogout successful!");
                } else {
                    System.out.println("\n\nInvalid menu option!");
                }
            } while (intUserMenuOption != 3);
        }
    }
}