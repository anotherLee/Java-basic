
/**
 * 数组的冒泡排序
 */
public class B_demo {
  public static void main(String[] args) {
    int[] score = {67, 89, 87, 69, 90, 100, 75, 90};
    for (int i=0; i<score.length - 1; ++i) { // 外层控制轮数
      for (int j=0; j<score.length - 1 - i; ++j ) { // 注意这里 score.length - 1 - i 是什么意思
        if (score[j] > score[j+1]) {
          int temp = score[j];
          score[j] = score[j+1];
          score[j+1] = temp;
        }
      }
    }
    for (int i=0; i<score.length; ++i) {
      System.out.print(score[i] + "\t");
    }
  }

  // 67, 89, 87, 69, 90, 100, 75, 90 最初
  // 67, 87, 69, 89, 90, 75, 90, 100 第一轮
}

