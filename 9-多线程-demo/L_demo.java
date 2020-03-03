/**
 * 设置线程优先级
 * 线程优先级有三个常量：public static final int MIN_PRIORITY, public static final int NORM_PRIORITY, public static final int MAX_PRIORITY
 * 注意，并非优先级越高就越会被先执行，都是由CPU调度决定
 */
public class L_demo {
  public static void main(String[] args) {
    MyThread mt = new MyThread();
    Thread t1 = new Thread(mt, "线程A");
    Thread t2 = new Thread(mt, "线程B");
    Thread t3 = new Thread(mt, "线程C");
    t1.start();
    t2.start();
    t3.start();
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.NORM_PRIORITY);
    t3.setPriority(Thread.MAX_PRIORITY);
  }
}

class MyThread implements Runnable {
  public void run() {
    for (int i=0; i<5; ++i) {
      try {
        Thread.sleep(500);
      } catch (Exception e) {
      }
      System.out.println(Thread.currentThread().getName() + "在运行，i=" + i);
    }
  }
}