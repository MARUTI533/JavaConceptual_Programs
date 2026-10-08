import java.util.Scanner;
class Addition{

  public static void main(String A[]){
    int no1=0,no2=0,ans;
    Scanner sobj=new Scanner(System.in);
    System.out.println("enter first number");
    no1=sobj.nextInt();
    System.out.println("enter second number");
    no2=sobj.nextInt();
    ans=no1+no2;
    System.out.println("addition is:"+ans);

  }
}