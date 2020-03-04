/**
 * 停止线程，可以使用标志位的方式来结束运行
 */
public class T_demo {
  public static void main(String[] args) {
    MyThread my = new MyThread();
    Thread t = new Thread(my);
    t.start();
    try {
      Thread.sleep(3000);
    } catch (Exception e) {}
    my.stop();
  }
}

class MyThread implements Runnable {
  private boolean flag = true;
  public void run() {
    while (this.flag) {      
      try {
        Thread.sleep(100);
      } catch(Exception e) {}
      System.out.println(Thread.currentThread().getName() + "正在运行....");
    }
  }
  public void stop() {
    this.flag = false;
  }
}
