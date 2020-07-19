package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;


public class Conteudo extends BasePage {

	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void Usuario () {
		
		driver.findElement(By.xpath("//button[@type = 'button'][@id='dropdown-user']")).click();

	}
	
	public void Conteudo () {
		
		driver.findElement(By.xpath("//ul/li/a/span[@class = 'fa fa-list-ol']")).click();
				
	}
	
	public void Adicionar () {
		
		driver.findElement(By.xpath("//button[@class = 'btn btn-success btn-add pull-left']")).click();
				
	}
	
	public void NomeDestaque ( String nomeDestaque ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/input[@placeholder = 'Nome do destaque']")));
		driver.findElement(By.xpath("//div/input[@placeholder = 'Nome do destaque']")).clear();
		driver.findElement(By.xpath("//div/input[@placeholder = 'Nome do destaque']")).sendKeys(nomeDestaque);
	
	}

	public void Titulo ( String titulo ) {
	
		driver.findElement(By.xpath("//div/input[@placeholder = 'Título'][@name = 'title']")).clear();
		driver.findElement(By.xpath("//div/input[@placeholder = 'Título'][@name = 'title']")).sendKeys(titulo);
		
	}

	public void Descricao ( String descricao ) {
		
		driver.findElement(By.xpath("//div/textarea[@placeholder = 'Descrição']")).clear();
		driver.findElement(By.xpath("//div/textarea[@placeholder = 'Descrição']")).sendKeys(descricao);
		
	}
	
	public void TextoBotao ( String textoBotao ) {
		
		driver.findElement(By.xpath("//div/input[@ placeholder = 'Texto do Botão']")).clear();
		driver.findElement(By.xpath("//div/input[@ placeholder = 'Texto do Botão']")).sendKeys(textoBotao);
		
	}
	
	public void CorBotao ( String corBotao ) {
		
		driver.findElement(By.xpath("//div/input[@ placeholder = 'Cor do Botão']")).clear();
		driver.findElement(By.xpath("//div/input[@ placeholder = 'Cor do Botão']")).sendKeys(corBotao);
		
	}
	
	public void UrlBotao ( String urlBotao ) {
		
		driver.findElement(By.xpath("//div//div/input[@ placeholder = 'URL do Botão']")).clear();
		driver.findElement(By.xpath("//div//div/input[@ placeholder = 'URL do Botão']")).sendKeys(urlBotao);

	}
 	
	public void Template () {
		
		driver.findElement(By.xpath("//div/label[@for = 'linkbar_type_float']")).click();
		
	}
	
	public void Cancelar () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/button[@class = 'btn btn-white pull-left']/span")).click();
		Thread.sleep(1000);
	
	}
	
	public void Categoria () throws InterruptedException {
		
		driver.findElement(By.xpath("//li/a/i[@class = 'fa fa-tag fa-fw']")).click();
		Thread.sleep(1000);
		
	}
	
	public void AdicionarCategoria () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/button[@class = 'dt-button btn btn-success pull-left']")).click();
		Thread.sleep(1000);
	
	}
	
	public void TituloCategoria ( String tituloCategoria ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/input[@placeholder = 'Título da categoria']")));
		driver.findElement(By.xpath("//form/div/input[@placeholder = 'Título da categoria']")).clear();
		driver.findElement(By.xpath("//form/div/input[@placeholder = 'Título da categoria']")).sendKeys(tituloCategoria);
		
	}
	
	public void SelecionarCategoria ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void Alterar () {
		
		driver.findElement(By.xpath("//button[@id = 'category-form--submit']")).click();
			
	}
	
	public void Ok () {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")));
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
		
	}
	
	public void CorCategoria ( String corCategoria ) {
		
		driver.findElement(By.xpath("//div/div[@class = 'input-group colorpicker-component colorpicker-element']/input")).clear();
		driver.findElement(By.xpath("//div/div[@class = 'input-group colorpicker-component colorpicker-element']/input")).sendKeys(corCategoria);
		
	}
	
	public void Grupo ( String grupo ) {
		
		driver.findElement(By.xpath("//ul/li/input[@type = 'text']")).clear();
		driver.findElement(By.xpath("//ul/li/input[@type = 'text']")).sendKeys(grupo);
		driver.findElement(By.xpath("//ul/li/input[@type = 'text']")).sendKeys(Keys.ENTER);
		
	}
	
	public void AdicionarNovaCategoria () {
		
		driver.findElement(By.id("category-form--submit")).click();
				
	}
	
	public void Busca ( String Busca ) throws InterruptedException {
		
		driver.findElement(By.xpath("//div/label/input[@placeholder = 'Deseja fazer uma busca?']")).clear();
		driver.findElement(By.xpath("//div/label/input[@placeholder = 'Deseja fazer uma busca?']")).sendKeys(Busca);
		Thread.sleep(1000);
		
	}
	
	public String ValidaCategoria () {
		
		return driver.findElement(By.xpath("(//tbody/tr/td)[3]")).getText();
		
	}
	
	public void SelecionarCategoria () throws InterruptedException {
		
		driver.findElement(By.xpath("(//tbody/tr/td)[3]")).click();
		Thread.sleep(1000);
		
	}
	
	public void EditarCategoria () {
		
		driver.findElement(By.xpath("//div/a/i[@class = 'fa fa-edit color-gray-dark']")).click();
				
	}
	
	public void ExcluirCategoria () {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/button/i[@class = 'fa fa-trash']")));
		driver.findElement(By.xpath("//div/button/i[@class = 'fa fa-trash']")).click();
				
	}
	
	public void SimExclusaoCategoria (){
		
		driver.findElement(By.xpath("//div/a/i[@class = 'glyphicon glyphicon-ok']")).click();
			
	}
	
	public String ValidaExclusaoCategoria () {
		
		return driver.findElement(By.xpath("(//tbody/tr/td/..)[1]")).getText();
		
	}
	

	
}