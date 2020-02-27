/**
 * 类与类之间的对应关系
 */
public class H_demo {
  public static void main(String[] args) {
    Person p1 = new Person("爸爸", 30);
    Person p2 = new Person("儿子", 10);
    Book b1 = new Book("《Java 核心教程》", 80F);
    Book b2 = new Book("《格林童话》", 30F);
    p1.setChild(p2);
    p1.setBook(b1);
    p2.setBook(b2);

    b1.setPerson(p1);
    b2.setPerson(p2);

    System.out.println(p1.getName() + "的" + p1.getChild().getName() + "的书" + p1.getChild().getBook().getTitle());
  }
}

class Person {
  private String name;
  private int age;
  private Person child;
  private Book book;
  
  public Person(String name, int age) {
    this.setName(name);
    this.setAge(age);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Person getChild() {
    return child;
  }

  public void setChild(Person child) {
    this.child = child;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }
}

class Book {
  private String title;
  private float price;
  private Person person;
  public Book(String title, float price) {
    this.setTitle(title);
    this.setPrice(price);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }
}