/**
 * throw 和 throws
 * 1. throws 在方法上使用，声明异常，调用此方法时要做异常处理，如果不处理，调用者就需要在它的方法上也声明
 * 2. throw 则直接抛一个异常，但是它不会直接抛一个新的异常实例，而是抛一个已经产生的异常实例
 */
public class D_demo {
  public static void main(String[] args) {
    Math m = new Math();
    try {
      int res = m.div(10, 0);
      System.out.println(res);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("-----------");

    try {
      throw new Exception("自己抛出的异常");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class Math {
  public int div(int i, int j) throws Exception {
    return i/j;
  }
}

