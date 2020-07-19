package br.com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import br.com.core.BasePage;

public class Contratos_UsuarioExterno extends BasePage {

	
	public void MinhaConta () throws InterruptedException {
		
		driver.findElement(By.xpath("//li/a/i[@class = 'fa fa-cog fa-fw ']")).click();

	}
	
	public void Contratos () { 
		
		driver.findElement(By.xpath("(//a[contains(text(),'Contratos')])[2]")).click();
		
	}
	
	public void ClienteContrato ( String clienteContrato ) throws InterruptedException {
		
		Thread.sleep(1000);
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
	

  // Método para validação do Contrato. 
	
	public String ValidaContrato () {
		
		return driver.findElement(By.xpath("//div/div/h2[2]")).getText();
	
	}
	
	public void PowerView () throws InterruptedException {
		
		driver.findElement(By.xpath("//a/div/img[@src = '/images/comerc/logo-login.png']")).click();
		Thread.sleep(3000);
	}
	
	public void BtnContratos () throws InterruptedException {
		
		driver.findElement(By.xpath("(//a[@id='be-modal-tab-title-link']/span)[2]")).click();
		Thread.sleep(1000);
		
	}
		
	public void ClienteContrato2 ( String clienteContrato ) { 
		
		driver.findElement(By.id("keyword-contracts")).clear();		
		driver.findElement(By.id("keyword-contracts")).sendKeys(clienteContrato);
		
	}
	
	public void BuscarContrato () throws InterruptedException {
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(1000);
	}

  
  // Método para validação do Contrato. 
	
	public String ValidaContrato2 () throws InterruptedException {
		
		return driver.findElement(By.xpath("//div/div/h2[2]")).getText();
				
	}
	
	
}
