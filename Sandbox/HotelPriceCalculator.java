/****************************
 * HOTEL PRICE CALCULATOR   *
 * AAYUSH SOOD              *
 * OCTOBER 3, 2025          *
 * PURPOSE: TO CALCULATE    *
 * THE COST OF HOUSING      *
 * PEOPLE IN A HOTEL BASED  *
 * ON THE NUMBER OF PEOPLE  *
 * PROVIDED                 *
 ***************************/
//---------------------------
 import java.util.Scanner;
 import java.text.NumberFormat;
//---------------------------
public class HotelPriceCalculator {
    public static void main(String[] args) {
        // DEFINE VARIABLES
            int intNumberOfGuests, intMultiOccupancyRooms, intSingleOccupancyRooms;
            String strReservationName, strFlush = "";
            double dblSubtotal, dblTax, dblTotalCost;
            
            Scanner scrInput = new Scanner(System.in);
            NumberFormat nbfMoney = NumberFormat.getCurrencyInstance();
        
        // PROMPT USER FOR RESERVATION
            System.out.println("\t\tStinky's \"Luxury\" Hotel");
            
            System.out.println("\n\nCreate Reservation");
            
            System.out.print("How many guests will be staying?: ");
            intNumberOfGuests = scrInput.nextInt();
            strFlush = scrInput.nextLine();
            
            System.out.print("Reservation made under the name: ");
            strReservationName = scrInput.nextLine();
            
        // PERFORM CALCULATIONS FOR NUMBER OF ROOMS
            intMultiOccupancyRooms = intNumberOfGuests / 3;
            intSingleOccupancyRooms = intNumberOfGuests % 3;
            
        // OUTPUT RESERVATION INFORMATION
            System.out.println("\n\nReservation Information Recorded: ");
            System.out.println("\nReservation for:\t\t\t\t" + strReservationName);
            System.out.println("Number of Multi-Occupancy Rooms:\t\t" + intMultiOccupancyRooms);
            System.out.println("Number of Single-Occupancy Rooms:\t\t" + intSingleOccupancyRooms);
            
        // PERFORM CALCULATIONS FOR SUBTOTAL, TAX, AND TOTAL COST
            dblSubtotal = (intMultiOccupancyRooms * 350) + (intSingleOccupancyRooms * 250);
            dblTax = dblSubtotal * 0.14;
            dblTotalCost = dblSubtotal + dblTax;
            
        // OUTPUT RESERVATION PRICES
            System.out.println("\n\nReservation Prices:");
            System.out.println("\t\t\tSubtotal:\t\t" + nbfMoney.format(dblSubtotal));
            System.out.println("\t\t\tTax:\t\t\t" + nbfMoney.format(dblTax));
            System.out.println("\t\t\tTotal:\t\t\t" + nbfMoney.format(dblTotalCost));
    }
}