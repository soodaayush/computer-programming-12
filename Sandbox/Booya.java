/************************
 * BOOYA                *
 * AAYUSH SOOD          *
 * JANUARY 20, 2026     *
 *                      *
 * PURPOSE: A WORDLE    *
 * CLONE                *
 ***********************/
 //----------------------
 import java.util.Scanner;
 //----------------------
public class Booya {
    public static void main(String[] args) {
        // DEFINE VARIABLES
            String strGuess = "", strResults = "", strWord = "", strUsedLetters = "";
            int intAttempts = 0, intRandomNumber = 0;
            boolean boolCorrectGuess = false;
            
            Scanner scrInput = new Scanner(System.in);
            
        // INTRODUCE PROGRAM AND PROMPT USER FOR WORD
            System.out.println("\t\t\t💃  BOOYA 🕺");
            System.out.println("\t\tA game about 5 letter words,");
            System.out.println("\t\twith a 5 letter title.");
            System.out.println("\t\t\t💃  BOOYA 🕺\n\n");
            
        // GENERATE RANDOM WORD
            intRandomNumber = (int)((3 - 1 + 1) * Math.random() + 1);
            
            if (intRandomNumber == 1) {
                //strWord = "tenet";
                strWord = "apple";
            } else if (intRandomNumber == 2) {
                strWord = "apple";
            } else if (intRandomNumber == 3) {
                strWord = "apple";
                //strWord = "flick";
            }
            
        // LOOP THROUGH
            do {
                System.out.print("Enter a word: ");
                strGuess = scrInput.nextLine().toLowerCase();
                
                if (strGuess.length() == 5) {
                    if (strGuess.equals(strWord)) {
                        intAttempts++;
                        strResults = "👍 👍 👍 👍 👍";
                        boolCorrectGuess = true;
                        
                        System.out.println("Guess results: " + strResults);
                    } else {
                        for (int i = 0; i < strGuess.length(); i++) {
                            String strCurrentLetter = strGuess.substring(i, i + 1);
                            int intCorrectWordIndex = strWord.indexOf(strCurrentLetter);
                            int intVisitedWordIndex = strUsedLetters.indexOf(strCurrentLetter);
                            
                            if (intCorrectWordIndex != -1) {
                                if (intCorrectWordIndex == strGuess.indexOf(strCurrentLetter) && intVisitedWordIndex == -1) {
                                    strResults = strResults + "👍 ";
                                } else if (intVisitedWordIndex != -1) {
                                    strResults = strResults + "👎 ";
                                } else {
                                    strResults = strResults + "👌 ";
                                }
                                
                                strUsedLetters = strUsedLetters + strCurrentLetter;
                            } else {
                                strResults = strResults + "👎 ";
                            }
                        }
                        
                        intAttempts++;
                        System.out.println("Guess results: " + strResults);
                        strResults = "";
                    }
                } else {
                    System.out.println("Please enter a word that is five letters long!");
                }
            } while (!boolCorrectGuess && intAttempts <= 5);
            
            if (boolCorrectGuess) {
                System.out.println("\n\n\t\t\t💃  BOOYA 🕺");
                System.out.println("\t\t\t💃  BOOYA 🕺");
                System.out.println("\t\t\t💃  BOOYA 🕺");
                System.out.println("\n\t\t\tYOU GOT IT!");
            }
    }
}