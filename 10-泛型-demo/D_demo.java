/**
 * 泛型接口,两种定义方式
 */

interface Info<T> {
  public T getInfo();
}

class InfoImp<T> implements Info<T> {
  private T name;
  public T getInfo() {
    return name;
  }
}

class InfoImp2 implements Info<String> {
  private String name;
  public String getInfo() {
    return name;
  }
}