package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Plugins;
import org.junit.Assert;


public class TestPlugins extends BaseTest {
	
	Plugins Step = new Plugins();
	
	@Test
	
	public void TestPlugins () throws InterruptedException {

		
		Step.Url(Parametros.UrlPowerView);
		Step.Usuario();
		
		Step.Plugins();
		Assert.assertEquals("Icon Nome Plugin URL Tipo Descrição Tipo de Link Role Escopo Status Ações", Step.ValidaPlugins());
		
		Step.Menus();
		Assert.assertEquals("Icon Nome URL Grupo Esconder em Status Mover", Step.ValidaMenu());
		
		Step.Grupos();
		Assert.assertEquals("Icon Nome Esconder em Status", Step.ValidaGrupos());
		
	}
		
}
