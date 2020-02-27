
public class A_demo {
  public static void main(String[] args) {
    Person p = new Person();
    p.name = "张三";
    p.age = 15;
    p.tell();
  }
}

class Person {
  String name;
  int age;

  public void tell() {
    System.out.println("姓名：" + name + "，年龄：" + age);
  }
}