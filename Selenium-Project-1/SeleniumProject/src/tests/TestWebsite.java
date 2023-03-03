package tests;

import myPackage.BaseClass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestWebsite extends BaseClass{

	
	@Test
	public void test_01() throws InterruptedException{
		getWebDriver().get("http://www.w3schools.com/");
		Thread.sleep(5000);
		getWebDriver().findElement(By.xpath("//*[@id='sidemenu']/a[3]")).click();
		Thread.sleep(5000);
		getWebDriver().findElement(By.xpath("//*[@id='topnav']/div[1]/div[1]/a[3]")).click();
		Thread.sleep(5000);

	}
	
	
	@Test
	public void test_02() throws InterruptedException{
		getWebDriver().get("http://www.w3schools.com/");
		Thread.sleep(5000);
		getWebDriver().findElement(By.xpath("//*[@id='sidemenu']/a[3]")).click();
		Thread.sleep(5000);
		getWebDriver().findElement(By.xpath("//*[@id='topnav']/div[1]/div[1]/a[3]")).click();
		Thread.sleep(5000);
	}
	
	@Test
	public void test_03() throws InterruptedException{
		getWebDriver().get("http://www.w3schools.com/");
		Thread.sleep(5000);
		getWebDriver().findElement(By.xpath("//*[@id='sidemenu']/a[3]")).click();
		Thread.sleep(5000);
		getWebDriver().findElement(By.xpath("//*[@id='topnav']/div[1]/div[1]/a[3]")).click();
		Thread.sleep(5000);
	}
}
