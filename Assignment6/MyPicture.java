//********************************************************************
//  MyPicture.java       Author: Chris Kasza, 100133723
//
//  Sets up the frame to draw the MyPicturePanel panel in.
//********************************************************************

import javax.swing.*;

public class MyPicture
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("MyPicture");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new MyPicturePanel());

      frame.pack();
      frame.setVisible(true);
   }
}
