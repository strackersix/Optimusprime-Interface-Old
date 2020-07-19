package br.com.testes;

import org.junit.Test;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.Ticket;


public class TestTicket extends BaseTest{

	
	Ticket Step = new Ticket();

	@Test
	public void LoginAndTicket() throws InterruptedException {

		
		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Step.Ticket();
		Step.NovoTicket();
		Step.Titulo("Test Automation");
		Step.Horas("2:00");
		Step.Data();
		Step.Projeto("Sustentação PowerView Doc88");
		Step.Solicitante("Gabriel Souza");
		Step.DirecioneTicket();
		Step.DirecioneTicket2();
		Step.DirecioneTicket3();
		Step.Texto("Segundo o SWEBOK 3.0, qualidade de software é uma área do conhecimento da engenharia de software que pode se referir"
				+ "a: \"as características desejadas de produtos de software, a extensão em que um produto de software em particular possui essas características e aos processos,"
				+ " ferramentas e técnicas que são usadas para garantir essas características\"[1]."
				+ "Existem muitas definições gerais sobre qualidade que podem ser aplicadas diretamente a qualidade de software. Segundo a norma ISO 9000 (versão 2000), qualidade é \"o grau em que um conjunto de características inerentes a um produto, processo ou sistema cumpre os requisitos inicialmente estipulados para estes\". Já Juran, um dos principais autores sobre o assunto, tem duas definições para qualidade \"a característica dos produtos que atendem as necessidades dos clientes, e, assim, proporcionar a satisfação do mesmo[2]\" e \"qualidade é a ausência de deficiências[2]\"");
		Step.Validar();
		Step.Cadastrar();
		Step.Acoes();
		Step.Apagar();
				
		

			
	}
			
}
		


	
	

