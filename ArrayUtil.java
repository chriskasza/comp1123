public class ArrayUtil
{
  public static void setToX(int[] anArray, int x)
  {
    for (int i=0; i<anArray.length; i++)
      anArray[i]=x;
  }
  
  public static int[] createX(int x, int size)
  {
    int[] temp = new int[size];
    setToX(temp,x);
    return temp;
  }
}
