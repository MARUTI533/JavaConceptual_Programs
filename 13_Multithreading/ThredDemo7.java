class demo extends Thread {
  public void run() {
    System.out.println("thread is running..");
  }
}

class ThredDemo7 {
  public static void main(String A[]) throws Exception

  {
    System.out.println("inside main thread");
    demo dobj1 = new demo();
    demo dobj2 = new demo();
    dobj1.setName("First_Thread");
    dobj2.setName("Second_Thread");
    dobj1.start();
    dobj2.start();

    dobj1.join();
    dobj2.join();
    System.out.println("end of main thread " + Thread.currentThread().getName()); // issue

  }
}