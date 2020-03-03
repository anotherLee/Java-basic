/**
 * Thread 类和 Runnable 接口：
 * 1、Thread类也实现了 Runnable接口，它里面的 run 方法其实是重写的Runnable接口里面的run方法，很像代理模式
 * 2、Thread类的多线程无法实现资源共享，因为多个接口要 new 多个实例出来；而实现了Runnable接口的类则可以，它只用了一个实例
 * 3、实现Runnable接口的多线程更好：适合多个线程去处理同一资源的情况；可以避免单继承的局限；代码被多个线程共享，代码和数据独立
 */

public class C_demo {
  public static void main(String[] args) {
    MyThread mt = new MyThread();
    new Thread(mt).start();
    new Thread(mt).start();
    new Thread(mt).start();
  }
}

class MyThread implements Runnable {
  private int ticket = 5;
  public void run() {
    for (int i=0; i<100; ++i) {
      if (ticket > 0) {
        System.out.println("卖票，ticket=" + ticket--);
      }
    }
  }
}