package com.qa.hobbyproject.sfgsitetest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {
	
private WebDriver driver;
	

	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Documents\\AA_PROJECTS\\AA_hobbyProject\\JAVA\\HobbyProject\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	WebElement target;
	
	
	@Test
	public void test_login() throws InterruptedException {
	
		driver.get("http://35.234.148.111/customerLogin.html");
		Thread.sleep(3000);
	
		target = driver.findElement(By.id("email"));
		target.sendKeys("admin@admin.com");
		
		target = driver.findElement(By.id("password"));
		target.sendKeys("adm1n2020!@1");

		assertEquals("SFG - Admin Portal", driver.getTitle());
		Thread.sleep(3000);
	}
	
	
	@Test
	public void test_nav1() throws InterruptedException {
	
		driver.get("http://35.234.148.111/adminLogin.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("navGallery"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Gallery", driver.getTitle());
		Thread.sleep(3000);
	}
	
	@Test
	public void test_nav2() throws InterruptedException {
	
		driver.get("http://35.234.148.111/adminLogin.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("navWorkshops"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Workshops", driver.getTitle());
		Thread.sleep(3000);
	}
	
	@Test
	public void test_nav3() throws InterruptedException {
	
		driver.get("http://35.234.148.111/adminLogin.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("navHome"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Home", driver.getTitle());
		Thread.sleep(3000);
	}
	
	@Test
	public void test_adminLogin() throws InterruptedException {
	
		driver.get("http://35.234.148.111/adminLogin.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("adminLoginButton"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - AdminPortal", driver.getTitle());
		Thread.sleep(3000);
	}
	
	
	@After
    public void after() {
        driver.quit();
    }
    

}
