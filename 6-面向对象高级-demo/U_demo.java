/**
 * 匿名内部类，当一个接口或者抽象类只使用一次时，就可以考虑使用匿名内部类
 */
public class U_demo {
  public static void main(String[] args) {
    new X().fun1();
  }
}

interface A {
  void printInfo();
}

class X {
  public void fun1() {
    this.fun2(new A() {
      public void printInfo() {
        System.out.println("print info");
      }
    });
  }

  public void fun2(A a) {
    a.printInfo();
  }
}

