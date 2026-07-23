import java.util.Scanner;

public class MessageAnalyzer {
    public static void main(String[] args) throws InterruptedException {
        String strSentence = "", strFormatted = "", strReversed = "";
        
        int intVowels = 0, intConsonants = 0;
        
        Scanner scrInput = new Scanner(System.in);
        
        System.out.print("Enter your sentence: ");
        strSentence = scrInput.nextLine().toLowerCase();
        
        for (int i = 0; i < strSentence.length(); i++) {
            char charLetter = strSentence.charAt(i);
            
            if (((int)charLetter >= 65 && (int)charLetter <= 90) || ((int)charLetter <= 122 && (int)charLetter >= 97)) {
                strFormatted = strFormatted + charLetter;
            }
        }
        
        for (int i = 0; i < strFormatted.length(); i++) {
            Character charLetter = strFormatted.charAt(i);
            
            if (charLetter == 'a' || charLetter == 'e' || charLetter == 'i' || charLetter == 'o' || charLetter == 'u') {
                intVowels++;
            } else {
                intConsonants++;
            }
        }
        
        if (strFormatted.length() % 2 == 0) {
            for (int i = strFormatted.length() - 1; i > -1; i--) {
                char charLetter = strFormatted.charAt(i);
                
                System.out.println(charLetter);
                Thread.sleep(300);
            }
        } else if (strFormatted.length() % 2 != 0) {
            for (int i = 0; i < strFormatted.length(); i += 2) {
                char charLetter = strFormatted.charAt(i);
                
                System.out.println(charLetter);
                Thread.sleep(300);
            }
        }
        
        for (int i = strFormatted.length() - 1; i > -1; i--) {
            char charLetter = strFormatted.charAt(i);
            
            strReversed = strReversed + charLetter;
        }
        
        System.out.println("\nVowels: " + intVowels);
        Thread.sleep(300);
        System.out.println("Consonants: " + intConsonants);
        
        if (strFormatted.equals(strReversed)) {
            System.out.println("This word is a palindrome!");   
        }
    }
}