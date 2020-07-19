package br.com.testes;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Conteudo;


public class TestConteudo extends BaseTest {
	
	
	Conteudo Step = new Conteudo();
	
	@Test
	
	public void TestConteudo () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.Usuario();
		Step.Conteudo();
		Step.Adicionar();
		Step.NomeDestaque("Quality Assurance");
		Step.Titulo("Test Automation");
		Step.Descricao("Qualidade de Software");
		Step.TextoBotao("Botão Teste");
		Step.CorBotao("#d9534f");
		Step.UrlBotao("Link Teste");
		Step.Template();
		Step.Cancelar();
		Step.Categoria();
		Step.AdicionarCategoria();
		Step.TituloCategoria("Categoria Test Automation");
		Step.SelecionarCategoria(By.id("content-type"), "Link");	
		Step.CorCategoria("#000000");
		Step.Grupo("Doc88");
		Step.AdicionarNovaCategoria();
		Step.Busca("Categoria Test Automation");

		Assert.assertEquals("Categoria Test Automation", Step.ValidaCategoria());
		
		Step.SelecionarCategoria();
		Step.EditarCategoria();
		Step.TituloCategoria("Alter - Categoria Test Automation");
		Step.SelecionarCategoria(By.id("content-type"), "Texto");
		Step.Alterar();
		Step.Ok();
		
		Step.Busca("Categoria Test Automation");
		Assert.assertEquals("Alter - Categoria Test Automation", Step.ValidaCategoria());
		Step.SelecionarCategoria();
		Step.EditarCategoria();
		Step.ExcluirCategoria();
		Step.SimExclusaoCategoria();
		Step.Ok();
		
		Step.Busca("Alter - Categoria Test Automation");
		
		Assert.assertEquals("Nenhum registro encontrado", Step.ValidaExclusaoCategoria());
		
		
		
		
		
		
	}
	
}
