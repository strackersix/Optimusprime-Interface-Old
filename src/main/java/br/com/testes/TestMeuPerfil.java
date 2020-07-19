package br.com.testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.junit.Assert;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.MeuPerfil;

public class TestMeuPerfil extends BaseTest {
	
	
	MeuPerfil Step = new MeuPerfil();
	
	@Test
	
	public void TestMeuPerfil () throws InterruptedException {
		
		Step.Url(Parametros.UrlPowerView);
		Step.Usuario();
		Step.AcessarMeuPerfil();
		Step.Editar();
		Step.NomeUsuario("Gabriel Conrado de Souza");
		Step.Cidade("São Paulo");
		Step.Ramal("(12) 345");
		Step.Comercial("1199990000");
		Step.Celular("11988887777");
		Step.TextoPessoal("Analista de Qualidade de Software.");
		Step.Salvar();
		Step.Scrapbook();
		Step.Publicacoes();
		Step.Favoritos();
		
	}
	
}
