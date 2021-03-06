/**
 * 使用同步代码块来解决多线程访问同一资源带来的问题
 */
public class O_demo {
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
      synchronized(this) {
        if (ticket > 0) {
          try {
            Thread.sleep(300);
          } catch (Exception e) {
            e.printStackTrace();
          }
          System.out.println("卖票，ticket = " + ticket--);
        }
      }
    }
  }
}
