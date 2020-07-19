package br.com.testes;

import org.junit.Test;
import org.junit.Assert;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.GestaoEnergia;

public class TestGestaoEnergia extends BaseTest {
	
	GestaoEnergia Step = new GestaoEnergia();
	
	@Test
	
	public void TestGestaoEnergia () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Step.GestaoEnergia();
		Step.SelecionarGrupoEconomico("DASA");
		Step.SelecionarPeriodo("11/2018 à 11/2019");
		Step.SelecionarGrupoEmpresas("DASA");
		Step.SelecionarUnidadeConsumo("D115-DA-ITAIM BIBI");
		Step.Submercado("SUDESTE/CENTRO-OESTE");
		Step.Estado("SÃO PAULO");
		Step.Distribuidora("ENEL SP");
		Step.Tensao("2,3 KV A 25 KV");
		Step.GerarRelatorio();
		Step.WaitLoading();
				
//		Assert.assertEquals("36.416,31", Step.ValidaPenalidades());
//		Assert.assertEquals("440.092,91", Step.ValidaCustoEnergiaEletrica());
//		Assert.assertEquals("341.878,74", Step.ValidaConsumo());
		
		Step.PageDown();
		Step.PageUp();
		
		Step.Tabela();
				
		Assert.assertEquals("R$ 36.416,31 / Ano", Step.ValidaOtimizacaoEconomicaTabela());
		Assert.assertEquals("R$ 36.416,31", Step.ValidaPenalidadesTabela());
		Assert.assertEquals("R$ 440.092,91", Step.ValidaCustoEnergiaEletricaTabela());
		Assert.assertEquals("R$ 341.878,74", Step.ConsumoTabela());

		Step.PageDown();
		Step.PageUp();
			
		Step.Faturas();
	
		Assert.assertEquals("11", Step.ValidaFaturasCapturadas());
		Assert.assertEquals("32.477,96", Step.ValidaReativaExcedente());
		Assert.assertEquals("3.938,35", Step.ValidaUltrapassagem());
		Assert.assertEquals("0,00", Step.ValidaMultasJurosMonetaria());
		Assert.assertEquals("14", Step.ValidaAlertas());
		
		Assert.assertEquals("pie-chart", Step.ValidaGraficoAuditoriaFaturas());
		Assert.assertEquals("bar-chart", Step.ValidaGraficoTotalOcorrencias());
		Assert.assertEquals("bar-chart", Step.ValidaGraficoControleFatura());
		
		Step.PageDown();
		
		Assert.assertEquals("bar-chart", Step.ValidaGraficoReativaExcedente());
		Assert.assertEquals("flex column pa-auto ma-1", Step.ValidaTop5Unidades1());
		Assert.assertEquals("bar-chart", Step.ValidaGraficoDemanda());
		Assert.assertEquals("flex column pa-auto ma-1", Step.ValidaTop5Unidades2());
		Assert.assertEquals("bar-chart", Step.ValidaGraficoMultaJurosMonetaria());
		Assert.assertEquals("flex column pa-auto ma-1", Step.ValidaTop5Unidades3());
		
		Step.PageDown();
		Step.PageUp();
		Step.PageUp();
					
		Step.MapaFaturas();
		Step.PageDown();
		
		Assert.assertEquals("flex column pa-auto ma-1", Step.ValorFatura());
		Assert.assertEquals("D115-DA-ITAIM BIBI", Step.EmpresaUnidade());
		
		Step.PageUp();		
		Step.UpLoadFaturas();
		
		Assert.assertEquals("flex column pa-auto ma-1", Step.ValidaFaturas());
		
		Step.RelatoriosFatura();
		
		Assert.assertEquals("g-panel__title flex grow pa-2", Step.ValidaDocumentosFaltantes());
		Assert.assertEquals("g-panel__title flex grow pa-2", Step.ValidaDadosFatura());
		
		Step.ExportarDocumentosFaltantes();
		Step.WaitLoading();
		Step.ExportaDadosFatura();
		Step.WaitLoading();
		Step.ExportarAuditoriaEmMassa();
		Step.WaitLoading();
		Step.PageDown();
		Step.ExportarRelatorioLiminares();
		Step.WaitLoading();
		

		
	// -------------------------------------------------- // -------------------------------------------------------------- //
		
	// Telemetria
		
//		Step.Url("https://powerview-hmg.doc88.com.br/gestaoenergiav2/telemetria/medicao");
//		Step.SelecionarGrupoEconomico("POWERVIEW BALANCO");
//		Step.SelecionarPeriodo("11/2019");
//		Step.SelecionarUnidadeConsumo("POWERVIEW BALANCO UNID 1");
//		Step.GerarRelatorio();
//		
//		Assert.assertNotEquals("0,000", Step.DemandaPonta());
//		Assert.assertNotEquals("0,000", Step.DemandaForaPonta());
//		Assert.assertNotEquals("0,000", Step.ConsumoPonta());
//		Assert.assertNotEquals("0,000", Step.ConsumoForaPonta());
//		Assert.assertNotEquals("0,000", Step.ConsumoTotal());
//		
//		Step.PageDown();
//		
//		Step.DemandaMaximaRegistradaDia();
//		Step.DemandaMaximaRegistradaSemana();
//		Step.DemandaMaximaRegistradaMes();
//		Step.ConsumoDia();
//		Step.ConsumoSemana();
//		Step.ConsumoMes();		
//		
//		Step.PageUp();
//			
//		Step.Relatorios();
//		
//		Assert.assertEquals("Extração Medição Horária", Step.ExtracaoMedicao());
//		
//		Step.Alarmes();

		
		
		
		
		
	}
	
}
