/**
 * 线程的礼让，将CPU执行权让给其它线程
 */
public class M_demo {
  public static void main(String[] args) {
    MyThread mt = new MyThread();
    Thread t1 = new Thread(mt, "t1");
    Thread t2 = new Thread(mt, "t2");
    t1.start();
    t2.start();
  }
}

class MyThread implements Runnable {
  public void run() {
    for (int i=0; i<10; ++i) {
      System.out.println(Thread.currentThread().getName() + "在运行，i=" + i);
      if (i == 4) {
        System.out.println("线程礼让");
        Thread.currentThread().yield();
      }
    }
  }
}