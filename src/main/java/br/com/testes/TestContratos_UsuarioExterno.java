package br.com.testes;

import org.junit.Test;
import org.junit.Assert;
import br.com.core.BaseTest;
import br.com.pages.Contratos_UsuarioExterno;

public class TestContratos_UsuarioExterno extends BaseTest {
	
	Contratos_UsuarioExterno Step = new Contratos_UsuarioExterno();
	
	@Test
	public void TestContratos () throws InterruptedException {
		
		Step.MinhaConta();
		Step.Contratos();	
		Step.ClienteContrato("POWERVIEW BALANCO UNID 1");
		Step.Data("01/2018");
		Step.Buscar();
		

	// Método para validação do Contrato. 
	
		Assert.assertEquals("O que acha de buscar por outro termo?", Step.ValidaContrato());
		
		Step.PowerView();
		Step.MinhaConta();
		Step.Contratos();
		Step.BtnContratos();
		Step.ClienteContrato2("POWERVIEW BALANCO UNID 1");
		Step.BuscarContrato();

		
	// Método para validação do Contrato. 	
	
		Assert.assertEquals("O que acha de buscar por outro termo?", Step.ValidaContrato2());
	
	
	}
	
}
