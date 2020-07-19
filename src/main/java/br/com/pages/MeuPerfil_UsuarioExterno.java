package br.com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.core.BasePage; 


public class MeuPerfil_UsuarioExterno extends BasePage {
	
	
public void Usuario () {
		
		driver.findElement(By.xpath("//button[@type = 'button'][@id='dropdown-user']")).click();

	}
	
	public void MeuPerfil () throws InterruptedException {
		
		driver.findElement(By.xpath("//ul/li/a[@tabindex = '-2'][@href=\"/account/profile\"]")).click();
		Thread.sleep(7000);
	
	}
	
	public void Editar () throws InterruptedException { 
		
		driver.findElement(By.xpath("//button/a/span[@class = 'color-white px12']")).click();
		Thread.sleep(2000);
		
	}
	
	public void NomeUsuario ( String nomeUsuario ) {
		
		driver.findElement(By.id("be-profile-name")).clear();
		driver.findElement(By.id("be-profile-name")).sendKeys(nomeUsuario);
		
	}
	
	public void Cidade ( String cidade ) {
		
		driver.findElement(By.id("be-profile-location")).clear();
		driver.findElement(By.id("be-profile-location")).sendKeys(cidade);
		
	}
	
	public void Setor ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
				
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
		Thread.sleep(7000);
	
	}
	
	public void Scrapbook () throws InterruptedException {
		
		driver.findElement(By.xpath("//ul/li/a/i[@class = 'fa fa-comments-o']")).click();
		Thread.sleep(500);
		
	}
	
	public void Publicacoes () throws InterruptedException {
		
		driver.findElement(By.xpath("//ul/li/a/i[@class = 'fa fa-send']")).click();
		Thread.sleep(500);
		
	}
	
	public void Favoritos () {
		
		driver.findElement(By.xpath("//ul/li/a/i[@class = 'fa fa-heart']")).click();
		
	}
	

}
