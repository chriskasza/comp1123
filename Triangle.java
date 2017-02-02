public class Triangle
{
  public int computeZ(int x, int y)
  {
    // code will not compile if the casting is missing
    return (int) Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
  }
}