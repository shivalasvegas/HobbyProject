package com.qa.hobbyproject.sfgsitetest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exclusive {
	
private WebDriver driver;
	

	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Documents\\AA_PROJECTS\\AA_hobbyProject\\JAVA\\HobbyProject\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	WebElement target;

	@Test
	public void test_login() throws InterruptedException {
	
		driver.get("http://35.234.148.111/exclusive.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("customerLoginButton"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Customer Login", driver.getTitle());
		Thread.sleep(3000);
	}
	
	
	@Test
	public void test_adminLogin() throws InterruptedException {
	
		driver.get("http://35.234.148.111/exclusive.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("adminLoginButton"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - AdminPortal", driver.getTitle());
		Thread.sleep(3000);
	}
	
	@Test
	public void test_nav1() throws InterruptedException {
	
		driver.get("http://35.234.148.111/exclusive.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("navGallery"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Gallery", driver.getTitle());
		Thread.sleep(3000);
	}
	
	@Test
	public void test_nav2() throws InterruptedException {
	
		driver.get("http://35.234.148.111/exclusive.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("navWorkshops"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Workshops", driver.getTitle());
		Thread.sleep(3000);
	}
	
	@Test
	public void test_adminPortal() throws InterruptedException {
	
		driver.get("http://35.234.148.111/exclusive.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("adminPortalLink"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Admin Portal", driver.getTitle());
		Thread.sleep(3000);
	}
	
	
	
	
	@After
    public void after() {
        driver.quit();
    }
    

}
