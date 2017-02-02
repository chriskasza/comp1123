import java.util.Scanner;

public class StringExercise
{
   public static void main(String[] args)
   {
      String message, firstCharacter, lastCharacter, firstHalf, lastHalf;
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter a line of text containing at least " +
                         "3 characters:");
      message = scan.nextLine();
      
      firstCharacter = message.substring( 0, 1 );
      lastCharacter = message.substring( message.length() - 1, message.length() );
      firstHalf = message.substring( 0, message.length()/2 );
      lastHalf = message.substring( message.length()/2 );
      
      System.out.println("The first character is: " + firstCharacter);
      System.out.println("The last character is: " + lastCharacter);
      System.out.println("The first half is: " + firstHalf);
      System.out.println("The last half is: " + lastHalf);

      scan.close();
   }
}