package mavenproject.mavenproject;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Sikuli {
	@Test
	public void f() throws Exception {
	
		Screen s = new Screen();
		
		Pattern p = new Pattern("C:\\Users\\Welcome\\Desktop\\anji\\junk.PNG");
		s.wait(p,2000);
		s.click();
		
		Pattern p1 = new Pattern("C:\\Users\\Welcome\\Desktop\\anji\\new.PNG");
		s.wait(p1,2000);
		s.click();

		
/*

		Pattern win = new Pattern("C:\\Users\\Welcome\\Desktop\\anji\\win.PNG");
		s.wait(win,2000);
		s.click();
*/
		
		//https://mvnrepository.com/artifact/com.sikulix/sikulixapi/1.1.2
		



	}
}
