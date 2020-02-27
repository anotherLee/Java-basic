
/**
 * 比较两个对象是否相等
 */
public class J_demo {
  public static void main(String[] args) {
    Person p1 = new Person("张三", 22);
    Person p2 = new Person("张三", 22);
    System.out.println(p1.equals(p2));
  }
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.setName(name);
    this.setAge(age);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o.getClass() == this.getClass()) {
      Person p = (Person)o;
      if (this.name.equals(p.getName()) && this.age == p.getAge()) {
        return true;
      }
      return false;
    } else {
      return false;
    }
  }
}