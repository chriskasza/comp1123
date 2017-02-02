
public class Midterm1Q2
{
   //-----------------------------------------------------------------
   //  Creates and exercises some Counter objects.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      System.out.println( computeZ(3,2) );
   }
   
   public static int computeZ(int x, int y){
      int z = (int)(Math.sqrt( Math.pow( x, 2) + Math.pow(y, 2)));
      return z;
   }
}
