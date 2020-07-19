package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class Logout extends BasePage {

	
	public void Url ( String url ) {
		
		driver.get(url);
		
	}
	
	public void MenuInicial () {
		
		driver.findElement(By.cssSelector("img")).click();
		
	}
	
	public void UsuarioLogado()  {
		
		driver.findElement(By.xpath("//button[@id='dropdown-user']/span[2]")).click();
		
	}
	
	public void Sair() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@action='/auth/logout']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@action='/auth/logout']")).click();
		
	}
	

  // Método de Validação do Logout	
	
	public String ValidacaoLogout () {
		
		return driver.findElement(By.id("be-login")).getText();
		
	}
	
	
	
}







