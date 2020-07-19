package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.CadastroCliente;

public class TestCadastroCliente extends BaseTest {
	
	CadastroCliente Step = new CadastroCliente();
	
	@Test
	public void CadastroCliente () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Step.CadastroClientes();
		Step.NovoCliente();
		Step.Empresa("Doc88 - Quality Assurance");
		Step.Contato("Gabriel Conrado");
		Step.Email("gabriel.souza@doc88.com.br");
		Step.Enviar();
		Step.EnviarNotificar();
		
	}
	
}
