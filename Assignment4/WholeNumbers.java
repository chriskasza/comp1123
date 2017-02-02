//********************************************************************
//  WholeNumbers.java       Author: Chris Kasza, 100133723
//
//  Assignment 4 Q2 - COMP 1123 A2
//
//  Write a program that reads a floating point value (double) and 
//  prints the closest whole numbers less than and greater than that 
//  value.  For example, if the number is 28.466, the program would 
//  print 28 and 29.
//********************************************************************

import java.util.Scanner;

public class WholeNumbers
{
   //-----------------------------------------------------------------
   //  Prints integer closest integers above and below provided float.
   //-----------------------------------------------------------------
   public static void main( String[] args )
   {
      int greater, lesser;
      double number;

      number = getNum( "decimal" );
      
      greater = (int)number + 1;
      lesser = (int)number;
      
      System.out.println( "The closest whole number greater than " + number + 
                         " is: " + greater );
      System.out.println( "The closest whole number less than " + number + 
                         " is: " + lesser );
   }

   //-----------------------------------------------------------------
   //  Requests and returns a valid decimal number.
   //-----------------------------------------------------------------   
   public static double getNum( String kind )
   {
      double number = 0;
      Scanner in = new Scanner(System.in);
      boolean notvalid = true;
      
      while( notvalid )
      {
         System.out.print( "Enter a " + kind + " number: " );
         
         if( in.hasNextDouble() )
         {
            number = in.nextDouble();
            notvalid = false;
         }
         else
         {
            in.next();
            System.out.println( "That's not a valid number. Please enter " +
                               "a " + kind + " value." );
            notvalid = true;
         }
      }
      
      in.close();
      return number;
   }   
}