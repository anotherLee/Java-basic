/**
 * 接口应用
 */
public class L_demo {
  public static void main(String[] args) {
    Computer.plugin(new Print());
    Computer.plugin(new U());
  }
}

class Computer {
  public static void plugin(USB usb) {
    usb.start();
    System.out.println("USB 设备开始工作了");
    usb.stop();
  }
}

interface USB {
  void start();
  void stop();
}

class Print implements USB {
  public void start() {
    System.out.println("打印机开始工作了！");
  }
  public void stop() {
    System.out.println("打印机停止工作了！");
  }
}

class U implements USB {
  public void start() {
    System.out.println("U盘开始工作了！");
  }
  public void stop() {
    System.out.println("U盘停止工作了！");
  }
}