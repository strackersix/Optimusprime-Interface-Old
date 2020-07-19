package br.com.testes;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.Parametros;
import br.com.pages.Calendario;

public class TestCalendario  {
	
	Calendario Step = new Calendario();
	
	@Test
	public void Calendario() throws InterruptedException, IOException {
	
			
			Step.Url(Parametros.UrlPowerView);
			Step.AcessarCalendario();
			Step.NovoEvento();
			Step.Inicio("01/12/2020");
			Step.Termino("01/12/2020");
			Step.TituloEvento("Test Automation Engineer");
			Step.TipoEvento();
			Step.DescricaoEvento("Selenium WebDriver, Java, JUnit e Maven.");
			Step.Responsavel("Gabriel Oliveira Conrado de Souza");
			Step.Participantes("Gabriel Oliveira Conrado de Souza");
			Step.ParticipantesExternos();
			Step.ReservarSala();
			Step.Participantes();
			Step.Servicos();
			Step.UnidadesSala();
			Step.Nome("Doctor Emmeet Brown");
			Step.Rg("3112252");
			Step.email("gabriel.souza@doc88.com.br");
			Step.PageDown();
			Step.Adicionar();
			Step.Semana();
			Step.SalasReuniao();
			Step.Convidados();
			Step.MeusEventos();
			Step.BuscarEvento("Test Automation Engineer");
			
			Assert.assertEquals("Test Automation Engineer", Step.Titulo());
			
			Step.EditarEvento();		
			Step.ExcluirEvento();
			Step.Sim();		
		
			
	}
	
}
