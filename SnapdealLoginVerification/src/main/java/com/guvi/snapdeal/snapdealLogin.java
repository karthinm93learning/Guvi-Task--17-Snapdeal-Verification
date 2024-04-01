package com.guvi.snapdeal;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdealLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement signInButton = driver.findElement(By.xpath("//span[contains(@class,'accountUserName')]"));
		signInButton.click();
		
		
		WebElement loginButton = driver.findElement(By.xpath("//span[starts-with(@class,'accountBtn')]"));
		loginButton.click();
		
		driver.switchTo().frame("loginIframe");
		
		WebElement emailField = driver.findElement(By.id("userName"));
		emailField.sendKeys("test@test.com");
		
		WebElement continueButton = driver.findElement(By.xpath("//button[text() = 'continue']"));
		continueButton.click();
		
		//Site got updated with OTP. We cannot automate OTP. So i stopped untill continue button.
		
		driver.switchTo().defaultContent();
		
		driver.close();
		
	}

}
