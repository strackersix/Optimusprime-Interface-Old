package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Login_UsuarioExterno; 
import org.junit.Assert;


public class TestLogin_UsuarioExterno extends BaseTest {
	
	Login_UsuarioExterno Step = new Login_UsuarioExterno ();
	
	@Test
	public void LoginTest() throws InterruptedException {  

		Step.Maximizar();
		Step.Url(Parametros.UrlPowerView);
//		Step.Usuario(Parametros.UsuarioExterno);
//		Step.Senha(Parametros.SenhaExterno);
		Step.Usuario("doc88.dev@gmail.com");
		Step.Senha("Doc88@1234");
		Step.BtnAcessar();
//		Assert.assertEquals("Gabriel Conrado", Step.ConfirmaNome());
		
	}
	
}
