package br.com.testes;

import org.junit.Test;
import org.openqa.selenium.By;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Indicadores;
import org.junit.Assert;


public class TestIndicadores extends BaseTest {
	
	Indicadores Step = new Indicadores();
		
	@Test
	public void TestIndicadores() throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Step.Indicadores();
		
		Step.DataInicial("01/01/2018");
		Step.DataFinal("01/01/2020");
		Step.RegiaoSudeste(By.id("filter-region"), "Sudeste");
		Step.Atualizar();
		
		
		Assert.assertEquals("inside-pw-historico-chart c3", Step.ValidaEnergiaNatural());
		Assert.assertEquals("inside-pw-historico-chart c3", Step.ValidaNivelReservatorios());
		Step.PageDown();
		Assert.assertEquals("inside-pw-historico-chart c3", Step.ValidaGraficoGeracaoCarga());
		Step.PageUp();
				
		Step.RegiaoSul(By.id("filter-region"), "Sul");
		Step.Atualizar();

		Assert.assertEquals("inside-pw-historico-chart c3", Step.ValidaEnergiaNatural());
		Assert.assertEquals("inside-pw-historico-chart c3", Step.ValidaNivelReservatorios());
		Step.PageDown();
		Assert.assertEquals("inside-pw-historico-chart c3", Step.ValidaGraficoGeracaoCarga());
		Step.PageUp();
		
		Step.RegiaoNordeste(By.id("filter-region"), "Nordeste");
		Step.Atualizar();
		
		Assert.assertEquals("inside-pw-historico-chart c3", Step.ValidaEnergiaNatural());
		Assert.assertEquals("inside-pw-historico-chart c3", Step.ValidaNivelReservatorios());
		Step.PageDown();
		Assert.assertEquals("inside-pw-historico-chart c3", Step.ValidaGraficoGeracaoCarga());
		Step.PageUp();
		
		Step.RegiaoNorte(By.id("filter-region"), "Norte");
		Step.Atualizar();
		
		Assert.assertEquals("inside-pw-historico-chart c3", Step.ValidaEnergiaNatural());
		Assert.assertEquals("inside-pw-historico-chart c3", Step.ValidaNivelReservatorios());
		Step.PageDown();
		Assert.assertEquals("inside-pw-historico-chart c3", Step.ValidaGraficoGeracaoCarga());
		Step.PageUp();
				
		Step.DadosTabulados();
		Assert.assertNotEquals("", Step.ValidaIndicadoresNorte());
		
						
		
	}
	
}
