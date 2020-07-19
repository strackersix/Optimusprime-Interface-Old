package br.com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement; 
import br.com.core.BasePage; 


public class Relacionamento_UsuarioExterno extends BasePage {
	
	
	public void Url ( String Url ) throws InterruptedException {

		Thread.sleep(7000);
		driver.get(Url);

	}	
	
	public void FaleComAgente () {
		
		driver.findElement(By.xpath("//li/a/i[@class = 'fa fa-phone fa-fw ']")).click();
				
	}
		
	public void Relacionamento () throws InterruptedException {
		
		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-comments-o fa-fw color-gray-blue']")).click();
		Thread.sleep(1000);
		
	}
	
	public void NovaConversa () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'btn btn-lg btn-success new-message pull-left']")).click();
		Thread.sleep(1000);
		
	}
	
	public void Convidado ( String convidade ) throws InterruptedException {
		
		driver.findElement(By.id("token-input-demo-input-local")).clear();
		driver.findElement(By.id("token-input-demo-input-local")).sendKeys(convidade);
		Thread.sleep(1000);
		driver.findElement(By.id("token-input-demo-input-local")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
	}
	
	public void Assunto ( String assunto ) throws InterruptedException {
		
		driver.findElement(By.xpath("//div/div/input[@id= 'subject']")).clear();
		driver.findElement(By.xpath("//div/div/input[@id= 'subject']")).sendKeys(assunto);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div/input[@id= 'subject']")).sendKeys(Keys.ENTER);
		
	}
	
	public void Texto ( String texto ) {
		
		driver.switchTo().frame("txtEditor_ifr");
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys(texto);
		driver.switchTo().defaultContent();
				
	}
	
	public void Adicionar () throws InterruptedException {
		
		driver.findElement(By.xpath("//form/div/button[@id = 'ohchat-create-conversation']")).click();
		Thread.sleep(2000);
		
	}
	
	public void Ok () {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
		
	}
	
	public void EscreverResposta ( String escreverResposta ) {
		
		driver.findElement(By.xpath("//form/div/textarea[@placeholder=\"Escreva uma resposta\"]")).clear();
		driver.findElement(By.xpath("//form/div/textarea[@placeholder=\"Escreva uma resposta\"]")).sendKeys(escreverResposta);
				
	}
	
	public void Enviar () throws InterruptedException {
		
		driver.findElement(By.id("ohchat-box-send-message-submit")).click();
		Thread.sleep(1000);
		
	}
	
	public void Excluir () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/span/i[@class = 'fa fa-fw fa-trash ohchat-delete-message']")).click();
		Thread.sleep(1000);
		
	}
	
	public void SimExcluir () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
		Thread.sleep(1000);
		
	}
	
	public void OkExcluir () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
		Thread.sleep(1000);
		
	}

}
