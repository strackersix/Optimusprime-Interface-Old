package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Historico;
import org.junit.Assert;


public class TestHistorico extends BaseTest {

	Historico Step = new Historico();
	
	@Test
	public void TestHistotico () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Step.historico();
		Step.SelecionarEmpresa("POWERVIEW BALANCO");
		Step.Pesquisar();
		Step.DataInicial("Janeiro/2018");
		Step.DataFinal("Maio/2019");
		Step.GerarRelatorio();
		
	// Método para validar histórico.		
		
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaEconomia());
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaEconomiaPorcentagem());
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaEconomiaAcumulada());
				
		Step.Icms();
		Step.GerarRelatorio();
		
	// Método para validar histórico.	
		
		Step.Graticos();
		
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.CustoConsolidado());
		
		Step.PageDown();
		
		Step.RS();
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaEnergia());
		Step.MontanteMWh();
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaEnergia());
		Step.MontanteMWm();
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaEnergia());
		
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaDistribuidora());
		
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaCCEE());
		
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaGestao());
		
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaResumoOperacional());
		
		Step.RS2();	
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaResumoOperacional());
		Step.Unitario();
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaResumoOperacional());
		Step.Economia();
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaResumoOperacional());
		
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaConsumoDemanda());
		Step.Consumo();
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaConsumoDemanda());
		Step.Demanda();
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaConsumoDemanda());
		
		Step.ComboUnidade("POWERVIEW BALANCO UNID 1");
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaConsumoDemanda());
		Step.ComboUnidade("POWERVIEW BALANCO UNID 2");
		Assert.assertEquals("inside-pw-detail-chart col-md-12", Step.ValidaConsumoDemanda());
		Step.ComboUnidade("POWERVIEW BALANCO UNID 3");
		
		Step.PageUp();		
		
		Step.DadosTabulados();
		
		Assert.assertNotEquals("", Step.ValidaSecao());
		Assert.assertNotEquals("", Step.ValidaIndicador());
		Assert.assertNotEquals("", Step.ValidaData());
		
	}
	
}
