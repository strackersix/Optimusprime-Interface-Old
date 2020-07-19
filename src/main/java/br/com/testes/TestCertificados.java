package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Certificados;
import org.junit.Assert;

public class TestCertificados extends BaseTest {
	
	
	Certificados Step = new Certificados();
	
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
		Step.GrupoEconomico("BRF");
		Step.AnoCertificado("2018");
		Step.Next1();
		Step.GerarRelatorio();
		Step.Next2();
		Step.Portugues();
		Step.Gerar();	
		Step.Close();
				
	// Solicitar certificado f�sico.
		
		Step.SolicitarCertificado();
		Step.NomeGrupo("BRF");
		Step.Unidades();
		Step.NomeGrupoUnidade("BRF - INCUBATORIO DIAMANTE");
		Step.NomeRua("Rua Ministro Jesu�no Cardoso");
		Step.Numero("531");
		Step.Cidade("S�o Paulo");
		Step.Estado();
		Step.Cep("04544-051");
		Step.Complemento("Vila Olimpia");
		Step.ResponsavelRecebimento("Gabriel Conrado");
		Step.Solicitar();
			
	// Verificar solicita��o de certificado f�sico. 
		
		Step.VerificarSolicitacao();
		
		Step.Pesquisar("BRF");
		Assert.assertEquals("BRF", Step.ValidaPesquisar());

		Step.Pesquisar("POWERVIEW BALANCO");
		Assert.assertEquals("POWERVIEW BALANCO", Step.ValidaPesquisar());
		
		Step.Pesquisar("MAGUARY");
		Assert.assertEquals("MAGUARY", Step.ValidaPesquisar());
		
		Step.Pesquisar("GRUPO SONAE");
		Assert.assertEquals("GRUPO SONAE", Step.ValidaPesquisar());
		
		Step.Pesquisar("ERPLASTI, FIOBRAS");
		Assert.assertEquals("ERPLASTI, FIOBRAS", Step.ValidaPesquisar());
		
		Step.StatusEmissoes("Todas ativas");
        Step.CloseEmissoes();
		
    // Solicitacoes em andamento de certificado f�sico.  
        
        Step.Solicitacoes();
        Assert.assertEquals("modal-body", Step.ValidaSolicitacoes());
        Step.CloseSolicitacoes();
        
    // Ajudaa    
        
        Step.Ajuda();
        Assert.assertEquals("modal-header text-left", Step.ValidaAjuda());
        Step.Ok();
        
    // Upload de CSV para atualiza��o de dados.     
    
        Step.UploadCSV();
        Step.UploadArquivo();
        Step.Carregar();
        Assert.assertEquals("swal2-confirm swal2-styled", Step.ValidaImportacaoCSV());
        Step.OkImportacao();
        
     // Consultar Dados  
        
        Step.ConsultaDados();
        Step.SelecionarAno("2018");
        Step.Nome("BRF");
        Step.Consultar();
        Assert.assertEquals("355-FRIG.AVES-SUINOS TOLEDO", Step.ValidaConsulta());
        Step.Closed();
      
	}

}
