
/**
 * 1. 方法和重载，重载就是方法名相同，但是参数类型或者参数个数不同
 * 2. System.out.println() 就是典型的重载方法
 * 3. void 可以直接 return;
 */
public class D_demo {
  public static void main(String[] args) {
    System.out.println(add(1, 2));
    System.out.println(add(1, 3, 4));
  }

  public static int add(int x, int y) {
    return x + y;
  }

  public static int add(int x, int y, int z) {
    return x + y + z;
  }

  public static void add(float x, float y) {
    System.out.println("这是啥");
    return;
  }
}