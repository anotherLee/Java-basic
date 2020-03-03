package org.lmr.packageDemo06;
import static org.lmr.packageDemo05.PackageDemo05.*;
/**
 * 静态导入的是静态方法
 */
public class PackageDemo06 {
  public static void main(String[] args) {
    System.out.println("2+3=" + add(2, 3));
    System.out.println("5*6=" + mul(5, 6));
    System.out.println("8/2=" + div(8, 2));
  }
}