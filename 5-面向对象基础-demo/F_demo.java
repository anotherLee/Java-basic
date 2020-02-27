/**
 * 引用传递，注意结果
 */
public class F_demo {
  public static void main(String[] args) {
    String str1 = "Hello";
    System.out.println("str1: " + str1);
    fun(str1);
    System.out.println("str1: " + str1);
  }
  public static void fun(String str2) {
    str2 = "other";
  }
}