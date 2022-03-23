package com.sl.orc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg {

	public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805499%7Ce%7Cfacebook%20account%7C&placement=&creative=550525805499&");
       
       
       WebElement firstname= driver.findElement(By.name("firstname"));
       WebElement lastname= driver.findElement(By.name("lastname"));
       WebElement regemail= driver.findElement(By.name("reg_email__"));
       WebElement cregemail= driver.findElement(By.name("reg_email_confirmation__"));
       WebElement pass= driver.findElement(By.name("reg_passwd__"));
       WebElement day= driver.findElement(By.name("birthday_day"));
       WebElement mon= driver.findElement(By.name("birthday_month"));
       WebElement year= driver.findElement(By.name("birthday_year"));
     
       WebElement radioclick= driver.findElement(By.xpath("//label[text()='Male']"));
      
       WebElement button= driver.findElement(By.xpath("//button[text()='Sign Up']"));
     
       
      firstname.sendKeys("Saurav");
      lastname.sendKeys("Tayade");
      regemail.sendKeys("sauravtayade8@gmail.com");
      cregemail.sendKeys("sauravtayade8@gmail.com");
      
      pass.sendKeys("SauarvT@_28");
      day.sendKeys("28");
      mon.sendKeys("Dec");
      year.sendKeys("1998");
      radioclick.click();
      button.click();
      
	}
}

