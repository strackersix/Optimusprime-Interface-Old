package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class MeuPerfil extends BasePage {
	
	
	public void Url ( String Url ) {

		driver.get(Url);

	}	
	
	public void Usuario () {
		
		driver.findElement(By.xpath("//button[@type = 'button'][@id='dropdown-user']")).click();

	}
	
	public void AcessarMeuPerfil () {
		
		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-id-card-o']")).click();
		
	}
	
	
	public void MinhaConta() {
		
		driver.findElement(By.xpath("(//li/a[@class = 'dropdown-toggle'])[1]")).click();
			
	}
	
	public void Editar () { 
		
		driver.findElement(By.xpath("//button/a/span[@class = 'color-white px12']")).click();
				
	}
	
	public void NomeUsuario ( String nomeUsuario ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("be-profile-name")));
		driver.findElement(By.id("be-profile-name")).clear();
		driver.findElement(By.id("be-profile-name")).sendKeys(nomeUsuario);
		
	}
	
	public void Cidade ( String cidade ) {
		
		driver.findElement(By.id("be-profile-location")).clear();
		driver.findElement(By.id("be-profile-location")).sendKeys(cidade);
		
	}
	
	public void Ramal ( String contatoPessoal ) {
		
		driver.findElement(By.id("be-profile-telephone-extension")).clear();
		driver.findElement(By.id("be-profile-telephone-extension")).sendKeys(contatoPessoal);
		
	}
	
	public void Comercial ( String comercial ) {
		
		driver.findElement(By.id("be-profile-home-phone")).clear();
		driver.findElement(By.id("be-profile-home-phone")).sendKeys(comercial);
		
	}
	
	public void Celular ( String celular ) {
		
		driver.findElement(By.id("be-profile-cell-phone")).clear();
		driver.findElement(By.id("be-profile-cell-phone")).sendKeys(celular);
		
	}
	
	public void TextoPessoal ( String textoPessoal ) {
		
		driver.findElement(By.id("be-bio")).clear();
		driver.findElement(By.id("be-bio")).sendKeys(textoPessoal);
		
	}
	
	public void Salvar () throws InterruptedException {
		
		driver.findElement(By.id("profile-save-button")).click();
		Thread.sleep(5000);
		
	}
	
	public void Scrapbook () throws InterruptedException {
		
		driver.findElement(By.xpath("//ul/li/a/i[@class = 'fa fa-comments-o']")).click();
		Thread.sleep(1000);
		
	}
	
	public void Publicacoes () throws InterruptedException {
		
		driver.findElement(By.xpath("//ul/li/a/i[@class = 'fa fa-send']")).click();
		Thread.sleep(1000);
		
	}
	
	public void Favoritos () {
		
		driver.findElement(By.xpath("//ul/li/a/i[@class = 'fa fa-heart']")).click();
		
	}

	
	
}
