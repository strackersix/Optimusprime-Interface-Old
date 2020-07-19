package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class Historico extends BasePage {

	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
	}
	
	public void historico () {
		
		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-pie-chart fa-fw color-gray-blue']")).click();
		
	}
		
	public void SelecionarEmpresa ( String selecionarEmpresa ) {
		
		driver.findElement(By.id("unit-search-input")).clear();
		driver.findElement(By.id("unit-search-input")).sendKeys(selecionarEmpresa);
				
	}
	
	public void Pesquisar () {
		
		driver.findElement(By.xpath("//button[@id='unit-search-button']/i")).click();
		
	}
	
	public void DataInicial ( String dataInicial ) {
		
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys(dataInicial);
		
	}
	
	public void DataFinal ( String dataFinal ) {
		
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys(dataFinal);
		
	}
	
	public void GerarRelatorio () {
		
		driver.findElement(By.id("hist-filter-button")).click();
				
	}
	
	public void Icms () {
		
		driver.findElement(By.xpath("//form[@id='pw-form-filter']/div/div[3]/div/label/span")).click();
		
	}
	
	public void DadosTabulados () {
		
		driver.findElement(By.xpath("(//a[@id='be-modal-tab-title-text']/span)[3]")).click();
		
	}
	
	public String ValidaSecao () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tbody[@id = 'historico-table-body']/tr/td)[1]")));
		return driver.findElement(By.xpath("(//tbody[@id = 'historico-table-body']/tr/td)[1]")).getText();
		
	}
	
	public String ValidaIndicador () {
		
		return driver.findElement(By.xpath("(//tbody[@id = 'historico-table-body']/tr/td)[2]")).getText();
		
	}

	public String ValidaData () {
		
		return driver.findElement(By.xpath("(//tbody[@id = 'historico-table-body']/tr/td)[3]")).getText();
		
	}

  // Método para validar histórico.
	
	public String ValidaEconomia () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[1]")).getAttribute("class");
		
	}
	
	public String ValidaEconomiaPorcentagem () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[2]")).getAttribute("class");
		
	}
	
	public String ValidaEconomiaAcumulada () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[3]")).getAttribute("class");
		
	}
	
	public void Graticos () {
		
		driver.findElement(By.xpath("//li/a/span[text() = 'Gráficos']")).click();
				
	}
	
	public void PageDown () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (0 , 550)");
		Thread.sleep(1000);		
	}
	
	public String CustoConsolidado () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-chart col-md-12'])[1]")).getAttribute("class");
		
	}
	
	public String ValidaEnergia () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-chart col-md-12'])[2]")).getAttribute("class");
		
	}
	
	public void RS() {
		
		driver.findElement(By.xpath("(//li/a/span[text() = 'R$'])[1]")).click();
				
	}
	
	
	public void MontanteMWh() throws InterruptedException {
		
		driver.findElement(By.xpath("//li/a/span[text() = 'Montante (MWh)']")).click();
		Thread.sleep(1000);
		
	}
	
	public void MontanteMWm() throws InterruptedException {
		
		driver.findElement(By.xpath("//li/a/span[text() = 'Montante (MWm)']")).click();
		Thread.sleep(1000);
		
	}
	
	public void RS2 () {
		
		driver.findElement(By.xpath("(//li/a/span[text() = 'R$'])[2]")).click();
				
	}
	
	public void Unitario () throws InterruptedException {
		
		driver.findElement(By.xpath("(//li/a/span[text() = 'Unitário (R$/MWh)'])")).click();
		Thread.sleep(1000);		
		
	}
	
	public void Economia () {
		
		driver.findElement(By.xpath("(//li/a/span[text() = 'Economia (%)'])")).click();
				
	}
	
	public void Consumo () throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li/a/span[text() = 'Consumo'])[1]")).click();
		Thread.sleep(1000);
		
	}
	
	public void Demanda () throws InterruptedException {
		
		driver.findElement(By.xpath("(//li/a/span[text() = 'Demanda'])[1]")).click();
		Thread.sleep(1000);
		
	}	
	
	public void ComboUnidade ( String texto ) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button/span/span[@class = 'caret'])[10]")));
		driver.findElement(By.xpath("(//button/span/span[@class = 'caret'])[10]")).click();
		WebElement ExpandirCombo = driver.findElement(By.xpath("(//a/span[. = '"+texto+"'])[4]"));		
		Actions ClicaItemCombo = new Actions(driver).click(ExpandirCombo);
		ClicaItemCombo.build().perform();
		Thread.sleep(1000);
		
	}
	
	public void PageUp () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (0, -4000)");
		Thread.sleep(2000);
		
	}
	
	public String ValidaDistribuidora () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-chart col-md-12'])[3]")).getAttribute("class");
		
	}
	
	public String ValidaCCEE () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-chart col-md-12'])[4]")).getAttribute("class");
		
	}
	
	public String ValidaGestao () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-chart col-md-12'])[5]")).getAttribute("class");
		
	}
	
	public String ValidaResumoOperacional () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-chart col-md-12'])[6]")).getAttribute("class");
		
	}
	
	public String ValidaConsumoDemanda () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-chart col-md-12'])[7]")).getAttribute("class");
		
	}
	
	
	
}
