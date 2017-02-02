public class ReadingCourse
{
  Student s1,s2,s3;
  String prof;
  
  public ReadingCourse(String n1, int id1, int numC1,
                       String n2, int id2, int numC2,
                       String n3, int id3, int numC3,
                       String professor)
  {
    s1 = new Student(n1,id1,numC1);
    s2 = new Student(n2,id2,numC2);
    s3 = new Student(n3,id3,numC3);
    prof = professor;
  }
  
  public String getProf()
  {
    return prof;
  }
  
  public String toString()
  {
    return "Class List: \n\n" + s1 + "\n" + s2 + "\n" + s3;
  }
}