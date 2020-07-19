package br.com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebElement; 
import br.com.core.BasePage;

public class MinhaCelula_UsuarioExterno extends BasePage {

	
	public void Url ( String Url ) throws InterruptedException {

		driver.get(Url);

	}	
	
	public void FaleComAgente () {
		
		driver.findElement(By.xpath("//li/a/i[@class = 'fa fa-phone fa-fw ']")).click();
				
	}
		
	public void MinhaCelula () throws InterruptedException {
		
		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-address-book fa-fw color-gray-blue']")).click();
		Thread.sleep(1000);
		
	}
		
	public void VerPerfil () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/a/i[@class = 'fa fa-id-card-o']")).click();
		Thread.sleep(1000);
	}
	
	public void Editar () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'be-inside-card-profile-edit inside-card-edit']")).click();
		Thread.sleep(1000);
	}
	
	
	public void Nome ( String nome ) {
		
		driver.findElement(By.id("be-profile-name")).clear();
		driver.findElement(By.id("be-profile-name")).sendKeys(nome);
		
	}
	
	public void Localizacao ( String localizacao ) {
		
		driver.findElement(By.id("be-profile-location")).clear();
		driver.findElement(By.id("be-profile-location")).sendKeys(localizacao);
		
	}
	
	public void Ramal ( String ramal ) {
		
		driver.findElement(By.id("be-profile-telephone-extension")).clear();
		driver.findElement(By.id("be-profile-telephone-extension")).sendKeys(ramal);
		
	}
	
	public void TelComercial ( String telComercial ) {
		
		driver.findElement(By.id("be-profile-telephone-extension")).clear();
		driver.findElement(By.id("be-profile-telephone-extension")).sendKeys(telComercial);
		
	}
 	
	public void TelCelular ( String telCelular ) {
		
		driver.findElement(By.id("be-profile-cell-phone")).clear();
		driver.findElement(By.id("be-profile-cell-phone")).sendKeys(telCelular);
		
	}
	
	public void Texto ( String texto ) {
		
		driver.findElement(By.id("be-bio")).clear();
		driver.findElement(By.id("be-bio")).sendKeys(texto);
		
	}
	
	public void Salvar () {
		
		driver.findElement(By.id("profile-save-button")).click();
		
	}
	
	public void DeixaRecado () {
		
		driver.findElement(By.xpath("//div/div/a[@id = 'module-lens-detail-post']")).click();
		
	}
		
}
