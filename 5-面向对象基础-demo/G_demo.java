
/**
 * 接收本类引用，可以访问本类的私有属性
 */
public class G_demo {
  public static void main(String[] args) {
    Demo d1 = new Demo();
    Demo d2 = new Demo();
    d1.setTemp(50);
    d2.setTemp(100);
    d1.fun(d2);
    System.out.println(d2.getTemp()); 
  }

}

class Demo {
  private int temp = 30;

  public void fun(Demo d) {
    d.temp = 50;
  }

  public int getTemp() {
    return temp;
  }

  public void setTemp(int temp) {
    this.temp = temp;
  }
}