import java.util.Arrays;
/**
 * 应用：宠物商店
 */
public class R_demo {
  public static void main(String[] args) {
    Dog d1 = new Dog("哈士奇", 1, "blue");
    Dog d2 = new Dog("牧羊犬", 2, "blue");
    Cat c1 = new Cat("加菲猫", 1, "red");
    Cat c2 = new Cat("蓝猫", 2, "blue");
    PetShop ps = new PetShop(6);
    ps.add(d1);
    ps.add(d2);
    ps.add(c1);
    ps.add(c2);
    Pet[] result = ps.search("blue");
    for (int i=0; i<result.length; ++i) {
      Pet p = result[i];
      System.out.println(p.getName());
    }
  }
}

interface Pet {
  String getName();
  int getAge();
  String getColor();
}

class Cat implements Pet {
  private String name;
  private int age;
  private String color;
  public Cat(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public String getColor() {
    return color;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setColor(String color) {
    this.color = color;
  }
}

class Dog implements Pet {
  private String name;
  private int age;
  private String color;
  public Dog(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public String getColor() {
    return color;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setColor(String color) {
    this.color = color;
  }
}

class PetShop {
  private Pet[] pets = null;
  private int foot;
  public PetShop(int count) {
    if (count > 0) {
      pets = new Pet[count];
    } else {
      pets = new Pet[1];
    }
  }
  public boolean add(Pet p) {
    if (this.foot < this.pets.length) {
      this.pets[foot] = p;
      this.foot++;
      return true;
    }
    return false;
  }

  public Pet[] search(String keywords) {
    Pet[] result = null;
    int count = 0;
    int f = 0;
    if (this.pets != null) {
      for (int i=0; i<this.pets.length; ++i) {
        Pet p = this.pets[i];
        if (p != null) {
          String name = p.getName();
          String color = p.getColor();
          if (name.indexOf(keywords) != -1 || color.indexOf(keywords) != -1) {
            count++;
          }
        }
      }

      result = new Pet[count];

      for (int i=0; i<this.pets.length; ++i) {
        if (this.pets[i] != null) {
          if (
            this.pets[i].getName().indexOf(keywords) != -1
            ||
            this.pets[i].getColor().indexOf(keywords) != -1
          ) {
            result[f] = this.pets[i];
            f++;
          }
        }
      }
    }
    return result;
  }

}
