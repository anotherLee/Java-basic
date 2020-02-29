/**
 * 1. 子类覆写父类，权限要大于等于父类
 * 2. 可以在覆写的方法中用 super 调用被覆写的方法
 * 3. 父类 private 修饰的方法不能被覆写
 * 4. 重写和重载的区别：名称、参数、返回值，是否在一个类中，权限要求
 */
public class C_demo {
  public static void main(String[] args) {
    new Student().print();
    System.out.println("--------");
    new Student().usePrint2();
    new Student().print2();
  }
}

class Person {
  void print() {
    System.out.println("父类 print");
  }
  private void print2() {
    System.out.println("父类 print2");
  }
  public void usePrint2() {
    this.print2();
  }
}

class Student extends Person {
  public void print2() { // 这个方法并不是对于父类方法的覆写，因为父类是 private 的
    System.out.println("子类 print2");
  }
  public void print() {
    super.print();
    System.out.println("子类 print");
  }
}