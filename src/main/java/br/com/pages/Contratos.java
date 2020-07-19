package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;


public class Contratos extends BasePage {

	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
	}
	
	public void Contratos () { 
		
		driver.findElement(By.xpath("(//a[contains(text(),'Contratos')])[2]")).click();
		
	}
	
	public void ClienteContrato ( String clienteContrato ) {
		
		driver.findElement(By.id("keyword-execess")).clear();
		driver.findElement(By.id("keyword-execess")).sendKeys(clienteContrato);
		
	}
	
	public void Data ( String data ) {
		
		driver.findElement(By.name("year_month")).clear();
		driver.findElement(By.name("year_month")).sendKeys(data);
		
	}
	
	public void Buscar () {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
	}
	
	public void ExpandirContrato () {
		
		driver.findElement(By.xpath("//tr/td[@class = 'text-left calc-group-economic']")).click();		
				
	}
	
	public String ValidaExpansaoGrupoEconomico () {
		
		return driver.findElement(By.xpath("//tbody/tr/td[text() = 'PV0004/01']")).getText();
		
	}
	
  // Método para validação do Contrato. 
	
	public String ValidaContrato () {
		
		return driver.findElement(By.xpath("//tbody/tr/td[4]/b[@id = 'be-id-unit']")).getText();
	
	}
	
	
	public void PageUp () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (0, -2000 )");
		Thread.sleep(1000);
		
	}
	
	public void BtnContratos () {
		
		driver.findElement(By.xpath("(//a[@id='be-modal-tab-title-link']/span)[2]")).click();
				
	}
		
	public void ClienteContrato2 ( String clienteContrato ) { 
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("keyword-contracts")));
		driver.findElement(By.id("keyword-contracts")).clear();		
		driver.findElement(By.id("keyword-contracts")).sendKeys(clienteContrato);
		
	}
	
	public void BuscarContrato () {
		
		driver.findElement(By.xpath("(//form/div/button[@class = 'btn btn-blue btn-lg'])[2]")).click();
				
	}

  
  // Método para validação do Contrato. 
	
	public String ValidaContrato2 () {
		
		return driver.findElement(By.xpath("//tr/td/b")).getText();
				
	}
	
	public void ExpandirContrato2 () {
		
		driver.findElement(By.xpath("(//tbody/tr/td)[2]")).click();
				
	}
	
	public String ValidaDadosCadastrais () {
		
		return driver.findElement(By.xpath("//td/p/b")).getText();
		
	}
	
	public String ValidaDadosCadastrais2 () {
		
		return driver.findElement(By.xpath("//tbody/tr/td[text() = 'PV0004']")).getText();
		
	}
	
	public void PageDown () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (0, 2000)");
		Thread.sleep(1000);
		
	}
	
	public void FornecimentoProinfa () {
		
		driver.findElement(By.xpath("//li/a/span[text() = 'Fornecimento e PROINFA']")).click();
		
	}
	
	public void ContratoFornecimento () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/h4/a")));
		driver.findElement(By.xpath("//div/h4/a")).click();		
		
	}
		
	public String IdentificadorContrato () {
		
		return driver.findElement(By.xpath("//tbody/tr/td[text() = 'LP2017111601']")).getText();
		
	}
	
	public void Documentos () {
		
		driver.findElement(By.xpath("//li/a/span[text() = 'Documentos']")).click();
			
	}
	
	public String ValidaDocumentos () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//thead/tr/th[text() = 'Documentos relacionados ao cliente POWERVIEW BALANCO UNID 1      ']")));
		return driver.findElement(By.xpath("//thead/tr/th[text() = 'Documentos relacionados ao cliente POWERVIEW BALANCO UNID 1      ']")).getText();
		
	}
	
	public void Medicoes () {
		
		driver.findElement(By.xpath("//li/a/span[text() = 'Medições']")).click();
	
	}
	
	public void Periodo ( String periodo ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/input[@name = 'measurements-date']")));
		driver.findElement(By.xpath("//div/div/input[@name = 'measurements-date']")).clear();
		driver.findElement(By.xpath("//div/div/input[@name = 'measurements-date']")).sendKeys(periodo);
		driver.findElement(By.xpath("//div/div/input[@name = 'measurements-date']")).sendKeys(Keys.TAB);
			
	}
	
	public String ConsumoTotalMes () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/span/span)[7]")));
		return driver.findElement(By.xpath("(//div/span/span)[7]")).getText();
		
	}
	
	public String ConsumoTotal1 () {
		
		return driver.findElement(By.xpath("(//div/span/span)[11]")).getText();
		
	}
	
	public String ConsumoTotal2 () {
		
		return driver.findElement(By.xpath("(//div/span/span)[15]")).getText();
		
	}
	
	public String DemandaMaxima1 () {
		
		return driver.findElement(By.xpath("(//div/span/span)[19]")).getText();
		
	}
	
	public String DemandaMaxima2 () {
		
		return driver.findElement(By.xpath("(//div/span/span)[23]")).getText();
		
	}
	
	public void AjustesReportados () {
		
		driver.findElement(By.xpath("//li/a/span[text() = 'Ajustes Reportados']")).click();
	
		
	}
	
	
}
