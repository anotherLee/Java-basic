/**
 * 线程操作的方法
 * 1、public Thread(Runnable target) 构造
 * 2、public Thread(Runnable target, String name) 构造
 * 3、public Thread(String name) 构造，实例化 Thread 对象，并设置线程名称
 * 4、public static Thread currentThread() 普通，获取当前正在执行的线程
 * 5、public final String getName() 普通，返回线程名称
 * 6、public final int getPriority() 普通，返回线程优先级
 * 7、public boolean isInterrupted() 普通，判断目前线程是否被中断
 * 8、public boolean isAlive() 判断线程是否在活动
 * 9、public final void join() throws InterruptedException 等待线程死亡
 * 10、public final synchronized void join(Long millis) throws InterruptedException 等待 millis 毫秒后线程死亡
 * 11、public void run()
 * 12、public final void setName(String name) 设定线程名称
 * 13、public final void setPriority(int newPriority) 设定线程优先值
 * 14、public static void sleep(long millis) throws InterruptedException 让当前线程休眠 millis 毫秒
 * 15、public void start()
 * 16、public String toString()
 * 17、public static void yield() 将目前正在执行的线程暂停，允许其它线程执行
 * 18、public final void setDaemon(boolean on) 将一个线程设置成后台运行
 */
public class E_demo {
  public static void main(String[] args) {
    
  }
}
