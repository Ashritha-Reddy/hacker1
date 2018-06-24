package gmailpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascrip {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C://testing1//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.findElement(By.name("q")).sendKeys("ASHRITHA REDDY");
WebElement e=driver.findElement(By.name("q"));




JavascriptExecutor js=(JavascriptExecutor) driver;

js.executeScript("var x=arguments[0].textContent;alert(x);",e);
driver.switchTo().alert().dismiss();
Thread.sleep(5000);
js.executeScript("alert('ashritha')");
Thread.sleep(5000);
String y=driver.switchTo().alert().getText();
System.out.println(y);
driver.switchTo().alert().dismiss();
Thread.sleep(5000);

driver.close();








	}

}
