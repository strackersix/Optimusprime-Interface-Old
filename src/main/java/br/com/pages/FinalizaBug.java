package br.com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.DriverFactory;
import br.com.testes.TestCalendario;

public class FinalizaBug extends DriverFactory {
	
	
	public void UrlJira ( String urlJira ) {
		
		driver.get(urlJira);
		
	}
	
	public void PesquisarTask ( String pesquisarTask ) throws InterruptedException {
		
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/form/input[@id = 'search-field-input']")));
		driver.findElement(By.xpath("//li/form/input[@id = 'search-field-input']")).sendKeys(pesquisarTask);
		Thread.sleep(2000);
		
	}
	
	public void AcessarBugVerificarStatus () {
		
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class = 'ghx-column ghx-narrow-card ui-sortable'])[1]")));
		driver.findElement(By.xpath("//section[@class = 'ghx-summary']")).click();
		
	}

	public void FinalizarBug () {
		
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class= 'elro8wh3 css-1jbxe2s']")));
		driver.findElement(By.xpath("//button[@class= 'elro8wh3 css-1jbxe2s']")).click();
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/span/span[text() = 'Finalizado']")));
		driver.findElement(By.xpath("//div/span/span[text() = 'Finalizado']")).click();
		
	}
		
	public void FinalizarBugTXT ( ) throws IOException {
		
		Calendario Step = new Calendario();
		Step.FinalizarBugArquivoTXT();
		
	}
		
}
