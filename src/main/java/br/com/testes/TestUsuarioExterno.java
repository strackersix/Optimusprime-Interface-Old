package br.com.testes;

import org.junit.Test;
import org.openqa.selenium.By;

import br.com.core.BaseTest;
import br.com.core.Parametros;
import br.com.pages.UsuarioExterno;
import br.com.utils.Random;
import org.junit.Assert;


public class TestUsuarioExterno extends BaseTest {
	
	
	final String nome = "Gabriel Conrado" + Random.randomAlphaNumeric(5);
	final String email = "gabriel.conrado" + Random.randomAlphaNumeric(5) + "@teste.com.br";
	final String login = "gabriel.conrado" + Random.randomAlphaNumeric(5);
	
	UsuarioExterno Step = new UsuarioExterno();
	
	@Test
	
	public void TestUsuarioExterno () throws InterruptedException {
		
		Step.Url(Parametros.UrlPowerView);
		Step.Usuario();
		Step.PowerView();
		Step.Adicionar();
		Step.NomeUsuario(nome);
		Step.Email(email);
		Step.Login(login);
		Step.Senha("Doc@123456");
		Step.UsuarioDegustacao();
		Step.DiasDegustacao(By.name("expire"), "30 Dias");
		Step.Grupos("Doc88");
		Step.Permissoes();
		Step.EnviarEmail();
		Step.GruposEconomicos("POWERVIEW BALANCO");
		Step.Historico();
		Step.Planejamento();
		Step.Infomerc();
		Step.AdicionarUsuario();
		Step.CadastradoSucesso();
		Step.Pesquisar(email);
		
		
  // Método para validar o Usuário Externo. 
		
		Assert.assertEquals(email, Step.EmailCadastrado());

		Step.AlterarEmail();
		Step.Excluir();
		Step.Sim();
		Step.Ok();
		
	}
	
}
