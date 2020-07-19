package br.com.testes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Demanda;


public class TestDemanda extends BaseTest {

	Demanda Step = new Demanda ();
	
	@Test
	
	public void TestDemanda() throws InterruptedException {
			
			
		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Step.GestaoDemandas();
		Step.Adicionar();
		Step.UsuarioDemanda("Phelipe Bruno Cunha");
		Step.TituloDemanda("Quality Assurance");
		Step.TratadoDemanda("Test Automation - PowerView.");
		Step.TipoDemanda("Solicitação");
		Step.EspecificacaoFuncional();
		Step.Evidencia();
		Step.EvidenciaText("No momento não há nenhuma evidência para ser enviada.");
		Step.Observacao();
		Step.ObservacaoText("No momento não há nenhuma observação a ser feita.");
		Step.AumentoReceita(By.id("demand__benefit[1]"), "Sem impacto");
		Step.ReducaoCusto(By.id("demand__benefit[2]"), "< 150K");
		Step.CustoEvitado(By.id("demand__benefit[3]"), "301K até 500K");
		Step.ReducaoInvestimento(By.id("demand__benefit[4]"), "151K até 300K");	
		Step.RequisitosLegaisFiscais(By.id("demand__benefit[5]"), "Sem impacto");
		Step.OutrosBeneficios(By.id("demand__benefit[6]"), "> 300K");
		Step.BeneficiosText("Quality Assurance");
		Step.Cadastrar();
		Step.ConsultarDemanda("Quality Assurance");
		
		
	// Método para validar Demanda.	
		
		Assert.assertEquals("Quality Assurance", Step.ValidaDemanda());
		
		Step.CancelarDemanda();
		
	}
	
}
