package br.com.testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.junit.Assert;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.HistoricoDecisoes;

public class TestHistoricoDecisoes extends BaseTest {

	HistoricoDecisoes Step = new HistoricoDecisoes();
	
	@Test
	
	public void TestHistoricoDecisoes () throws InterruptedException {
		
		Step.Url(Parametros.UrlDecisions);
		Step.ProcurarDecisoes("013464/02");
		Step.Pesquisar();
		
//		Assert.assertEquals("20825 013464/02 Compra 9,375 24/05/2019 17:09:42 Vinicius Akira Tamada enviada 04/2019", Step.MontanteMWh());
				
		Step.Filtros();
		Step.FiltrarPor(By.xpath(""), "Unidade");
		Step.Pesquisar();	
		
		Step.Filtros();
		Step.FiltrarPor(By.xpath(""), "Tipo de decisão");
		Step.Pesquisar();
		
		Step.Filtros();
		Step.Status(By.xpath("//div/select[@name = 'status']"), "Pendentes");
		Step.Pesquisar();
		
		Step.Filtros();
		Step.Status(By.xpath("//div/select[@name = 'status']"), "Enviadas");
		Step.Pesquisar();
		
		Step.Filtros();
		Step.Status(By.xpath("//div/select[@name = 'status']"), "Processando");
		Step.Pesquisar();
		
		Step.Filtros();
		Step.Status(By.xpath("//div/select[@name = 'status']"), "Rejeitadas");
		Step.Pesquisar();
		
		Step.Filtros();
		Step.Status(By.xpath("//div/select[@name = 'status']"), "Aprovadas");
		Step.Pesquisar();
		
		Step.DecisoesExcluidas();

	
	// Método para validar decisões. 	
	
//		Assert.assertEquals("41281 POWERVIEW BALANCO UNID 1 PV0004/01 Compra 88,995 2019/10 01/05/2020 13:20:47 Gabriel Oliveira Conrado de Souza 05/06/2020 18:43:26 teste exclusão", Step.IdDecisaoExcluido());
		
		
	}
		                                                                                 
}