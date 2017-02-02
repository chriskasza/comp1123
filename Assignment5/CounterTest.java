//********************************************************************
//  CounterTest.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 4.1
//********************************************************************

public class CounterTest
{
   //-----------------------------------------------------------------
   //  Creates and exercises some Counter objects.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      Counter c1 = new Counter();
      Counter c2 = new Counter();

      System.out.println("Counter 1: " + c1.getCount() +
         "    Counter 2: " + c2.getCount());

      c1.click();
      c1.click();
      c1.click();
      c1.click();
      c1.click();

      c2.click();
      c2.click();
      c2.click();

      System.out.println("Counter 1: " + c1.getCount() +
         "    Counter 2: " + c2.getCount());

      c1.reset();

      System.out.println("Counter 1: " + c1.getCount() +
         "    Counter 2: " + c2.getCount());
   }
}
