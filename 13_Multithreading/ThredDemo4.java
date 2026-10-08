class demo implements Runnable {
  public void run() {
    System.out.println("thread is running..");
  }
}

class ThredDemo4 {
  public static void main(String A[])

  {
    System.out.println("inside main thread");
    Thread dobj1 = new Thread(new demo());
    Thread dobj2 = new Thread(new demo());
    dobj1.start();

    dobj2.start();

  }
}