package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.PainelPrecos;
import org.junit.Assert;
public class TestPainelPrecos extends BaseTest {

	PainelPrecos Step = new PainelPrecos();
	
	@Test
	public void TestPainelPrecos () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		
	// Inclusão de Preço Venda	
		
		Step.MinhaConta();
		Step.PainelPrecos();
		Step.NovoPreco();
		Step.VendaConv();
		Step.VendaI0();
		Step.VendaI50();
		Step.VendaI100();
		
		
	// Inclusão de Preço Cessão & Compra. 
		
		Step.Compra();
		Step.CompraI0();
		Step.CompraI50();
		Step.CompraI100();		
		Step.Observacao("Testes automatizados de inclusão de preços.");
		Step.Adicionar();
		
		
	// Atulizar PLD e CCEE	
		
		Step.AtualizarPLDCCEE();
		
		Assert.assertEquals("Dados extraidos com sucesso!", Step.ValidaAtualizacaoPLDCEE());
		
		Step.Ok();
		
				
		
	}
		
}
