/**
 * 溢出的问题
 */
class B_demo {
  public static void main(String[] args) {
    int max = Integer.MAX_VALUE;
    System.out.println("整型最大值：" + max);
    System.out.println("整型最大值加1：" + (max + 1)); // int 最小值
    System.out.println("整型最大值加2：" + (max + 2)); // int 次小值
  }
}