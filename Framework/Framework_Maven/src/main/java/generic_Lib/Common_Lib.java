package generic_Lib;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Common_Lib {


	public void Fullscreen(){
		Driverclass.driver.manage().window().maximize();
	}

	public void close(){
		Driverclass.driver.close();
	}

	public void Quit(){
		Driverclass.driver.quit();
	}

	//sendkeys

	public String Sendkeys(String TextXpath, String Value){

		Driverclass.driver.findElement(By.xpath(TextXpath)).sendKeys(Value);
		return Value;
	}

	public void DropDown_VisibleText(String Xpath, String SelectByVisibleText){

		Select Sel = new Select(Driverclass.driver.findElement(By.xpath(Xpath)));
		Sel.selectByVisibleText(SelectByVisibleText);
	}

	public void url(String URL){
		Driverclass.driver.get(URL);
	}

}
