
import marvellouse.ppa;
import marvellouse.LB;
import marvellouse.infosystems.python;

class packagedemo {
  public static void main(String A[])

  {
    ppa pobj = new ppa();
    LB lobj = new LB();
    python pyobj = new python();
    pobj.ppa_fun();
    lobj.LB_fun();
    pyobj.python_fun();
  }
}