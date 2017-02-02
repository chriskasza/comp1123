public class Tester
{  
  public static void main (String[] args)
   {
    Dog peggy = new Dog(8,"Peggy");
    Human joe = new Human(21,"Joe");     
    Furniture table = new Furniture(120,"Granma's table");
    
    System.out.println(peggy);
    if (CompareAge.older(peggy,joe))
      System.out.println("is older than");
    else
      System.out.println("is not older than");
    System.out.println(joe);
    System.out.println();
    
    System.out.println(peggy);
    if (CompareAge.older(peggy,table))
      System.out.println("is older than");
    else
      System.out.println("is not older than");
    System.out.println(table);
    System.out.println();
    
    System.out.println(joe);
    if (CompareAge.older(joe,table))
      System.out.println("is older than");
    else
      System.out.println("is not older than");
    System.out.println(table);
    System.out.println();
  }
}