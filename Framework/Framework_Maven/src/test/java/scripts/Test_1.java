package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import propertyfiles.Messages;

public class Test_1 {
  @Test
  public void f() {
	  
	  System.out.println(Messages.getString("Test_1.messages0")); //$NON-NLS-1$
	
	  
	  System.out.println("kiran");
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
