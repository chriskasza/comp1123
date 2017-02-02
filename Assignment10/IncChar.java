//********************************************************************
//  IncChar.java       Author: Chris Kasza, 100133723
//  
//  Assignment 10 Q1 - COMP 1123 A2
//  
//  Counter class for characters
//********************************************************************

public class IncChar implements Incrementable {
   private char c;
   
   // Constructor
   public IncChar(char val) {
      c = val;
   }   

   // Increment the counter once
   public void inc() {
      c++;
   }
   
   // Increment the counter numTimes
   public void inc(int numTimes) {
      for(int j=0; j<numTimes; j++) {
         inc();
      }
   }
   
   // Reset the counter
   public void reset() {
      c = 'a';
   }
   
   // Return info abount counter
   public String toString() {
      return Character.toString(c);
   }
}