package br.com.testes;

import org.junit.Test;
import org.junit.Assert;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Historico;
import br.com.pages.Historico_UsuarioExterno;

public class TestHistorico_UsuarioExterno extends BaseTest {

	Historico_UsuarioExterno Step = new Historico_UsuarioExterno();

	@Test
	public void TestHistotico() throws InterruptedException {

			
			Step.Url(Parametros.UrlPowerView);
			Thread.sleep(10000);
			Step.MinhaConta();
			Step.historico();
			Step.DataInicial("Janeiro/2018");
			Step.DataFinal("Maio/2019");
			Step.GerarRelatorio();

			// Método para validar histórico.

			Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidarEconomiaPeriodo());
			Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidarEconomiaPercentual());
			Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidarEconomiaAcumulada());

			Step.Icms();
			Step.GerarRelatorio();

			// Método para validar histórico.

			Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidarEconomiaPeriodo());
			Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidarEconomiaPercentual());
			Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidarEconomiaAcumulada());

			Step.DadosTabulados();
	

	}

}
