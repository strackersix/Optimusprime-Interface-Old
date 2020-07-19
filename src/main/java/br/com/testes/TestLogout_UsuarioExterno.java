package br.com.testes;

import org.junit.Test;
import org.junit.Assert;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Logout_UsuarioExterno;


public class TestLogout_UsuarioExterno extends BaseTest {
	
	
	Logout_UsuarioExterno Step = new Logout_UsuarioExterno();
	
	@Test
	
	public void TestLogout_UsuarioExterno () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.MenuInicial();
		Step.UsuarioLogado();
		Step.Sair();
				
		
	// Método de Validação do Logout
		
		Assert.assertEquals("Acessar Blue PowerView", Step.ValidacaoLogout());
	
		
		
	}
		
}
