/**
 * super 和 this：
 * 1. this 访问本类中的属性或者方法，如果没有就从父类找；super 直接访问父类属性或者方法
 * 2. this 调用本类构造方法，必须放在首行；super 调用父类构造，必须放在子类构造第一行
 * 3. this 还可以表示当前对象，super 则无此概念
 */

public class D_demo {
  public static void main(String[] args) {
    String s = new Student("小明", "上官小学").info();
    System.out.println(s);
  }
}

class Person {
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
  public String info() {
    return "学生：" + name;
  }
}

class Student extends Person {
  private String school;
  public Student(String name, String school) {
    super(name); // 看这里
    this.school = school;
  }
  public String getSchool() {
    return school;
  }
  public void setSchool(String school) {
    this.school = school;
  }
  @Override
  public String info() { // 重写
    String f = super.info();
    return f + "，学校：" + this.school;
  }
}