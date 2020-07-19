package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;


public class Planejamento extends BasePage {

	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
	}
	
	public void Planejamento () {
		
		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-line-chart fa-fw color-gray-blue']")).click();
				
	}
		
	public void SelecionarEmpresa ( String selecionarEmpresa ) throws InterruptedException {
		
		driver.findElement(By.id("unit-search-input")).clear();
		driver.findElement(By.id("unit-search-input")).sendKeys(selecionarEmpresa);
		driver.findElement(By.id("unit-search-input")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);		
	}
	
	
  // Método para validação dos calculos do planejamento. 		
	
	public String ValidaVisaoMensalCustoTotal () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[4]")).getAttribute("class");
		
	}
	
	public String ValidaConsumoMedio () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[5]")).getAttribute("class");
		
	}
	
	public String ValidaConsumoTotal () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[6]")).getAttribute("class");
		
	}
	
	public String ValidaGraficoVisaoMensalCustoTotal () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-chart col-lg-12'])[5]")).getAttribute("class");
		
	}
	
	public String ValidaComparativosTotal2018 () {
		
		return driver.findElement(By.xpath("//div[@id='tabGroupComparative']/div[2]/div/div/div/div/span[@class = 'px22 pplan-overview-comparative-display overview-total-cost-year1']")).getText();
		
	}
	
	public String ValidaComparativosTotal2019 () {
		
		return driver.findElement(By.xpath("//div[@id='tabGroupComparative']/div[2]/div/div/div/div/span[@class = 'px22 pplan-overview-comparative-display overview-total-cost-year2']")).getText();
		
	}
	
	public String ValidaVisaoAnualCustoTotal () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[1]")).getAttribute("class");
		
	}
	
	public String ValidaVisaoAnualConsumoMedio () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[1]")).getAttribute("class");
		
	}
	
	public String ValidaVisaoAnualConsumoTotal () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[1]")).getAttribute("class");
		
	}
	
	public void FiltrarResultados () throws InterruptedException {
		
		driver.findElement(By.id("filterLink")).click();
		Thread.sleep(1000);
		
	}

	public void ICMS () {
		
		driver.findElement(By.xpath("//form[@id='pw-form-filter-annual']/div/div/div[2]/div/label/span")).click();
		
	}
	
	public void FiltrarResultado () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h2/a/span[@id = 'filterLink'])[1]")));
		driver.findElement(By.xpath("(//h2/a/span[@id = 'filterLink'])[1]")).click();
				
	}
	
	public void SomatorioAnual () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@id='filterLink'])[2]")));
		driver.findElement(By.xpath("(//span[@id='filterLink'])[2]")).click();
		
	}
	
	public String ValidaGraficoSomatorioAnual () {
		
		return driver.findElement(By.xpath("(//div[@class= 'inside-pw-detail-pin-side-left-height']/div)[2]")).getAttribute("class");
		
	}
	
	public void VisaoMensal () throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@id='tabPlan']/div[2]/ul/li[2]/a/span")).click();
		Thread.sleep(1000);
		
	}
	
	public void Comparativos () throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@id='tabPlan']/div[2]/ul/li[3]/a/span")).click();
		Thread.sleep(1000);
		
	}
	
	public void VisaoAnual () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li/a/i[@class = 'fa fa-calendar-o']")));
		driver.findElement(By.xpath("//li/a/i[@class = 'fa fa-calendar-o']")).click();
				
	}
		
	public void PageUp () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy ( 0,-2000 )");
		Thread.sleep(1000);
		
	}
	
	public void PageDown () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy ( 0, 500 )");
		Thread.sleep(1000);
		
	}
	
	public String ValidaGraficoVisaoAnualCustoTotal () {
		
		return driver.findElement(By.xpath("//div/div/div[@id = 'chartAnnualTotalCost']")).getAttribute("class");
		
	}
	
	public String ValidaGraficoVisaoAnualCustoUnitario () {
		
		return driver.findElement(By.xpath("//div/div/div[@id = 'chartAnnualTotalCostMwh']")).getAttribute("class");
		
	}
	
	public String ValidaGraficoVisaoMensalCustoUnitario () {
		
		return driver.findElement(By.xpath("//div/div/div[@id = 'chartAnnualTotalCostMwh']")).getAttribute("class");
		
	}

	public String ValidaGraficoVisaoAnualConsumoTotal () {
		
		return driver.findElement(By.xpath("//div[@id = 'chartAnnualConsumption']")).getAttribute("class");
		
	}
	
	public String ValidaGraficoVisaoAnualBalancoEnergetico () {
		
		return driver.findElement(By.xpath("//div[@id = 'chartAnnualEnergeticBalance']")).getAttribute("class");
		
	}
	
	public String ValidaGraficoVisaoMensalConsumoDemanda () {
		
		return driver.findElement(By.xpath("//div[@id = 'chartMonthlyDemandConsumption']")).getAttribute("class");
		
	}
	
	public String ValidaGraficoVisaoMensalBalancoEnergetico () {
		
		return driver.findElement(By.xpath("//div/div/div[@id = 'chartAnnualEnergeticBalance']")).getAttribute("class");
		
	}
	
	public String ValidaComparativosCustoTotal () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[7]")).getAttribute("class");
		
	}
	
	public String ValidaComparativosConsumoMedio () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[8]")).getAttribute("class");
		
	}
	
	public String ValidaComparativosConsumoTotal () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[9]")).getAttribute("class");
		
	}
	
	public void ComboConsumoDemanda ( String text ) throws InterruptedException {
		
		WebElement element = driver.findElement(By.id("chartMonthlyDemandConsumption-select"));
		Select combo = new Select(element);
		combo.selectByVisibleText(text);
		Thread.sleep(1000);
		
	}
	
	public void ComboBalancoEnergetico ( String text ) throws InterruptedException {
		
		WebElement element = driver.findElement(By.id("chartMonthlyEnergeticBalance-select"));
		Select combo = new Select(element);
		combo.selectByVisibleText(text);
		Thread.sleep(1000);
		
	}
	
	public void ComboCustoEnergiaProdutoManufaturado ( String text ) throws InterruptedException {
		
		WebElement element = driver.findElement(By.id("chartMonthlyManufactures-select"));
		Select combo = new Select(element);
		combo.selectByVisibleText(text);
		Thread.sleep(1000);
				
	}
	
	public String ValidaGraficoVisaoMensalCustoEnergiaProdutoManufaturado () {
		
		return driver.findElement(By.xpath("//div[@id = 'chartMonthlyManufactures']")).getAttribute("class");
				
	}
	
	public String ValidaGraficoComparativosCustoTotal () {
		
		return driver.findElement(By.xpath("//div[@id = 'chartComparativeTotalCost']")).getAttribute("class");
		
	}
	
	public String ValidaGraficoComparativoCustoUnitario () {
		
		return driver.findElement(By.xpath("//div[@id = 'chartComparativeTotalCostMwh']")).getAttribute("class");
		
	}
	
	public void ComboComparativosConsumoTotal ( String text ) throws InterruptedException {
		
		WebElement element = driver.findElement(By.id("chartComparativeConsumption-select"));
		Select combo = new Select(element);
		combo.selectByVisibleText(text);
		Thread.sleep(1000);
		
	}
	
	public String ValidaGraficoComparativosConsumoTotal () {
		
		return driver.findElement(By.xpath("//div[@id = 'chartComparativeConsumption']")).getAttribute("class");
		
	}
	
	public String ValidaGraficoComparativosCustoEnergiaProdutoManufaturado () {
		
		return driver.findElement(By.xpath("//div[@id = 'chartComparativeManufactures']")).getAttribute("class");
		
	}
	
	public void ComparativosCustoEnergiaProdutoManufaturado ( String text ) throws InterruptedException {
		
		WebElement element = driver.findElement(By.id("chartComparativeManufactures-select"));
		Select combo = new Select(element);
		combo.selectByVisibleText(text);
		Thread.sleep(1000);		
		
	}
	
	
}
