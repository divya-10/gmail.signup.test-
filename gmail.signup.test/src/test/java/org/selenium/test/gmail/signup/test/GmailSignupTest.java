package org.selenium.test.gmail.signup.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class GmailSignupTest {
	static WebDriver driver;

	@BeforeClass
	public static void chromeDriverSetup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/about/#");
	}

	@AfterClass
	public static void chromeDriverTearDown() {
		driver.quit();
	}
	@Test
	public void validateLandingPageUrl() {
		assertEquals("https://www.google.com/gmail/about/#", driver.getCurrentUrl());
	}
	
	public void validateLandingPageFields() {
		WebElement forWorkbutton = null;
		try {
			 forWorkbutton = driver.findElement(By.cssSelector("cssSelector"));
			 //body > div.hercules-header.h-c-header.h-c-header--product-marketing-one-tier.header--desktop > div.h-c-header__bar > div.h-c-header__cta > ul.h-c-header__cta-list.header__nav--ltr > li:nth-child(1) > a
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			
		}
		assertNotNull(forWorkbutton);
		
	}

}
