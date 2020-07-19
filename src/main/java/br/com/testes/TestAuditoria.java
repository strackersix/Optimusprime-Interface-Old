package br.com.testes;

import org.junit.Assert;
import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Auditoria;

public class TestAuditoria extends BaseTest {
	
	
	Auditoria Step = new Auditoria();
	
	@Test
	
	public void Auditoria () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Step.Auditoria();
		Step.Cliente("AJINOMOTO");
		Step.Filtrar();
		

	// Método para validar Resultado da Pesquisa de Auditoria.
	
		Assert.assertEquals("00009143", Step.ValidaAuditoria1());
		Assert.assertEquals("00008396", Step.ValidaAuditoria2());
		Assert.assertEquals("00008053", Step.ValidaAuditoria3());
		Assert.assertEquals("00008669", Step.ValidaAuditoria4());
		
		Step.ExpandirAuditoria();
		
		Assert.assertEquals("00009143", Step.ValidaIdAuditoria());
		Assert.assertEquals("Contrato Gerenciamento - Contr Gerenc. - 000032", Step.ValidaContrato());
		
			
	}

}
