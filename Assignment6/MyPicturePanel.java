//********************************************************************
//  MyPicturePanel.java       Author: Chris Kasza, 100133723
//
//  Class that draws a the coolest image you've ever seen, ever. Ever.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;

public class MyPicturePanel extends JPanel
{
   // get the screen size
   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
   private final double SCREENWIDTH = screenSize.getWidth();
   private final double SCREENHEIGHT = screenSize.getHeight();
   private final int PANELWIDTH = ( (int)SCREENWIDTH - 30 );
   private final int PANELHEIGHT = ( (int)SCREENHEIGHT - 120 );

   //-----------------------------------------------------------------
   //  Creates the panel for the random square and circle
   //-----------------------------------------------------------------
   public MyPicturePanel() 
   {
      // determine the dimensions we'll use for the panel

      setBackground( Color.gray );
      setPreferredSize( new Dimension( PANELWIDTH, PANELHEIGHT ) );
   }

   //-----------------------------------------------------------------
   //  Draw the pièce de résistance
   //-----------------------------------------------------------------
   public void paintComponent( Graphics page )
   {
      final int PANELWIDTH = this.getWidth();
      final int PANELHEIGHT = this.getHeight();
      
      // head circle
      int headBaseX = PANELWIDTH / 2;
      int headBaseY = PANELHEIGHT / 4;
      int headDiameter = PANELWIDTH / 4;
      int headRadius = headDiameter / 2;
      int headCenterX = headBaseX + headRadius;
      int headCenterY = headBaseY + headRadius;
      
      // ear1 circle
      int ear1Diameter = 9 * headDiameter / 20;
      int ear1BaseX = headCenterX;
      int ear1BaseY = (int)( headBaseY - 3 * ear1Diameter / 4 );
      
      // ear2 circle
      int ear2Diameter = 9 * headDiameter / 20;
      int ear2BaseX = headCenterX + 3 * headRadius / 4;
      int ear2BaseY = (int)(headCenterY - Math.sqrt( Math.pow( headRadius, 2 )-
                           ( headCenterX - ear2BaseX ) ) );
      
      // eye circle
      int eyeDiameter = headDiameter / 3;
      int eyeBaseX = (int)( headBaseX + headRadius / 5);
      int eyeBaseY = (int)( headBaseY + headRadius / 5);
      
      // eye cross
      //int crossLength = 3 * eyeDiameter / 4;
      int[] cross1X = new int[2];
      int[] cross1Y = new int[2];
      int[] cross2X = new int[2];
      int[] cross2Y = new int[2];
      cross1X[0] = eyeBaseX + eyeDiameter / 4;
      cross1X[1] = eyeBaseX + 3 * eyeDiameter / 4;
      cross1Y[0] = eyeBaseY + eyeDiameter / 4;
      cross1Y[1] = eyeBaseY + 3 * eyeDiameter / 4;
      cross2X[0] = eyeBaseX + 3 * eyeDiameter / 4;
      cross2X[1] = eyeBaseX + eyeDiameter / 4;
      cross2Y[0] = eyeBaseY + eyeDiameter / 4;
      cross2Y[1] = eyeBaseY + 3 * eyeDiameter / 4;      
      
      // mouth triangle
      double[] mouthX = new double[3];
      double[] mouthY = new double[3];
      mouthX[0] = headBaseX - headRadius / 5;
      mouthY[0] = headBaseY + headRadius;
      mouthX[1] = headBaseX + headRadius / 5;
      mouthY[1] = mouthY[0] + 2 * headRadius / 3;
      mouthX[2] = mouthX[0] + headRadius;
      mouthY[2] = ( mouthY[0] + mouthY[1] ) / 2;      
      
      // mouth in relation to head
      double topMouthSlope = ( mouthY[2] - mouthY[0] ) / 
                             ( mouthX[2] - mouthX[0] );
      double topMouthB = topMouthSlope * ( 0 - mouthX[0] ) + mouthY[0];
      double topIntersectX = calcLineCircleIntersectX( topMouthSlope, 
                              topMouthB, headCenterX, headCenterY, headRadius );
      double topIntersectY = lineFormulaCalcY( topMouthSlope,
                                                     topMouthB, topIntersectX );
      double topMouthLength = Math.sqrt( Math.pow( topIntersectX - mouthX[2], 
                              2 ) + Math.pow( topIntersectY - mouthY[2], 2 ) );
      /*
      double bottomMouthSlope = ( mouthY[2] - mouthY[1] ) / 
                                ( mouthX[2] - mouthX[1] );
      double bottomMouthB = bottomMouthSlope * ( 0 - mouthX[1] ) + mouthY[1];
      double bottomIntersectX = calcLineCircleIntersectX( bottomMouthSlope, 
                           bottomMouthB, headCenterX, headCenterY, headRadius );
      double bottomIntersectY = lineFormulaCalcY( bottomMouthSlope,
                                               bottomMouthB, bottomIntersectX );
      */

      // teeth
      int[][] topToothX = new int[4][3];
      int[][] topToothY = new int[4][3];
      //System.out.println("x-coord for topmouth is " + topIntersectX);
      //System.out.println("y-coord for topmouth is " + topIntersectY);
      for( int i = 0; i < 4; i++ )
      {
         if( i == 0 )
         {
            topToothX[i][0] = (int)topIntersectX;
         }
         else
         {
            topToothX[i][0] = (int)topToothX[i - 1][1];
         }
         topToothY[i][0] = (int)( lineFormulaCalcY( topMouthSlope, topMouthB, 
                                                   topToothX[i][0] ) );
         topToothX[i][1] = (int)( topToothX[i][0] + topMouthLength / 5 );
         topToothY[i][1] = (int)( lineFormulaCalcY( topMouthSlope, topMouthB, 
                                                   topToothX[i][1] ) );
         topToothX[i][2] = (int)( ( topToothX[i][0] + topToothX[i][1] ) / 2 );
         topToothY[i][2] = (int)( lineFormulaCalcY( topMouthSlope, topMouthB, 
                                       topToothX[i][2] ) + topMouthLength / 6 );
         /*
         System.out.println("x-coord0 for tooth " +i + " is " +topToothX[i][0]);
         System.out.println("y-coord0 for tooth " +i + " is " +topToothY[i][0]);
         System.out.println("x-coord1 for tooth " +i + " is " +topToothX[i][1]);
         System.out.println("y-coord1 for tooth " +i + " is " +topToothY[i][1]);
         System.out.println("x-coord2 for tooth " +i + " is " +topToothX[i][2]);
         System.out.println("y-coord2 for tooth " +i + " is " +topToothY[i][2]);
         */
      }
      
      String message = "all your bases are belong to me  \u00a9dasmaus";
      int messageBaseX = PANELWIDTH / 4;
      int messageBaseY = PANELHEIGHT / 4;
      
      super.paintComponent( page );
      page.setColor( Color.black );
      page.fillOval( headBaseX, headBaseY, headDiameter, headDiameter );
      
      page.setColor( Color.black );
      page.fillOval( ear1BaseX, ear1BaseY, ear1Diameter, ear1Diameter );

      page.setColor( Color.black );
      page.fillOval( ear2BaseX, ear2BaseY, ear2Diameter, ear2Diameter );

      page.setColor( Color.white );
      page.fillOval( eyeBaseX, eyeBaseY, eyeDiameter, eyeDiameter );
      
      page.setColor( Color.black );
      page.drawLine( cross1X[0], cross1Y[0], cross1X[1], cross1Y[1] );
      page.drawLine( cross2X[0], cross2Y[0], cross2X[1], cross2Y[1] );
      
      page.setColor( Color.gray );
      int[] intMouthX = new int[3];
      int[] intMouthY = new int[3];
      for (int i=0; i < 3; i++)
      {
         intMouthX[i] = (int)mouthX[i];
         intMouthY[i] = (int)mouthY[i];
      }
      page.fillPolygon( intMouthX, intMouthY, 3 );
      
      page.setColor( Color.white );
      for( int i = 0; i < 4; i++ )
      {
         page.fillPolygon( topToothX[i], topToothY[i], 3 );
      }
      
      page.setColor( Color.black );
      page.setFont( new Font( "TimesRoman", Font.PLAIN, PANELWIDTH/50 ) ); 
      page.drawString( message, messageBaseX, messageBaseY );
   }

   private double calcLineCircleIntersectX( double m, double b, int ox, int oy,
                                           int r)
   {
      double x = ( m * oy - b * m + ox - Math.sqrt( 0 - Math.pow( m, 2 ) * 
                  Math.pow( ox, 2 ) + Math.pow( m, 2 ) * Math.pow( r, 2 ) -
                  2 * b * m * ox + 2 * m * ox * oy - Math.pow( b, 2 ) + 
                  2 * b * oy - Math.pow( oy, 2 ) + Math.pow( r, 2 ) ) ) / 
                  ( Math.pow( m, 2 ) + 1 );
      return x;
   }
   
   private double lineFormulaCalcY( double m, double b, double x )
   {
      double y = m * x + b;
      //System.out.println("y = m * x + b => " + y + " = " + m + " * " + x + 
                         //" + " + b);
      return y;
   }
}
