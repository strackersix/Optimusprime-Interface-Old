package br.com.testes;

import org.junit.Test;
import org.junit.Assert;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Planejamento;
import br.com.pages.Planejamento_UsuarioExterno;

public class TestPlanejamento_UsuarioExterno extends BaseTest {
	
	Planejamento_UsuarioExterno Step = new Planejamento_UsuarioExterno();
	
	@Test
	
	public void TestPlanejamento () throws InterruptedException {

		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Step.Planejamento();
		Step.VisaoMensal();
		
		Assert.assertEquals("32.249.536,41", Step.ValidaVisaoCustoTotal());
		
		Step.Comparativos();
		
	
	// Método para validação dos calculos do planejamento. 	
		
		Assert.assertEquals("21.793.436,88", Step.ValidaComparativosTotal2018());
		Assert.assertEquals("32.249.536,41", Step.ValidaComparativosTotal2019());
		
		Step.VisaoAnual();
		Step.FiltrarResultados();
		Step.ICMS();
		Step.FiltrarResultado();
		Step.VisaoMensal();
		
		
	// Método para validação dos calculos do planejamento. 		
		
		Assert.assertEquals("26.445.021,37", Step.ValidaVisaoCustoTotal());
		
		Step.Comparativos();
	
		
	// Método para validação dos calculos do planejamento. 	
		
		Assert.assertEquals("17.505.432,80", Step.ValidaComparativosTotal2018());
		Assert.assertEquals("26.445.021,37", Step.ValidaComparativosTotal2019());
	
	}	

}
