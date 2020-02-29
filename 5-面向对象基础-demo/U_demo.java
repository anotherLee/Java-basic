/**
 * 简单单向链表实现
 */
public class U_demo {
  public static void main(String[] args) {
    Node root = new Node("火车头");
    Node first = new Node("一车厢");
    Node second = new Node("二车厢");
    Node third = new Node("三车厢");
    root.setNextNode(first);
    first.setNextNode(second);
    second.setNextNode(third);
    printLink(root);
    System.out.println("--------");
    printLink2(root);
  }

  /**
   * 打印简单链表
   */
  public static void printLink(Node root) {
    Node current = root;
    while (current != null) {
      System.out.println(current.getData());
      current = current.getNextNode();
    }
  }

  /**
   * 用递归打印简单链表
   */
  public static void printLink2(Node node) {
    System.out.println(node.getData());
    if (node.getNextNode() != null) {
      printLink2(node.getNextNode());
    }
  }
}

class Node {
  private String data;
  private Node nextNode;
  
  public Node(String data) {
    this.data = data;
  }

  public String getData() {
    return data;
  }
  public void setNextNode(Node n) {
    this.nextNode = n;
  }
  public Node getNextNode() {
    return nextNode;
  }
}

