//********************************************************************
//  Race.java       Author: Chris Kasza, 100133723
//  
//  Assignment 9 Q2 - COMP 1123 A2
//  
//  Flip a coin X times until heads appears 10,000 times or tails does
//********************************************************************

public class Race
{  
   //-----------------------------------------------------------------
   //  Program jumping off point
   //-----------------------------------------------------------------
   public static void main(String[] args) {
      boolean winner = false;
      Coin coin = new Coin();
      int heads = 0;
      int tails = 0;
      
      while (winner == false) {
         if (coin.toString() == "Heads") {
            heads++;
         } else {
            tails++;
         }
         
         if (heads == 10000 || tails == 10000) {
            System.out.println("Heads: " + heads);
            System.out.println("Tails: " + tails);
            winner = true;
         } else {
            coin.flip();
         }
      }
   }
}