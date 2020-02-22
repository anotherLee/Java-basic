
public class L_demo {
  public static void main(String[] args) {
    homeWork01();
    homeWork02();
    homeWork03();
    homeWork04(21);
    homeWork05();
    System.out.println("-----");
    homeWork06();
    homeWork07();
    homeWork08();
  }

  /**
   * 打印所有的水仙花数
   */
  public static void homeWork01() {
    for (int i=100; i<999; ++i) {
      String str = Integer.toString(i);
      int first = Integer.valueOf(str.substring(0, 1));
      int second = Integer.valueOf(str.substring(1, 2));
      int third = Integer.valueOf(str.substring(2));
      if (Math.pow(first, 3) + Math.pow(second, 3) + Math.pow(third, 3) == i) {
        System.out.println(i);
      }
    }
  }

  /**
   * 交换两个整数
   */
  public static void homeWork02() {
    int a = 12;
    int b = 24;
    int c = a + b;
    a = c - a;
    b = c - a;
    System.out.println("a=" + a);
    System.out.println("b=" + b);
  }

  /**
   * 求3个数字的最大值
   */
  public static void homeWork03() {
    int a = 12, b = 23, c = 109;
    int d = Math.max(a, b);
    int res = Math.max(d, c);
    System.out.println("结果为：" + res);
  }

  /**
   * 判断一个数能否被3 7 5同时整除
   */
  public static boolean homeWork04(int x) {
    if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0) {
      return true;
    }
    return false;
  }

  /**
   * while 求出 100-200的累加和
   */
  public static void homeWork05() {
    int x = 100;
    int res = 0;
    while (x <= 200) {
      res += x;
      x++;
    }
    System.out.println(res);
  }

  /**
   * 求 13-23+33-43+...+973-983+993-1003
   */
  public static void homeWork06() {
    int x = 13;
    int res = 0;
    while (Math.abs(x) <= 1003) {
      res += x;
      if (x > 0) {
        x = -(x + 10);
      } else {
        x = -x + 10;
      }
    }
    System.out.println(res);
  }

  /**
   * 1! + 2! + 3! + ... 20!
   */
  public static void homeWork07() {
    int res = 0;
    for (int i=1; i<=20; ++i) {
      int temp = 1;
      for (int j=1; j<=i; j++) {
        temp = temp * j;
      }
      res += temp;
    }
    System.out.println(res);
  }

  /**
   * 打印图形
   */
  public static void homeWork08() {
    for (int i=1; i<=5; ++i) {
      for(int j=1; j<=i; ++j) {
        if (j == 1) {
          for (int z=1; z<=(15-i*3)/2; ++z) {
            System.out.print(" "); 
          }
        }
        System.out.print(" * ");
      }
      System.out.println();
    }
  }
}