package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Relacionamento_UsuarioExterno;

public class TestRelacionamento_UsuarioExterno extends BaseTest {
	
	
	Relacionamento_UsuarioExterno Step = new Relacionamento_UsuarioExterno();
	
	@Test
	
	public void TestRelacionamento_UsuarioExterno () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.FaleComAgente();
		Step.Relacionamento();
		Step.NovaConversa();
		Step.Convidado("Gabriel Conrado");
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
		Step.Excluir();
		Step.SimExcluir();
		Step.OkExcluir();
		
	}
	
}
