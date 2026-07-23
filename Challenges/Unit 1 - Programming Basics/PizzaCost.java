/*******************************************
 * PIZZA COST CALCULATOR                    *
 * AAYUSH SOOD                              *
 * SEPTEMBER 11, 2025                       *
 *                                           *
 * PURPOSE: THIS PROGRAM PROMPTS            *
 * THE USER FOR THE SIZE OF PIZZA           *
 * AND DISPLAYS THE COST OF MAKING          *
 * THE PIZZA                                *
 *********************************************/
//------------------------------------
import java.util.Scanner;
import java.text.NumberFormat;
//------------------------------------
public class PizzaCost {
    public static void main(String Args[]) {
        // DEFINE VARIABLES
        double dblPizzaDiameter;
        double dblLaborCost = 0.75;
        double dblRentCost = 1.00;
        double dblMaterialsCost;
        double dblTotalPizzaCost;

        String strFlush = "";

        Scanner scrInput = new Scanner(System.in);
        NumberFormat nbfMoney = NumberFormat.getCurrencyInstance();

        // ASK FOR PIZZA DIAMETER
        System.out.print("Enter the diameter of the pizza in inches: ");
        dblPizzaDiameter = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        // PERFORM COST CALCULATIONS
        dblMaterialsCost = 0.05 * dblPizzaDiameter * dblPizzaDiameter;
        dblTotalPizzaCost = dblLaborCost + dblRentCost + dblMaterialsCost;

        // OUTPUT COST OF PIZZA PRODUCTION
        System.out.println("The cost of making the pizza is: " + nbfMoney.format(dblTotalPizzaCost));
    }
}
