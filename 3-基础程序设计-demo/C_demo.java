
/**
 * 运算时解决溢出的方法，强制类型转换
 */
public class C_demo {
  public static void main(String[] args) {
    int max = Integer.MAX_VALUE;
    System.out.println("整型最大值：" + max);
    System.out.println("整型最大值+1：" + (max + 1));
    
    System.out.println("整型最大值+2：" + (max + 2L));
    System.out.println("整型最大值+3：" + ((long)max + 3));
  }
}