/**
 * 1.异常类的继承结构：Throwable，它有两个子类：Exception 可以处理；Error 一般上 JVM 错误，程序中无法处理
 * 2.使用 Exception 可以处理所有的异常，因为它是父类
 * 3.大异常应该放在后面，否则编译不通过
 */
public class C_demo {
  public static void main(String[] args) {
    int i = 10, j = 0;
    try {
      int temp = i/j;
      System.out.println("结果：" + temp);
    } catch (Exception e) {
      e.printStackTrace();
    } catch (ArithmeticException e) {
      e.printStackTrace();
    } finally {
      System.out.println("都要执行的代码");
    }
    
  }
}

