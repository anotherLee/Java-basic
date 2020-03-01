/**
 * 包装类：Integer/Character/Short/Long/Float/Double/Boolean/Byte
 * Character和Boolean都是Object的直接子类，其它都是Number的子类
 */
public class T_demo {
  public static void main(String[] args) {
    // 手动装箱、拆箱
    int x = 30;
    Integer i = new Integer(x);
    int temp = i.intValue();
    System.out.println(temp);

    float f = 30.0F;
    Float ff = new Float(f);
    float y = ff.floatValue();
    System.out.println(y);

    use();
  }
  /**
   * 自动拆装箱
   */
  public static void auto() {
    Integer i = 30;
    Float f = 30.0F;
    int x = i;
    float y = f;
  }

  /**
   * 包装类使用
   * 1. 字符串变为基本数据类型
   * 
   */
  public static void use() {
    String s1 = "123";
    String s2 = "30.3";
    int x = Integer.parseInt(s1);
    float y = Float.parseFloat(s2);
    System.out.println("----------");
    System.out.println(x);
    System.out.println(y);
  }
}



