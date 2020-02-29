
/**
 * 模板模式，利用抽象类和多态
 */
public class K_demo {
  public static void main(String[] args) {
    Person s1 = new Student("张三");
    Person s2 = new Worker("李四");
    s1.say();
    s2.say();
  }
}

abstract class Person {
  private String name;
  public Person(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  abstract void say();
}

class Student extends Person {
  public Student(String name) {
    super(name);
  }
  public void say() {
    String name = super.getName();
    System.out.println(name + "说：他是个学生");
  }
}

class Worker extends Person {
  public Worker(String name) {
    super(name);
  }
  public void say() {
    String name = super.getName();
    System.out.println(name + "说：他是个工人");
  }
}





