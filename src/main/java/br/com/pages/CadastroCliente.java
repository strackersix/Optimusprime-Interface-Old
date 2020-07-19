package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class CadastroCliente extends BasePage {
	
	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
	}
	
	public void CadastroClientes () {
		
		driver.findElement(By.xpath("(//li/a[@href='/client-signup/manage'])[2]")).click();
		
	}
		
	public void NovoCliente () {
		
		driver.findElement(By.cssSelector("button.btn.btn-success.pull-left")).click();
		
	}
	
	public void Empresa ( String empresa ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("client-signup-company-name")));
		driver.findElement(By.id("client-signup-company-name")).clear();
		driver.findElement(By.id("client-signup-company-name")).sendKeys(empresa);
		
	}
	
	public void Contato ( String contato ) {
		
		driver.findElement(By.id("client-signup-contact-name")).clear();
		driver.findElement(By.id("client-signup-contact-name")).sendKeys(contato);
	
	}
 	
	public void Email ( String email ) {
		
		driver.findElement(By.id("client-signup-contact-email")).clear();
		driver.findElement(By.id("client-signup-contact-email")).sendKeys(email);
		
	}
	
	public void Enviar () {
		
		driver.findElement(By.xpath("//button[@id='client-signup-store-button']/span")).click();
		
	}
	
	public void EnviarNotificar () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")));
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
		Thread.sleep(2000);
		
	}

}
