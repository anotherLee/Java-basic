package org.lmr.demo01;

/**
 * 1. 包，避免类的重名
 * 2. 编译的时候 javac -d . PackageDemo01.java
 * 3. 执行的时候 java org.lmr.demo01.PackageDemo01
 */
public class PackageDemo01 {
  public static void main(String[] args) {
    System.out.println(new Demo().getInfo());
  }
}

class Demo {
  public String getInfo() {
    return "Hello World！";
  }
}