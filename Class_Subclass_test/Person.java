//********************************************************************
//  Person.java
//  
//  Basic class defining an individual person
//********************************************************************

public class Person {
   private String name;
   private int age;
   //private Person mother;
   
   // Constructor
   public Person (String n, int a) {
      name = n;
      age = a;
   }
   
   protected String getName() {
      return name;
   }
   
   public void setName (String n) {
      name = n;
   }
   
   public int getAge() {
      return age;
   }
   
   public void setAge (int a) {
      age = a;
   }
   
   // Return info about this person
   public String toString() {
      return "Name: " + name + " Age: " + Integer.toString(age);
   }
}