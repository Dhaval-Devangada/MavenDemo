package com.test.hierarchy;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumHierarchy {

	WebDriver driver = new ChromeDriver();
	WebDriver driver1 = new EdgeDriver();
	ChromeDriver driver2= new ChromeDriver();
	private URL remoteAddress;
	private Capabilities capabilities;
	WebDriver driver3 = new RemoteWebDriver(remoteAddress, capabilities);
	
}
