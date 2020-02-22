
/**
 * 与 短路与；或 短路或
 */
public class H_demo {
  public static void main(String[] args) {
    int a = 10;
    if (a == 10 | 10 / 0 == 0) {
      System.out.println("进来了");
    }
  }
}