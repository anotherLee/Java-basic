/**
 * 线程的五种状态
 * 1、创建 Thread t = new Thread();
 * 2、就绪 t.start();
 * 3、运行 获取 cpu 资源运行
 * 4、阻塞 如果被人为挂起或执行耗时的IO操作时，将让出 CPU 并暂时中止自己的执行，进入阻塞状态；sleep(); wait(); 阻塞结束后进入就绪状态
 * 5、死亡 stop(); 或者 run() 方法结束后，即死亡
 */
public class D_demo {
  public static void main(String[] args) {
    
  }
}

