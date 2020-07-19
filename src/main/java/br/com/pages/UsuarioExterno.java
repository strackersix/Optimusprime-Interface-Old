package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;


public class UsuarioExterno extends BasePage {

		
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void Usuario () {
		
		driver.findElement(By.xpath("//button[@type = 'button'][@id='dropdown-user']")).click();

	}
	
	public void PowerView () {
		
		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-fw fa-cog']")).click();
				
	}
	
	public void Adicionar () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/a/span/li[@class = 'fa fa-plus']")));
		driver.findElement(By.xpath("//div/a/span/li[@class = 'fa fa-plus']")).click();
				
	}
	
	public void NomeUsuario ( String nomeUsuario ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("be-user-name")));
		driver.findElement(By.id("be-user-name")).clear();
		driver.findElement(By.id("be-user-name")).sendKeys(nomeUsuario);
		
	}
	
	public void Email ( String email ) {
		
		driver.findElement(By.id("be-user-email")).clear();
		driver.findElement(By.id("be-user-email")).sendKeys(email);
		
	}
	
	public void Login ( String login ) {
		
		driver.findElement(By.id("be-user-login")).clear();
		driver.findElement(By.id("be-user-login")).sendKeys(login);
		
	}
 	
	public void Senha ( String senha ) {
		
		driver.findElement(By.id("be-user-password")).clear();
		driver.findElement(By.id("be-user-password")).sendKeys(senha);
		
	}
	
	public void UsuarioDegustacao () {
		
		driver.findElement(By.name("usr_expire")).click();
				
	}
	
	public void DiasDegustacao ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void Permissoes () {
		
		driver.findElement(By.xpath("//div/span/a[@id = 'btnClientRoles']")).click();
		
	}
	
	public void Grupos ( String grupos ) throws InterruptedException {
		
		driver.findElement(By.id("token-input-be-user-groups")).clear();
		driver.findElement(By.id("token-input-be-user-groups")).sendKeys(grupos);
		Thread.sleep(2000);
		driver.findElement(By.id("token-input-be-user-groups")).sendKeys(Keys.ENTER);
		
	}
	
	
	public void EnviarEmail () {
		
		driver.findElement(By.name("sendEmail")).click();
		
	}
	
	public void GruposEconomicos ( String gruposEconomicos) throws InterruptedException {
		
		driver.findElement(By.id("token-input-be-input-egroup")).clear();
		driver.findElement(By.id("token-input-be-input-egroup")).sendKeys(gruposEconomicos);
		Thread.sleep(2000);
		driver.findElement(By.id("token-input-be-input-egroup")).sendKeys(Keys.ENTER);
			
	}
	
	public void Historico () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//th/div/label[@for = 'checkbox-hs-all']")));
		driver.findElement(By.xpath("//th/div/label[@for = 'checkbox-hs-all']")).click();
				
	}
	
	public void Planejamento () {
		
		driver.findElement(By.xpath("//th/div/label[@for = 'checkbox-pl-all']")).click();
		
	}
	
	public void Infomerc () {
		
		driver.findElement(By.xpath("//th/div/label[@for = 'checkbox-if-all']")).click();
		
	}
	
	public void AdicionarUsuario () {
		
		driver.findElement(By.xpath("//button/i[@class = 'fa fa-plus']")).click();
		
	}
	
	public void CadastradoSucesso () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")));
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
		
	}
	
	
	public void Pesquisar ( String pesquisar ) throws InterruptedException {
		
		driver.findElement(By.xpath("//div/label/input[@type = 'search']")).clear();
		driver.findElement(By.xpath("//div/label/input[@type = 'search']")).sendKeys(pesquisar);
		Thread.sleep(1000);
	}
	
	public String EmailCadastrado () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr/td[3]")));
		Thread.sleep(2000);
		return driver.findElement(By.xpath("//tbody/tr/td[3]")).getText();		
		
	}
	
	public void AlterarEmail () {
		
		driver.findElement(By.xpath("//tbody/tr/td[3]")).click();
				
	}
	
	public void Excluir () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("be-button-delete-user")));
		Thread.sleep(2000);
		driver.findElement(By.id("be-button-delete-user")).click();
	
	}
	
	public void Sim () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/a[@class = 'btn btn-danger']")));
		driver.findElement(By.xpath("//div/div/a[@class = 'btn btn-danger']")).click();
		Thread.sleep(1000);		
		
	}
	
	public void Ok () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")));
		driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
				
	}
	
}
