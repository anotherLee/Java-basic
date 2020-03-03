/**
 * join() 让一个线程强制运行直到结束，其它线程才能继续运行
 */
public class H_demo {
  public static void main(String[] args) throws Exception{
    MyThread mt = new MyThread();
    Thread t = new Thread(mt);
    t.start();
    for (int i=0; i<50; ++i) {
      if (i > 10) {
        t.join();
      }
      System.out.println("main线程运行，i=" + i);
    }
  }
}

class MyThread implements Runnable {
  public void run() {
    for (int i=0; i<10; ++i) {
      System.out.println(Thread.currentThread().getName() + "运行，i=" + i);
    }
  }
}

