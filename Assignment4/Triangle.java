//********************************************************************
//  Triangle.java       Author: Chris Kasza, 100133723
//
//  Assignment 4 Q3 - COMP 1123 A2
//
//  Write a program called Triangle.java which first reads in the 
//  (x,y) coordinates for 3 points of a triangle. Each x-y is an 
//  integer. Compute the triangle’s area. Use the formulas in PP 3.5 
//  and 3.7.
//  Distance = sqrt( ( x2 - x1 )^2 + ( y2 - y1 )^2 )
//  Area = sqrt( s( s - a )( s - b )( s - c ) )
//********************************************************************

import java.util.Scanner;

public class Triangle
{   
   private int[][] points = new int[3][2];
   private double area;
   private boolean updated = true;
   
   //-----------------------------------------------------------------
   //  Save x coordinate of a point.
   //  Point should be 0 to 2.
   //-----------------------------------------------------------------   
   public void setX( int point, int value )
   {
      points[point][0] = value;
   }

   //-----------------------------------------------------------------
   //  Return x coordinate of a point.
   //  Point should be 0 to 2.
   //-----------------------------------------------------------------   
   public int getX( int point )
   {
      return points[point][0];
   }
   
   //-----------------------------------------------------------------
   //  Save y coordinate of a point.
   //  Point should be 0 to 2.
   //-----------------------------------------------------------------   
   public void setY( int point, int value )
   {
      points[point][1] = value;
   }
   
   //-----------------------------------------------------------------
   //  Return y coordinate of a point.
   //  Point should be 0 to 2.
   //-----------------------------------------------------------------   
   public int getY( int point )
   {
      return points[point][1];
   }
   
   //-----------------------------------------------------------------
   //  Return y coordinate of a point.
   //  Point should be 0 to 2.
   //-----------------------------------------------------------------   
   public double getArea()
   {
      double s;
      double[] distance = new double[3];
      
      if( updated )
      {
         //if( getX( 0 ) != null && getY( 0 ) != null && getX( 1 ) != null && 
         //   getY( 1 ) != null && getX( 2 ) != null && getY( 2 ) != null )
         //{
            distance[0] = Math.sqrt( Math.pow( getX( 1 ) - getX( 0 ), 2 ) + 
                                    Math.pow( getY( 1 ) - getY( 0 ), 2 ) );
            distance[1] = Math.sqrt( Math.pow( getX( 2 ) - getX( 1 ), 2 ) + 
                                    Math.pow( getY( 2 ) - getY( 1 ), 2 ) );
            distance[2] = Math.sqrt( Math.pow( getX( 0 ) - getX( 2 ), 2 ) + 
                                    Math.pow( getY( 0 ) - getY( 2 ), 2 ) );
            s = ( distance[0] + distance[1] + distance[2] ) / 2;
            area = Math.sqrt( s * ( s - distance[0] ) * ( s - distance[1] ) * 
                             ( s - distance[2] ) );
            updated = false;
         //}
         //else
         //{
            // throw error; not all points have coordinates set
         //}
      }
       
      return area;
   }
   
   //-----------------------------------------------------------------
   //  Requests and returns a valid decimal number.
   //-----------------------------------------------------------------   
   public int getCoord( )
   {
      int number = 0;
      Scanner in = new Scanner(System.in);
      boolean notvalid = true;
      
      while( notvalid )
      {
         if( in.hasNextInt() )
         {
            number = in.nextInt();
            notvalid = false;
         }
         else
         {
            in.next();
            System.out.println( "That's not a valid coordinate. Please " + 
                               "enter a whole number." );
            notvalid = true;
         }
      }
      
      in.close();
      return number;
   }   
   
   //-----------------------------------------------------------------
   //  Requests three coordinates representing the points of a 
   //  triangle then prints the area of that triangle.
   //-----------------------------------------------------------------
   public static void main( String[] args )
   {
      String[] coordName = new String[]{"first", "second", "third"};
      
      Triangle me = new Triangle();
      
      for( int i = 0; i < 3; i++ )
      {
         System.out.println( "Enter the " + coordName[i] + 
                            " x-y coordinate values:");
         me.setX( i, me.getCoord() );
         me.setY( i, me.getCoord() );
      }
      
      System.out.println( "The triangle (" + me.getX( 0 ) + "," + me.getY( 0 ) +
                         "), (" + me.getX( 1 ) + "," + me.getY( 1 ) +
                         "), (" + me.getX( 1 ) + "," + me.getY( 1 ) + 
                         ") has the following area: " + me.getArea() );
   }
}