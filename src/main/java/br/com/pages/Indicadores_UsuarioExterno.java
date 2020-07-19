package br.com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.core.BasePage;

public class Indicadores_UsuarioExterno extends BasePage {
	

	public void MinhaConta () throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.dropdown-toggle")).click();

	}
	
	public void Indicadores () {
		
		driver.findElement(By.xpath("(//a[contains(text(),'Indicadores')])[2]")).click();
		
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
	
	public void DadosTabulados () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/ul/li/a/i[@class = 'fa fa-table']")).click();
		Thread.sleep(1000);
		
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
		
		return driver.findElement(By.xpath("//table[@id='data-table']/tbody/tr/td[2]")).getText();
		
	}

}


