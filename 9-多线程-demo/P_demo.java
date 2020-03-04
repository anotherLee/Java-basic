/**
 * 使用同步方法，解决多线程访问同一资源带来的问题
 */
public class P_demo {
  public static void main(String[] args) {
    MyThread mt = new MyThread();
    Thread t1 = new Thread(mt);
    Thread t2 = new Thread(mt);
    Thread t3 = new Thread(mt);
    t1.start();
    t2.start();
    t3.start();
  }
}

class MyThread implements Runnable {
  private int ticket = 5;
  public void run() {
    for (int i=0; i<50; ++i) {
      sale();
    }
  }
  public synchronized void sale() {
    if (ticket > 0) {
      try {
        Thread.sleep(300);
      } catch (Exception e) {

      }
      System.out.println("卖票：ticket = " + ticket--);
    } 
  }
}