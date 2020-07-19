package br.com.testes;

import org.junit.Test;
import org.openqa.selenium.By;

import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.PublicarCard;
import org.junit.Assert;

public class TestCard extends BaseTest {
	
	
	PublicarCard Step = new PublicarCard();
	
	@Test 
	
	public void PublicarCard() throws InterruptedException {
		
		Step.Url(Parametros.UrlPowerView);
	
 	// Publicação do Card via Link.
		
		Step.Publicar();
		Step.Link("https://www.doc88.com.br/institucional");
		Step.Carregar();
		Step.Categoria("Notícias");
		Step.ComentarioPost("Melhor PME para se trabalhar do Brasil!!!");
		Step.Grupo();
		Step.Comentario();
		Step.PublicarCard();
		
		Assert.assertEquals("DOC88 - Institucional", Step.ConfirmaLink());
				
		
	// Publicação do Card via Link YouTube.
		
		Step.Publicar();
		Step.Video();
		Step.LinkYoutube("https://www.youtube.com/watch?v=D50KdLYQAsc&t=137s");
		Step.Carregar();
		Step.CategoriaYoutube();
		Step.ComentPost("Automação de Testes by Selenium WebDriver.");
		Step.GrupoYoutube();
		Step.PublicarCard();
		
		Assert.assertEquals("Doc Talking #5 Testes Automatizados - 9 de abril de 2019", Step.ConfirmaVideoYoutube());
	
	
	// Publicação do Card via Texto.
		
		Step.Publicar();
		Step.TextosArquivos();
		Step.CategoriaTextos("Doc88 Informa");
		Step.TituloTexto("Quality Assurance");
		Step.Texto("Neste tutorial, aprenderemos a lidar com iFrames usando o Selenium Webdriver . O iFrame é um documento HTML incorporado dentro de um documento HTML. O iFrame é definido por uma tag <iframe> </ iframe> em HTML. Com essa tag, você pode identificar um iFrame enquanto inspeciona a árvore HTML.\r\n" + 
					"\r\n" + 
					"Aqui está um exemplo de código HTML de uma página HTML que contém dois iFrames.");
		Step.GrupoTelaTexto();
		Step.PublicarCard();
				
		Assert.assertEquals("Quality Assurance", Step.ConfirmaTextoArquivos());
		

	// Pesquisar Card Link 
	
		Step.PesquisarCard();
		Step.TodasCategorias(By.id("filter-category"), "Comunicados Internos");
		Step.TodosGrupos(By.id("filter-group"), "Colaboradores");
		Step.PesquisarConteudo("DOC88 - Institucional");
		Step.Pesquisar();
	
		Assert.assertEquals("DOC88 - Institucional", Step.ValidaCardLink());
		
	
	// Pesquisar Card Link YouTube 
		
		Step.TodasCategorias(By.id("filter-category"), "Doc88 Informa");
		Step.TodosGrupos(By.id("filter-group"), "Colaboradores");
		Step.PesquisarConteudo("Doc Talking #5 Testes Automatizados - 9 de abril de 2019");
		Step.Pesquisar();
		
		Assert.assertEquals("Doc Talking #5 Testes Automatizados - 9 de abril de 2019", Step.ValidaCardYoutube());	
		
	
	// Pesquisa Card Texto
	
		Step.TodasCategorias(By.id("filter-category"), "Doc88 Informa");
		Step.TodosGrupos(By.id("filter-group"), "Colaboradores");
		Step.PesquisarConteudo("Quality Assurance");
		Step.Pesquisar();
	
		Assert.assertEquals("Quality Assurance", Step.ValidaCardTexto());	
	
		
	// Excluir Cards e Validar Exclusão.
	
		Step.RefreshNavigate();
		
		Assert.assertEquals("Quality Assurance", Step.ValidaExclusao());
		Step.ExcluirCard1();
		
		Assert.assertEquals("Doc Talking #5 Testes Automatizados - 9 de abril de 2019", Step.ValidaExclusao());
		Step.ExcluirCard2();
		
		Assert.assertEquals("DOC88 - Institucional", Step.ValidaExclusao());
		Step.ExcluirCard3();
						
	}	
		
}
