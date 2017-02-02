public class Acadia
{
  public static void main(String[] args)
  {
    Student ralph = new Student("Ralph", 1234, 5);
    
    ReadingCourse java = new ReadingCourse("Billy Bob", 4321, 3,
                                           "Evangeline", 5447, 5,
                                           "Josephine", 6789, 4,
                                           "Yosemite Sam");
    
    System.out.println("The following student:");
    System.out.println();
    System.out.println(ralph);
    System.out.println();
    System.out.println("Is not enrolled in the following reading course "+
                       "taught by " + java.getProf() + ".");
    System.out.println();
    System.out.println(java);
  }
}
      