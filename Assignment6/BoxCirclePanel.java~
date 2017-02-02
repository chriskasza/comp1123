//********************************************************************
//  NestedPanels4.java       Author: Lewis/Loftus
//
//  NestedPanels.java demonstrated a basic componenet hierarchy.
//  Modify the NestedPanels program in chapter 3. Call your program 
//  NestedPanels4.java. The modified program displays 4 nested panels. 
//  Each panel has a color, a label, and is 100 by 100. When your 
//  program is run it must first display the panels arranged 2x2 but
//  the windows size can be adjusted by the user.
//********************************************************************

import java.awt.*;
import javax.swing.*;

public class NestedPanels4
{
   //-----------------------------------------------------------------
   //  Presents four colored panels nested within a fifth.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Nested Panels 4");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Set up first subpanel
      JPanel subPanel1 = new JPanel();
      subPanel1.setPreferredSize(new Dimension(100, 100));
      subPanel1.setBackground(Color.green);
      //subPanel1.setBorder( BorderFactory.createEmptyBorder( 0, 0, 0, 0 ) );
      JLabel label1 = new JLabel("One");
      subPanel1.add(label1);

      // Set up second subpanel
      JPanel subPanel2 = new JPanel();
      subPanel2.setPreferredSize(new Dimension(100, 100));
      subPanel2.setBackground(Color.white);
      //subPanel2.setBorder( BorderFactory.createEmptyBorder( 0, 0, 0, 0 ) );
      JLabel label2 = new JLabel("Two");
      subPanel2.add(label2);
      
      // Set up third subpanel
      JPanel subPanel3 = new JPanel();
      subPanel3.setPreferredSize(new Dimension(100, 100));
      subPanel3.setBackground(Color.white);
      //subPanel3.setBorder( BorderFactory.createEmptyBorder( 0, 0, 0, 0 ) );
      JLabel label3 = new JLabel("Three");
      subPanel3.add(label3);
      
      // Set up fourth subpanel
      JPanel subPanel4 = new JPanel();
      subPanel4.setPreferredSize(new Dimension(100, 100));
      subPanel4.setBackground(Color.green);
      //subPanel4.setBorder( BorderFactory.createEmptyBorder( 0, 0, 0, 0 ) );
      JLabel label4 = new JLabel("Four");
      subPanel4.add(label4);
      
/*      
      // Set up first mid panel
      JPanel midPanel1 = new JPanel();
      //midPanel1.setPreferredSize(new Dimension(220, 200));
      midPanel1.setBackground(Color.blue);
      //midPanel1.setBorder( BorderFactory.createEmptyBorder( 0, 0, 0, 0 ) );
      midPanel1.add(subPanel1);
      midPanel1.add(subPanel2);
       
      // Set up second mid panel
      JPanel midPanel2 = new JPanel();
      //midPanel2.setPreferredSize(new Dimension(220, 200));
      midPanel2.setBackground(Color.blue);
      //midPanel2.setBorder( BorderFactory.createEmptyBorder( 0, 0, 0, 0 ) );
      midPanel2.add(subPanel3);
      midPanel2.add(subPanel4);
      
      // Set up primary panel
      JPanel primary = new JPanel();
      primary.setPreferredSize(new Dimension(220, 220));
      primary.setBackground(Color.blue);
      primary.add(midPanel1);
      primary.add(midPanel2);
*/
      
      // Set up primary panel
      JPanel primary = new JPanel();
      primary.setPreferredSize(new Dimension(215, 215));
      primary.setBackground(Color.blue);
      primary.add(subPanel1);
      primary.add(subPanel2);
      primary.add(subPanel3);
      primary.add(subPanel4);
      
      frame.getContentPane().add(primary);
      frame.pack();
      frame.setVisible(true);
   }
}
