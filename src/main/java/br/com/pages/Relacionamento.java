package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage; 

public class Relacionamento extends BasePage {
	
	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void FaleComAgente () {
		
		driver.findElement(By.xpath("//li/a/i[@class = 'fa fa-phone fa-fw ']")).click();
				
	}
		
	public void Relacionamento () {
		
		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-comments-o fa-fw color-gray-blue']")).click();
				
	}
	
	public void NovaConversa (){
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/button[@class = 'btn btn-lg btn-success new-message pull-left']")));
		driver.findElement(By.xpath("//div/div/button[@class = 'btn btn-lg btn-success new-message pull-left']")).click();
			
	}
	
	public void Convidado ( String convidade ) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("token-input-demo-input-local")));
		driver.findElement(By.id("token-input-demo-input-local")).clear();
		driver.findElement(By.id("token-input-demo-input-local")).sendKeys(convidade);
		Thread.sleep(1000);
		driver.findElement(By.id("token-input-demo-input-local")).sendKeys(Keys.ENTER);
				
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
	
	public void Adicionar (){
		
		driver.findElement(By.xpath("//form/div/button[@id = 'ohchat-create-conversation']/i")).click();
				
	}
	
	public void Ok (){
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")));
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
				
	}
	
	
	public void EscreverResposta ( String escreverResposta ) {
		
		driver.findElement(By.xpath("//form/div/textarea[@placeholder='Escreva uma resposta']")).clear();
		driver.findElement(By.xpath("//form/div/textarea[@placeholder='Escreva uma resposta']")).sendKeys(escreverResposta);
				
	}
	
	public void Enviar () throws InterruptedException {
		
		driver.findElement(By.id("ohchat-box-send-message-submit")).click();
		Thread.sleep(1000);
		
	}
	
	public void AdicionarParticipante () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/span/i[@class = 'fa fa-fw fa-user-plus']")).click();
		Thread.sleep(1000);
	}
	
	public void Participante ( String participante ) throws InterruptedException {
		
		driver.findElement(By.id("token-input-add-participant")).clear();
		driver.findElement(By.id("token-input-add-participant")).sendKeys(participante);
		Thread.sleep(1000);
		driver.findElement(By.id("token-input-add-participant")).sendKeys(Keys.ENTER);
				
	}
	
	public void AdicionarConvidado2 () {
		
		driver.findElement(By.xpath("//div/button[@class = 'btn btn-success btn-add-participant']")).click();
	
	}
	
	public void OkConvidado () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")));
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
		
	}
		
	public void F5 () {
		
		driver.navigate().refresh();
				
	}
		
	public void Excluir () {
		
		driver.findElement(By.xpath("//span/i[@class = 'fa fa-fw fa-trash ohchat-delete-message']")).click();
				
	}
	
	public void SimExcluir () {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
			
	}
	
	public void OkExcluir () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")));
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
				
	}	

	
}
