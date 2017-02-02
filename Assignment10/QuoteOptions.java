//********************************************************************
//  QuoteOptions.java       Author: Chris Kasza, 100133723
//  
//  Assignment 10 Q3 - COMP 1123 A2
//  
//  QuoteOptions class contains the frame that the QuotesOptionsPanel
//  is displayed in
//********************************************************************

import javax.swing.JFrame;

public class QuoteOptions
{
   //-----------------------------------------------------------------
   //  Creates and presents the program frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Quote Options");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      QuoteOptionsPanel panel = new QuoteOptionsPanel();
      frame.getContentPane().add(panel);

      frame.pack();
      frame.setVisible(true);
   }
}
