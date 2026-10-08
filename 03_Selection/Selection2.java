import java.util.*;

class Selection2 {

  public static void main(String A[]) {
    Scanner Sobj = new Scanner(System.in);
    int No = 0;
    System.out.println("enter your age");
    No = Sobj.nextInt();
    if (No >= 18) {
      System.out.println("allowed");

    } else {
      System.out.println("not allowed");
    }
  }
}
