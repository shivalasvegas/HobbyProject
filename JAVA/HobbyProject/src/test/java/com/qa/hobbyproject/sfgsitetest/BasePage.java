package com.qa.hobbyproject.sfgsitetest;


import org.junit.After;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.springframework.boot.test.context.SpringBootTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class BasePage {
	
	private WebDriver driver;
	

	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Documents\\AA_PROJECTS\\AA_hobbyProject\\JAVA\\HobbyProject\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	WebElement target;

	
	@Test
	public void test_carousel1() throws InterruptedException {
	
		driver.get("http://35.234.148.111/index.html");
		Thread.sleep(9000);
		target = driver.findElement(By.id("signUpButton"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Sign Up", driver.getTitle());
		Thread.sleep(3000);
	}
	
	@Test
	public void test_carousel2() throws InterruptedException {
	
		driver.get("http://35.234.148.111/index.html");
		Thread.sleep(9000);
		target = driver.findElement(By.id("workshopButton"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Workshops", driver.getTitle());
		Thread.sleep(3000);
	}
	
	
	@Test
	public void test_carousel3() throws InterruptedException {
	
		driver.get("http://35.234.148.111/index.html");
		Thread.sleep(9000);
		target = driver.findElement(By.id("galleryButton"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Gallery", driver.getTitle());
		Thread.sleep(3000);
	}
	
	@Test
	public void test_login() throws InterruptedException {
	
		driver.get("http://35.234.148.111/index.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("customerLoginButton"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Customer Login", driver.getTitle());
		Thread.sleep(3000);
	}
	
	@Test
	public void test_nav1() throws InterruptedException {
	
		driver.get("http://35.234.148.111/index.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("navGallery"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Gallery", driver.getTitle());
		Thread.sleep(3000);
	}
	
	@Test
	public void test_nav2() throws InterruptedException {
	
		driver.get("http://35.234.148.111/index.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("navWorkshops"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Workshops", driver.getTitle());
		Thread.sleep(3000);
	}
	
	@Test
	public void test_nav3() throws InterruptedException {
	
		driver.get("http://35.234.148.111/index.html");
		Thread.sleep(3000);
		target = driver.findElement(By.id("navHome"));
		target.click();
		Thread.sleep(9000); 
		assertEquals("SFG - Home", driver.getTitle());
		Thread.sleep(3000);
	}
	
	
	@After
    public void after() {
        driver.quit();
    }
    
    

}
