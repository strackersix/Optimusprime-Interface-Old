package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;


public class Auditoria extends BasePage {

	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
	}
	
	public void Auditoria () {
		
		driver.findElement(By.xpath("(//a[contains(text(),'Auditoria')])[2]")).click();
		
	}
	
	public void Cliente ( String cliente ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id = 'btn-filtrar-auditoria']")));
		driver.findElement(By.id("keyword_filter")).clear();
		driver.findElement(By.id("keyword_filter")).sendKeys(cliente);
				
	}
	
	public void Filtrar () throws InterruptedException {
		
		driver.findElement(By.id("btn-filtrar-auditoria")).click();
		Thread.sleep(3000);
		
	}
	
	public String ValidaAuditoria1 () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tbody/tr/td[@class = 'sorting_1'])[1]")));
		Thread.sleep(2000);
		return driver.findElement(By.xpath("(//tbody/tr/td[@class = 'sorting_1'])[1]")).getText();
				
	}
	
	public String ValidaAuditoria2 () {
		
		return driver.findElement(By.xpath("(//tbody/tr/td[@class = 'sorting_1'])[2]")).getText();
		
	}
	
	public String ValidaAuditoria3 () {
		
		return driver.findElement(By.xpath("(//tbody/tr/td[@class = 'sorting_1'])[3]")).getText();
		
	}
	
	public String ValidaAuditoria4 () {
		
		return driver.findElement(By.xpath("(//tbody/tr/td[@class = 'sorting_1'])[4]")).getText();
		
	}
	
	public void ExpandirAuditoria () throws InterruptedException {
		
		driver.findElement(By.xpath("(//tbody/tr/td[@class = 'sorting_1'])[1]")).click();
		Thread.sleep(3000);
		
	}
	
	public String ValidaIdAuditoria () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tbody/tr/td)[11]")));
		return driver.findElement(By.xpath("(//tbody/tr/td)[2]")).getText();
		
	}
	
	public String ValidaContrato () {
		
		return driver.findElement(By.xpath("(//tbody/tr/td)[text() = 'Contrato Gerenciamento - Contr Gerenc. - 000032']")).getText();
				
	}
		
	public void Salvar () {
		
		driver.findElement(By.xpath("(//form/span/button[@class = 'btn btn-blue btn-send-note active'])[2]")).click();
	}
	

}
