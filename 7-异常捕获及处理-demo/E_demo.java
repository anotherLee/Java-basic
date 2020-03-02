/**
 * 异常应用实例
 */
public class E_demo {
  public static void main(String[] args) {
    Math m = new Math();
    try {
      m.div(10, 0);
    } catch (Exception e) {
      System.out.println("父级捕捉到了异常：" + e);
    }
  }
}

class Math {
  public int div(int i, int j) throws Exception{
    System.out.println("计算开始---------");
    int temp = 0;
    try {
      temp = i/j;
    } catch (Exception e) {
      throw e; // 捕捉到异常，但是未处理，没有吃掉，而是向上抛给调用者
    } finally {
      System.out.println("计算结束-------");
    }
    return temp;
  }
}