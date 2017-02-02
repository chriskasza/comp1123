//********************************************************************
//  Password.java       Author: Chris Kasza, 100133723
//  
//  Assignment 7 - COMP 1123 A2
//  
//  Password class containing some random methods to generate strings
//********************************************************************

import java.util.Random;

public class Password
{
   private final int LOWER_A = 97;
   private final int LOWER_Z = 122;
   private int first, second, third;
   
   // constructor
   public Password()
   {
      first = LOWER_A;
      second = LOWER_A;
      third = LOWER_A - 1;
   }
   
   // loops through all possible combinations of three lower case characters
   // returns ??? after zzz is reached
   public String nextPassword() 
   {
      third++;
      if( third == ( LOWER_Z + 1 ) )
      {
         third = LOWER_A;
         second++;
         if( second == ( LOWER_Z + 1 ) )
         {
            second = LOWER_A;
            first++;
            if( first > LOWER_Z )
            {
               first = LOWER_Z;
               second = LOWER_Z;
               third = LOWER_Z;
               return "???";
            }
         }
      }
      StringBuilder output = new StringBuilder().append((char)first).append(
                                             (char)second).append((char)third);
      return output.toString();
   }
   
   // relating to nextPassword method; will reset the characters back to "aaa"
   public void reset() {
      first = LOWER_A;
      second = LOWER_A;
      third = ( LOWER_A - 1 );
   }
   
   // generate a random 3 character password using only lower case characters
   public static String shortPassword() 
   {
      String range = "abcdefghijklmnopqrstuvwxyz";
      int length = 3;
      String password = generatePW( range, length );
      return password;
   }
   
   // generate a random 25 character password using upper case, lower case,
   // and digit characters
   public static String longPassword() 
   {
      String range = "ABCDEFGHIJKLMOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz"
         + "0123456789";
      int length = 25;
      String password = generatePW( range, length );
      return password;
   }
   
   // generatePW method will generate a random string of specified size 
   // comprised of only desired characters (string range)
   public static String generatePW( String range, int size )
   {
      char[] pw = new char[size];
      Random rnd = new Random();

      for( int i = 0; i < size; i++ )
      {
         pw[i] = range.charAt( rnd.nextInt( range.length() ) );
      }
      
      return new String( pw );
   }      
}