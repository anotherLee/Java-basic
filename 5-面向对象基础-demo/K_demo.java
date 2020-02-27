
/**
 * static 关键字：
 * 1. static 标记的属性被所有对象共享
 * 2. static 标记的方法被类调用
 * 3. 非 static 方法可以调用 static 方法、使用 static 属性，反之则不行
 * 
 * Java 中的内存：
 * 1. 栈内存空间：保存所有对象名称
 * 2. 堆内存空间：保存每个对象的具体属性内容
 * 3. 全局数据区：保存 static 类型的属性
 * 4. 全局代码区：保存所有方法定义
 */
public class K_demo {
  public static void main(String[] args) {
    Person p1 = new Person("张三", 30);
    Person p2 = new Person("李四", 31);
    p1.printInfo();
    p2.printInfo();
    Person.setCountry("R城");
    p1.printInfo();
    p2.printInfo();
  }
}

class Person {
  private String name;
  private int age;
  private static String country = "P城";

  Person(String name, int age) {
    this.setName(name);
    this.setAge(age);
  }

  public static void setCountry(String country) {
    Person.country = country;
  }

  public static String getCountry() {
    return country;
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

  public void printInfo() {
    System.out.println(name + "，" + age + "，住在" + country);
  }
}



