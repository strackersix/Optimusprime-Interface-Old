package br.com.testes;

import org.junit.Test;

import br.com.core.Parametros;
import br.com.pages.TelemetriaFiltro;
import org.junit.Assert;

public class TestTelemetriaFiltro  {
	
	TelemetriaFiltro Step = new TelemetriaFiltro();
		
	@Test
	public void ExecutaTelemetriaFiltro() throws InterruptedException {
	
		String Mes = "Dez";
		String Ano = "2019";
		
		String GrupoEconomico_1 = "AJINOMOTO";
		String GrupoEmpresa_1 = "AJINOMOTO";
		String GrupoUnidade_1 = "AJINOMOTO LARANJAL";
		
		String GrupoEconomico_2 = "JBS";
		String GrupoEmpresa_2 = "JBS";
		String GrupoUnidade_2 = "FRIBOI - BARRA DO GARCAS";
		
		String GrupoEconomico_3 = "ALPEX";
		String GrupoEmpresa_3 = "ALPEX";
		String GrupoUnidade_3 = "ALPEX";
				
		String GrupoEconomico_4 = "ASB BEBIDAS";
		String GrupoEmpresa_4 = "ASB BEBIDAS";
		String GrupoUnidade_4 = "ASB STA BARBARA";
		
		String GrupoEconomico_5 = "POWERVIEW BALANCO";
		String GrupoEmpresa_5 = "POWERVIEW BALANCO";
		String GrupoUnidade_5 = "POWERVIEW BALANCO UNID 1";
		

				
		Step.Url(Parametros.UrlPowerView);
		Step.MinhaConta();
		Step.Telemetria();
		
		int count = 1; 
		int tentativa = 1;
		
		do {
			
			Step.GrupoEconomico(GrupoEconomico_1);
			Step.Empresa(GrupoEmpresa_1);
			Step.Unidade(GrupoUnidade_1);
			Step.Periodo(Mes, Ano);
			Step.WaitDashboard();
			
			Step.GrupoEconomico(GrupoEconomico_2);
			Step.Empresa(GrupoEmpresa_2);
			Step.Unidade(GrupoUnidade_2);
			Step.Periodo(Mes, Ano);
			Step.WaitDashboard();
			
			Step.GrupoEconomico(GrupoEconomico_3);
			Step.Empresa(GrupoEmpresa_3);
			Step.Unidade(GrupoUnidade_3);
			Step.Periodo(Mes, Ano);
			Step.WaitDashboard();
			
			Step.GrupoEconomico(GrupoEconomico_4);
			Step.Empresa(GrupoEmpresa_4);
			Step.Unidade(GrupoUnidade_4);
			Step.Periodo(Mes, Ano);
			Step.WaitDashboard();
			
			Step.GrupoEconomico(GrupoEconomico_5);
			Step.Empresa(GrupoEmpresa_5);
			Step.Unidade(GrupoUnidade_5);
			Step.Periodo(Mes, Ano);
			Step.WaitDashboard();
			
			--count;
			System.out.println("Tentativa número: " + tentativa++);
			
		} while (count != 0);
		
		Thread.sleep(2000);
		Assert.assertEquals("Demanda Ponta" + "\n" +
				"Máxima Registrada - 06/12/2019 19:45" + "\n" + 
				"766,08 kW" + "\n" +
				"Última Leitura" + "\n" +
				"72,96 kW" + "\n" +
				"Usado: 46,43%" + "\n" +
				"766,08 / 1.650,00 KW", Step.DemandaPonta());
		
		Assert.assertEquals("Demanda Fora Ponta" + "\n" +
				"Máxima Registrada - 05/12/2019 17:30" + "\n" + 
				"817,92 kW" + "\n" +
				"Última Leitura" + "\n" +
				"69,12 kW" + "\n" +
				"Usado: 49,57%" + "\n" +
				"817,92 / 1.650,00 KW", Step.DemandaPontaForaPonta());
		
		Assert.assertEquals("Consumo Ponta" + "\n" + 
				"25/12/19 - 23:45" + "\n" +
				"26,269 MWh", Step.ConsumoPonta());
	
		Assert.assertEquals("Consumo Fora Ponta" + "\n" + 
				"25/12/19 - 23:45" + "\n" + 
				"212,317 MWh", Step.ConsumoForaPonta());
		
		Assert.assertEquals("0" + "\n" + 
				"250" + "\n" + 
				"500" + "\n" + 
				"750" + "\n" + 
				"01/12 00:…" + "\n" + 
				"01/12 05:15" + "\n" + 
				"01/12 10:15" + "\n" + 
				"01/12 15:15" + "\n" + 
				"01/12 20:15" + "\n" + 
				"02/12 01:15" + "\n" + 
				"02/12 06:15" + "\n" + 
				"02/12 11:15" + "\n" + 
				"02/12 16:15" + "\n" + 
				"02/12 21:15" + "\n" + 
				"03/12 02:15" + "\n" + 
				"03/12 07:15" + "\n" + 
				"03/12 12:15" + "\n" + 
				"03/12 17:15" + "\n" + 
				"03/12 22:15" + "\n" + 
				"04/12 03:15" + "\n" + 
				"04/12 08:15" + "\n" + 
				"04/12 13:15" + "\n" + 
				"04/12 18:15" + "\n" + 
				"04/12 23:15" + "\n" + 
				"05/12 04:15" + "\n" + 
				"05/12 09:15" + "\n" + 
				"05/12 14:15" + "\n" + 
				"05/12 19:15" + "\n" + 
				"06/12 00:15" + "\n" + 
				"06/12 05:15" + "\n" + 
				"06/12 10:15" + "\n" + 
				"06/12 15:15" + "\n" + 
				"06/12 20:15" + "\n" + 
				"07/12 01:15" + "\n" + 
				"07/12 06:15" + "\n" + 
				"07/12 11:15" + "\n" + 
				"07/12 16:15" + "\n" + 
				"07/12 21:15" + "\n" + 
				"Ponta" + "\n" + 
				"Fora Ponta" + "\n" + 
				"Demanda Reativa" + "\n" + 
				"Contrato Ponta Fora" + "\n" + 
				"Contrato Ponta", Step.PerfilCarga());
		
		Step.MaximaDia();
		
		Assert.assertEquals("0" + "\n" + 
				"250" + "\n" + 
				"500" + "\n" + 
				"750" + "\n" + 
				"2019-12-01" + "\n" + 
				"2019-12-06" + "\n" + 
				"2019-12-11" + "\n" + 
				"2019-12-16" + "\n" + 
				"2019-12-21" + "\n" + 
				"2019-12-26" + "\n" + 
				"2019-12-31" + "\n" + 
				"Ponta" + "\n" + 
				"Fora Ponta" + "\n" + 
				"Demanda Reativa" + "\n" + 
				"Contrato Ponta Fora" + "\n" + 
				"Contrato Ponta", Step.PerfilCarga());
		
		Step.MaximaDia();
		
		Assert.assertEquals("0" + "\n" + 
				"250" + "\n" + 
				"500" + "\n" + 
				"750" + "\n" + 
				"01/12 00:…" + "\n" + 
				"01/12 05:15" + "\n" + 
				"01/12 10:15" + "\n" + 
				"01/12 15:15" + "\n" + 
				"01/12 20:15" + "\n" + 
				"02/12 01:15" + "\n" + 
				"02/12 06:15" + "\n" + 
				"02/12 11:15" + "\n" + 
				"02/12 16:15" + "\n" + 
				"02/12 21:15" + "\n" + 
				"03/12 02:15" + "\n" + 
				"03/12 07:15" + "\n" + 
				"03/12 12:15" + "\n" + 
				"03/12 17:15" + "\n" + 
				"03/12 22:15" + "\n" + 
				"04/12 03:15" + "\n" + 
				"04/12 08:15" + "\n" + 
				"04/12 13:15" + "\n" + 
				"04/12 18:15" + "\n" + 
				"04/12 23:15" + "\n" + 
				"05/12 04:15" + "\n" + 
				"05/12 09:15" + "\n" + 
				"05/12 14:15" + "\n" + 
				"05/12 19:15" + "\n" + 
				"06/12 00:15" + "\n" + 
				"06/12 05:15" + "\n" + 
				"06/12 10:15" + "\n" + 
				"06/12 15:15" + "\n" + 
				"06/12 20:15" + "\n" + 
				"07/12 01:15" + "\n" + 
				"07/12 06:15" + "\n" + 
				"07/12 11:15" + "\n" + 
				"07/12 16:15" + "\n" + 
				"07/12 21:15" + "\n" + 
				"Ponta" + "\n" + 
				"Fora Ponta" + "\n" + 
				"Demanda Reativa" + "\n" + 
				"Contrato Ponta Fora" + "\n" + 
				"Contrato Ponta", Step.PerfilCarga());
		
		Step.PeriodoMes("1", "31");
		
		Assert.assertEquals("0" + "\n" +
				"250" + "\n" +
				"500" + "\n" +
				"750" + "\n" +
				"-250" + "\n" +
				"01/12 00:…" + "\n" +
				"01/12 12:45" + "\n" +
				"02/12 01:15" + "\n" +
				"02/12 13:45" + "\n" +
				"03/12 02:15" + "\n" +
				"03/12 14:45" + "\n" +
				"04/12 03:15" + "\n" +
				"04/12 15:45" + "\n" +
				"05/12 04:15" + "\n" +
				"05/12 16:45" + "\n" +
				"06/12 05:15" + "\n" +
				"06/12 17:45" + "\n" +
				"07/12 06:15" + "\n" +
				"07/12 18:45" + "\n" +
				"08/12 07:15" + "\n" +
				"08/12 19:45" + "\n" +
				"09/12 08:15" + "\n" +
				"09/12 20:45" + "\n" +
				"10/12 09:15" + "\n" +
				"10/12 21:45" + "\n" +
				"11/12 10:15" + "\n" +
				"11/12 22:45" + "\n" +
				"12/12 11:15" + "\n" +
				"12/12 23:45" + "\n" +
				"13/12 12:15" + "\n" +
				"14/12 00:45" + "\n" +
				"14/12 13:15" + "\n" +
				"15/12 01:45" + "\n" +
				"15/12 14:15" + "\n" +
				"16/12 02:45" + "\n" +
				"16/12 15:15" + "\n" +
				"17/12 03:45" + "\n" +
				"17/12 16:15" + "\n" +
				"18/12 04:45" + "\n" +
				"18/12 17:15" + "\n" +
				"19/12 05:45" + "\n" +
				"19/12 18:15" + "\n" +
				"20/12 06:45" + "\n" +
				"20/12 19:15" + "\n" +
				"21/12 07:45" + "\n" +
				"21/12 20:15" + "\n" +
				"22/12 08:45" + "\n" +
				"22/12 21:15" + "\n" +
				"23/12 09:45" + "\n" +
				"23/12 22:15" + "\n" +
				"24/12 10:45" + "\n" +
				"24/12 23:15" + "\n" +
				"25/12 11:45" + "\n" +
				"26/12 00:15" + "\n" +
				"26/12 12:45" + "\n" +
				"27/12 01:15" + "\n" +
				"27/12 13:45" + "\n" +
				"28/12 02:15" + "\n" +
				"28/12 14:45" + "\n" +
				"29/12 03:15" + "\n" +
				"29/12 15:45" + "\n" +
				"30/12 04:15" + "\n" +
				"30/12 16:45" + "\n" +
				"31/12 05:15" + "\n" +
				"31/12 17:45" + "\n" +
				"Ponta" + "\n" +
				"Fora Ponta" + "\n" +
				"Demanda Reativa" + "\n" +
				"Contrato Ponta Fora" + "\n" +
				"Contrato Ponta", Step.PerfilCarga());	
		
		Step.PeriodoMes("1", "7");
		
		Assert.assertEquals("0" + "\n" +
				"250" + "\n" +
				"500" + "\n" +
				"750" + "\n" +
				"01/12 00:…" + "\n" + 
				"01/12 05:15" + "\n" +
				"01/12 10:15" + "\n" +
				"01/12 15:15" + "\n" +
				"01/12 20:15" + "\n" +
				"02/12 01:15" + "\n" +
				"02/12 06:15" + "\n" +
				"02/12 11:15" + "\n" +
				"02/12 16:15" + "\n" +
				"02/12 21:15" + "\n" +
				"03/12 02:15" + "\n" +
				"03/12 07:15" + "\n" +
				"03/12 12:15" + "\n" +
				"03/12 17:15" + "\n" +
				"03/12 22:15" + "\n" +
				"04/12 03:15" + "\n" +
				"04/12 08:15" + "\n" +
				"04/12 13:15" + "\n" +
				"04/12 18:15" + "\n" +
				"04/12 23:15" + "\n" +
				"05/12 04:15" + "\n" +
				"05/12 09:15" + "\n" +
				"05/12 14:15" + "\n" +
				"05/12 19:15" + "\n" +
				"06/12 00:15" + "\n" +
				"06/12 05:15" + "\n" +
				"06/12 10:15" + "\n" +
				"06/12 15:15" + "\n" +
				"06/12 20:15" + "\n" +
				"07/12 01:15" + "\n" +
				"07/12 06:15" + "\n" +
				"07/12 11:15" + "\n" +
				"07/12 16:15" + "\n" +
				"07/12 21:15" + "\n" +
				"Ponta" + "\n" +
				"Fora Ponta" + "\n" +
				"Demanda Reativa" + "\n" +
				"Contrato Ponta Fora" + "\n" +
				"Contrato Ponta", Step.PerfilCarga());
		
	}

}
