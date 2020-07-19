package br.com.testes;

import org.junit.Assert;
import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Dashmaker;

public class TestDashmaker extends BaseTest {
	
	
	Dashmaker Step = new Dashmaker();
	
	@Test
	public void TestDashmaker () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.Usuario();
		Step.Dashmaker();
		Step.RemoverOitavaPosicao(); // Dashmaker com erro para remover. 
		Step.Sim();
		
		Assert.assertNotEquals("Automação de Teste.", Step.ValidaRemocaoDashMaker());
		
		Step.NovoDashmaker();
		Step.Titulo("Automação de Teste.");
		Step.Cards("5");
		Step.Descricao("Automação de Teste - Quality Assurance.");
		Step.Grupos("TV-COMERC");
		Step.Categorias("Aniversariante - TV");
		Step.TempoExibicao();
		Step.Salvar();
		
		Assert.assertEquals("Automação de Teste.", Step.ValidaRemocaoDashMaker());
		
		Step.GuiaCards();
		
		
	}

}
