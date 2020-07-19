package br.com.pages;

import org.openqa.selenium.By;

import br.com.core.BasePage;

public class Plugins extends BasePage {
	
	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void Usuario () {
		
		driver.findElement(By.xpath("//button[@type = 'button'][@id='dropdown-user']")).click();

	}
	
	public void Plugins () {
		
		driver.findElement(By.xpath("//ul/li/a[@tabindex=\"-1\"]/span[@class=\"fa fa-puzzle-piece\"]")).click();
		
	}
	
	public String ValidaPlugins () {
		
		return driver.findElement(By.xpath("//table[@class = 'table table-hover']/thead/tr/th/..")).getText();
		
	}
	
	public void Menus () throws InterruptedException {
		
		driver.findElement(By.xpath("//ul/li/a[@href = '/admin/modules/menus' ]")).click();
		Thread.sleep(1000);
		
	}
	
	public String ValidaMenu() {
		
		return driver.findElement(By.xpath("(//table[@class = 'table table-hover menus-table']/thead/tr/th/..)[1]")).getText();
		
	}
	
	public void Grupos () throws InterruptedException {
		
		driver.findElement(By.xpath("//ul/li/a[@href = '#grupos' ]")).click();
		Thread.sleep(1000);
		
	}
	
	public String ValidaGrupos() {
		
		return driver.findElement(By.xpath("(//table[@class = 'table table-hover menus-table']/thead/tr/th/..)[2]")).getText();
		
	}
	
	
}
