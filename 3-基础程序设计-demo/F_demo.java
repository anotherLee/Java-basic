
/**
 * 3.0 默认的是 double，向 float 强制转换会有问题
 */
public class F_demo {
  public static void main(String[] args) {
    float num = 3.0; // 报错
    System.out.println(num);
  }
}