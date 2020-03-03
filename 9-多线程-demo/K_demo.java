/**
 * 设置为后台执行，即使是死循环，依然会执行完
 */
public class K_demo {
  public static void main(String[] args) {
    MyThread mt = new MyThread();
    Thread t = new Thread(mt, "李明儒");
    t.setDaemon(true);
    t.start();
    for (int i=0; i<10; ++i) {
      System.out.println(Thread.currentThread().getName() + "运行，i=" + i);
    }
  }
}

class MyThread implements Runnable {
  public void run() {
    while(true) {
      System.out.println(Thread.currentThread().getName() + "在运行...");
    }
  }
}