public class D_demo {
  public static void main(String[] args) {
    /**
     * 1. String 的 == 比较的是内存地址
     * 2. equals
     * 3. String 两种实例化的区别：字符串池、是否开辟新的内存空间
     * 4. String 是不可变的，每次拼接都会开辟新的内存空间
     */
    String str1 = "Hello";
    String str2 = new String("Hello");
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));

    String str3 = "world";
    String str4 = "world";
    System.out.println(str3 == str4);

    /**
     * 错误的示例，反复开辟内存100次
     */
    String s = "";
    for (int i=0; i<100; ++i) {
      s += i;
    }
    System.out.println("res：" + s);
  }
}