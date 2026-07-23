import java.util.Scanner;

public class SurveyAnalysis {
    public static void main(String[] args) {
        String strParticipantName = "", strFlush = "";
        
        int intResponseAmount = 0, intResponseScoreSum = 0, intHighest = 0, intLowest = 5;
        int intUserOption = 0, intRating = 0;
        
        Scanner scrInput = new Scanner(System.in);
        
        do {
            System.out.println("1. Enter Survey Data");
            System.out.println("2. Analyze Numbers");
            System.out.println("3. Exit");
            
            System.out.print("\n\nEnter Choice: ");
            intUserOption = scrInput.nextInt();
            strFlush = scrInput.nextLine();
            
            if (intUserOption == 1) {
                System.out.print("\n\nEnter participant Name: ");
                strParticipantName = scrInput.nextLine();
                
                System.out.print("Enter rating (1-5): ");
                intRating = scrInput.nextInt();
                strFlush = scrInput.nextLine();
                
                if (strParticipantName.equals("") || (intRating < 1 || intRating > 5)) {
                    System.out.println("Invalid Input!\n\n");
                    strParticipantName = "";
                    intRating = 0;
                } else {
                    System.out.println("Data recorded!\n\n");
                    intResponseAmount++;
                    intResponseScoreSum = intResponseScoreSum + intRating;
                    
                    if (intRating > intHighest) {
                        intHighest = intRating;
                    }
                    
                    if (intRating < intLowest) {
                        intLowest = intRating;
                    }
                }
            } else if (intUserOption == 2) {
                if (intResponseAmount >= 1) {
                    System.out.println("\n\nSurvey Statistics");
                    System.out.println("Participants Entered: " + intResponseAmount);
                    System.out.println("Average Score: " + (intResponseScoreSum / intResponseAmount));
                    System.out.println("Highest Score: " + intHighest);
                    System.out.println("Lowest Score: " + intLowest + "\n\n");
                } else {
                    System.out.println("Please enter responses!\n\n");
                }
            } else if (intUserOption == 3) {
                System.out.println("Program terminated. Thank you.\n\n");
            } else {
                System.out.println("Invalid option!\n\n");
            }
            
        } while (intUserOption != 3);
    }
}