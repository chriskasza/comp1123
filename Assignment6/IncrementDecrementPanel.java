//********************************************************************
//  IncrementDecrementPanel.java       Author: Chris Kasza, 100133723
//
//  two buttons and a label.  one button increases a count displayed
//  in the label, the other button decreases it.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IncrementDecrementPanel extends JPanel
{
   private int count;
   private JButton buttonDecrement, buttonIncrement;
   private JLabel labelCount;
   
   //  Constructor - creates the panel and sets up the buttons and label
   public IncrementDecrementPanel() 
   {
      count = 50;

      buttonDecrement = new JButton( "Decrement" );
      buttonDecrement.addActionListener( new DecrementListener() );
      
      buttonIncrement = new JButton( "Increment" );
      buttonIncrement.addActionListener( new IncrementListener() );
      
      labelCount = new JLabel( " " + count + " " );

      add( buttonDecrement );
      add( labelCount );
      add( buttonIncrement );

      setBackground( Color.yellow );
      setPreferredSize( new Dimension( 250, 50 ) );
   }

   // listener for buttonDecrement action events
   private class DecrementListener implements ActionListener
   {
      // Updates the counter and label when buttonDecrement  is pushed.
      public void actionPerformed( ActionEvent event )
      {
         count--;
         labelCount.setText( " " + count + " " );
      }
   }
   
   // listener for buttonIncrement action events
   private class IncrementListener implements ActionListener
   {
      // Updates the counter and label when buttonIncrement is pushed.
      public void actionPerformed( ActionEvent event )
      {
         count++;
         labelCount.setText( " " + count + " " );
      }
   }
}