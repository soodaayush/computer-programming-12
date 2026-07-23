/************************
 * CUSTOM TITLE         *
 * AAYUSH SOOD          *
 * OCTOBER 14, 2025     *
 *                      *
 * PURPOSE: TO MAKE A   *
 * FANCY TITLE FOR A    *
 * PROGRAM              *
 ***********************/
 //----------------------
 import java.util.Scanner;
 //----------------------
public class CustomTitle {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR TITLE
            String strTitle = "", strBorder = "", strSymbol = "";
            int intLength = 0; // AS IN LENGTH OF TITLE
            
            Scanner scrInput = new Scanner(System.in);
            
        // ASK FOR A TITLE & A BORDER SYMBOL
            System.out.print("Enter a title: ");
            strTitle = scrInput.nextLine(); // GREAT SONGS
            strTitle = strTitle.toUpperCase();
            
            intLength = strTitle.length();
            
            System.out.print("Enter a symbol for a border: ");
            strSymbol = scrInput.nextLine(); // $@*#
            
        // USE A LOOP TO BUILD A BORDER
            for (int i = 0; i < intLength; i++) {
                strBorder = strBorder + strSymbol;
            }
            
        // BUILD THE TITLE FOR THE LIST
            strTitle = strBorder + "\n" + strTitle + "\n" + strBorder;
            
        // PRINT TITLE WITH BORDER    
            System.out.println("\n\n" + strTitle);
    }
}