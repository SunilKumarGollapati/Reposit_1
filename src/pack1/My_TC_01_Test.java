package pack1;

import org.testng.annotations.Test;

public class My_TC_01_Test {

  @Test (priority = 4)
  public void A() {
    System.out.println("1");
  }

  @Test (priority = 3)
  public void B() {
	  System.out.println("2");
  }

  @Test (priority = 2)
  public void C() {
	  System.out.println("3");
  }
 
  @Test (priority = 1)
  public void D() {
	  System.out.println("4");
  }
}
