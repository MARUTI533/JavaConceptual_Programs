class demo implements Runnable {
  public void run() {
    System.out.println("thread is running..");
  }
}

class ThredDemo3 {
  public static void main(String A[])

  {
    System.out.println("inside main thread");
    demo dobj1 = new demo();
    demo dobj2 = new demo();
    dobj1.start();// error

    dobj2.start();// error

  }
}