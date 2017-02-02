//********************************************************************
//  Student.java
//  
//  Basic class defining an individual student, extends Person class
//********************************************************************

public class Student extends Person {
   //private int year;
   private String degree;
   
   // Constructor
   public Student (String n, int a, String d) {
      super(n, a);
      //year = y;
      degree = d;
   }   

   public String getDegree() {
      return degree;
   }
   
   public void setDegree (String d) {
      degree = d;
   }
   
   // Return info about this student
   public String toString() {
      return super.toString() + " Degree: " + degree;
   }
}