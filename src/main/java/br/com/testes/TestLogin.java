package br.com.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.Parametros;
import br.com.pages.Login;


public class TestLogin {

	
	Login Step = new Login ();
		
	@Test
	public void LoginTest() throws InterruptedException {  

		Step.Maximizar();
		Step.Url(Parametros.UrlPowerView);
		Step.Usuario(Parametros.UsuarioInterno);
		Step.Senha(Parametros.SenhaInterno);
		Step.BtnAcessar();
	
//		Assert.assertEquals("Gabriel Oliveira Conrado de Souza", Step.ConfirmaNome());
		
		Step.PermitirNotificacoes();		
			
		
	}

}


