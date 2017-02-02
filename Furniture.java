public class Furniture implements Age
{
  private int age;
  private String type;
  
  public Furniture(int y, String t)
  {
    age = y;
    type = t;
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
    return (age>100);
  }
  
  public String toString()
  {
    return "Furniture: " + type + " Age: " + age + " Antique? " + antique();
  }
}