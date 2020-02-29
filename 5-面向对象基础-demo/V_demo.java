/**
 * 比较完善的一个链表
 */
public class V_demo {
  public static void main(String[] args) {
    Link link = new Link();
    link.addNode("车头");
    link.addNode("A");
    link.addNode("B");
    link.addNode("C");
    link.printLink();
    link.deleteNode("B");
    link.printLink();
  }
}

class Link {
  class Node {
    private String data;
    private Node next;
    
    public Node(String data) {
      this.data = data;
    }
    public String getData() {
      return data;
    }
    public void setNext(Node n) {
      this.next = n;
    }
    public Node getNext() {
      return next;
    }

    public void add(Node newNode) {
      if (this.next == null) {
        this.next = newNode;
      } else {
        this.next.add(newNode);
      }
    }

    public void print() {
      System.out.println(this.data + "\t");
      if (this.next != null) {
        this.next.print();
      }
    }

    public boolean search(String data) {
      if (data.equals(this.data)) {
        return true;
      } else {
        if (this.next != null) {
          return this.next.search(data);
        }
        return false;
      }
    }

    public void delete(Node prevNode, String data) {
      if (data.equals(this.data)) {
        prevNode.next = this.next;
      } else {
        if (this.next != null) {
          this.next.delete(this, data);
        }
      }
    }
  }
  /**
   * 根节点
   */
  private Node root;

  /**
   * 添加节点
   */
  public void addNode(String data) {
    Node newNode = new Node(data);
    if (this.root == null) {
      this.root = newNode;
    } else {
      this.root.add(newNode);
    }
  }

  /**
   * 打印链表
   */
  public void printLink() {
    if (this.root != null) {
      this.root.print();
    }
  }

  /**
   * 某个节点是否包含某个内容
   */
  public boolean contains(String data) {
    return this.root.search(data);
  }

  /**
   * 删除某个节点
   */
  public void deleteNode(String data) {
    if (data.equals(this.root.data)) {
      this.root = this.root.next;
    } else {
      this.root.next.delete(this.root, data);
    }
  }
}