package br.com.testes;

import org.junit.Test;
import org.junit.Assert;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.MinhasMedalhas_UsuarioExterno;

public class TestMinhasMedalhas_UsuariosExternos extends BaseTest {

	
	MinhasMedalhas_UsuarioExterno Step = new MinhasMedalhas_UsuarioExterno();
	
	@Test
	
	public void TestMinhasMedalhas_UsuariosExternos () throws InterruptedException {
	
		
		Step.Url(Parametros.UrlPowerView);
		Step.Usuario();
		Step.MinhasMedalhas();
		
	// Médoto para validar a abertura da dela. 	
		
		Assert.assertEquals("Newbie", Step.ValidaMedalhas());
			
	}
}