public class Dog implements Age
{
  private int age;
  private String name;
  
  public Dog(int y, String n)
  {
    age = y;
    name = n;
  }
  
  public void setAge (int years)
  {
    age = years;
  }
  
  public int getAge()
  {
    // return the age in human years
    return age * Age.DOG_YEARS;  //Could also refer to the constant without Age
  }
  
  public int getDogAge()
  {
    return age;
  }
  
  public boolean antique()
  {
    return (age>15);
  }
  
  public String toString()
  {
    return "Dog: " + name + " Age: " + getDogAge() + " Antique? " + antique();
  }
}