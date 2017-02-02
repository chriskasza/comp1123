//********************************************************************
//  Seconds.java       Author: Chris Kasza, 100133723
//
//  Assignment 3 Q3 - COMP 1123 A2
//
//  PP2.8 on p. 109. Call the program Seconds.java.
//  Write a program that reads values representing a time duration in 
//  hours, minutes, and seconds and then prints the equivalent total 
//  number of seconds.  (For example, 1 hour, 28 minutes, and 42 
//  seconds is equivalent to 5322 seconds.)
//********************************************************************

import java.util.Scanner;

public class Seconds
{
   //-----------------------------------------------------------------
   //  Adds hours, minutes, and seconds together and provides the 
   //  total represented as seconds.
   //-----------------------------------------------------------------
   public static void main( String[] args )
   {
      int hours, mins, secs, ttlSecs;
      final int SEC_PER_MIN = 60;
      final int MIN_PER_HR = 60;
      
      hours = getNum( "hours" );
      mins = getNum( "minutes" );
      secs = getNum( "seconds" );
      ttlSecs = hours * MIN_PER_HR * SEC_PER_MIN + mins * SEC_PER_MIN + secs;
      System.out.println( "Total seconds : " + ttlSecs );
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