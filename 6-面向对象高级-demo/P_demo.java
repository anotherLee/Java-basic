/**
 * 抽象类中定义接口
 * 接口中定义抽象类
 * 抽象类中也可以再定义多个抽象类，接口中也可以定义多个接口
 */
public class P_demo {
  public static void main(String[] args) {
    A.B b = new X().new Y();
    b.printB();

    Z.Zinner inner = new Z().new Zinner();
    inner.printD();
  }
}

abstract class A {
  public abstract void printA();
  interface B {
    public void printB();
  }
}

class X extends A {
  public void printA() {
    System.out.println("这是 x 里的 a");
  }
  class Y implements B {
    public void printB() {
      System.out.println("这是里面的 b");
    }
  }
}

interface C {
  void printC();
  abstract class D {
    public abstract void printD();
  }
}

class Z implements C {
  public void printC() {
    System.out.println("这是Z里面的 print");
  }
  class Zinner extends D {
    public void printD() {
      System.out.println("这是Z里面的Zinner");
    }
  }
}

