/**
 * Runtime类
 */

public class B_demo {
  public static void main(String[] args) {
    Runtime rt = Runtime.getRuntime();
    System.out.println(rt.freeMemory());
    try {
      rt.exec("node");
    } catch (Exception e) {
      //TODO: handle exception
    }
  }
}