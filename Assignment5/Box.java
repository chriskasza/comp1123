//********************************************************************
//  Box.java       Author: Chris Kasza, 100133723
//  
//  Assignment 5 Q3 - COMP 1123 A2
//  
//  Box class representing a box
//  instance data: height, width, depth (int); full (boolean)
//  constructor: accept and initialize h, w, d; full = false
//  get/set methods for all instance data
//  toString: two line description of box
//********************************************************************

public class Box
{
   private int height, width, depth; // height, width, and depth of the box
   boolean full;                     // whether the box is full or not
   
   //-----------------------------------------------------------------
   //  Constructor; initializes the dimension variables of box
   //-----------------------------------------------------------------
   public Box( int h, int w, int d )
   {
      height = h;
      width = w;
      depth = d;
      full = false;
   }

   //-----------------------------------------------------------------
   //  Overload constructor for if no dimensions provided
   //-----------------------------------------------------------------
   public Box()
   {
      height = 1;
      width = 1;
      depth = 1;
      full = false;
   }
   
   //-----------------------------------------------------------------
   //  returns the height variable
   //-----------------------------------------------------------------
   public int getHeight()
   {
      return height;
   }
   
   //-----------------------------------------------------------------
   //  updates the height variable to the value passed to the method
   //-----------------------------------------------------------------
   public void setHeight( int h )
   {
      height = h;
   }
   
   //-----------------------------------------------------------------
   //  returns the width variable
   //-----------------------------------------------------------------
   public int getWidth()
   {
      return width;
   }
   
   //-----------------------------------------------------------------
   //  updates the width variable to the value passed to the method
   //-----------------------------------------------------------------
   public void setWidth( int w )
   {
      width = w;
   }
   
   //-----------------------------------------------------------------
   //  returns the depth variable
   //-----------------------------------------------------------------
   public int getDepth()
   {
      return depth;
   }
   
   //-----------------------------------------------------------------
   //  updates the depth variable to the value passed to the method
   //-----------------------------------------------------------------
   public void setDepth( int d )
   {
      depth = d;
   }
   
   //-----------------------------------------------------------------
   //  returns whether box is full or not
   //-----------------------------------------------------------------
   public boolean isFull()
   {
      return full;
   }
   
   //-----------------------------------------------------------------
   //  updates the depth variable to the value passed to the method
   //-----------------------------------------------------------------
   public void setFull( boolean f )
   {
      full = f;
   }
   
   //-----------------------------------------------------------------
   //  return a description of the box
   //-----------------------------------------------------------------
   public String toString()
   {
      String desc;
      
      desc = "Box size: " + height + " H x " +
            width + " W x " + depth + " D\n" +
            "This box is" + ( full ? " " : " not " ) + "full.";

      return desc;
   }
}
