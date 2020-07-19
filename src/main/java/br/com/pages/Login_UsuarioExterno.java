package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import br.com.core.DriverFactory;
import br.com.core.Parametros;
import javafx.scene.input.ZoomEvent;


public class Login_UsuarioExterno extends DriverFactory {
	
	public void Go () throws InterruptedException {
		
		Maximizar();
		Url(Parametros.UrlPowerView);
//		Usuario(Parametros.UsuarioExterno);
//		Senha(Parametros.SenhaExterno);
		Usuario("doc88.dev@gmail.com");
		Senha("Doc88@1234");
		BtnAcessar();
		
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

	public void BtnAcessar() {

		driver.findElement(By.id("be-login")).click();

	}
	
	public String ConfirmaNome () {
		
		return driver.findElement(By.id("be-menu-profile-name")).getText();
		
	}
	
}
