/**
 * 线程休眠 Thread.sleep();
 */
public class I_demo {
  public static void main(String[] args) {
    MyThread mt = new MyThread();
    Thread t = new Thread(mt, "李明儒");
    t.start();
  }
}

class MyThread implements Runnable {
  public void run() {
    for (int i=0; i<10; ++i) {
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + "运行，i=" + i);
    }
  }
}