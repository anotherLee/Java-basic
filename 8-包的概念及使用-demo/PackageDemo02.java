package org.lmr.demo02;

/**
 * 如果一个包中类想要被别的包中类访问，必须是 public 的
 */
public class PackageDemo02 {
  public String getInfo() {
    return "Hello world!";
  }
}