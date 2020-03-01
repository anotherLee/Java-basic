
public class V_demo {
  public static void main(String[] args) {
    Company c = new Company();
    System.out.println(c.getClassName());

    System.out.println("--------------");

    Customer ming = new Customer("小明");
    Cart cart = new Cart(5);
    ming.setCart(cart);
    Product p1 = new Product("零食", 78.5);
    Product p2 = new Product("书", 90.9);
    ming.addProduct(p1);
    ming.addProduct(p2);
    Cashier ca = new Cashier();
    ming.setCa(ca);
    ming.makeAccounts();
  }
}

/**
 * homeWork01
 */
interface ClassName {
  String getClassName();
}

class Company implements ClassName {
  public String getClassName() {
    return this.getClass().getName();
  }
}

/**
 * homeWork02
 */

abstract class Shape {
  abstract double area();
  abstract double perimeter();
}

class Rectangle extends Shape {
  private double change;
  private double kuan;
  public Rectangle(double change, double kuan) {
    this.change = change;
    this.kuan = kuan;
  }
  public double getChange() {
    return this.change;
  }
  public void setChange(double change) {
    this.change = change;
  }
  public double getKuan() {
    return kuan;
  }
  public void setKuan(double kuan) {
    this.kuan = kuan;
  }
  public double area() {
    return change * kuan;
  }
  public double perimeter() {
    return change * 2 + kuan * 2;
  }
}

/**
 * 小明去超市买东西，买到的东西放到购物车中，最后到收银台结账
 */

// 顾客
class Customer {
  private String name;
  private Cart cart;
  private Cashier ca;
  public Customer(String name) {
    this.name = name;
  }
  // 买东西
  public boolean addProduct(Product p) {
    if (this.cart != null) {
      if (this.cart.add(p)) {
        return true;
      }
      return false;
    }
    return false;
  }
  // 最后付款
  public boolean makeAccounts() {
    if (this.ca != null) {
      this.ca.acceptMoney(this.cart);
      return true;
    }
    return false;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Cart getCart() {
    return this.cart;
  }
  public void setCart(Cart c) {
    this.cart = c;
  }
  public Cashier getCa() {
    return this.ca;
  }
  public void setCa(Cashier ca) {
    this.ca = ca;
  }
}

// 购物车，有添加商品功能
class Cart {
  private Product[] products;
  private int foot;
  public Cart(int count) {
    if (count > 0) {
      products = new Product[count];
    } else {
      products = new Product[1];
    }
  }
  public boolean add(Product p) {
    int num = this.products.length;
    if (this.foot < num) {
      products[this.foot] = p;
      this.foot++;
      return true;
    }
    return false;
  }
  public Product[] getProducts() {
    return this.products;
  }
}

// 商品，有名称和价格两个属性
class Product {
  private String name;
  private double price;
  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
}

// 收银台，有收款功能
class Cashier {
  public void acceptMoney(Cart c) {
    Product[] ps = c.getProducts();
    for (int i=0; i<ps.length; ++i) {
      Product p = ps[i];
      if (p != null) {
        String name = p.getName();
        double price = p.getPrice();
        System.out.println(name + "，应收" + price + "元");
      }
    }
  }
}