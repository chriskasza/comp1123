//********************************************************************
//  UnicodePanel.java       Author: Chris Kasza, 100133723
//
//  Assignment 8 Q2 - COMP 1123 A2
//
//  Class that displays the corresponding character of a unicode 
//  number.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UnicodePanel extends JPanel implements ActionListener {
   private JTextField input;
   private JRadioButton c2u, u2c;
   private JLabel label;
   
   
   //-----------------------------------------------------------------
   //  Constructor - creates the panel
   //-----------------------------------------------------------------
   public UnicodePanel() 
   {
      input = new JTextField(5);
      input.setActionCommand("input");
      input.addActionListener(this);
      label = new JLabel("");
      
      JPanel textPanel = new JPanel();
      textPanel.add(input);
      textPanel.add(label);
      textPanel.setBackground(Color.green);
      
      u2c = new JRadioButton("Unicode to char", true);
      u2c.setMnemonic(KeyEvent.VK_U);
      u2c.setActionCommand("u2c");
      u2c.addActionListener(this);
      u2c.setBackground(Color.green);
      u2c.setHorizontalAlignment(AbstractButton.CENTER);
      
      c2u = new JRadioButton("char to Unicode");
      c2u.setMnemonic(KeyEvent.VK_C);
      c2u.setActionCommand("c2u");
      c2u.addActionListener(this);
      c2u.setBackground(Color.green);
      c2u.setHorizontalAlignment(AbstractButton.CENTER);
      
      ButtonGroup group = new ButtonGroup();
      group.add(u2c);
      group.add(c2u);
      
      JPanel radioPanel = new JPanel(new GridLayout(0, 1));
      radioPanel.add(u2c);
      radioPanel.add(c2u);
      
      setLayout(new GridLayout(2, 0));
      
      setBackground(Color.green);
      setPreferredSize(new Dimension(100, 80));
      
      add(textPanel);
      add(radioPanel);
   }

   //--------------------------------------------------------------
   //  Listen to events
   //--------------------------------------------------------------
   public void actionPerformed(ActionEvent event)
   {
      Object source = event.getSource();
      if (source == input) {
         if (u2c.isSelected()) {
            int i = Integer.parseInt(input.getText());
            label.setText(String.valueOf((char)i));
         } else if (c2u.isSelected()) {
            label.setText(String.valueOf((int)input.getText().charAt(0)));
         }
      } else if (source == u2c || source == c2u) {
         input.setText("");
         label.setText("");
      }
   }
}
