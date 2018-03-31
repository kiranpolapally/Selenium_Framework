package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Common_lib {



	//dropdown

	public void close(){
		Driverclass.driver.close();
	}
	
	public void dropselect_visible(String XPathDropdwn , String VisibleText ){
		Select sel = new Select(Driverclass.driver.findElement(By.xpath(XPathDropdwn)));
		sel.selectByVisibleText(VisibleText);
	}

	public void dropselect_index(String XPathDropdwn , int VisibleText ){
		Select sel = new Select(Driverclass.driver.findElement(By.xpath(XPathDropdwn)));
		sel.selectByIndex(VisibleText);
	}
	
	
	public void url(String url){
		
		Driverclass.driver.get(url);
	}
	
	
	public void Browser(String browser){
		
		switch (browser) {
		case "IE":
		case "ie":
		case "Ie":
			System.setProperty("webdriver.ie.driver", "Browser//ieserver.exe");
			Driverclass.driver = new InternetExplorerDriver();
			break;

		case "chrome":
		case "Chrome":
			System.setProperty("webdriver.ie.driver", "Browser//chrome.exe");
			Driverclass.driver = new ChromeDriver();
			break;

		default:
			break;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
