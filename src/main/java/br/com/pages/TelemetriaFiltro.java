package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class TelemetriaFiltro extends BasePage {
	
	public void Url ( String url ) {
		
		driver.get(url);
			
	}
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
	}
	
	public void Telemetria () {
		
		driver.findElement(By.xpath("(//li/a[@href=\"/telemetria/medicao\"])[2]")).click();
		
	}
	
	public void GrupoEconomico ( String grupoEconomico ) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'SelectInput__placeholder'])[1]")));
		driver.findElement(By.xpath("(//div[@class = 'SelectInput__placeholder'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Pesquisar']")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Pesquisar']")).clear();
		driver.findElement(By.xpath("//input[@placeholder = 'Pesquisar']")).sendKeys(grupoEconomico);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul[@class ='SelectItemGroup__ul'])[1]")));
		Thread.sleep(500);
		driver.findElement(By.xpath("(//ul[@class ='SelectItemGroup__ul'])[1]")).click();
				
	}
	
	public void Empresa ( String empresa ) throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[@class = 'SelectAccordion FMultiSelect'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Pesquisar']")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Pesquisar']")).clear();
		driver.findElement(By.xpath("//input[@placeholder = 'Pesquisar']")).sendKeys(empresa);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li[@class = 'SelectItemGroup__ul__li'])[2]")));
		Thread.sleep(500);
		driver.findElement(By.xpath("(//ul/li[@class = 'SelectItemGroup__ul__li'])[2]")).click();
				
	}
	
	public void Unidade ( String unidade ) throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[@class = 'SelectAccordion FMultiSelect'])[3]")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Pesquisar']")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Pesquisar']")).clear();
		driver.findElement(By.xpath("//input[@placeholder = 'Pesquisar']")).sendKeys(unidade);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'SelectAccordion__content__inner'])[3]")));
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class = 'SelectAccordion__content__inner'])[3]")).click();

	}
		
	public void Periodo ( String mes, String ano ) {
		
		driver.findElement(By.xpath("//div[@class = 'datepicker']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'mx-btn mx-btn-text mx-btn-icon-double-left']")));
		String AnoDisponivel = driver.findElement(By.xpath("//button[@class = 'mx-btn mx-btn-text']")).getText();
		
		if (!AnoDisponivel.equalsIgnoreCase(ano)) {
			
			do {
				driver.findElement(By.xpath("//button[@class = 'mx-btn mx-btn-text mx-btn-icon-double-left']")).click();
				AnoDisponivel = driver.findElement(By.xpath("//button[@class = 'mx-btn mx-btn-text']")).getText();
			} while (!AnoDisponivel.equalsIgnoreCase(ano));			

		}

		driver.findElement(By.xpath("//table[@class = 'mx-table mx-table-month']/tr/td/div[text() = '"+mes+"' ]")).click();
		
	}
		
	public void WaitDashboard () throws InterruptedException {
						
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class = 'numeric-measurement']/span)[1]")));
		Thread.sleep(2000);
		
	}
	
	public String DemandaPonta () {
		 
		return driver.findElement(By.xpath("(//section[@class = 'f-card demand-widget p--base br--base m-- color--background--white color--text--font-base'])[1]")).getText();
				
	}
	
	public String DemandaPontaForaPonta () {
		 
		return driver.findElement(By.xpath("(//section[@class = 'f-card demand-widget p--base br--base m-- color--background--white color--text--font-base'])[2]")).getText();
				
	}
	
	public String ConsumoPonta () {
		 
		return driver.findElement(By.xpath("(//section[@class = 'f-card intake-card p--base br--base m-- color--background--white color--text--font-base'])[1]")).getText();
				
	}
	
	public String ConsumoForaPonta () {
		 
		return driver.findElement(By.xpath("(//section[@class = 'f-card intake-card p--base br--base m-- color--background--white color--text--font-base'])[2]")).getText();
				
	}
	
	public String ConsumoTotal () {
		 
		return driver.findElement(By.xpath("//section[@class = 'f-card intake-card p--base br--base m-- color--background--secondary color--text--font-base intake-card--total']")).getText();
				
	}
	
	public String PerfilCarga () {
		 
		return driver.findElement(By.xpath("(//div[@class = 'highcharts-container ']/*[1])[1]")).getText();
				
	}
	
	public void MaximaDia () throws InterruptedException {
		 
		driver.findElement(By.xpath("(//label[@class = 'f-checkbox__wrapper'])[1]")).click();
		Thread.sleep(2000);
						
	}
	
	public void PeriodoMes ( String dataInicio , String dataFim  ) throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[@class = 'mx-datepicker mx-datepicker-range'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class = 'mx-table mx-table-date']/tbody/tr/td/div[text() = '"+dataInicio+"']/..")).click();
		driver.findElement(By.xpath("//table[@class = 'mx-table mx-table-date']/tbody/tr/td/div[text() = '"+dataFim+"']/..")).click();
		Thread.sleep(7000);
		
	}
	

}
