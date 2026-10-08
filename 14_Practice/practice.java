class demo extends Thread {
  public void run() {
    try {
      int i = 1;
      for (i = 1; i <= 10; i++) {
        System.out.println("thread is running " + Thread.currentThread().getName() + "" + i);
        Thread.sleep(344);
      }
    } catch (Exception eobj) {
    }

  }
}

class practice {

  public static void main(String A[]) throws Exception {
    System.out.println("inside main thread");
    demo dobj1 = new demo();
    demo dobj2 = new demo();
    dobj1.setName("first thread");
    dobj2.setName("second thread");

    dobj1.start();
    dobj2.start();
    dobj1.join();
    dobj2.join();
    System.out.println("end of main thread" + Thread.currentThread().getName());

  }
}