import java.util.*;

class Selection1 {

  public static void main(String A[]) {
    Scanner Sobj = new Scanner(System.in);
    int No = 0;
    System.out.println("enter number");
    No = Sobj.nextInt();
    if ((No % 2) == 0) {
      System.out.println("even number");

    } else {
      System.out.println("odd number");
    }
  }
}
