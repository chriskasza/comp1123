public class Student
{
  private String name;
  private int id, numCourses;
  
  public Student(String aName, int studId, int aNumCourses)
  {
    name = aName;
    id = studId;
    numCourses = aNumCourses;
  }
  
  public String toString()
  {
    return "Name: " + name + "\nStudent ID: " + id + "\nNumber of courses: " +
      numCourses + "\n";
  }
}