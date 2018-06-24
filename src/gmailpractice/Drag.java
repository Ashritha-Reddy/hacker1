package gmailpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://semantic-ui.com/modules/dropdown.html");
		//Actions a=new Actions(driver);
		//a.dragAndDrop(e1,e2).build().perform();
		
	//	driver.switchTo().defaultContent();
		
		
	}

}
