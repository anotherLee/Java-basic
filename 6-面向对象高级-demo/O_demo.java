/**
 * 适配器模式
 * 如果一个接口定义的抽象方法过多，而具体类不需要这么多方法，这时候就需要一个中间类来过渡，它就是适配器
 */
public class O_demo {
  public static void main(String[] args) {
    Window w = new WindowIml();
    w.open();
    w.close();
  }
}

interface Window {
  void open();
  void close();
  void iconified(); // 最小化
  void deiconified(); // 恢复大小
}

abstract class WindowAdapter implements Window {
  public void open() {}
  public void close() {}
  public void iconified() {}
  public void deiconified() {}
}

class WindowIml extends WindowAdapter {
  public void open() {
    System.out.println("开窗");
  }
  public void close() {
    System.out.println("关窗");
  }
}