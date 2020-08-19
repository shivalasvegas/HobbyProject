package com.qa.hobbyproject.sfgsitetest;


import org.junit.After;

//import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

//@RunWith()
public class BasePage {
	
	private WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Documents\\AA_PROJECTS\\AA_hobbyProject\\JAVA\\HobbyProject\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	WebElement target;
	//private final static Logger LOGGER = Logger.getLogger(BasePage.class.getName());
	//String logMessage;
	
	@Test
    public void test1() throws InterruptedException {
        driver.get("http://google.com");
    }
	
//	@Test
//	public void test2() throws InterruptedException {
//		driver.get("http://localhost:8003/index.html");
//	}
//	
	@After
    public void after() {
        driver.quit();
    }
    
    

}
