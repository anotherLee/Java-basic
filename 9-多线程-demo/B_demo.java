/**
 * 1. 使用 Runnable 接口，它可以避免 Thread 继承的单继承缺点
 * 2. 实现 Runnable 以后依然还要靠 Thread 类来启动线程
 * 3. public Thread(Runnable r); public Thread(Runnable r, String name)
 */
public class B_demo {
  public static void main(String[] args) {
    MyThread mt1 = new MyThread("线程A");
    MyThread mt2 = new MyThread("线程B");
    Thread t1 = new Thread(mt1);
    Thread t2 = new Thread(mt2);
    t1.start();
    t2.start();
  }
}

class MyThread implements Runnable {
  private String name;
  public MyThread(String name) {
    this.name = name;
  }
  public void run() {
    for (int i=0; i<10; ++i) {
      System.out.println(name + "运行，i=" + i);
    }
  }
}