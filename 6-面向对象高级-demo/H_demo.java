/**
 * 接口：由全局常量和公共抽象方法组成
 * 1. 常量默认是 public static final
 * 2. 抽象方法默认是 public abstract
 * 3. 一个类如果实现多个接口，需要重写全部的抽象方法
 */
public class H_demo {
  public static void main(String[] args) {
    B b = new B();
    b.print();
    b.getInfo();
  }
}

interface A {
  String AUTHOR = "李明儒";
  void print();
  void getInfo();
}

class B implements A {
  public void print() {
    System.out.println(AUTHOR);
  }
  public void getInfo() {
    System.out.println(AUTHOR);
  }
}
