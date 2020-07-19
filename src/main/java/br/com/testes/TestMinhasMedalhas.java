package br.com.testes;

import org.junit.Test;
import org.junit.Assert;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.MinhasMedalhas;

public class TestMinhasMedalhas extends BaseTest {
	
	
	MinhasMedalhas Step = new MinhasMedalhas();
	
	@Test
	
	public void TestMinhasMedalhas () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.Usuario();
		Step.MinhasMedalhas();
		
	// Método para Validação da tela Minhas Medalhas
		
		Assert.assertEquals("Medalhas", Step.ValidaMedalha());
		Assert.assertEquals("Newbie", Step.ValidaNewbie());
		Assert.assertEquals("Let's share #1", Step.ValidaLetsShare());
		Assert.assertEquals("Fun #1", Step.ValidaFun1());
		Assert.assertEquals("Commenter #1", Step.ValidaCommenter());
		
		Step.PageDown();
		
		Assert.assertEquals("Personalizador", Step.ValidaPersonalizador());
		Assert.assertEquals("Developer", Step.ValidaDeveloper());
		Assert.assertEquals("PowerView Histórico", Step.ValidaPowerViewHistorico());
		Assert.assertEquals("I’m on fire #1", Step.ValidaImOnFire());
		
		Step.PageDown();
		
		Assert.assertEquals("Repost", Step.ValidaRepost());
		Assert.assertEquals("PowerView Dados", Step.ValidaPowerViewDados());
		Assert.assertEquals("PowerView Planejamento", Step.ValidaPowerViewPlanejamento());
		Assert.assertEquals("Planejamento Expert", Step.ValidaPlanejamentoExpert());
		
		Step.PageDown();
		
		Assert.assertEquals("Deep Iceberg", Step.ValidaDeepIceberg());
		Assert.assertEquals("Ninja de Infra", Step.ValidaNinjadeInfra());
		Assert.assertEquals("1k", Step.Valida1k());
		Assert.assertEquals("Você Sabia?", Step.ValidaVoceSabia());
		
		Step.PageDown();
		Step.PageDown();
		Step.PageUp();
		
		
	}

}
