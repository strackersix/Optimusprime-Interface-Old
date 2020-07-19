package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.pages.PainelPrecos;
import br.com.pages.PainelPrecos_UsuarioExterno;
import org.junit.Assert;

public class TestPainelPrecos_UsuarioExterno {

	PainelPrecos_UsuarioExterno Step = new PainelPrecos_UsuarioExterno();
	
	@Test
	public void TestPainelPrecos () throws InterruptedException {
		
	// Inclusão de Preço Venda	
		
		Step.MinhaConta();
		Step.PainelPrecos();
		
	// Valida Painel de Preços
		
		Assert.assertEquals("", Step.ValidaRedirecionamentoHomePage());

	}
	
	
}
