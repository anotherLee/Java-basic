
/**
 * 1. 数组的使用包含申明数组和分配内存两步
 * 2. null 是表示引用数据类型的默认值
 * 3. 数组初始化有动态和静态两种
 */
public class A_demo {
  public static void main(String[] args) {
    int[] a = null; // 栈内存保存名称
    a = new int[5]; // 在堆上开辟3个保存整数的内存空间，并将地址给 a
    int length = a.length;
    System.out.println("数组长度：" + length);

    int[] b = {10, 23, 10}; // 静态初始化
  }
}