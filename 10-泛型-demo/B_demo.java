/**
 * 1.使用多个泛型类型
 * 2.安全警告
 */
public class B_demo {
  public static void main(String[] args) {
    NotePad<String, Integer> n = new NotePad<String, Integer>();
    n.setKey("count");
    n.setValue(12);
  }
}

class NotePad<K, V> {
  private K key;
  private V value;
  public K getKey() {
    return this.key;
  }
  public V getValue() {
    return this.value;
  }
  public void setKey(K key) {
    this.key = key;
  }
  public void setValue(V value) {
    this.value = value;
  }
}