import java.util.*;

class exceptiondemo1 {
  public static void main(String A[])

  {
    Scanner sobj = new Scanner(System.in);
    int no1 = 0, no2 = 0, ans = 0;
    System.out.println("enter first number");
    no1 = sobj.nextInt();
    System.out.println("enter second number");
    no2 = sobj.nextInt();
    ans = no1 / no2;// exception prone code
    System.out.println("dibision is:" + ans);

  }

}
