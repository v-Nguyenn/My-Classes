import java.util.Scanner;

/**
   This program converts cups to fluid ounces.
*/

public class CupConverter_VNguyen
{
   public static void main(String[] args)
   {
      double cups;   // To hold the number of cups
      double ounces; // To hold the number of ounces
      
      // Get the number of cups.
      cups = getCups();
      
      // Convert the cups to fluid ounces.
      ounces = cupsToOunces(cups);
      
      // Display the results.
      displayResults(cups, ounces);
      System.exit(0);
   }
   
   /**
      The getCups method promtps the user to enter a number
      of cups.
      @return The number of cups entered by the user.
   */
   
   public static double getCups()
   {
      double numCups;  // To hold cups.

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
            
      // Get the number of cups from the user.
      String prompt = 
            "This program converts measurements\n" +
            "in cups to fluid ounces. For your\n" +
            "reference the formula is:\n" +
            "    1 cup = 8 fluid ounces\n\n" +
            "Enter the number of cups.";
            
      // Get the number of cups from the user.
      System.out.print( prompt );
      numCups = keyboard.nextDouble( );
      
      // Return the number of cups.
      return numCups;
   }
   
   /**
      The cupsToOunces method converts a number of
      cups to fluid ounces, using the formula
      1 cup = 8 fluid ounces.
      @param numCups The number of cups to convert.
      @return The number of ounces.
   */
   
   public static double cupsToOunces(double numCups)
   {
      return numCups * 8.0;
   }
   
   /**
      The displayResults method displays a message showing
      the results of the conversion.
      @param cups A number of cups.
      @param ounces A number of ounces.
   */
   
   public static void displayResults(double cups, double ounces)
   {
      System.out.printf("%.1f cups equals %.f fluid ounces.\n",
         cups,  ounces);
   }
}