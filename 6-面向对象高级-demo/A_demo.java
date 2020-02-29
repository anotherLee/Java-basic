/**
 * 子类不能直接访问父类的私有成员，但可以调用父类中的非私有方法
 */
public class A_demo {
  public static void main(String[] args) {
    new Student().fun();
  }
}

class Person {
  private String name = "xxx";
  private int age;

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
  public void fun() {
    System.out.println("能不能访问？" + getName()); //注意这里
  }
}