/**
 * 1. 为什么要使用泛型：因为在设计类时有些变量、方法要接口的类型不只是一种，可能多种，传统的方法只能用 Object 类，但这就需要频繁的向下转型
 * 2. 使用泛型最大的好处是避免类型转换异常
 */
public class A_demo {
  public static void main(String[] args) {
    Point<Integer> p = new Point<Integer>(10, 9);
    p.setX(15);
    p.setY(20);
  }
}

class Point<T> {
  private T x;
  private T y;
  public Point(T x, T y) {
    this.x = x;
    this.y = y;
  }
  public T getX() {
    return x;
  }
  public T getY() {
    return y;
  }
  public void setX(T x) {
    this.x = x;
  }
  public void setY(T y) {
    this.y = y;
  }
}