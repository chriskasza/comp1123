//********************************************************************
//  MaxInt.java       Author: Chris Kasza, 100133723
//
//  Assignment 3 Q1 - COMP 1123 A2
//
//  Write a program called MaxInt.java which first defines two int 
//  constants. They contain the largest/smallest possible int values. 
//  Print their values. Then, add 1 to the largest value and subtract 
//  1 from the smallest value. Print the results. Don’t just output 4 
//  numbers. Include a short description for each one.
//********************************************************************

public class MaxInt
{
   //-----------------------------------------------------------------
   //  Prints the upper and lower bounds of int and shows the 
   //  relationship between the two.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
		//Integer.MIN_INTEGER
		//Integer.MAX_INTEGER
      final int SMALL = -2147483648;
      final int LARGE = 2147483647;

      System.out.println( "The smallest number of data type int is " + 
                         SMALL + "." );

      System.out.println( "The largest number of data type int is " + 
                         LARGE + "." );
      
      System.out.println( "Subtracting one from the smallest number gives " + 
                         "us " + ( SMALL - 1 ) + "." );
                         
      System.out.println( "Adding one to the largest number gives us " +
                         ( LARGE + 1 ) + "." );
   }
}
