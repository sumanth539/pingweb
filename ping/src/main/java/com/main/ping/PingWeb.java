package com.main.ping;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class PingWeb {
	public static WebDriver driver;

	@Before
	public void login() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanpuri\\Desktop\\driver\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.get("https://ping.telebu.com/login");

		WebElement number = driver.findElement(By.id("number"));

		WebElement login = driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/button"));

		number.sendKeys("8523088073");
		login.click();

}
	
	@Test
	public void InvalidCredientials() {
		
		WebElement number = driver.findElement(By.id("number"));

		WebElement login = driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/button"));

		number.sendKeys("9999999999");
		login.click();
		
		 String actualUrl="https://ping.telebu.com/chat";
	        String expectedUrl= driver.getCurrentUrl();
	        
	        Assert.assertNotEquals(expectedUrl,actualUrl);
	}
	
	@Test
	public void SpecialCharacters() {
		WebElement number = driver.findElement(By.id("number"));

		WebElement login = driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/button"));

		number.sendKeys("A@#$%^&");
		login.click();
		
		 String actualUrl="https://ping.telebu.com/chat";
	        String expectedUrl= driver.getCurrentUrl();
	        
	        Assert.assertNotEquals(expectedUrl,actualUrl);
	}
	
	@Test
	public void GreaterThanLimit() {
	
		WebElement number = driver.findElement(By.id("number"));

		WebElement login = driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/button"));

		number.sendKeys("7896985654789");
		login.click();
		
		 String actualUrl="https://ping.telebu.com/chat";
	        String expectedUrl= driver.getCurrentUrl();
	        
	        Assert.assertNotEquals(expectedUrl,actualUrl);
	}
	
	@Test
	public void LessThanLimit() {
		WebElement number = driver.findElement(By.id("number"));

		WebElement login = driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/button"));

		number.sendKeys("789");
		login.click();
		
		 String actualUrl="https://ping.telebu.com/chat";
	        String expectedUrl= driver.getCurrentUrl();
	        
	        Assert.assertNotEquals(expectedUrl,actualUrl);
	}
	
	@Test
	public void NullCredientials() {
		
		try {
			WebElement number = driver.findElement(By.id("number"));

			WebElement login = driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/button"));

			number.sendKeys(null);
			login.click();
			
			 String actualUrl="https://ping.telebu.com/chat";
		        String expectedUrl= driver.getCurrentUrl();
		        
		        Assert.assertNotEquals(expectedUrl,actualUrl);
			
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void  IntCharCreiantials() {
		WebElement number = driver.findElement(By.id("number"));

		WebElement login = driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/button"));

		number.sendKeys("789abc2312");
		login.click();
		
		 String actualUrl="https://ping.telebu.com/chat";
	        String expectedUrl= driver.getCurrentUrl();
	        
	        Assert.assertNotEquals(expectedUrl,actualUrl);
	}
	@Test
	public void  Fractions() {
		WebElement number = driver.findElement(By.id("number"));

		WebElement login = driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/button"));

		number.sendKeys("99898784.99");
		login.click();
		
		 String actualUrl="https://ping.telebu.com/chat";
	        String expectedUrl= driver.getCurrentUrl();
	        
	        Assert.assertNotEquals(expectedUrl,actualUrl);
	}
	@Test
	public void NumberSPecialCaracters() {
		WebElement number = driver.findElement(By.id("number"));

		WebElement login = driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/button"));

		number.sendKeys("-8523496325");
		login.click();
		
		 String actualUrl="https://ping.telebu.com/chat";
	        String expectedUrl= driver.getCurrentUrl();
	        
	        Assert.assertNotEquals(expectedUrl,actualUrl);
	}
	@Test
	public void EmptyCredientials() {
		WebElement number = driver.findElement(By.id("number"));

		WebElement login = driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/button"));

		number.sendKeys("    ");
		login.click();
		
		 String actualUrl="https://ping.telebu.com/chat";
	        String expectedUrl= driver.getCurrentUrl();
	        
	        Assert.assertNotEquals(expectedUrl,actualUrl);
	}
	@Test
	public void SpacedCredientials() {
		WebElement number = driver.findElement(By.id("number"));

		WebElement login = driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/button"));

		number.sendKeys("85230 88073");
		login.click();
		
		 String actualUrl="https://ping.telebu.com/chat";
	        String expectedUrl= driver.getCurrentUrl();
	        
	        Assert.assertNotEquals(expectedUrl,actualUrl);
	}
 
}
