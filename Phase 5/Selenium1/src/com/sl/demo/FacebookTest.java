package com.sl.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.facebook.com/");
        WebElement email = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));
        
        email.sendKeys("tayadesaurav9@gmail.com");
        pass.sendKeys("srt@1025");
        
        WebElement login= driver.findElement(By.name("login"));
        login.submit();
		
	}

}

