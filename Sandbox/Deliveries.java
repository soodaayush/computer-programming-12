/************************
 * DELIVERIES           *
 * AAYUSH SOOD          *
 * OCTOBER 27, 2025     *
 *                      *
 * PURPOSE: A PROGRAM   *
 * THAT PROMPTS THE     *
 * USER FOR THE         *
 * DIMENSIONS OF THEIR  *
 * PACKAGE, AND ACCEPTS *
 * THE PACKAGE IF ALL   *
 * DIMENSIONS ARE LESS  *
 * THAN OR EQUAL TO 10  *
 ***********************/
 //----------------------
 import java.util.Scanner;
 //----------------------
public class Deliveries {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR PACKAGE LENGTH, WIDTH, AND HEIGHT
        // AS WELL AS SCANNER
            double dblLength = 0, dblWidth = 0, dblHeight = 0;
            
            Scanner scrInput = new Scanner(System.in);
            
        // PROMPT USER FOR THEIR PACKAGE DIMENSIONS
            System.out.println("Welcome to our delivery package validator!");
            
            System.out.print("\n\nEnter the package length: ");
            dblLength = scrInput.nextDouble();
            
            System.out.print("Enter the package width: ");
            dblWidth = scrInput.nextDouble();
            
            System.out.print("Enter the package height: ");
            dblHeight = scrInput.nextDouble();
            
        // VALIDATE THE PACKAGE DIMENSIONS
        // IF ONE OR MORE DIMENSIONS ARE > 10 - RETURN "REJECT"
        // OTHERWISE, RETURN "ACCEPT"
            if ((dblLength > 0 && dblLength >= 10) || (dblWidth > 0 && dblWidth >= 10) || (dblHeight > 0 && dblHeight >= 10)) {
                System.out.println("\nPackage Rejected!");
            } else {
                System.out.println("\nPackage Accepted!");
            }
    }
}