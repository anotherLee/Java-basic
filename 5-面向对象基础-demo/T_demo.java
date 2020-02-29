/**
 * 系统登录简单实例
 */
public class T_demo {
  public static void main(String[] args) {
    Login l = new Login(args);
    l.login();
  }
}

class Login {
  private String[] info = null;
  public Login(String[] info) {
    this.setInfo(info);
  }
  public void setInfo(String[] info) {
    this.info = info;
  }
  public String[] getInfo() {
    return info;
  }
  private void check() {
    if (this.info.length != 2) {
      System.out.println("输入格式不正确!");
      System.out.println("正确格式：java T_demo name password");
      System.exit(1);
    }
  }

  private boolean validate() {
    String name = this.info[0];
    String password = this.info[1];
    if (name.equals("张三") && password.equals("123")) {
      return true;
    }
    return false;
  }

  public void login() {
    check();
    if (validate()) {
      System.out.println("登录成功");
    } else {
      System.out.println("您的用户名或密码不正确！");
    }
  }
}

