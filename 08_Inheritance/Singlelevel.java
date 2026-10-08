class Base {

  public int i, j;

  public Base() {
    System.out.println("inside Base constructor");
  }

  public void fun() {
    System.out.println("inside Base constructor fun");
  }

  public void gun() {
    System.out.println("inside Base constructor gun");
  }
}

class Derived extends Base {
  public int x, y;

  public Derived() {
    System.out.println("inside derived");
  }

  public void sun() {
    System.out.println("inside derived sun");
  }
}

class Singlelevel {

  public static void main(String A[]) {
    Derived dobj = new Derived();
    dobj.fun();
    dobj.gun();
    dobj.sun();
  }
}
