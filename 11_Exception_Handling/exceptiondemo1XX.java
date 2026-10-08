import java.util.*;

class exceptiondemo1X {
  public static void main(String A[])

  {
    Scanner sobj = new Scanner(System.in);
    int no1 = 0, no2 = 0, ans = 0;
    try {
      System.out.println("enter first number");
      no1 = sobj.nextInt();
      System.out.println("enter second number");
      no2 = sobj.nextInt();
      ans = no1 / no2;// exception prone code
    } catch (ArithmeticException aobj) {
      System.out.println("exception occured:" + aobj);
    } catch (Exception aobj) {
      System.out.println("exception occured:" + aobj);
    }

    finally {
      System.out.print("inside finally block");
    }
    System.out.println("division is:" + ans);

  }

}
