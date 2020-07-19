package br.com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import br.com.core.BasePage;

public class PainelPrecos_UsuarioExterno extends BasePage {

 // Inclusão de Preço Venda	

	public void MinhaConta () throws InterruptedException {
		
		driver.findElement(By.xpath("//ul/li/a/i[@class = 'fa fa-cog fa-fw ']")).click();			
	
	}
	
	public void PainelPrecos () {
		
		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-usd fa-fw color-gray-blue']")).click();
		
	}
	
	public String ValidaRedirecionamentoHomePage () {
		
		return driver.findElement(By.xpath("//body/section/div[@class = 'be-ads-primary__wrapper']")).getText();
		
	}
	
	
	
}
