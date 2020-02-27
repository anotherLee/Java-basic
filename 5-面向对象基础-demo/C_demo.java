
public class C_demo {
  public static void main(String[] args) {
    Student s = new Student("0x123", "张三", 88F, 91F, 88F);
    System.out.println("学生姓名：" + s.getName());
    System.out.println("学生编号：" + s.getStuno());
    System.out.println("总成绩：" + s.sum());
    System.out.println("平均成绩：" + s.avg());
    System.out.println("最高成绩：" + s.max());
    System.out.println("最低成绩：" + s.min());
  }
}

class Student {
  private String stuno;
  private String name;
  private float math;
  private float english;
  private float computer;

  public Student() {}
  public Student(String stuno, String name, float math, float english, float computer) {
    this.setStuno(stuno);
    this.setName(name);
    this.setMath(math);
    this.setEnglish(english);
    this.setComputer(computer);
  }

  public void setStuno(String stuno) {
    this.stuno = stuno;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setMath(float math) {
    this.math = math;
  }

  public void setEnglish(float english) {
    this.english = english;
  }

  public void setComputer(float computer) {
    this.computer = computer;
  }

  public String getStuno() {
    return stuno;
  }

  public String getName() {
    return name;
  }

  public float getMath() {
    return math;
  }

  public float getEnglish() {
    return english;
  }

  public float getComputer() {
    return computer;
  }

  public float sum() {
    return math + english + computer;
  }

  public float avg() {
    return this.sum() / 3;
  }

  public float min() {
    return Math.min(Math.min(math, english), computer);
  }

  public float max() {
    float max = math;
    max = max > english ? max : english;
    max = max > computer ? max : computer;
    return max;
  }
}

