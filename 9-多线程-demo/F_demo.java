/**
 * 1、获取和设置线程名称，没有的设置的话会给一个默认的
 * 2、默认的格式是 Thread-0 Thread-1，可以看出 Thread 类一定有一个 static 的属性用于为线程自动命名
 */
public class F_demo {
  public static void main(String[] args) {
    MyThread mt = new MyThread();
    new Thread(mt).start();
    new Thread(mt, "线程-A").start();
    new Thread(mt, "线程-B").start();
    new Thread(mt).start();
    new Thread(mt).start();
  }
}

class MyThread implements Runnable{
  public void run() {
    for (int i=0; i<3; ++i) {
      System.out.println(Thread.currentThread().getName() + "运行，i=" + i);
    }
  }
}