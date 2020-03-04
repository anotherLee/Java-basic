/**
 * 生产者消费者：等待、唤醒
 * 注意：wait() 方法会让出当前线程执行权
 */
public class S_demo {
  public static void main(String[] args) {
    Info i = new Info();
    Producer p = new Producer(i);
    Consumer c = new Consumer(i);
    new Thread(p).start();
    new Thread(c).start();
  }
}

class Info {
  private String name;
  private String content;
  private boolean flag = true;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  public synchronized void get() {
    if (this.flag) {
      try {
        super.wait();
      } catch(Exception e) {}
    }
    try {
      Thread.sleep(100);
    } catch(Exception e) {}
    System.out.println(this.getName() + " ---> " + this.getContent());
    flag = true;
    super.notify();
  }

  public synchronized void set(String name, String content) {
    if (!this.flag) {
      try {
        super.wait();
      } catch(Exception e) {}
    }
    this.setName(name);
    try {
      Thread.sleep(100);
    } catch(Exception e) {}
    this.setContent(content);
    flag = false;
    super.notify();
  }
}

class Producer implements Runnable {
  private Info info;
  public Producer(Info info) {
    this.info = info;
  }
  public void run() {
    boolean flag = true;
    for (int i=0; i<50; ++i) {
      if (flag) {
        this.info.set("李明儒", "在家");
        flag = false;
      } else {
        this.info.set("王丽", "在公司");
        flag = true;
      }
    }
  }
}

class Consumer implements Runnable {
  private Info info;
  public Consumer(Info info) {
    this.info = info;
  }

  public void run() {
    for (int i=0; i<50; ++i) {
      this.info.get();
    }
  }
}
