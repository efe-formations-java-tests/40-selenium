package fr.formation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestSelenium {

	private String expectedTitle = "WebDriver :: Documentation for Selenium";
	private static SeleniumExemple seleniumExemple;
	
	@BeforeAll
	public static void setUp() {
		seleniumExemple = new SeleniumExemple();
	}
	
	
	@AfterAll
	public static void tearDown() {
	    seleniumExemple.closeWindow();
	}

	

	@Test
	public void testTitre() {
		seleniumExemple.manipulationPages();
		String titre = seleniumExemple.getTitle();
		System.out.println(titre);
		Assertions.assertEquals(expectedTitle, titre);
	}
}
