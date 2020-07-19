package br.com.testes;

import org.junit.Assert;
import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Contratos;

public class TestContratos extends BaseTest {

	
	Contratos Step = new Contratos();
	
	@Test
	public void TestContratos () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Step.Contratos();	
		Step.ClienteContrato("POWERVIEW BALANCO UNID 1");
		Step.Data("01/2018");
		Step.Buscar();
		Step.ExpandirContrato();
		
		Assert.assertEquals("PV0004/01", Step.ValidaExpansaoGrupoEconomico());
			

	// Método para validação do Contrato. 
	
		
		Step.PageUp();
		Step.BtnContratos();
		Step.ClienteContrato2("POWERVIEW BALANCO UNID 1");
		Step.BuscarContrato();

		
	// Método para validação do Contrato. 	
	
		Assert.assertEquals("POWERVIEW BALANCO UNID 1", Step.ValidaContrato2());

		Step.ExpandirContrato2();

		Assert.assertEquals("POWERVIEW BALANCO UNID 1", Step.ValidaDadosCadastrais());
		Assert.assertEquals("PV0004", Step.ValidaDadosCadastrais2());
		
		Step.PageDown();
		Step.PageUp();
		Step.FornecimentoProinfa();
		Step.ContratoFornecimento();
		
		Assert.assertEquals("LP2017111601", Step.IdentificadorContrato());
		
		Step.PageDown();
		Step.PageUp();
		
		Step.Documentos();
			
		Assert.assertEquals("DOCUMENTOS RELACIONADOS AO CLIENTE POWERVIEW BALANCO UNID 1", Step.ValidaDocumentos());
		
		Step.Medicoes();
		Step.Periodo("01/2019");
		
		Assert.assertEquals("MWh", Step.ConsumoTotalMes());
		Assert.assertEquals("MWh", Step.ConsumoTotal1());
		Assert.assertEquals("MWh", Step.ConsumoTotal2());
		Assert.assertEquals("kW", Step.DemandaMaxima1());
		Assert.assertEquals("kW", Step.DemandaMaxima2());
		
		Step.AjustesReportados();
		
	}
	
}
