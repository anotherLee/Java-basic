
/**
 * 1. 数组的排序
 * 2. 数组的复制
 * 3. 可变参数
 * 4. 使用 foreach
 */
public class E_demo {
  public static void main(String[] args) {
    int[] score = {23, 34, 1, 45, 567, -1};
    java.util.Arrays.sort(score);
    print(score);

    int[] a = {23, 34, 1, 45, 567, -1};
    int[] b = {45, 34, 12, 102, 221, 234};
    System.arraycopy(a, 2, b, 3, 3);
    System.out.println();
    print(b);
    System.out.println("-------");
    fun(1, 2, 34, 123);
    System.out.println("-------");
    fun2(2, -10, 231);
  }

  public static void print(int[] array) {
    for (int i=0; i<array.length; ++i) {
      System.out.print(array[i] + "\t");
    }
  }
 
  public static void fun(int ...arg) {
    for (int i=0; i<arg.length; ++i) {
      System.out.print(arg[i] + "\t");
    }
  }
  
  public static void fun2(int ...arg) {
    for (int x: arg) {
      System.out.print(x + "、");
    }
  }
}