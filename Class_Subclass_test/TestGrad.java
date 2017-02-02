public class TestGrad
{
  public static void main(String[] args)
  {
    GradStudent obj1 = new GradStudent("george", 13, "Doogie Med", "Doogie Houser");
    
    System.out.println("\n Initial value:");
    System.out.println(obj1);
    
    System.out.println(obj1.getName() + " is " + obj1.getAge() + " years old");
  }
}
  