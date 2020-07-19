package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import br.com.core.BasePage;


public class MinhasMedalhas extends BasePage {

	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void Usuario () {
		
		driver.findElement(By.xpath("//button[@type = 'button'][@id='dropdown-user']")).click();

	}
	
	public void MinhasMedalhas () {
		
		driver.findElement(By.xpath("//a[contains(text(),'Minhas medalhas')]")).click();
		
	}

	
  // Método para Validação da tela Minhas Medalhas	
	
	public String ValidaMedalha () {
		
		return driver.findElement(By.xpath("//header/h4[@class = 'be-badgetracker__badges__header__title']")).getText();
		
	}
	
	public String ValidaNewbie () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[1]")).getText();
		
	}
	
	public String ValidaLetsShare () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[2]")).getText();
		
	}
	
	public String ValidaFun1 () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[3]")).getText();
		
	}
	
	public String ValidaCommenter () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[4]")).getText();
		
	}
	
	public String ValidaPersonalizador () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[9]")).getText();
		
	}
	
	public String ValidaDeveloper () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[10]")).getText();
		
	}
	
	public String ValidaPowerViewHistorico () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[11]")).getText();
		
	}
	
	public String ValidaImOnFire () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[12]")).getText();
		
	}
	
	public String ValidaRepost () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[17]")).getText();
		
	}
	
	public String ValidaPowerViewDados () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[18]")).getText();
		
	}
	
	public String ValidaPowerViewPlanejamento () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[19]")).getText();
		
	}
	
	public String ValidaPlanejamentoExpert () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[20]")).getText();
		
	}
	
	public String ValidaDeepIceberg () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[25]")).getText();
		
	}
	
	public String ValidaNinjadeInfra () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[26]")).getText();
		
	}
	
	public String Valida1k () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[27]")).getText();
		
	}
	
	public String ValidaISaoPaulo () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[28]")).getText();
		
	}
	
	public String ValidaIFlorida () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[33]")).getText();
		
	}
	
	public String ValidaVoceSabia () {
		
		return driver.findElement(By.xpath("(//section/article/h5)[34]")).getText();
		
	}
	
	public void PageDown () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (0, 500)");
		Thread.sleep(1000);
	}
	
	public void PageUp () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy ( 0, -3000 )");
		Thread.sleep(2000);
	}
	
	
}
