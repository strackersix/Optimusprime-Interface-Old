package br.com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;
import br.com.core.Parametros;


public class Indicadores extends BasePage {
	
	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
	}
	
	public void Indicadores () {
		
		driver.findElement(By.xpath("(//li/a[@href = '/indicadores'])[3]")).click();
		
	}

	public void DataInicial ( String dataInicial ) {
		
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys(dataInicial);
		
	}
	
	public void DataFinal ( String dataFinal ) {
		
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys(dataFinal);
		
	}
	
	public void Atualizar () throws InterruptedException {
		
		driver.findElement(By.id("iara-filter-button")).click();
		Thread.sleep(1000);
		
	}
	
	public void RegiaoSudeste ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void DadosTabulados () {
		
		driver.findElement(By.xpath("//div/ul/li/a/i[@class = 'fa fa-table']")).click();
				
	}
	
	public void Graficos () {
		
		driver.findElement(By.xpath("//li/a/i[@class = 'fa fa-line-chart']")).click();
		
	}
	
	public void RegiaoSul ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void RegiaoNordeste ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void RegiaoNorte ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	
  // Método para validação dos Indicadores.
	
	public String ValidaIndicadoresNorte () {
		
		return driver.findElement(By.xpath("(//tbody/tr[@role = 'row' ][@class = 'odd']/td)[1]/..")).getText();
		
	}
	
	public void PageDown () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy ( 0, 2000 )");
		Thread.sleep(1000);
		
	}
	
	public void PageUp () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy ( 0, -2000 )");
		Thread.sleep(1000);
		
	}
	
	public String ValidaEnergiaNatural () {
		
		return driver.findElement(By.xpath("//div[@id = 'chartEna']")).getAttribute("class");
		
	}
	
	public String ValidaNivelReservatorios () {
		
		return driver.findElement(By.xpath("//div[@id = 'chartEar']")).getAttribute("class");
		
	}
	
	public String ValidaGraficoGeracaoCarga () {
		
		return driver.findElement(By.xpath("//div[@id = 'chartProd']")).getAttribute("class");
		
	}
	
	public void Go () throws InterruptedException {
		
		Url(Parametros.UrlPowerView);
		MinhaConta();
		Indicadores();
		
		DataInicial("01/01/2018");
		DataFinal("01/01/2020");
		RegiaoSudeste(By.id("filter-region"), "Sudeste");
		Atualizar();
		
		
		Assert.assertEquals("inside-pw-historico-chart c3", ValidaEnergiaNatural());
		Assert.assertEquals("inside-pw-historico-chart c3", ValidaNivelReservatorios());
		PageDown();
		Assert.assertEquals("inside-pw-historico-chart c3", ValidaGraficoGeracaoCarga());
		PageUp();
				
		RegiaoSul(By.id("filter-region"), "Sul");
		Atualizar();

		Assert.assertEquals("inside-pw-historico-chart c3", ValidaEnergiaNatural());
		Assert.assertEquals("inside-pw-historico-chart c3", ValidaNivelReservatorios());
		PageDown();
		Assert.assertEquals("inside-pw-historico-chart c3", ValidaGraficoGeracaoCarga());
		PageUp();
		
		RegiaoNordeste(By.id("filter-region"), "Nordeste");
		Atualizar();
		
		Assert.assertEquals("inside-pw-historico-chart c3", ValidaEnergiaNatural());
		Assert.assertEquals("inside-pw-historico-chart c3", ValidaNivelReservatorios());
		PageDown();
		Assert.assertEquals("inside-pw-historico-chart c3", ValidaGraficoGeracaoCarga());
		PageUp();
		
		RegiaoNorte(By.id("filter-region"), "Norte");
		Atualizar();
		
		Assert.assertEquals("inside-pw-historico-chart c3", ValidaEnergiaNatural());
		Assert.assertEquals("inside-pw-historico-chart c3", ValidaNivelReservatorios());
		PageDown();
		Assert.assertEquals("inside-pw-historico-chart c3", ValidaGraficoGeracaoCarga());
		PageUp();
				
		DadosTabulados();
		Assert.assertNotEquals("", ValidaIndicadoresNorte());
		
		
	}
	
	
}
