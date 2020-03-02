/**
 * 异常的处理
 */
public class A_demo {
  public static void main(String[] args) {
    int i = 10, j = 0;
    try {
      int temp = i / j;
      System.out.println("两数相除的结果：" + temp);
    } catch (ArithmeticException e) {
      System.out.println("出现了异常：" + e);
    } finally {
      System.out.println("一定会走到这里");
    }
  }
}