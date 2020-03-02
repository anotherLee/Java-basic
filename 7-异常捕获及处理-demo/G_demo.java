/**
 * 自定义异常类
 */
public class G_demo {
  public static void main(String[] args) {
    try {
      throw new MyException("自定义异常");
    } catch(Exception e) {
      System.out.println("抓到异常了：" + e);
    }
  }
}

class MyException extends Exception {
  public MyException(String msg) {
    super(msg);
  }
}

