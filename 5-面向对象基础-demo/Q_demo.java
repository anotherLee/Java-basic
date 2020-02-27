
/**
 * 使用 static 定义内部类，它不能访问外部类中的非static 属性
 */
public class Q_demo {
  public static void main(String[] args) {
    new Outer.Inner().print(); // 定义成 static 才能这样 new Outer.Inner()
  }
}

class Outer {
  private static String info = "hello world";
  static class Inner {
    public void print() {
      System.out.println(info);
    }
  }
} 