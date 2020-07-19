package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class PainelPrecos extends BasePage {
	

	public void Url ( String Url ) {

		driver.get(Url);

	}	
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
	}
	
	public void PainelPrecos () {
		
		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-usd fa-fw color-gray-blue']")).click();
		
	}
	
	public void NovoPreco () throws InterruptedException {
		
		driver.findElement(By.id("pld-add__button")).click();
		Thread.sleep(1000);
	}
	
	public void VendaConv () throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.name("selling_price[SECO][CONV]")).click();
		driver.findElement(By.name("selling_price[SECO][CONV]")).click();
									
	}
	
	public void VendaI0 () {
		
		driver.findElement(By.name("selling_price[SECO][I0]")).click();
		driver.findElement(By.name("selling_price[SECO][I0]")).click();
		
	}
	
	public void VendaI50 () {
		
		driver.findElement(By.name("selling_price[SECO][I50]")).click();
		driver.findElement(By.name("selling_price[SECO][I50]")).click();
		
	}
	
	public void VendaI100 () {
		
		driver.findElement(By.name("selling_price[SECO][I100]")).click();
		driver.findElement(By.name("selling_price[SECO][I100]")).click();

	}

	
 // Inclusão de Preço Cessão & Compra. 	
	
	public void Compra () {
		
		driver.findElement(By.name("repurchase_price[SECO][CONV]")).click();
		driver.findElement(By.name("repurchase_price[SECO][CONV]")).click();
				
	}
	
	public void CompraI0 () {
		
		driver.findElement(By.name("repurchase_price[SECO][I0]")).click();
		driver.findElement(By.name("repurchase_price[SECO][I0]")).click();
				
	}

	public void CompraI50 () {
		
		driver.findElement(By.name("repurchase_price[SECO][I50]")).click();
		driver.findElement(By.name("repurchase_price[SECO][I50]")).click();
				
	}
	
	public void CompraI100 () {
		
		driver.findElement(By.name("repurchase_price[SECO][I100]")).click();
		driver.findElement(By.name("repurchase_price[SECO][I100]")).click();
				
	}
	

	public void Observacao ( String observacao ) {
		
		driver.findElement(By.name("observation")).clear();
		driver.findElement(By.name("observation")).sendKeys(observacao);
		
	}
	
	public void Adicionar () throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@id='pld-insert-button']/span")).click();
		Thread.sleep(6000);
		
	}
	
	
 // Atulizar PLD e CCEE		
	
	public void AtualizarPLDCCEE () { 
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("pld-update-table")));
		driver.findElement(By.id("pld-update-table")).click();
				
	}
	
	public String ValidaAtualizacaoPLDCEE () {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/h2[text() = 'Dados extraidos com sucesso!']")));
		return driver.findElement(By.xpath("//div/div/h2[text() = 'Dados extraidos com sucesso!']")).getText();
		
	}
	
	public void Ok () {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
		
	}
	
	
	
}
