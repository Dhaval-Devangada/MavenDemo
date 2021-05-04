package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest3 {

	@Parameters("Browser")
	@Test
	public void startBrowser(String browserName) {
		
		System.out.println("Parameter value is"+browserName);
		WebDriver driver=null;
		
		if(browserName.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if (browserName.contains("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
	}
	

}
