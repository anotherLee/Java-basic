package org.lmr.demo03;
import org.lmr.demo02.PackageDemo02;
/**
 * 1. 使用 import 导入不同包中的类
 * 2. 可以使用 * 表示包下所有需要导入的类
 * 3. 如果导入不同包下相同类，需要把名称写全
 */
public class PackageDemo03 {
  public static void main(String[] args) {
    System.out.println(new PackageDemo02().getInfo());
  }
}

