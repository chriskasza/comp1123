//********************************************************************
//  IncrementDecrement.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 4.16
//********************************************************************

import javax.swing.JFrame;

public class IncrementDecrement
{
   //-----------------------------------------------------------------
   //  Creates and displays the GUI.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Increment / Decrement");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new IncrementDecrementPanel());
      frame.pack();
      frame.setVisible(true);
   }
}
