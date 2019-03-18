package openbaidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openbaidu {
	@Test
	 public void open() throws InterruptedException  
	{
	 System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe") ;
	 WebDriver driver=new ChromeDriver();
	
	 String url1="https://www.baidu.com";
	 
	 driver.get(url1);
	 String url22=driver.getCurrentUrl();
	 System.out.println(url22);
	 
	 driver.findElement(By.id("kw")).sendKeys("jenkins");
	 
	 driver.findElement(By.id("su")).click();
}
}
