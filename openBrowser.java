//package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class openBrowser {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Shiva\\Desktop\\selenium-java-2.53.1\\chromedriver_win32\\chromedriver.exe");
//		WebDriver gcdriver = new ChromeDriver();
//		gcdriver.get("http://www.techgig.com");
//		
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\Shiva\\Desktop\\selenium-java-2.53.1\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
//		WebDriver iedriver = new InternetExplorerDriver();
//		iedriver.get("http://www.techgig.com");
//		iedriver.findElement(By.id(""));

		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("http://www.techgig.com");
		
		ffdriver.findElements(By.tagName("a")).get(10).click();
	
	
	}
	
}
