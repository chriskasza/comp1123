//********************************************************************
//  GradStudent.java
//  
//  Basic class defining an individual student, extends Person class
//********************************************************************

public class GradStudent extends Student {
   private String advisor;
   
   // Constructor
   public GradStudent (String n, int a, String d, String ad) {
      super(n, a, d);
      //year = y;
      advisor = ad;
   }   

   public String getAdvisor() {
      return advisor;
   }
   
   public void setAdvisor (String a) {
      advisor = a;
   }
   
   // Return info about this grad student
   public String toString() {
      // this.getName() doesn't work but super.getName() does
      return getName() + " is a grad student and " + advisor + " is her/his advisor";
   }
}