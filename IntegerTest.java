import java.util.Scanner;

public class IntegerTest
{
   public static void main(String[] args)
   {
      String in;
      Scanner scan = new Scanner(System.in);

      System.out.print("Please enter an integer: ");
      in = scan.nextLine();
      
      // Add 1 to the number just read in and then display the value.
      // For example, if 56 is read in, display 57.
      System.out.println(in + 1);
      
      scan.close();

   }
}