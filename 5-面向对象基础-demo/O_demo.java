
/**
 * 包含对象的数组
 */
public class O_demo {
  public static void main(String[] args) {
    Person[] ps = {
      new Person("张三", 12),
      new Person("李四", 11)
    };

    for (int i=0; i<ps.length; ++i) {
      System.out.println(ps[i].getName() + "，年龄" + ps[i].getAge());
    }
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
  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
}