import java.util.*;

class exceptiondemo2X {
  public static void main(String A[])

  {
    Scanner sobj = new Scanner(System.in);
    int arr[] = { 11, 21, 51, 101, 111 };
    int index = 0;
    try {
      System.out.println("enter the index ");
      index = sobj.nextInt();

      System.out.println("elements is:" + arr[index]);
    } catch (ArrayIndexOutOfBoundsException aobj) {
      System.out.println("inside catch" + aobj);
    }
    System.out.println("end of main");

  }

}
