package gmailpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	    Thread.sleep(5000);
	   
	    js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	    

	}

}
