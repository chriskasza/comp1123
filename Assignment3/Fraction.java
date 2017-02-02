//********************************************************************
//  Fraction.java       Author: Chris Kasza, 100133723
//
//  Assignment 3 Q2 - COMP 1123 A2
//
//  Write a program called Fraction.java which requests the user to 
//  enter a numerator and denominator for a fraction. Both are int’s. 
//  Use casting to display the fraction as a double.
//********************************************************************

import java.util.Scanner;

public class Fraction
{
   //-----------------------------------------------------------------
   //  Converts a fraction to a decimal.
   //-----------------------------------------------------------------
   public static void main( String[] args )
   {
      int numerator, denominator;
      
      numerator = getNum( "numerator" );
      denominator = getNum( "denominator" );
     
      System.out.println( "The decimal equivalent of your fraction is : " + 
                         ( (double)( numerator ) / (double)( denominator ) ) + 
                         "." );
   }

   //-----------------------------------------------------------------
   //  Requests and returns a valid integer number.
   //-----------------------------------------------------------------   
   public static int getNum( String kind )
   {
      int number = 0;
      Scanner in = new Scanner(System.in);
      boolean notint = true;
      
      while( notint )
      {
         System.out.print( "Enter the " + kind + " of a fraction: " );
         
         if( in.hasNextInt() )
         {
            number = in.nextInt();
            notint = false;
         }
         else
         {
            in.next();
            System.out.println( "That's not a valid number. Please enter " +
                               "an integer value." );
            notint = true;
         }
      }
      
      in.close();
      return number;
   }
}