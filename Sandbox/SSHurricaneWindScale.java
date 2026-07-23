/************************************************
 * SAFFIR-SIMPSON HURRICANE WIND SCALE          *
 * AAYUSH SOOD                                  *
 * OCTOBER 27, 2025                             *
 *                                              *
 * PURPOSE: A PROGRAM THAT PROMPTS THE USER TO  *
 * ENTER A STORM'S WIND SPEED IN KM/H AND       *
 * OUTPUTS THE HURRICANE CATEGORY AND AMOUNT OF *
 * DAMAGE                                       *
 ***********************************************/
 //----------------------------------------------
 import java.util.Scanner;
 //----------------------------------------------
public class SSHurricaneWindScale {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR HURRICANE SPEED, CATEGORY, AND SCANNER
            double dblHurricaneSpeed = 0;
            
            Scanner scrInput = new Scanner(System.in);
            
        // PROMPT THE USER FOR THE STORM'S WIND SPEED
            System.out.println("Welcome to the Saffir-Simpson Hurricane Wind Scale!");
            
            System.out.print("Enter the storm's wind speed: ");
            dblHurricaneSpeed = scrInput.nextDouble();
            
        // CHECK THE CATEGORY OF THE HURRICANE BASED ON WIND SPEED AND OUTPUT
        // ITS CATEGORY AND AMOUNT OF DAMAGE TO THE USER
            if (dblHurricaneSpeed >= 119 && dblHurricaneSpeed <= 153) {
                System.out.println("Category 1 - Very dangerous winds that will produce some damage");
            } else if (dblHurricaneSpeed >= 154 && dblHurricaneSpeed <= 177) {
                System.out.println("Category 2 - Extremely dangerous winds that will cause extensive damage");
            } else if (dblHurricaneSpeed >= 178 && dblHurricaneSpeed <= 208) {
                System.out.println("Category 3 - Devastating damage will occur");
            } else if (dblHurricaneSpeed >= 209 && dblHurricaneSpeed <= 251) {
                System.out.println("Category 4 - Catastrophic damage will occur");
            } else if (dblHurricaneSpeed > 251) {
                System.out.println("Category 5 - Catastrophic damage will occur. A high percentage of framed homes will be destroyed");
            } else {
                System.out.println("Please enter a valid wind speed!");
            }
    }
}