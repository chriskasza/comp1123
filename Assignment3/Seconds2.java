//********************************************************************
//  Seconds2.java       Author: Chris Kasza, 100133723
//
//  Assignment 3 Q4 - COMP 1123 A2
//
//  PP 2.9 on p. 109. Call the program Seconds2.java.
//  Create a version of the previous project that reverses the 
//  computation. That is, read a value representing a number of 
//  seconds, then print the equivalent amount of time as a combination 
//  of hours, minutes, and seconds. (For example, 9999 seconds is 2 
//  hours, 46 minutes, and 39 seconds.)
//********************************************************************

import java.util.Scanner;

public class Seconds2
{
   //-----------------------------------------------------------------
   //  Converts seconds to equivalent value using hours, minutes and 
   //  seconds.
   //-----------------------------------------------------------------
   public static void main( String[] args )
   {
      int hours, mins, secs, ttlsecs;
      final int SEC_PER_MIN = 60;
      final int MIN_PER_HR = 60;
      
      ttlsecs = getNum( "seconds" );
      
      hours = ttlsecs / SEC_PER_MIN / MIN_PER_HR;
      mins = ttlsecs / SEC_PER_MIN % MIN_PER_HR;
      //mins = ttlsecs / SEC_PER_MIN - hours * MIN_PER_HR;
      secs = ttlsecs % SEC_PER_MIN;
      //secs = ttlsecs - mins * SEC_PER_MIN - hours * SEC_PER_MIN * MIN_PER_HR;
      
      System.out.println( "Hours : " + hours );
      System.out.println( "Minutes : " + mins );
      System.out.println( "Seconds : " + secs );
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
         System.out.print( "Enter the number of " + kind + ": " );
         
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