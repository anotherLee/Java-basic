/**
 * 1. 代码块有4种：普通代码块、构造块、静态代码块、同步代码块
 * 2. 在类实例化时，执行优先级为 静态代码块 > 构造块 > 构造方法
 * 3. 在有主方法的类中，静态代码块早于主方法执行
 */
public class M_demo {
  static {
    System.out.println("主方法前的静态块！");
  }
  public static void main(String[] args) {
    new Demo();
    new Demo();
  }
}

class Demo {
  {
    System.out.println("构造块");
  }
  static {
    System.out.println("静态代码块");
  }
  public Demo() {
    System.out.println("构造方法");
  }
}

