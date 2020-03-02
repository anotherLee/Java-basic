/**
 * 多个异常的处理
 * 下面这个程序可能出现的问题：除以0、数组越界、数字格式化异常（如Integer.parseInt("a")）
 */
public class B_demo {
  public static void main(String[] args) {
    int i = 0, j = 0;
    try {
      String str1 = args[0];
      String str2 = args[1];
      i = Integer.parseInt(str1);
      j = Integer.parseInt(str2);
      int temp = i / j;
      System.out.println("两个数字相除的结果：" + temp);
    } catch (ArithmeticException e) {
      System.out.println("出现了异常：" + e);
    } catch(NumberFormatException e) {
      System.out.println("数字格式化异常：" + e);
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("数组越界异常：" + e);
    } finally {
      System.out.println("这里是 finally 的代码");
    }
  }
}