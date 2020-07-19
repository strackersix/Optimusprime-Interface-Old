package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import br.com.core.BasePage;

public class Dashmaker extends BasePage {

	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void Usuario() {
		
		driver.findElement(By.xpath("//div/button/span[@id = 'be-menu-profile-name']")).click();
		
	}	
	
	public void Dashmaker () {
		
		driver.findElement(By.xpath("//ul/li/a[@href=\"/dashmaker\"]")).click();
		
	}
	
	public void NovoDashmaker () {
		
		driver.findElement(By.xpath("//div[@id='react-tabs-1']/div/div/button/span")).click();
		
	}
	
	public void Titulo ( String titulo ) throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='title'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@name='title'])[3]")).sendKeys(titulo);
		
	}
	
	public void Cards ( String cards ) {
		
		driver.findElement(By.name("max_cards")).clear();
		driver.findElement(By.name("max_cards")).sendKeys(cards);
		
	}	
	
	public void Descricao ( String descricao ) throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(descricao);
		
	}
	
	public void Grupos ( String grupos ) throws InterruptedException {
		
		driver.findElement(By.id("token-input-")).clear();
		driver.findElement(By.id("token-input-")).sendKeys(grupos);
		Thread.sleep(1000);
		driver.findElement(By.id("token-input-")).sendKeys(Keys.ENTER);
		
	}
	
	public void Categorias ( String categoria ) throws InterruptedException {
		
		driver.findElement(By.xpath("(//input[@id='token-input-'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@id='token-input-'])[2]")).sendKeys(categoria);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='token-input-'])[2]")).sendKeys(Keys.ENTER);
		
	}
	
	public void TempoExibicao () {
		
		 driver.findElement(By.cssSelector("div.radio > label")).click();
		
	}
	
	public void Salvar () throws InterruptedException {
		
		driver.findElement(By.xpath("//div[2]/div/div/div[3]/button/span")).click();
		Thread.sleep(2000);
		
	}
	
	public void RemoverOitavaPosicao () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/button/i[@class = 'fa fa-trash'])[8]")).click();
		Thread.sleep(1000);
		
	}
	
	public void Sim () {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
	
	}
	
	public String ValidaRemocaoDashMaker () {
		
		return driver.findElement(By.xpath("//div/div/div[text() = 'Automação de Teste.']")).getText();
		
	}
		
	public void GuiaCards () throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='react-tabs-2']/a/span")).click();
		
	}
		
}
