class Arithematic {
  public int no1;
  public int no2;

  public Arithematic() {

    this.no1 = 0;
    this.no2 = 0;
  }

  public Arithematic(int i, int j) {

    this.no1 = i;
    this.no2 = j;

  }

  public int Addition() {

    int ans = 0;
    ans = this.no1 + this.no2;
    return ans;
  }

  public int Substraction() {

    int ans = 0;
    ans = this.no1 - this.no2;
    return ans;
  }
}

class OOPXX {

  public static void main(String A[]) {

    Arithematic obj = new Arithematic(1, 11);
    int result = 0;
    result = obj.Addition();
    System.out.println("add is:" + result);
    result = obj.Substraction();
    System.out.println("sub is:" + result);
  }
}