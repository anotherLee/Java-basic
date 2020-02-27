
/**
 * 内部类，内部类唯一的好处就是可以访问外部类中的私有属性
 */

public class P_demo {
  public static void main(String[] args) {
    new Outer().fun();
  }
}

class Outer {
  private String info = "hello world！";

  class Inner {
    public void print() {
      System.out.println(info);
    }
  }

  public void fun() {
    new Inner().print();
  }
}