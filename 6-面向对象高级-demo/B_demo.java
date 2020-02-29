
/**
 * 子类实例化过程中，会先构造父类，再构造子类
 */
public class B_demo {
  public static void main(String[] args) {
    Student s = new Student("儿子", 2);
    System.out.println(s.getName());
  }
}

class Person {
  private String name = "xxx";
  private int age;

  public Person(String name, int age) {
    System.out.println("父类构造");
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return age;
  }
}

class Student extends Person {
  private String school;

  public Student(String name, int age) {
    super(name, age);
    System.out.println("子类构造");
    this.setName("yyyy");
  }

  public String getSchool() {
    return school;
  }
  
  public void setSchool(String school) {
    this.school = school;
  }
}