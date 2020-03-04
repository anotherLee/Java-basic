/**
 * 生产者消费者，问题部分解决
 */
public class R_demo {
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
    try {
      Thread.sleep(100);
    } catch(Exception e) {}
    System.out.println(this.getName() + " ---> " + this.getContent());
  }

  public synchronized void set(String name, String content) {
    this.setName(name);
    try {
      Thread.sleep(100);
    } catch(Exception e) {}
    this.setContent(content);
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

