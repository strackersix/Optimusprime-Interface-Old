package br.com.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	public static WebDriver driver;

	public DriverFactory() {
		
		InicializaDriverFactory ();
		
	}

	public void InicializaDriverFactory() {
		
		if (driver == null)
			createNewDriverInstance();
		
	}

	private void createNewDriverInstance() {

		System.setProperty("webdriver.chrome.driver", "C:\\Automacao\\ChromeDriver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);

	}

	public static void FinalizaDriverFactory() {
		
		driver.quit();

	}
		
}
