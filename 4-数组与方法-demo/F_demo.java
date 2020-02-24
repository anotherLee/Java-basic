
public class F_demo {
  public static void main(String[] args) {
    homeWork01();
  }

  /**
   * 求 1! + 2! + 3! + ... 30!的和
   */
  public static void homeWork01() {
    long result = 0L;
    for (int i=1; i<=30; ++i) {
      int current = getRes(i);
      result += current;
    }
    System.out.println(result);
  }

  /**
   * 求 n!
   */
  public static int getRes(int n) {
    if (n == 1) {
      return 1;
    }
    return n * getRes(n - 1);
  }

  public static void homeWork02() {
    
  }
}