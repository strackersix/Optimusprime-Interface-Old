package br.com.testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.junit.Assert;
import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.UsuariosInternos;
import br.com.utils.Random;

public class TestUsuariosInternos extends BaseTest {

	static final String nome = "Testes Automatizados" + Random.randomAlphaNumeric(5);
	static final String email = "gabriel.conrado" + Random.randomAlphaNumeric(5) + "@comerc.com.br";
	static final String login = "gabriel.conrado" + Random.randomAlphaNumeric(5);
	
	UsuariosInternos Step = new UsuariosInternos(); 
	
	@Test
	
	public void TestUsuariosInternos () throws InterruptedException {
		
		
		Step.Url(Parametros.UrlPowerView);
		Step.Usuario();
		Step.GestaoUsuario();
		Step.Adicionar();
		Step.NomeUsuario(nome);
		Step.Email(email);
		Step.LoginAcesso(login);
		Step.Senha("Comerc@2019");
		Step.Nascimento("29/10/1986");
		Step.Admissao("15/04/2019");
		Step.Demissao("");
		Step.Grupo(By.id("be-user-brand"), "Doc88");
		Step.Departamento(By.id("be-user-department"), "São Paulo / TI");
		Step.EnviarEmail();
		Step.GrupoPrincipal("Colaboradores São Paulo");
		Step.Grupos("Doc88");
		Step.Papeis("admin");
		Step.AdicionarUsuario();
		Step.ConsultarUsuario(nome);


	// Método para validação do Usuario Cadastrado
		
		Assert.assertEquals(nome, Step.ValidaUsuario());
		
		Step.ClickUsuario();
		Step.Editar();
		Step.ExcluirUsuario();
		Step.Sim();
		
	
	// Método para validação do Usuario Cadastrado	

		Assert.assertEquals("Inativo", Step.ValidaExclusao());
		
		Step.Organizacoes();
		Step.Grupos();
		Step.Roles();
				
	}
	
}
