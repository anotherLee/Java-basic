/**
 * 1.通配符
 * 2.使用通配符接收泛型对象时，不能设置泛型指定内容
 */
public class C_demo {
  public static void main(String[] args) {
    Info<Object> i = new Info<Object>(new Object());
    // fun(i); // 这里会报错
    fun2(i);

    Info<?> i2 = new Info<String>("abc");
    // i2.setName("def"); // 这里不行
    System.out.println(i2.getName());
  }
  public static void fun(Info<String> info) {

  }
  public static void fun2(Info<?> info) {
    
  }

}

class Info<T> {
  private T name;
  public Info(T name) {
    this.name = name;
  }
  public void setName(T name) {
    this.name = name;
  }
  public T getName() {
    return this.name;
  }
}