/**
 * 抽象类：
 * 1. 包含抽象方法类必须是抽象类
 * 2. 抽象方法和抽象类都需用 abstract 申明
 * 3. 抽象方法只须申明，不用实现
 * 4. 抽象类必须被子类继承，子类必须重写全部的抽象方法
 * 5. 抽象方法不要用 private，用了子类无法重写
 */
public class G_demo {
  public static void main(String[] args) {
    new B().print();
  }
}

abstract class A {
  public static final String COUNTRY = "CHINA";
  private String name = "李明儒";
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public abstract void print();
}

class B extends A {
  public void print() {
    System.out.println("姓名：" + super.getName());
  }
}

