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
		Step.Projeto("Sustenta��o PowerView Doc88");
		Step.Solicitante("Gabriel Souza");
		Step.DirecioneTicket();
		Step.DirecioneTicket2();
		Step.DirecioneTicket3();
		Step.Texto("Segundo o SWEBOK 3.0, qualidade de software � uma �rea do conhecimento da engenharia de software que pode se referir"
				+ "a: \"as caracter�sticas desejadas de produtos de software, a extens�o em que um produto de software em particular possui essas caracter�sticas e aos processos,"
				+ " ferramentas e t�cnicas que s�o usadas para garantir essas caracter�sticas\"[1]."
				+ "Existem muitas defini��es gerais sobre qualidade que podem ser aplicadas diretamente a qualidade de software. Segundo a norma ISO 9000 (vers�o 2000), qualidade � \"o grau em que um conjunto de caracter�sticas inerentes a um produto, processo ou sistema cumpre os requisitos inicialmente estipulados para estes\". J� Juran, um dos principais autores sobre o assunto, tem duas defini��es para qualidade \"a caracter�stica dos produtos que atendem as necessidades dos clientes, e, assim, proporcionar a satisfa��o do mesmo[2]\" e \"qualidade � a aus�ncia de defici�ncias[2]\"");
		Step.Validar();
		Step.Cadastrar();
		Step.Acoes();
		Step.Apagar();
				
		

			
	}
			
}
		


	
	

