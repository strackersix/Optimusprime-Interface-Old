package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class HistoricoDecisoes extends BasePage {

	
	public void Url ( String Url ) {

		driver.get(Url);

	}

	public void PesquisaDecisoes () {
		
		driver.findElement(By.xpath("//ul/li/a[@href ='/protheus-view/decisions/deleted-history']")).click();
		
	}
		
	public void DecisoesExcluidas () {
		
		driver.findElement(By.xpath("//ul/li/a[@href ='/protheus-view/decisions/deleted-history']")).click();
				
	}
	
	public void ProcurarDecisoes ( String procurarDecisoes ) {
	
		driver.findElement(By.xpath("//div/div/input[@placeholder = 'Procure por decisiões']")).clear();
		driver.findElement(By.xpath("//div/div/input[@placeholder = 'Procure por decisiões']")).sendKeys(procurarDecisoes);
		
	}
	
	public void Pesquisar () {
		
		driver.findElement(By.xpath("//div/button[@class = 'btn btn-primary btn-lg']")).click();
				
	}
	
	public void Filtros () {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'btn btn-default dropdown-toggle btn-lg']")).click();
				
	}
	
	public void FiltrarPor ( By by, String valor ) {
		
		WebElement element = driver.findElement(by.xpath("//form/div/select[@class = 'form-control input-lg'][@form = 'decisions-search-form'][@name = 'column']"));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
				
	}
	
	public void SelecionarMes (By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void DataCriacao ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	
	}
	
	public void TipoDecisao (By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
				
	}
	
	public void Status ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void Exportar () {
		
		driver.findElement(By.xpath("//div/button[@class = 'btn btn-success btn-block']")).click();
		
	}
			
	public String MontanteMWh () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tbody[@id  ='decisions-table-tbody']/tr)[1]/.")));
		return driver.findElement(By.xpath("(//tbody[@id  ='decisions-table-tbody']/tr)[1]/.")).getText();
		
	}
	
	public String IdDecisaoExcluido () {
		
		return driver.findElement(By.xpath("(//tbody/tr)[1]")).getText();
		
	}
	
}