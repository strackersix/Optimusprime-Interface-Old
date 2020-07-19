package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Certificados_UsuarioExterno;


public class TestCertificados_UsuarioExterno extends BaseTest {
	
	
	
	Certificados_UsuarioExterno Step = new Certificados_UsuarioExterno();
	
	@Test
	
	public void TestCertificado () throws InterruptedException {
		
		Step.Url(Parametros.UrlPowerView);
		
	// Acessar m�dulo: Certificado.	
		
		Step.MinhaConta();
		Step.Certificados();
		Step.VejaBeneficios();
			
	// Gerar certificado e/ou relat�rio. 
		
		Step.GerarCertificado();
		Step.Consolidado();
		Step.GrupoEconomico("SABESP");
		Step.Next1();
		Step.GerarRelatorio();
		Step.Next2();
		Step.Portugues();
		Step.Gerar();	
		Step.Close();
				
	// Solicitar certificado f�sico.
		
		Step.SolicitarCertificado();
		Step.NomeGrupo("SABESP");
		Step.Unidades();
		Step.NomeGrupoUnidade("SABESP");
		Step.NomeRua("Rua Ministro Jesu�no Cardoso");
		Step.Numero("531");
		Step.Cidade("S�o Paulo");
		Step.Estado();
		Step.Cep("04544-051");
		Step.Complemento("Vila Olimpia");
		Step.ResponsavelRecebimento("Gabriel Conrado");
		Step.Solicitar();
			
		
    // Solicitacoes em andamento de certificado f�sico.  
        
        Step.Solicitacoes();
        Step.CloseSolicitacoes();
        Step.PowerView();
               
	}

}
