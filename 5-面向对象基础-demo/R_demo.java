
/**
 * 从外部访问内部类，要特别注意其访问格式和步骤
 */
public class R_demo {
  public static void main(String[] args) {
    Outer o = new Outer();
    Outer.Inner i = o.new Inner();
    i.print();
  }
}

class Outer {
  private String info = "Hello world";
  class Inner {
    public void print() {
      System.out.println(info);
    }
  }
}