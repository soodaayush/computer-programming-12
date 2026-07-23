/*********************************
 * PAYROLL CALCULATOR             *
 * AAYUSH SOOD                    *
 * OCTOBER 8, 2025                *
 *                                 *
 * PURPOSE: TO CALCULATE THE      *
 * INDIVIDUAL COMPONENTS OF       *
 * RICK ASTLEY'S ASSISTANT'S      *
 * PAYSTUB AND PROVIDE INFO       *
 * ABOUT REGULAR PAY, OVERTIME    *
 * PAY, INCOME TAX DEDUCTIONS,    *
 * AND NET PAY                    *
 ***********************************/
//---------------------------------
import java.util.Scanner;
import java.text.NumberFormat;
//---------------------------------
public class Quiz {
    public static void main(String args[]) {
        // DEFINE VARIABLES FOR REGULAR & OVERTIME HOURS, REGULAR PAY, OVERTIME PAY, INCOME TAX DEDUCTION, NET PAY
        // SCANNER AND NUMBERFORMAT VARIABLES ARE DEFINED TO TAKE RICK ASTLEY'S INPUT AND FORMAT PAY ACCORDINGLY
        double dblRegularHours, dblOvertimeHours;
        double dblRegularPay, dblOvertimePay, dblIncomeTaxDeduction, dblNetPay;

        Scanner scrInput = new Scanner(System.in);
        String strFlush = "";
        NumberFormat nbfMoney = NumberFormat.getCurrencyInstance();

        // INTRODUCE THE PERSONAL ASSISTANT PAYROLL PROGRAM TO RICK ASTLEY
        System.out.println("\t\"RICK'S pay ROLL\"");

        // PROMPT RICK ASTLEY FOR HIS PERSONAL ASSISTANT'S NUMBER OF REGULAR AND OVERTIME HOURS WORKED
        System.out.print("\n\n\nEnter number of regular hours: ");
        dblRegularHours = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        System.out.print("Enter number of overtime hours: ");
        dblOvertimeHours = scrInput.nextDouble();
        strFlush = scrInput.nextLine();

        // CALCULATE REGULAR PAY, OVERTIME PAY, INCOME TAX DEDUCTION, AND NET PAY FOR HIS PERSONAL ASSISTANT'S PAY STUB BASED ON PROVIDED HOURS
        // PAY RATES:
        // $15.50 PER REGULAR HOUR
        // $31.00 PER OVERTIME HOUR WORKED
        // INCOME TAX: 45%
        dblRegularPay = 15.50 * dblRegularHours;
        dblOvertimePay = 31.00 * dblOvertimeHours;
        dblIncomeTaxDeduction = 0.45 * (dblRegularPay + dblOvertimePay);
        dblNetPay = (dblRegularPay + dblOvertimePay) - dblIncomeTaxDeduction;

        // OUTPUT THE PAY STUB TO RICK ASTLEY, CONTAINING REGULAR PAY, OVERTIME PAY, INCOME TAX DEDUCTIONS, AND NET PAY
        System.out.println("\n\n\nPay Stub Summary:");
        System.out.println("^^^^^^^^^^^^^^^^^");

        System.out.println("Reg Pay: \t" + nbfMoney.format(dblRegularPay));
        System.out.println("Over Pay: \t" + nbfMoney.format(dblOvertimePay));
        System.out.println("Tax: \t\t" + nbfMoney.format(dblIncomeTaxDeduction));
        System.out.println("Net Pay: \t" + nbfMoney.format(dblNetPay));
    }
}
