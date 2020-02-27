/**
 * 构造方法私有化，和单例模式
 */
public class N_demo {
  public static void main(String[] args) {
    Singleton s = Singleton.getInstance();
    s.info();
  }
}

class Singleton {
  private static Singleton s = new Singleton();
  private Singleton() {}
  public static Singleton getInstance() {
    return s;
  }
  public void info() {
    System.out.println("info 输出！");
  }
}