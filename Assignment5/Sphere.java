//********************************************************************
//  Sphere.java       Author: Chris Kasza, 100133723
//  
//  Assignment 5 Q2 - COMP 1123 A2
//  
//  The Sphere class represents a sphere.  For some reason, 
//  there is only one instance variable, diameter.  If we were aiming
//  for efficient code, we would have instance variables for 
//  area and volume as well.  Instead, we will calculate area and 
//  volume each time the getArea and getVolume methods are called.
//  The constructor method accepts a double value and initializes the 
//  diameter variable with the passed value. The getDiameter and 
//  setDiameter methods are available to return and update the 
//  diameter variable. The toString method 
//  returns a description of the sphere. The driver class 
//  MultiSphere is included to demonstrate how to access the Sphere.
//********************************************************************

public class Sphere
{
   private double diameter;   // the diameter of the sphere
   /*
   private double area;       // the surface area of the sphere
   private double volume;     // the volume of the sphere
   private boolean aUpdated;  // save cycles, only recalc if diameter changed
   private boolean vUpdated;  // save cycles, only recalc if diameter changed
   */
   
   //-----------------------------------------------------------------
   //  Constructor; initializes the diameter variable to the value 
   //  passed to the constructor
   //-----------------------------------------------------------------
   public Sphere( double passedDiameter )
   {
      diameter = passedDiameter;
   }

   //-----------------------------------------------------------------
   //  Overload the constructor; if Sphere is called without a value, 
   //  diameter is zero
   //-----------------------------------------------------------------
   public Sphere()
   {
      diameter = 0;
   }
   
   //-----------------------------------------------------------------
   //  returns the diameter variable
   //-----------------------------------------------------------------
   public double getDiameter()
   {
      return diameter;
   }
   
   //-----------------------------------------------------------------
   //  updates the diameter variable to the value passed to the method
   //-----------------------------------------------------------------
   public void setDiameter( double passedDiameter )
   {
      diameter = passedDiameter;
   }
   
   //-----------------------------------------------------------------
   //  overload setDiameter; if no value is passed, set diameter to 0
   //-----------------------------------------------------------------
   public void setDiameter()
   {
      diameter = 0;
   }
   
   //-----------------------------------------------------------------
   //  calculates and returns the surface area
   //-----------------------------------------------------------------
   public double getArea()
   {
      double area;
      
      area = 4 * Math.PI * Math.pow( diameter/2, 2 );
      return area;
   }
   
   //-----------------------------------------------------------------
   //  calculates and returns the volume
   //-----------------------------------------------------------------
   public double getVolume()
   {
      double volume;
      
      volume = ( 4.0 / 3 ) * Math.PI * Math.pow( diameter/2, 3 );
      return volume;
   }
   
   //-----------------------------------------------------------------
   //  return a description of the sphere
   //-----------------------------------------------------------------
   public String toString()
   {
      String desc;
      
      desc = "Sphere diameter: " + diameter + 
         "   volume: " + getVolume() + 
         "   area: " + getArea();

      return desc;
   }
}
