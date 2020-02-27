
/**
 * main 函数的参数在执行 java 命令的时候传递
 */
public class L_demo {
  public static void main(String[] args) {
    for (int i=0; i<args.length; ++i) {
      System.out.println("第" + (i+1) + "个参数：" + args[i]);
    }
  }
}