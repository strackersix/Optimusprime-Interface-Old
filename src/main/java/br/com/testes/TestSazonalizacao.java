package br.com.testes;

import org.junit.Assert;
import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Sazonalizacao;

public class TestSazonalizacao extends BaseTest {

	Sazonalizacao Step = new Sazonalizacao();
	
	@Test
	public void Sazonalizacao () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Step.Sazonalizacao();
		Step.Cliente("POWERVIEW");
		Step.BuscarCliente();
		
		
   // M�todo de valida��o do Cliente / Grupo Econ�mico. 
		
		Assert.assertEquals("POWERVIEW BALANCO(PV0004)", Step.ValidaSazonalizacao());
		
		Step.Fornecedores();
		Step.CarregarFornecedores();
		Step.Fornecedor("BRASIL COMERC");	
		Step.BuscarFornecedor();
		
				
	// M�todo de valida��o do Fornecedor.	
	
		Assert.assertEquals("BRASIL COMERC", Step.ValidaFornecedor());
		
		Step.ExpandirFornecedor();
		Step.PageDown();
		
	// M�todo de valida��o do UC.		

		Assert.assertEquals("BALL EMBALAGENS - MANAUS", Step.ValidaUC());
					
	}
		
}
