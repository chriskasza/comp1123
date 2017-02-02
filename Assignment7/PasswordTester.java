public class PasswordTester
{
  public static void main(String[] args)
  {
    Password pw = new Password();
    int count = 0;
    
    System.out.println("A short password: " + pw.shortPassword());
    System.out.println("Another short password: " + pw.shortPassword());
    System.out.println();
    
    System.out.println("A long password: " + pw.longPassword());
    System.out.println("Another long password: " + pw.longPassword());
    System.out.println();
    
    System.out.println("Assume I am trying to break into a system which " +
                       "has the password: dog");
    while (!pw.nextPassword().equals("dog"))
      count++;
    System.out.println("It would take me " + count + " guesses to break in.");
    System.out.println();
    
    System.out.print("Total number of possible 3 lower case letter "+
                       "passwords: ");
    count = 0;
    pw.reset();
    while (!pw.nextPassword().equals("???"))
      count++;
    System.out.println(count);
  }
}