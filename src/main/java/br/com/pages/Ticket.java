package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;
import br.com.core.Parametros;


public class Ticket extends BasePage {

		
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
	}

	public void Ticket() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(@href, '/ticket')])[2]")));
		driver.findElement(By.xpath("(//a[contains(@href, '/ticket')])[2]")).click();
		Thread.sleep(2000);
				
	}
		
	public void NovoTicket() {
		
		driver.findElement(By.xpath("//nav/span/button/i")).click();
		
	}	
	
	public void Titulo (String titulo ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("name")));
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys(titulo);
		
	}
	
	public void Horas (String horas) {
		
		driver.findElement(By.id("effort_hours")).clear();
		driver.findElement(By.id("effort_hours")).sendKeys(horas);
	
	}	
	
	public void Data () {
		
		driver.findElement(By.id("desired_date")).click();
		driver.findElement(By.id("desired_date")).sendKeys(Keys.RIGHT);
		driver.findElement(By.id("desired_date")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("desired_date")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("desired_date")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("desired_date")).sendKeys(Keys.ENTER);
		
	}
		
	public void Projeto (String nome) throws InterruptedException  {
		
		driver.findElement(By.id("select2-project_id-container")).click();
		driver.findElement(By.className("select2-search__field")).clear();
		driver.findElement(By.className("select2-search__field")).sendKeys(nome);
		Thread.sleep(500);
		driver.findElement(By.id("select2-project_id-results")).click();
		
	}
	
	public void Solicitante(String nome) throws InterruptedException  {
		
		driver.findElement(By.id("select2-owner_id-container")).click();
		driver.findElement(By.className("select2-search__field")).clear();
		driver.findElement(By.className("select2-search__field")).sendKeys(nome);
		Thread.sleep(500);
		driver.findElement(By.id("select2-owner_id-results")).click();
		
	}
	
	public void DirecioneTicket () throws InterruptedException {
		
		selecionarCombo(By.name("ticket_category_id[]"), "TI");
		Thread.sleep(500);
		
	}
	
	
	public void DirecioneTicket2 () throws InterruptedException {
		
		driver.findElement(By.xpath("//div[4]/div/div[2]/select")).click();
		driver.findElement(By.xpath("//div[4]/div/div[2]/select")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//div[4]/div/div[2]/select")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//div[4]/div/div[2]/select")).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
	}
	
	public void DirecioneTicket3 () throws InterruptedException {
		
		driver.findElement(By.xpath("//div[4]/div/div[3]/select")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//div[4]/div/div[3]/select")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//div[4]/div/div[3]/select")).sendKeys(Keys.ENTER);
		Thread.sleep(500);
			
	}
	
	public void Texto ( String texto ) {
		
		driver.findElement(By.cssSelector("div.note-editable.panel-body")).clear();
		driver.findElement(By.cssSelector("div.note-editable.panel-body")).sendKeys(texto);
		
	}
		
	public void Validar () {
		
		driver.findElement(By.xpath("//div[6]/div/label")).click();
		
	}
	
	public void Cadastrar () throws InterruptedException {
		
		driver.findElement(By.xpath("(//button[@type='button'])[65]")).click();
		Thread.sleep(10000);
		
	}	
		

  // Método para validação do Ticket.
	
	public String ValidaTicket () {
		
		return driver.findElement(By.xpath("//td/a/span[text() = 'Test Automation']")).getText();
			
	}
	
	public void Acoes () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[8]/div/a[1]")));
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div/a[1]")).click();
		
	}
	
	public void Apagar () throws InterruptedException {
		
		driver.findElement(By.xpath("//td[8]/div/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
	
	}
		
	static int count = 0;
	public void Go () throws InterruptedException {
					
		try {
			
			Url(Parametros.UrlPowerView);
			MinhaConta();
			Ticket();
			NovoTicket();
			Titulo("Test Automation");
//			Horas("2:00");
//			Data();
//			Projeto("Sustentação PowerView Doc88");
//			Solicitante("Gabriel Souza");
//			DirecioneTicket();
//			DirecioneTicket2();
//			DirecioneTicket3();
//			Texto("Segundo o SWEBOK 3.0, qualidade de software é uma área do conhecimento da engenharia de software que pode se referir");
//			Validar();
//			Cadastrar();
			Acoes();
			Apagar();
			
		} catch (Throwable e) {
			
			count++;
			System.out.println("TestTicket - Qtde erros: " + count );
			
		}	
		
	}
	
}	


