
/**
 * 1. 一个 int 和 float 或 double 运算，int 会被先转换成 float/double
 * 2. 两个整数运算时，会舍弃小数
 */
public class G_demo {
  public static void main(String[] args) {
    int x = 30;
    float y = 3.33f;
    System.out.println(x/y); // 7.xxx
    System.out.println(30/3.33); // 7.xxx
    System.out.println(30/4); // 7
  }
}