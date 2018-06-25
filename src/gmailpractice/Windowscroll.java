package gmailpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowscroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\testing1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(5000);
        js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
        Thread.sleep(5000);
       // js.executeScript(arg0, arg1)
        
        WebElement e=driver.findElement(By.xpath("//*[@class='dropdown pushable']"));
        js.executeScript("arguments[0].scrollIntoView();",e);
        
        
	}

}
