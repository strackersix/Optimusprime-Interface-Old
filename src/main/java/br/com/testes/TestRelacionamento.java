package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Relacionamento;
import org.junit.Assert;

public class TestRelacionamento extends BaseTest {
	
	
	Relacionamento Step = new Relacionamento();
	
	@Test
	
	public void TestRelacionamento () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.FaleComAgente();
		Step.Relacionamento();
		Step.NovaConversa();
		Step.Convidado("Gabriel Oliveira Conrado de Souza");
		Step.Assunto("Quality Assurance");
		Step.Texto("Automation Test");
		Step.Adicionar();
		Step.Ok();
		Step.EscreverResposta("Mensagem 1");
		Step.Enviar();
		Step.EscreverResposta("Mensagem 2");
		Step.Enviar();
		Step.EscreverResposta("Mensagem 3");
		Step.Enviar();
		Step.EscreverResposta("Mensagem 4");
		Step.Enviar();
		Step.EscreverResposta("Mensagem 5");
		Step.Enviar();
		Step.AdicionarParticipante();
		Step.Participante("Phelipe Bruno Cunha");
		Step.AdicionarConvidado2();
		Step.OkConvidado();
		Step.F5();
		Step.Excluir();
		Step.SimExcluir();
		Step.OkExcluir();		
		
	}
	
}
