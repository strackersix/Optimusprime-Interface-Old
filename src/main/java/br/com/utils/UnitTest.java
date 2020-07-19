package br.com.utils;

import org.junit.Assert;
import org.junit.Test;

import br.com.pages.Historico_UsuarioExterno;
import br.com.pages.Login_UsuarioExterno;

public class UnitTest {

	Login_UsuarioExterno login = new Login_UsuarioExterno();
	Historico_UsuarioExterno historico = new Historico_UsuarioExterno();

	@Test
	public void TesteUnitario() throws InterruptedException {

		login.Go();
		int count = 10;

		try {

			do {

				historico.Go();
				--count;

				System.out.println("Faltam: " + count + " execuções.");

			} while (count != 0);

		} catch (Throwable e) {

			Assert.fail("Erro");
			
		}

		System.out.println("Sucesso");
		
	}

}
