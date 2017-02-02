//********************************************************************
//  Palindrome.java       Author: Chris Kasza, 100133723
//  
//  Assignment 8 Q1 - COMP 1123 A2
//  
//  Palindrome class that will read in a text file and check if the 
//  alpha characters equate to a palindrome.  The class case 
//  insensitive and ignores non-alpha characters.
//********************************************************************

import java.util.Scanner;
import java.io.*;

public class PalindromeText
{
   //-----------------------------------------------------------------
   //  Tests strings to see if file is a palindrome.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      int left, right;
      String filename, contents = "";
      File file;
      Scanner fileScan;
      Scanner scan = new Scanner(System.in);
      boolean emptyFile = true;
      
      while( emptyFile == true )
      {
         System.out.println( "Enter a file name: " );
         filename = scan.nextLine();
         
         try
         {  
            file = new File( filename );
            
            if( !( isBinaryFile( file ) ) )
            {
               fileScan = new Scanner( file );
               
               //if( ( contents = fileScan.useDelimiter( "\\Z" ).next() ).isEmpty() )
               if( fileScan.hasNext() )
               {
                  contents = fileScan.useDelimiter( "\\Z" ).next();
                  emptyFile = false;
               }
               else
               {
                  System.out.println( "Empty files aren't palindromes, " +
                                     "silly.\nPhilosophical question: \"If a " +
                                     "String object is declared in the woods " +
                                     "and nobody is around to initialize it, " +
                                     "is it really a string?\"\n" );               
               }
            }
            else
            {
               System.out.println( "Your file appears to be binary; not text." +
                                  "  Try entering a text file instead.\n");
            }
         }
         catch( FileNotFoundException e )
         {
            e.printStackTrace();
         }
         catch( IOException e )
         {
            e.printStackTrace();
         }
      }
         //System.out.println( contents );
         
      left = -1;
      right = contents.length();
      
      do
      {
         left++;
         right--;
         
         while( contents.toLowerCase().charAt( left ) < 97 || 
               contents.toLowerCase().charAt( left ) > 122 )
         {
            /*System.out.println("Skipping character #" + left + 
             " with value \"" + 
             contents.toLowerCase().charAt( left ) +
             "\"" );*/
            left++;
         }
         
         while( contents.toLowerCase().charAt( right ) < 97 || 
               contents.toLowerCase().charAt( right ) > 122 )
         {
            /*System.out.println("Skipping character #" + right + 
             " with value \"" + 
             contents.toLowerCase().charAt( right ) +
             "\"" );*/
            right--;
         }
         /*System.out.println("comparing left, " + 
          contents.toLowerCase().charAt(left) + 
          ", with right, " + 
          contents.toLowerCase().charAt(right) );*/
         
      } while (contents.toLowerCase().charAt(left) == 
               contents.toLowerCase().charAt(right) && left < right);
      
      System.out.println();
      
      if (left < right)
      {
         System.out.println("That string is NOT a palindrome.");
      }
      else
      {
         System.out.println("That string IS a palindrome.");
      }
   }
   
   // code borrowed from http://stackoverflow.com/questions/620993/
   //                           determining-binary-text-file-type-in-java
   // Guess whether given file is binary. Just checks for anything under 0x09.
   public static boolean isBinaryFile( File f ) 
      throws FileNotFoundException, IOException 
   {
      FileInputStream in = new FileInputStream(f);
      int size = in.available();
      if(size > 1024) size = 1024;
      byte[] data = new byte[size];
      in.read(data);
      in.close();
      
      int ascii = 0;
      int other = 0;
      
      for(int i = 0; i < data.length; i++) {
         byte b = data[i];
         if( b < 0x09 ) return true;
         
         if( b == 0x09 || b == 0x0A || b == 0x0C || b == 0x0D ) ascii++;
         else if( b >= 0x20  &&  b <= 0x7E ) ascii++;
         else other++;
      }
      
      if( other == 0 ) return false;
      
      return 100 * other / (ascii + other) > 95;
   }
}