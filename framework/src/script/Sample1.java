package script;

import org.testng.annotations.Test;

import utility.Common_lib;
import utility.Excel_Fucntion;

public class Sample1 {
	
	Excel_Fucntion excel = new Excel_Fucntion();
	Common_lib common = new Common_lib();
	
  @Test
  public void f() throws Exception {
	  
	  common.Browser("Chrome");
	  common.url("http://www.google.com");
	  
  }
}
