import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        String strInput = "", strImproved = "";
        
        Scanner scrInput = new Scanner(System.in);
        
        System.out.print("Enter your message human: ");
        strInput = scrInput.nextLine();
        
        System.out.println("Human, here is your improved message!");
        
        for (int i = 0; i < strInput.length(); i++) {
            char charLetter = strInput.charAt(i);
            int intASCII = (int)charLetter;
            int intDifference = 0;
            char newCharLetter = ' ';
            
            
            if (intASCII == 32 || (intASCII >= 65 && intASCII <= 90) || (intASCII >= 97 && intASCII <= 122)) {
                if (intASCII >= 65 && intASCII <= 90) {
                    intDifference = intASCII - 65;
                    newCharLetter = (char)(97 + intDifference);
                } else if (intASCII >= 97 && intASCII <= 122) {
                    intDifference = intASCII - 97;
                    newCharLetter = (char)(65 + intDifference);
                }
                
                strImproved = strImproved + newCharLetter;
            }            
        }
        
        System.out.println(strImproved);
    }
}