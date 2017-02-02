//********************************************************************
//  Lincoln.java       Author: Chris Kasza, 100133723
//
//  Assignment 2 - COMP 1123 A2
//
//  Demonstrates escaping special characters when printing strings.
//********************************************************************

public class Lincoln
{
   //-----------------------------------------------------------------
   //  Prints a presidential quote.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      System.out.print( "\tA \'quote\' by \"Abraham Lincoln\":\n" +
                        "\t\tWhatever you are, \n\t\t\tbe a good one" );
      System.out.println( Character.toString( (char)46 ) );
   }
}
