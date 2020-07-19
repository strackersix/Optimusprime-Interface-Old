package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;


public class UsuariosInternos extends BasePage {

	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void Usuario () {
		
		driver.findElement(By.xpath("//button[@type = 'button'][@id='dropdown-user']")).click();

	}
	
	public void GestaoUsuario () {
		
		driver.findElement(By.xpath("//div/ul/li/a/span[@class = 'fa fa-users']")).click();
				
	}
	
	public void Adicionar () {
		
		driver.findElement(By.xpath("//button[@aria-controls = 'be-user-list']/span/li[@class = 'fa fa-plus']")).click();
				
	}
	
	public void NomeUsuario ( String nomeUsuario ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("be-user-name")));
		driver.findElement(By.id("be-user-name")).clear();
		driver.findElement(By.id("be-user-name")).sendKeys(nomeUsuario);
		
	}
	
	public void Email ( String email ) {
		
		driver.findElement(By.id("be-user-email")).clear();
		driver.findElement(By.id("be-user-email")).sendKeys(email);
		
	}
	
	public void LoginAcesso ( String loginAcesso ) {
		
		driver.findElement(By.id("be-user-login")).clear();
		driver.findElement(By.id("be-user-login")).sendKeys(loginAcesso);
		
	}
	
	public void Senha ( String senha ) {
		
		driver.findElement(By.id("be-user-password")).clear();
		driver.findElement(By.id("be-user-password")).sendKeys(senha);
		
	}
	
	public void Nascimento ( String nascimento ) {
		
		driver.findElement(By.id("be-profile-birthday")).clear();
		driver.findElement(By.id("be-profile-birthday")).sendKeys(nascimento);
		
	}
	
	public void Admissao ( String admissao ) {
		
		driver.findElement(By.id("be-profile-admission")).clear();
		driver.findElement(By.id("be-profile-admission")).sendKeys(admissao);
		
	}
	
	public void Demissao ( String demissao ) {
		
		driver.findElement(By.id("be-user-demission")).clear();
		driver.findElement(By.id("be-user-demission")).sendKeys(demissao);
		
	}
	
	public void Grupo ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
			
	}
	
	public void Departamento ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
 	
	public void EnviarEmail () {
		
		driver.findElement(By.name("sendEmail")).click();
		
	}
	
	public void GrupoPrincipal ( String grupoPrincipal ) throws InterruptedException {
		
		driver.findElement(By.id("token-input-be-user-main-group")).clear();
		driver.findElement(By.id("token-input-be-user-main-group")).sendKeys(grupoPrincipal);
		Thread.sleep(1500);
		driver.findElement(By.id("token-input-be-user-main-group")).sendKeys(Keys.ENTER);
		
	}
	
	public void Grupos ( String grupos ) throws InterruptedException {
		
		driver.findElement(By.id("token-input-be-user-groups")).clear();
		driver.findElement(By.id("token-input-be-user-groups")).sendKeys(grupos);
		Thread.sleep(2000);
		driver.findElement(By.id("token-input-be-user-groups")).sendKeys(Keys.ENTER);
		
	}
	
	public void Papeis ( String papeis ) throws InterruptedException {
		
		driver.findElement(By.id("token-input-be-user-roles")).clear();
		driver.findElement(By.id("token-input-be-user-roles")).sendKeys(papeis);
		Thread.sleep(1500);
		driver.findElement(By.id("token-input-be-user-roles")).sendKeys(Keys.ENTER);
				
	}
	
	public void AdicionarUsuario () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/button[@id = 'card-user-store-button']/i")).click();
		Thread.sleep(5000);
		
	}
		
	public void ConsultarUsuario ( String consultarUsuario ) throws InterruptedException {
		
		driver.findElement(By.xpath("//div/label/input[@aria-controls='be-user-list']")).clear();
		driver.findElement(By.xpath("//div/label/input[@aria-controls='be-user-list']")).sendKeys(consultarUsuario);
		Thread.sleep(2000);
		
	}
	
	public String ValidaUsuario () {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div/label/input[@aria-controls='be-user-list']")));
		return driver.findElement(By.xpath("//table[@id = 'be-user-list']/tbody/tr/td[2]")).getText();
		
	}
	
	public void ClickUsuario () throws InterruptedException {
		
		driver.findElement(By.xpath("//table[@id = 'be-user-list']/tbody/tr/td[@class='sorting_1']")).click();
		Thread.sleep(1000);
		
	}
	
	public void Editar () {
		
		driver.findElement(By.xpath("//div/button/a/li[@class = 'fa fa-edit color-white']")).click();
				
	}
	
	public void ExcluirUsuario () {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id = 'be-button-delete-user']")));
		driver.findElement(By.xpath("//button[@id = 'be-button-delete-user']")).click();
				
	}
	
	public void Sim () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/div/a/i[@class = 'glyphicon glyphicon-ok']")).click();
		Thread.sleep(1000);
		
	}
	
	public String ValidaExclusao () {
		
		return driver.findElement(By.xpath("//td[4]")).getText();
		
	}
	
	public void Organizacoes () throws InterruptedException {
		
		driver.findElement(By.xpath("//li/a[@data-div = 'be-organization-list']/span[@class = 'be-mobile-hide']")).click();
		Thread.sleep(1000);
		
	}
	
	public void Grupos () throws InterruptedException {
		
		driver.findElement(By.xpath("//li/a[@data-div = 'be-group-list']/span[@class = 'be-mobile-hide']")).click();
		Thread.sleep(1000);
		
	}
	
	public void Roles () throws InterruptedException {
		
		driver.findElement(By.xpath("//li/a[@data-div = 'be-role-list']/span[@class = 'be-mobile-hide']")).click();
		Thread.sleep(1000);
	}
	
	
}
