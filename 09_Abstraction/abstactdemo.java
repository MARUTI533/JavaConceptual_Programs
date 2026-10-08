
abstract class base {

  public int i, j;

  public int addition(int no1, int no2) {
    return no1 + no2;
  }

  abstract int substraction(int no1, int no2);
}

class derived extends base {

  public int x;

  public int substraction(int no1, int no2) {
    return no1 - no2;
  }

  int multiplication(int no1, int no2) {
    return no1 * no2;
  }
}

class abstactdemo {
  public static void main(String A[]) {
    derived dobj = new derived();
    int ret = 0;

    ret = dobj.addition(11, 10);
    System.out.println("addition is: " + ret);
    ret = dobj.substraction(11, 10);
    System.out.println("substrsction is: " + ret);
    ret = dobj.multiplication(11, 10);
    System.out.println("multiplication is: " + ret);
  }
}