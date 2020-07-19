package br.com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage; 

public class Planejamento_UsuarioExterno extends BasePage {
	
	
	public void Url ( String Url ) throws InterruptedException {

		driver.get(Url);

	}
	
	public void MinhaConta() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[1]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[1]")).click();
		
	}
	
	public void Planejamento () throws InterruptedException {
		
		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-line-chart fa-fw color-gray-blue']")).click();
		Thread.sleep(4000);
		
	}
		
	
  // Método para validação dos calculos do planejamento. 		
	
	public String ValidaVisaoCustoTotal () {
		
		return driver.findElement(By.xpath("//div[@id='tabGroupMonthly']/div[2]/div/div/div/div/span")).getText();
		
	}
	
	public String ValidaComparativosTotal2018 () {
		
		return driver.findElement(By.xpath("//div[@id='tabGroupComparative']/div[2]/div/div/div/div/span[@class = 'px22 pplan-overview-comparative-display overview-total-cost-year1']")).getText();
		
	}
	
	public String ValidaComparativosTotal2019 () {
		
		return driver.findElement(By.xpath("//div[@id='tabGroupComparative']/div[2]/div/div/div/div/span[@class = 'px22 pplan-overview-comparative-display overview-total-cost-year2']")).getText();
		
	}
	
	public void FiltrarResultados () throws InterruptedException {
		
		driver.findElement(By.id("filterLink")).click();
		Thread.sleep(1000);
		
	}

	public void ICMS () {
		
		driver.findElement(By.xpath("//form[@id='pw-form-filter-annual']/div/div/div[2]/div/label/span")).click();
		
	}
	
	public void FiltrarResultado () throws InterruptedException {
		
		driver.findElement(By.id("pw-filter-button-annual")).click();
		Thread.sleep(3000);
		
	}
	
	public void SomatorioAnual () {
		
		driver.findElement(By.xpath("(//span[@id='filterLink'])[2]")).click();
		
	}
	
	public void VisaoMensal () throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@id='tabPlan']/div[2]/ul/li[2]/a/span")).click();
		Thread.sleep(1000);
		
	}
	
	public void Comparativos () throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@id='tabPlan']/div[2]/ul/li[3]/a/span")).click();
		Thread.sleep(1000);
		
	}
	
	public void VisaoAnual () throws InterruptedException {
		
		driver.findElement(By.xpath("//li/a/i[@class = 'fa fa-calendar-o']")).click();
		Thread.sleep(1000);
	}

}
