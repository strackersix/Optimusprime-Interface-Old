package br.com.testes;

import org.junit.Test;
import org.openqa.selenium.By;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.MeuPerfil;
import br.com.pages.MeuPerfil_UsuarioExterno;

public class TestMeuPerfil_UsuarioExterno extends BaseTest {
	
	
	MeuPerfil Step = new MeuPerfil();
	
	@Test
	
	public void TestMeuPerfil () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.Usuario();
		Step.AcessarMeuPerfil();
		Step.Editar();
		Step.NomeUsuario("Gabriel Conrado");
		Step.Cidade("São Paulo");
		Step.Ramal("12345");
		Step.Comercial("1199990000");
		Step.Celular("11988887777");
		Step.TextoPessoal("Analista de Qualidade de Software.");
		Step.Salvar();
		Step.Scrapbook();
		Step.Publicacoes();
		Step.Favoritos();
		
	}

}
