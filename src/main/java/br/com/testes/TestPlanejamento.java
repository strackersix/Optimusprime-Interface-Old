package br.com.testes;

import org.junit.Test;
import br.com.pages.Planejamento;
import org.junit.Assert;
import br.com.core.BaseTest;
import br.com.core.Parametros;


public class TestPlanejamento extends BaseTest {

	
	Planejamento Step = new Planejamento();
	
	@Test
	
	public void TestPlanejamento () throws InterruptedException {

		
		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Step.Planejamento();
		Step.SelecionarEmpresa("POWERVIEW BALANCO");
		
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaVisaoAnualCustoTotal());
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaVisaoAnualConsumoMedio());
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaVisaoAnualConsumoTotal());
		
		Step.FiltrarResultado();
		
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaVisaoAnualCustoTotal());
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaVisaoAnualConsumoMedio());
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaVisaoAnualConsumoTotal());
		
		Step.ICMS();
		Step.FiltrarResultado();
		
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaVisaoAnualCustoTotal());
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaVisaoAnualConsumoMedio());
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaVisaoAnualConsumoTotal());
		
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoAnualCustoTotal());
		
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoAnualCustoUnitario());
		
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoAnualConsumoTotal());
		
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoAnualBalancoEnergetico());
		
		Step.PageUp();
		Step.VisaoMensal();
		
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaVisaoMensalCustoTotal());
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaConsumoMedio());
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaConsumoTotal());
		
		Assert.assertEquals("inside-pw-detail-chart col-lg-12", Step.ValidaGraficoVisaoMensalCustoTotal());
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoMensalCustoUnitario());
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoMensalConsumoDemanda());
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoMensalConsumoDemanda());
		Step.ComboConsumoDemanda("POWERVIEW BALANCO UNID 2");
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoMensalConsumoDemanda());
		Step.ComboConsumoDemanda("POWERVIEW BALANCO UNID 3");
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoMensalConsumoDemanda());
		
		Step.PageDown();
				
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoMensalBalancoEnergetico());
		Step.ComboBalancoEnergetico("POWERVIEW BALANCO UNID 2");
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoMensalBalancoEnergetico());
		Step.ComboBalancoEnergetico("POWERVIEW BALANCO UNID 3");
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoMensalBalancoEnergetico());
		
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoMensalCustoEnergiaProdutoManufaturado());		
		Step.ComboCustoEnergiaProdutoManufaturado("POWERVIEW BALANCO UNID 2");
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoMensalCustoEnergiaProdutoManufaturado());
		Step.ComboCustoEnergiaProdutoManufaturado("POWERVIEW BALANCO UNID 3");
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoVisaoMensalCustoEnergiaProdutoManufaturado());
		
		Step.PageUp();
		
		Step.Comparativos();
		
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaComparativosCustoTotal());
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaComparativosConsumoMedio());
		Assert.assertEquals("inside-pw-detail-pin-content", Step.ValidaComparativosConsumoTotal());
		
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoComparativosCustoTotal());
		
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoComparativoCustoUnitario());
		
		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoComparativosConsumoTotal());
		Step.ComboComparativosConsumoTotal("POWERVIEW BALANCO UNID 2");
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoComparativosConsumoTotal());
		Step.ComboComparativosConsumoTotal("POWERVIEW BALANCO UNID 3");
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoComparativosConsumoTotal());

		Step.PageDown();
		
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoComparativosCustoEnergiaProdutoManufaturado());
		Step.ComparativosCustoEnergiaProdutoManufaturado("POWERVIEW BALANCO UNID 2");
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoComparativosCustoEnergiaProdutoManufaturado());
		Step.ComparativosCustoEnergiaProdutoManufaturado("POWERVIEW BALANCO UNID 3");
		Assert.assertEquals("inside-pw-detail-chart-svg c3", Step.ValidaGraficoComparativosCustoEnergiaProdutoManufaturado());
		
		Step.PageUp();
		
		Step.VisaoAnual();
		Step.SomatorioAnual();
		
		Assert.assertEquals("inside-pw-detail-pin-side-left-somatoria pv-chart c3", Step.ValidaGraficoSomatorioAnual());
		
	}
		
}
