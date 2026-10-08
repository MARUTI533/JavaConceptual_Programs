class demo extends Thread {
  public void run() {
    System.out.println("thread is running..");
  }
}

class ThredDemo5 {
  public static void main(String A[])

  {
    System.out.println("inside main thread");
    demo dobj1 = new demo();
    demo dobj2 = new demo();
    dobj1.start();
    dobj2.start();
    System.out.println("end of main thread "); // issue

  }
}