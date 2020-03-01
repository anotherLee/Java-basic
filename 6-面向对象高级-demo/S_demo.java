/**
 * Object 类的部分方法：equals(), hashCode(), toString()
 * 默认的 toString 是内存地址；equals 是比较内存地址是否相同；
 * 对于一个设计良好的类，最好重写它的 equals、hashCode 和 toString 3个方法
 */
public class S_demo {
  public static void main(String[] args) {
    Person p1 = new Person("张三", 12);
    Person p2 = new Person("张三", 12);
    System.out.println(p1);
    System.out.println(p1.equals(p2));
  }
}

class Person {
  private String name;
  private int age;
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
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

  public String toString() {
    return "姓名:" + this.name + "，年龄：" + this.age;
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj instanceof Person) {
      Person p = (Person)obj;
      if (this.name.equals(p.getName()) && this.age == p.getAge()) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }
}


