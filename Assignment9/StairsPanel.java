//********************************************************************
//  StairsPanel.java       Author: Chris Kasza, 100133723
//  
//  Assignment 9 Q3 - COMP 1123 A2
//  
//  Panel that draws equi-distance lines in the shape of stairs 
//  across the full panel
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;

public class StairsPanel extends JPanel
{
   private int numStairs;
   
   //-----------------------------------------------------------------
   //  Creates the panel for the stairs
   //-----------------------------------------------------------------
   public StairsPanel(int num) 
   {
      numStairs = num;
      setBackground(Color.black);
      setPreferredSize(new Dimension(800, 600));
   }

   //-----------------------------------------------------------------
   //  Draw the stairs
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
      final int PANELWIDTH = this.getWidth();
      final int PANELHEIGHT = this.getHeight();
      final int STAIRWIDTH = (int)(PANELWIDTH / numStairs);
      final int STAIRHEIGHT = (int)(PANELHEIGHT / numStairs);
      int startPoint[] = {0, PANELHEIGHT}; //[0] is x, [1] is y
      int endPoint[] = {0, 0};
      
      super.paintComponent(page);
      page.setColor(Color.white);
      for (int i=0; i<numStairs; i++) {
         startPoint[0] = endPoint[0];
         endPoint[1] = startPoint[1]-STAIRHEIGHT;
         System.out.println(startPoint[0] + ", " + startPoint[1] + ", " +
                            endPoint[0] + ", " + endPoint[1]);
         page.drawLine(startPoint[0], startPoint[1], endPoint[0], endPoint[1]);
         
         startPoint[1] = endPoint[1];
         endPoint[0] = startPoint[0]+STAIRWIDTH;
         System.out.println(startPoint[0] + ", " + startPoint[1] + ", " +
                            endPoint[0] + ", " + endPoint[1]);
         page.drawLine(startPoint[0], startPoint[1], endPoint[0], endPoint[1]);
      }     
   }
}
