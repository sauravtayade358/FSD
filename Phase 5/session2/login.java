package com.sl.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	
	
		public static void main(String[] args) {
		        
		        //set the driver property
			System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\chromedriver.exe");
		        WebDriver driver= new ChromeDriver();
		        driver.get("https://m.facebook.com/");
		        
		        WebElement email= driver.findElement(By.xpath("//*[@id=\"m_login_email\"]"));
		        email.sendKeys("sonam@gmail.com");
		        
		        WebElement pass= driver.findElement(By.xpath("//*[@id=\"m_login_password\"]"));
		        pass.sendKeys("sonam@gmail.com");
		        
		        WebElement button= driver.findElement(By.xpath("//*[@id=\"login_password_step_element\"]/button"));
		        button.submit();
//		        WebElement email= driver.findElement(By.cssSelector("input[id*='mail']"));
//		        System.out.println(email.getAttribute("placeholder"));
//		        
//		        WebElement button= driver.findElement(By.cssSelector("button[value='Log In'][type='button']"));
//		        button.submit();
//		        System.out.println(button.getAttribute("data-sigil"));
		        //driver.close();

}
		
}
