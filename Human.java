public class Human implements Age
{
  private int age;
  private String name;
  
  public Human(int y, String n)
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
    return age;
  }
  
  public boolean antique()
  {
    return (age>80);
  }
  
  public String toString()
  {
    return "Human: " + name + " Age: " + age + " Antique? " + antique();
  }
}