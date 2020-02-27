
/**
 * 在方法中的内部类不能访问该方法的参数，除非 final
 */
public class S_demo {
  public static void main(String[] args) {
    new Outer().fun(20);
  }
}

class Outer {
  private String info = "Hello world!";
  public void fun(final int n) {
    class Inner {
      public void print() {
        System.out.println(n);
        System.out.println(info);
      }
    }
    new Inner().print();
  }
}

