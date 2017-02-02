//********************************************************************
//  Stairs.java       Author: Chris Kasza, 100133723
//  
//  Assignment 9 Q3 - COMP 1123 A2
//  
//  Draws "stairs" based on a user provided number of stairs
//********************************************************************

import java.util.Scanner;
import javax.swing.*;

public class Stairs
{
   //-----------------------------------------------------------------
   //  Request a number from the user and return it
   //-----------------------------------------------------------------
   public static int requestNumber() {
      double dNumber = 0;
      int iNumber = 0;
      Scanner scan = new Scanner(System.in);
      boolean validNumber = false;
      
      while (validNumber == false) {
         System.out.print( "Enter the number of stairs: " );
         dNumber = scan.nextDouble();
         
         if (dNumber <= 0) {
            // negative number
            System.out.println( "That number is not a positive integer." );
         }
         // string
         else {
            // valid
            validNumber = true;
            iNumber = (int)dNumber;
         }
      }
      return iNumber;
   }
   
   //-----------------------------------------------------------------
   //  Program jumping off point; draws frame
   //-----------------------------------------------------------------
   public static void main(String[] args) {
      int number = requestNumber();

      JFrame frame = new JFrame("Stairs");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new StairsPanel(number));

      frame.pack();
      frame.setVisible(true);
   }
}