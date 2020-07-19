package br.com.testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.junit.Assert;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Indicadores;
import br.com.pages.Indicadores_UsuarioExterno;


public class TestIndicadores_UsuarioExterno extends BaseTest { 
	
	
	Indicadores Step = new Indicadores();
	
	@Test
	public void TestIndicadores() throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Thread.sleep(10000);
		Step.Indicadores();
		Step.DataInicial("01/01/2018");
		Step.DataFinal("01/01/2020");
		Step.RegiaoSudeste(By.id("filter-region"), "Sudeste");
		Step.Atualizar();
		Step.RegiaoSul(By.id("filter-region"), "Sul");
		Step.Graficos();
		Step.RegiaoNordeste(By.id("filter-region"), "Nordeste");
		Step.Atualizar();
		Step.RegiaoNorte(By.id("filter-region"), "Norte");
		Step.Atualizar();
			
	// Método de validação dos Indicadores. 
			
		Step.DadosTabulados();
		
		Assert.assertNotEquals("", Step.ValidaIndicadoresNorte());
					
		
	}

}
