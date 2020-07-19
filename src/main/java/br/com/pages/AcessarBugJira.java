package br.com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.DriverFactory;

public class AcessarBugJira extends DriverFactory {

	
	public void UrlJira ( String urlJira ) {
		
		driver.get(urlJira);
			
	}

	public void Usuario ( String usuario ) {
		
		driver.findElement(By.id("username")).sendKeys(usuario);
				
	}
		
	public void Senha ( String senha ) {

		driver.findElement(By.id("login-submit")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		driver.findElement(By.id("password")).sendKeys(senha);
		
	}
	
	public void Entrar () {
				
		driver.findElement(By.id("login-submit")).click();
		
	}
	
	public void PesquisarTask ( String pesquisarTask ) throws InterruptedException {
		
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/form/input[@id = 'search-field-input']")));
		driver.findElement(By.xpath("//li/form/input[@id = 'search-field-input']")).sendKeys(pesquisarTask);
		Thread.sleep(2000);
				
	}
		
	public void AcessarBugVerificarStatus ( ) {
		
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class = 'ghx-column ghx-narrow-card ui-sortable'])[1]")));
		driver.findElement(By.xpath("//section[@class = 'ghx-summary']")).click();
			
	}
	

	
	
}
