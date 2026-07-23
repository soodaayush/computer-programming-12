import java.util.Scanner;

public class Menu
{
    public static void main(String[] args) {
        String strWord = "", strCipher = "", strFlush = "";
        String strUserTextInput = "", strEncrypted = "";
        String strAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        int intCharacters = 0, intVowels = 0, intWords = 1, intChoice = 0;
        int intShift = 3, intNumber = 0, intFactorial = 1;
        
        Scanner scrInput = new Scanner(System.in);
        
        do {
            System.out.println("1. Analyze Text");
            System.out.println("2. Encrypt Text");
            System.out.println("3. Math tools");
            System.out.println("4. Exit");
            
            System.out.print("\n\nEnter Choice: ");
            intChoice = scrInput.nextInt();
            strFlush = scrInput.nextLine();
            
            if (intChoice == 1) {
                System.out.println("\n======================================");
                System.out.println("\t  ANALYZE TEXT");
                System.out.println("======================================");
                
                System.out.print("Enter text: ");
                strUserTextInput = scrInput.nextLine().toLowerCase();
                
                for (int i = 0; i < strUserTextInput.length(); i++) {
                    Character strChar = strUserTextInput.charAt(i);
                    
                    if (strChar.equals('a') || strChar.equals('e') || strChar.equals('i') || strChar.equals('o') || strChar.equals('u')) {
                        intVowels++;
                    }
                    
                    if (strChar.equals(' ')) {
                        intWords++;
                    }
                }
                
                System.out.println("\nNumber of Characters: " + strUserTextInput.length());
                System.out.println("Number of Vowels: " + intVowels);
                System.out.println("Number of Words: " + intWords);
                
                System.out.println("======================================\n\n");
            } else if (intChoice == 2) {
                System.out.println("\n======================================");
                System.out.println("\t  ENCRYPT TEXT");
                System.out.println("======================================");
                
                System.out.print("Enter text: ");
                strUserTextInput = scrInput.nextLine().toLowerCase();
                
                for (int i = 0; i < strUserTextInput.length(); i++) {
                    String strChar = "";
                    
                    if (i == 0) {
                        strChar = strUserTextInput.substring(0, i + 1).toUpperCase();
                    } else {
                        strChar = strUserTextInput.substring(i, i + 1).toUpperCase();
                    }
                    
                    int intIndex = strAlphabet.indexOf(strChar);
                    int intNewIndex = intIndex + intShift;
                    
                    if (intNewIndex > 25) {
                        intNewIndex = intNewIndex - 25;
                    }
                    
                    strEncrypted = strEncrypted + strAlphabet.substring(intNewIndex, intNewIndex + 1);
                }
                
                System.out.println("\nEncrypted Text: " + strEncrypted);
                System.out.println("======================================\n\n");
            } else if (intChoice == 3) {
                System.out.println("\n======================================");
                System.out.println("\t  MATH TOOLS");
                System.out.println("======================================");
                
                System.out.print("Enter number: ");
                intNumber = scrInput.nextInt();
                
                for (int i = intNumber; i >= 2; i--) {
                    intFactorial = i * intFactorial;
                }
                
                System.out.println("\nResult: " + intFactorial);
            }
        } while (intChoice != 4);
    }
}