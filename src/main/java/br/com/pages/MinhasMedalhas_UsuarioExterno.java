package br.com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebElement;
import br.com.core.BasePage;

public class MinhasMedalhas_UsuarioExterno extends BasePage {
	
	
	public void Url ( String Url ) throws InterruptedException {

		driver.get(Url);

	}
	
	public void Usuario () {
		
		driver.findElement(By.xpath("//button[@type = 'button'][@id='dropdown-user']")).click();

	}
	
	public void MinhasMedalhas () {
		
		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-trophy']")).click();
		
	}
		
	public String ValidaMedalhas () {
		
		return driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Fun #1'])[1]/preceding::h5[2]")).getText();
		
	}
	

}
