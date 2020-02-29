/**
 * 代理模式，替别的类做，但是得先检查下
 */
public class N_demo {
  public static void main(String[] args) {
    NetWork n = new Proxy(new Real());
    n.browse();
  }
}

interface NetWork {
  void browse();
}

class Real implements NetWork {
  public void browse() {
    System.out.println("真实地浏览网络信息！");
  }
}

class Proxy implements NetWork {
  private NetWork n = null;
  public Proxy (NetWork n) {
    this.n = n;
  }
  private void check() {
    System.out.println("检查用户是否可以上网！");
  }
  public void browse() {
    check();
    this.n.browse();
  }
}

