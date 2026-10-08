class Demo {

  public Demo() {
    System.out.println("inside default constructor");
  }

  public Demo(int i, int j) {
    System.out.println("inside parameterized constructor");
  }
}

class Constructors_Demo {

  public static void main(String A[]) {
    Demo obj1 = new Demo();
    Demo obj2 = new Demo(11, 21);
  }
}
