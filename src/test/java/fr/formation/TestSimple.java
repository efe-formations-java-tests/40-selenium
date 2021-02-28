package fr.formation;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSimple {

	
	@Test
	public void testTitre() {
		System.setProperty("webdriver.chrome.driver", "../seleniumDrivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev");
		
			
		driver.close();
		
	}
}
