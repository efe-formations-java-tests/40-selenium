package fr.formation;

import org.openqa.selenium.By;

public class SeleniumExemple {

	private SeleniumConfig config;
	private String url = "https://www.selenium.dev";

	public SeleniumExemple() {
		config = new SeleniumConfig();
		config.getDriver().get(url);
	}

	public void closeWindow() {
		this.config.getDriver().close();
	}

	public String getTitle() {
		return this.config.getDriver().getTitle();
	}

	
	public void manipulationPages() {
		clickSurDocumentation();

		clickSurWebDriver();
	}
	
	private void clickSurDocumentation() {
		this.config.getDriver().findElement(By.linkText("Documentation")).click();
	}
	
	private void clickSurWebDriver() {
		this.config.getDriver().findElement(By.linkText("WebDriver")).click();
	}
}
