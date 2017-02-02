public class TestIncrementable
{
  public static void main(String[] args)
  {
    Incrementable obj1, obj2;
    
    obj1 = new IncChar('A');
    obj2 = new IncInt(0);
    
    System.out.println("\n Initial values:");
    System.out.println(obj1);
    System.out.println(obj2);
    
    obj1.inc();
    obj2.inc();
    
    System.out.println("\n After incrementing once:");
    System.out.println(obj1);
    System.out.println(obj2);
    
    obj1.reset();
    obj2.reset();
    
    System.out.println("\n After doing a reset:");
    System.out.println(obj1);
    System.out.println(obj2);
        
    obj1.inc(5);
    obj2.inc(5);
    
    System.out.println("\n Incrementing 5 times:");
    System.out.println(obj1);
    System.out.println(obj2);
    
    System.out.println();
    System.out.println("Is obj2 odd? " + ((IncInt) obj2).odd());
  }
}
  