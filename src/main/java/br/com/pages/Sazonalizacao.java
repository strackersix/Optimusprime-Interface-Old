package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class Sazonalizacao extends BasePage {
	
	
	public void Url ( String Url ) {

		driver.get(Url);

	}	
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
	}
	
	public void Sazonalizacao () {
		
		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-bar-chart fa-fw color-gray-blue']")).click();
		
	}
	
	public void Cliente ( String cliente ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("keyword-execess")));
		driver.findElement(By.id("keyword-execess")).clear();
		driver.findElement(By.id("keyword-execess")).sendKeys(cliente);
		
	}
	
	public void BuscarCliente () throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
	}
	
	public void Fornecedores () {
		
		driver.findElement(By.xpath("(//a[@id='be-modal-tab-title-text']/span)[3]")).click();
			
	}
	
	public void Fornecedor ( String fornecedor ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/input[@name= 'supplier-search']")));
		driver.findElement(By.xpath("//div/div/input[@name= 'supplier-search']")).clear();
		driver.findElement(By.xpath("//div/div/input[@name= 'supplier-search']")).sendKeys(fornecedor);
	
	}
	
	public void BuscarFornecedor () {
		
		driver.findElement(By.xpath("//div[@class = 'col-sm-12']/button[@class = 'btn btn-blue btn-lg']")).click();
				
	}
				
	public void CarregarFornecedores () { 
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='submit'])[2]")));
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
	}
		
  // Método de validação do Cliente / Grupo Econômico.	

	public String ValidaSazonalizacao () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr//td[@class = 'text-left sorting_1']")));
		return driver.findElement(By.xpath("//tbody/tr//td[@class = 'text-left sorting_1']")).getText();
		
	}

	
  // Método de validação do Fornecedor.	
	
	public String ValidaFornecedor () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tbody/tr/td/a[ @class = 'drill-supplier' ])[1]")));
		return driver.findElement(By.xpath("(//tbody/tr/td/a[ @class = 'drill-supplier' ])[1]")).getText();
		
	}
	
	public void ExpandirFornecedor () {
		
		driver.findElement(By.xpath("(//tbody/tr/td/a[ @class = 'drill-supplier' ])[1]")).click();
				
	}
	
	public void PageDown () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy ( 0, 3000 )");
		Thread.sleep(1000);

	}
	
	
  // Método de validação do UC.
	
	public String ValidaUC () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tbody//tbody[2]/tr/td[3])[1]")));
		return driver.findElement(By.xpath("(//tbody//tbody[2]/tr/td[3])[1]")).getText();
		
	}
	
	
}
