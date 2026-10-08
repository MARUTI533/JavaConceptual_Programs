import java.util.*;

class demo {
  public static int division(int no1, int no2) throws ArithmeticException {
    return no1 / no2;
  }
}

class exceptiondemo3X {
  public static void main(String A[])

  {
    Scanner sobj = new Scanner(System.in);
    int no1 = 0, no2 = 0, ans = 0;
    System.out.println("enter first number");
    no1 = sobj.nextInt();
    System.out.println("enter second number");
    no2 = sobj.nextInt();
    ans = demo.division(no1, no2);
    System.out.println("dibision is:" + ans);

  }

}
