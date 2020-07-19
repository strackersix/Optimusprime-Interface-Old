package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Logout;
import org.junit.Assert;

public class TestLogout extends BaseTest {

	
	Logout Step = new Logout();
	
	@Test
	
	public void LogoutTest() throws InterruptedException {
		
		Step.Url(Parametros.UrlPowerView);
		Step.MenuInicial();
		Step.UsuarioLogado();
		Step.Sair();
		
	// Método de Validação do Logout
		
		Assert.assertEquals("Acessar Blue PowerView", Step.ValidacaoLogout());
		
	}
	
}
