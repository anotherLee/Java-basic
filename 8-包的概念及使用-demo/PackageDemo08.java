package org.lmr.packageDemo08;
/**
 * jar 命令的使用
 * jar -cvf my.jar org  这条命令将 org包打包成 my.jar 文件
 * 将之前的所有 class 文件删除后，将 my.jar 添加到 classpath 中
 * 编译并运行下面的代码
 */
import org.lmr.packageDemo07.PackageDemo07;

public class PackageDemo08 {
  public static void main(String[] args) {
    PackageDemo07 p = new PackageDemo07();
    System.out.println(p.getInfo());
  }
}