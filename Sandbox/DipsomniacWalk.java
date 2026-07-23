import java.util.Scanner;

public class DipsomniacWalk {
    public static void main(String[] args) throws InterruptedException {
        // DEFINE VARIABLES
            String strStep = "", strInput = "";
            int intRandomNumber = 0, intSteps = 0;
            boolean boolOnBridge = true;
            
            Scanner scrInput = new Scanner(System.in);
            
        // INTRODUCE PROGRAM AND PRINT FIRST STEP
            System.out.println("\t\t\"Walking Simulation\"");
            strStep = "|---*---|";
            System.out.print("\n\n\t\t    " + strStep);
            strInput = scrInput.nextLine();
        
        // CONDUCT SIMULATION
            do {
                intRandomNumber = (int)((3 - 1 + 1) * Math.random() + 1);
                int intPersonLocation = strStep.indexOf("*");
                
                if (intRandomNumber == 1) {
                    Thread.sleep(500);
                    System.out.println("\t\t    " + strStep);
                    intSteps++;
                } else if (intRandomNumber == 2) {
                    if (intPersonLocation == 1) {
                        Thread.sleep(500);
                        strStep = "*-------|";
                        System.out.println("\t\t    " + strStep);
                        System.out.println("\t\t    " + "~~splash~~");
                        boolOnBridge = false;
                    } else {
                        Thread.sleep(500);
                        strStep = strStep.substring(0, intPersonLocation - 1) + strStep.substring(intPersonLocation, intPersonLocation + 1) + "-" + strStep.substring(intPersonLocation + 1, strStep.length());
                        System.out.println("\t\t    " + strStep);
                        intSteps++;
                    }
                } else if (intRandomNumber == 3) {
                    if (intPersonLocation == strStep.length() - 2) {
                        Thread.sleep(500);
                        strStep = "|-------*";
                        System.out.println("\t\t    " + strStep);
                        System.out.println("\t\t    " + "~~splash~~");
                        boolOnBridge = false;
                    } else {
                        Thread.sleep(500);
                        strStep = strStep.substring(0, intPersonLocation) + "-" + strStep.substring(intPersonLocation, intPersonLocation + 1) + strStep.substring(intPersonLocation + 2, strStep.length());
                        System.out.println("\t\t    " + strStep);
                        intSteps++;
                    }
                }
            } while (boolOnBridge && intSteps < 20);
            
        if (boolOnBridge) {
            System.out.println("\nThey made it safely across the bridge.");
        } else {
            System.out.println("\nOh no...they fell into the water.");
        }
    }
}