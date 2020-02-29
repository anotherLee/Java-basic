import java.util.Arrays;

/**
 * 继承范例使用，先做一个类数组，再继承它完成额外的功能
 */
public class E_demo {
  public static void main(String[] args) {
    // Array a = new Array(2);
    // System.out.println(a.add(1) + "");
    // System.out.println(a.add(2) + "");
    // System.out.println(a.add(3) + "");

    // ReverseArray r = new ReverseArray(2);
    // System.out.println(r.add(1) + "");
    // System.out.println(r.add(2) + "");
    // System.out.println(r.add(3) + "");
    // r.getArray();

    SortedArray r = new SortedArray(2);
    System.out.println(r.add(109) + "");
    System.out.println(r.add(21) + "");
    System.out.println(r.add(39) + "");
    r.getArray();
  }
}

class Array {
  private int[] temp;
  private int foot;

  public Array(int len) {
    if (len > 0) {
      temp = new int[len];
    } else {
      temp = new int[1];
    }
  }

  public boolean add(int i) {
    if (foot < this.temp.length) {
      this.temp[foot] = i;
      foot++;
      return true;
    } else {
      return false;
    }
  }

  public int[] getArray() {
    return this.temp;
  }
}

class ReverseArray extends Array{
  public ReverseArray(int len) {
    super(len);
  }
  public int[] getArray() {
    int[] array = super.getArray();
    int length = array.length;
    for (int i=0; i<length/2; ++i) {
      int temp = array[length - 1 - i];
      array[length - 1 - i] = array[i];
      array[i] = temp;
    }
    System.out.println(Arrays.toString(array));
    return array;
  }
}

class SortedArray extends Array {
  public SortedArray(int len) {
    super(len);
  }

  public int[] getArray() {
    int[] array = super.getArray();
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    return array;
  }
}

