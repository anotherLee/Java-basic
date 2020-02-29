/**
 * 接口之间可以继承，还可以多继承
 */
public class I_demo {
  public static void main(String[] args) {
    X x = new X();
    x.printA();
    x.printB();
    x.printC();
  }
}

interface A {
  String AUTHOR = "张三";
  void printA();
}
interface B {
  void printB();
}
interface C extends A,B {
  void printC();
}

class X implements C {
  public void printA() {
    System.out.println("print a");
  }
  public void printB() {
    System.out.println("print b");
  }
  public void printC() {
    System.out.println("print c");
  }
}
