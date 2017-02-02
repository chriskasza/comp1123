public class SwitchExample
{
  public static void main(String[] args)
  {
    char option = 'A';
    
    switch (option)
    {
      case 'A':
        System.out.println("A");
        break;
      case 'B':
        System.out.println("B");
        break;
      case 'C':
        System.out.println("C");
        System.out.println("This is the last case...");
    }
    
    System.out.println("End of program.");
  }
}
  