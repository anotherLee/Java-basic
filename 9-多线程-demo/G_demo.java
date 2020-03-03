/**
 * 判断线程是否启动：start() 方法执行之后就已经启动处于就绪状态了，通过 isAlive()
 * 以下代码运行的结果是不确定的
 */
public class G_demo {
  public static void main(String[] args) {
    MyThread mt = new MyThread();
    Thread t = new Thread(mt, "李明儒");
    System.out.println("线程启动之前: " + t.isAlive());
    t.start();
    System.out.println("线程启动之后：" + t.isAlive());

    for (int i=0; i<5; ++i) {
      System.out.println("main线程运行 -->" + i);
    }
    System.out.println("代码执行之后" + t.isAlive());
  }
}

class MyThread implements Runnable {
  public void run() {
    for (int i=0; i<5; ++i) {
      System.out.println(Thread.currentThread().getName() + "运行，i=" + i);
    }
  }
}