package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.MinhaCelula_UsuarioExterno;

public class TestMinhaCelula_UsuarioExterno extends BaseTest {
	
	
	MinhaCelula_UsuarioExterno Step = new MinhaCelula_UsuarioExterno();
	
	@Test
	
	public void TestFaleComAgente_UsuarioExterno () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.FaleComAgente();
		Step.MinhaCelula();
		Step.VerPerfil();
		Step.Editar();
		Step.Nome("Gabriel Conrado");
		Step.Localizacao("Doc88");
		Step.Ramal("222");
		Step.TelComercial("1142435567");
		Step.TelCelular("11981688987");
		Step.Texto("Analista de Qualidade de Software");
		Step.Salvar();
//		Step.DeixaRecado();
					
	}

}
        
