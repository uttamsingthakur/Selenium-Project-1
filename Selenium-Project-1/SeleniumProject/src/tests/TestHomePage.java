package tests;

import myPackage.BaseClass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHomePage extends BaseClass{


	@Test
	public void test_01() throws InterruptedException{
		getWebDriver().get("http://www.google.com/");
		Thread.sleep(5000);


	}

}
