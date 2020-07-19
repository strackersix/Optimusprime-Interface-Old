package br.com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import br.com.core.BasePage;

public class Logout_UsuarioExterno extends BasePage {
	
	
	public void Url ( String Url ) throws InterruptedException {

		driver.get(Url);

	}	
	
	public void MenuInicial () {
		
		driver.findElement(By.cssSelector("img")).click();
		
	}
	
	public void UsuarioLogado()  {
		
		driver.findElement(By.xpath("//button[@id='dropdown-user']/span[2]")).click();
		
	}
	
	public void Sair() throws InterruptedException {
		
		driver.findElement(By.xpath("//form[@action='/auth/logout']")).click();
		Thread.sleep(3000);
	}
	

  // Método de Validação do Logout	
	
	public String ValidacaoLogout () {
		
		return driver.findElement(By.id("be-login")).getText();
		
	}
		

}
