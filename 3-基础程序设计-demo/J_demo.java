
/**
 * 1. << >> 有符号位移；左移不论正负统一补0；右移正数补0，负数补1
 * 2. <<< >>> 无符号，都补0
 */
public class J_demo {
  public static void main(String[] args) {
    int x = -3;
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(x << 2));
  }
}