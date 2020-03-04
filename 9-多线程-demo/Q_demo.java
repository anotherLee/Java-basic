/**
 * 死锁 demo
 */
public class Q_demo {
  public static void main(String[] args) {
    new Demo().dead();
  }
}

class Demo {
  private Object obj1 = new Object();
  private Object obj2 = new Object();
  public void dead() {
    // Thread t1 = new Thread(new ThreadDeadLock(obj1, obj2, true));
    // Thread t2 = new Thread(new ThreadDeadLock(obj1, obj2, false));
    // t1.start();
    // t2.start();

    Thread t1 = new Thread(new Runnable() {
      public void run() {
        synchronized(obj1) {
          try {
            Thread.sleep(500);
          } catch (Exception e) {}
          synchronized(obj2) {

          }
        }
      }
    });

    Thread t2 = new Thread(new Runnable() {
      public void run() {
        synchronized(obj2) {
          try {
            Thread.sleep(500);
          } catch(Exception e) {}
          synchronized(obj1) {

          }
        }
      }
    });
    t1.start();
    t2.start();
  }
}

// 下面这个可以在上面直接写成匿名内部类
class ThreadDeadLock implements Runnable {
  private Object obj1;
  private Object obj2;
  private boolean flag;
  public ThreadDeadLock(Object obj1, Object obj2, boolean flag) {
    this.obj1 = obj1;
    this.obj2 = obj2;
    this.flag = flag;
  }
  public void run() {
    if (flag) {
      synchronized(obj1) {
        try {
          System.out.println("1");
          Thread.sleep(500);
        } catch(Exception e) {}
        synchronized(obj2) {
          System.out.println("true的情况完成");
        }
      }
    } else {
      synchronized(obj2) {
        try {
          System.out.println("1");
          Thread.sleep(500);
        } catch (Exception e) {}
        synchronized(obj1) {
          System.out.println("false的情况完成");
        }
      }
    }
  }
}