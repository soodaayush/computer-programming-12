/************************
 * PALINDROME           *
 * AAYUSH SOOD          *
 * NOVEMBER 19, 2025    *
 *                      *
 * PURPOSE: A PROGRAM   *
 * THAT RANDOMLY        *
 * GENERATES TWO        *
 * PALINDROMES UNTIL    *
 * THEY MATCH           *
 ***********************/
 //----------------------
 import java.util.Scanner;
 //----------------------
public class Palindrome {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR LETTER COUNT, TWO PALINDROMES, AND SCANNER
            int intNumberOfLetters = 0, intRandomASCII = 0, intAttempts = 0;
            String strFirstPalindrome = "", strSecondPalindrome = "", strCurrentLetter = "";
            
            Scanner scrInput = new Scanner(System.in);
            
        // INTRODUCE PROGRAM
            System.out.println("\tWelcome to \"Pal\"");
            System.out.println("    The Palindrome Generator");
            
        // PROMPT USER FOR NUMBER OF LETTERS
            System.out.print("\n\nHow many letters should the palindrome be? ");
            intNumberOfLetters = scrInput.nextInt();
            
        // INITIATE PROCESS
            do {
                // RESET THE PALINDROMES 
                    strFirstPalindrome = "";
                    strSecondPalindrome = "";
                
                for (int i = 0; i < intNumberOfLetters; i++) {
                    // GENERATE RANDOM ASCII NUMBERS FOR BOTH PALINDROMES
                        intRandomASCII = (int)((90 - 65 - 1) * Math.random() + 65);

                    // APPEND RANDOMLY GENERATED LETTERS TO FIRST PALINDROME, 
                    // WHILE ADDING THE REVERSE TO THE SECOND PALINDROME
                        strFirstPalindrome = strFirstPalindrome + (char)intRandomASCII;
                        strSecondPalindrome = (char)intRandomASCII + strSecondPalindrome;
                }
                
                // PRINT PALINDROMES
                    System.out.println("\t\t" + strFirstPalindrome + "\t\t" + strSecondPalindrome);
                
                // INCREMENT NUMBER OF ATTEMPTS
                    intAttempts++;
            } while(!strFirstPalindrome.equals(strSecondPalindrome));
            
            // PRINT THE PALINDROME THAT WAS THE SAME IN BOTH STRING ALONG WITH
            // NUMBER OF ATTEMPTS
                System.out.println("Wow! The palindrome " + strFirstPalindrome + " was generated in " + intAttempts + " attempts.");
    }
}