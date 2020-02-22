
/**
 * for 循环，9x9乘法表
 */
public class K_demo {
  public static void main(String[] args) {
    for (int i=1; i<=9; ++i) {
      for (int j=1; j<=i; ++j) {
        System.out.print(i + "*" + j + "=" + i * j + "\t");
      }
      System.out.println();
    }
  }
}