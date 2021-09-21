package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
public WebDriver driver;



@BeforeMethod
public void openApp() {
   driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
@Test
public void tc1(){
	driver.findElement(By.id("email")).sendKeys("shobha");
	driver.findElement(By.id("pass")).sendKeys("pjshj");
	driver.findElement( By.name("login")).click();
}
@AfterMethod
public void closeApp() {
 driver.close();
}

	



	
}


