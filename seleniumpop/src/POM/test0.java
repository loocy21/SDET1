package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) {
		  	WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			google g=new google(driver);
			driver.navigate().refresh();
			g.searchTextbox("selenium");
			

	}

}
