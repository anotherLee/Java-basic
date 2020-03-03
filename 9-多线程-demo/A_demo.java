/**
 * 1. 进程与线程：以 Word 为例，当打开Word软件，就是开了一个进程，这个进程里还有许多线程，比如拼写检查，当在写单词的时候，如果单词错误，会划线提示，
 * 这个提示功能就是后台运行的一个线程；当软件关闭，也就是进程关闭，所有的线程也随之关闭
 * 2. 实现多线程的两种手段，一个是继承 Thread 类，一个是实现 Runnable 接口
 * 3. 继承 Thread 类，必须重写 run 方法
 * 4. 实例化之后必须调用 start 方法才能启动线程，直接调用 run 方法并没有启动
 */
public class A_demo {
  public static void main(String[] args) {
    MyThread mt1 = new MyThread("线程A");
    MyThread mt2 = new MyThread("线程B");
    mt1.start();
    mt2.start();
  }
}

class MyThread extends Thread {
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