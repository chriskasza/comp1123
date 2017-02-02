//********************************************************************
//  BoxCirclePanel.java       Author: Chris Kasza, 100133723
//
//  Class that draws a random box and circle in a panel.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;

public class BoxCirclePanel extends JPanel
{
   // get the screen size
   //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
   //private final double SCREENWIDTH = screenSize.getWidth();
   //private final double SCREENHEIGHT = screenSize.getHeight();
   
   // determine the dimensions we'll use for the panel
   //private final int PANELWIDTH = (int)( Math.random() * SCREENWIDTH );
   //private final int PANELHEIGHT = (int)( Math.random() * SCREENHEIGHT );
   
   //-----------------------------------------------------------------
   //  Creates the panel for the random square and circle
   //-----------------------------------------------------------------
   public BoxCirclePanel() 
   {
      setBackground( Color.black );
      //setPreferredSize( new Dimension( WIDTH, PANELHEIGHT ) );
   }

   //-----------------------------------------------------------------
   //  Draw the square and circle
   //-----------------------------------------------------------------
   public void paintComponent( Graphics page )
   {
      final int PANELWIDTH = this.getWidth();
      final int PANELHEIGHT = this.getHeight();
      // derive the square dimensions
      int squareBaseX = (int)( Math.random() * PANELWIDTH );
      int squareBaseY = (int)( Math.random() * PANELHEIGHT );
      int squareEdge = (int)( Math.random() * PANELWIDTH );
      // circle variables
      int circleBaseX = 0;
      int circleBaseY = 0;
      int circleDiameter = 0;
      int radius, centerX, centerY;
      double pointY;
      boolean circleNotVisible = true;
      //int i = 0;

      while( circleNotVisible )
      {
         circleBaseX = (int)( Math.random() * PANELWIDTH );
         circleBaseY = (int)( Math.random() * PANELHEIGHT );
         circleDiameter = (int)( Math.random() * PANELWIDTH );
         radius = circleDiameter/2;
         centerX = circleBaseX + radius;
         centerY = circleBaseY + radius;
         
         // check that at least a small portion of the 2nd quadrant of
         // the circle is visible in the panel; if not, get new coordinates
         if( PANELWIDTH <= centerX )
         {
            //System.out.println( i + ". the panel width doesn't intersect\n" );
            pointY = centerY - Math.sqrt( Math.pow( radius, 2 ) - 
                                         ( PANELWIDTH - centerX ) );
            if( PANELHEIGHT > pointY )
            {
               //System.out.println( "\tthe panel height does not intersect\n"s);
               circleNotVisible = false;
            }
         }
         else
         {
            //System.out.println( i + ". the panel width does intersect\n" );
            circleNotVisible = false;
         }
         //i++;
      }

      super.paintComponent( page );
      page.setColor( Color.red );
      page.fillRect( squareBaseX, squareBaseY, squareEdge, squareEdge );
      
      page.setColor( Color.green );
      page.fillOval( circleBaseX, circleBaseY, circleDiameter, circleDiameter );
   }
}