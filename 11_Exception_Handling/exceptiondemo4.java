import java.util.*;

class AgeInvalid extends Exception {
  public AgeInvalid(String str) {
    super(str);
  }

}

class exceptiondemo4 {
  public static void main(String A[])

  {
    int Age;
    Scanner sobj = new Scanner(System.in);
    System.out.println("enter your age:");
    Age = sobj.nextInt();
    try {

      if (Age < 18) {
        throw new AgeInvalid("you are unde age");
      } else {
        System.out.println("welcome to");
      }
    } catch (AgeInvalid aobj) {
      System.out.println("axception occured deu to age");
    }
  }
}
