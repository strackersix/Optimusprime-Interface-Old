package br.com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.DriverFactory;
import br.com.core.Parametros;

public class Login extends DriverFactory {

	
	public void Go () throws InterruptedException {
		
		Maximizar();
		Url(Parametros.UrlPowerView);
		Usuario(Parametros.UsuarioInterno);
		Senha(Parametros.SenhaInterno);
		BtnAcessar();
		PermitirNotificacoes();	
			
	}
	
	public void Maximizar () {
		
		driver.manage().window().maximize();
		
	}
	
	public void Url ( String Url ) throws InterruptedException {

		driver.get(Url);

	}

	public void Usuario(String usuario) {
		
		driver.findElement(By.name("login")).clear();
		driver.findElement(By.name("login")).sendKeys(usuario);

	}

	public void Senha(String senha) {

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(senha);

	}

	public void BtnAcessar() throws InterruptedException {

		driver.findElement(By.id("be-login")).click();
		Thread.sleep(2000);
		
	}
	
	public String ConfirmaNome () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("be-menu-profile-name")));
		return driver.findElement(By.id("be-menu-profile-name")).getText();
		
	}

	public void PermitirNotificacoes () {
					
		try {
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
						
			
		} catch (AWTException e) {

			e.printStackTrace();
			
		}
		
	}
	
}
