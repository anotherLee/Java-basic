public class E_demo {
  public static void main(String[] args) {
    
  }

  public static <T extends Number> Info<T> fun(T param) {
    Info<T> temp = new Info<T>();
    temp.setVar(param);
    return temp;
  }
}

class Info<T extends Number> {
  private T var;
  public T getVar() {
    return var;
  }
  public void setVar(T var) {
    this.var = var;
  }
}