/**
 * 中断线程
 */
public class J_demo {
  public static void main(String[] args) {
    MyThread mt = new MyThread();
    Thread t = new Thread(mt, "李明儒");
    t.start();
    try {
      Thread.sleep(2000);
      t.interrupt();
    } catch (Exception e) {

    }
  }
}

class MyThread implements Runnable {
  public void run() {
    System.out.println("1、进入 run 方法");
    try {
      Thread.sleep(10000);
      System.out.println("2、休眠结束");
    } catch (Exception e) {
      System.out.println("3、休眠被中断");
      return;
    }
    System.out.println("4、run方法正常结束");
  }
}
