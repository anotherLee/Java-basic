
public class B_demo {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("张三");
    p.setAge(-1);
    p.tell();
  }
}

class Person {
  private String name;
  private int age;

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
    if (age < 0) {
      this.age = 0;
    } else {
      this.age = age;
    }
  }

  public void tell() {
    System.out.println("姓名：" + name + "，年龄：" + age);
  }
}