
/**
 * 1. 二维数组，声明时要同时给行的个数和列的个数，第一个是行，第二个是列
 * 2. 二维数组的静态
 * 3. 二维数组的静态初始化，每行里列数可以不一样
 */
public class C_demo {
  public static void main(String[] args) {
    int[][] score = null;
    score = new int[4][3];
    System.out.println("length:"+ score.length);
    score[0][1] = 30;
    score[1][0] = 31;
    score[2][2] = 32;
    score[3][1] = 33;
    score[1][1] = 30;
    for (int i=0; i<score.length; ++i) {
      for (int j=0; j<score[i].length; ++j) {
        System.out.print(score[i][j] + "\t");
      }
      System.out.println();
    }

    // 二维数组的静态初始化，每行里列数可以不一样
    int[][] c = {
      {1, 2, 32}, // 第一行值
      {2, 22, 232, 45, 56} // 第二行的值
    };
  } 
}