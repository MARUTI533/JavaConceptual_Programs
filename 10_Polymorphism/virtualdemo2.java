
class base {

  int i, j;

  void fun() // 1000
  {
    System.out.println("base fun\n");
  }

  void gun() // 2000
  {
    System.out.println("base gun\n");
  }

  void sun() // 3000
  {
    System.out.println("base sun\n");
  }

  void run() // 4000
  {
    System.out.println("base run\n");
  }
}

class derived extends base {

  int x;

  void fun() // 5000
  {
    System.out.println("derived fun\n");
  }

  void sun() // 6000
  {
    System.out.println("derived sun\n");
  }

  void mun() // 7000
  {
    System.out.println("derived mun\n");
  }

  void bun() // 8000

  {
    System.out.println("derived bun\n");
  }

}

class virtualdemo2 {

  public static void main(String A[]) {
    base bp = new derived();
    // cout << sizeof(base) << "\n";
    // cout << sizeof(derived) << "\n";

    bp.fun();
    bp.gun();
    bp.sun();
    bp.run();
    // bp.mun(); // error
    // bp.bun(); // error

  }
}