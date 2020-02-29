/**
 * 工厂模式：使用最多的一种模式
 * 注意：方法中的局部变量是没有默认值的。
 */
public class M_demo {
  public static void main(String[] args) {
    Fruit apple = Factory.getIntance("apple");
    apple.eat();
    Fruit orange = Factory.getIntance("orange");
    orange.eat();
  }
}

interface Fruit {
  void eat();
}

class Apple implements Fruit {
  public void eat() {
    System.out.println("吃苹果！");
  }
}

class Orange implements Fruit {
  public void eat() {
    System.out.println("吃橙子！");
  }
}

class Factory {
  public static Fruit getIntance(String className) {
    Fruit f = null;
    if ("apple".equals(className)) {
      f = new Apple();
    }
    if ("orange".equals(className)) {
      f = new Orange();
    }
    return f;
  }
}

