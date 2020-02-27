import java.util.Arrays;

public class E_demo {
  public static void main(String[] args) {
    /**
     * 字符串的更多方法，其它的在文档里
     */
    
    // 1. 将一个字符数组构造成一个字符串
    char[] ch1 = {'j', 'd', 'k'};
    String s1 = new String(ch1);
    System.out.println("ch1:" + s1);
    // 2. 将一个指定范围的字符数组构造成字符串
    char[] ch2 = {'a', 'b', 'c', 'd', 'e'};
    String s2 = new String(ch2, 1, 2);
    System.out.println("ch2:" + s2);
    // 3. 将一个 byte 数组构造成字符串
    byte[] b1 = {97, 98, 99};
    String s3 = new String(b1);
    System.out.println("s3:" + s3); // abc
    // 4. 将指定范围的 byte 数组构造成字符串
    byte[] b2 = {109, 108, 99, 98};
    String s4 = new String(b2, 1, 2);
    System.out.println("s4:" + s4);
    // 5. 将一个字符串变成字符数组
    String s5 = "english";
    char[] ch3 = s5.toCharArray();
    System.out.println(Arrays.toString(ch3));
    // 6. 从字符串取出指定位置的字符
    String s6 = "this is a string";
    char c1 = s6.charAt(3);
    System.out.println("c1:" + c1);
    // 7. 将一个字符串变成 byte 数组
    String s7 = "abc";
    byte[] bytes1 = s7.getBytes();
    System.out.println(Arrays.toString(bytes1));
    // 8. 获取字符串的长度
    String s8 = "abcdefg";
    System.out.println("length: " + s8.length());
    // 9. 从头开始查找指定字符串的位置
    String s9 = "this is a test";
    System.out.println("test开始位置：" + s9.indexOf("test"));
    // 10. 从指定位置查找字符串的位置
    String s10 = "this is a test";
    System.out.println("a开始的位置：" + s10.indexOf("a", 10));
    // 11. 清除两侧的空格
    String s11 = " xxx   ";
    System.out.println("清除后的：" + s11.trim());
    // 12. 从指定位置截取子串直到尾部
    String s12 = "parent string";
    System.out.println(s12.substring(7));
    // 13. 指定截取子串的开始和结束
    String s13 = "parent string";
    System.out.println(s13.substring(7, 10));
    // 14. 根据指定规则对字符串进行拆分，注意这里放的是一个正则，对于特殊符号需要进行两次转义
    String s14 = "this is a string";
    String[] res = s14.split(" ");
    System.out.println(Arrays.toString(res));
    // 15. 将字符串转为全部大写或者小写
    String s15 = "abCdEf";
    System.out.println(s15.toLowerCase());
    System.out.println(s15.toUpperCase());
    // 16. 判断某个字符串是否以指定字符串开头或者结尾
    String s16 = "this is a string";
    System.out.println(s16.startsWith("this"));
    System.out.println(s16.endsWith("g"));
    // 17. equals
    // 18. equealsIgnoreCase 不区分大小写比较两个字符串
    String s17 = "tEst";
    System.out.println(s17.equalsIgnoreCase("test"));
    // 字符串替换
    String s18 = "axxxxbcdef";
    System.out.println(s18.replaceAll("x", ""));
  }
}