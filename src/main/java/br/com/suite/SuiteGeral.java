package br.com.suite;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import br.com.core.DriverFactory;

import br.com.testes.*;

	@RunWith(Suite.class)
	@SuiteClasses({
					
//// <<< Usuário Interno >>> 		
	TestLogin.class,	
//	TestCard.class,	
//	TestCalendario.class,   									
//	TestDemanda.class,  		
//	TestTicket.class, 
//	TestAuditoria.class,
//	TestPainelPrecos.class, 
//	TestSazonalizacao.class,
//	TestCadastroCliente.class,
//	TestContratos.class, 		
//	TestHistorico.class,  
//	TestIndicadores.class,		
//	TestGestaoEnergia.class, 
//	TestDashmaker.class,    
//	TestPlanejamento.class, 
//	TestRelacionamento.class, 
//	TestMeuPerfil.class, 
//	TestMinhasMedalhas.class, 		
//	TestUsuariosInternos.class, 
//	TestPlugins.class,
//	TestConteudo.class, 
//	TestUsuarioExterno.class, 
//	TestHistoricoDecisoes.class, 
//	TestLogout.class,
//	
//// ------ <<< Usuário Externo >>> ------ // 
//	TestLogin_UsuarioExterno.class,
//	TestHistorico_UsuarioExterno.class,  
//	TestIndicadores_UsuarioExterno.class, 
//	TestPlanejamento_UsuarioExterno.class,  
//	TestMinhaCelula_UsuarioExterno.class, 
//	TestRelacionamento_UsuarioExterno.class, 
//	TestMeuPerfil_UsuarioExterno.class, 
//	TestMinhasMedalhas_UsuariosExternos.class,
//	TestLogout_UsuarioExterno.class,
		
	
})
		
	
public class SuiteGeral  { 

	@AfterClass
	public static void Finalizar() throws InterruptedException {
		
//		Thread.sleep(30000);
//		DriverFactory.FinalizaDriverFactory();
			
	}

	
}
	