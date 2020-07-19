package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class GestaoEnergia extends BasePage {
	
	
	public void Url ( String Url ) {

		driver.get(Url);
		
	}
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
	}
	
	public void GestaoEnergia () throws InterruptedException {
		
		driver.findElement(By.xpath("(//li/a/span[@class = 'fa fa-bolt fa-fw color-gray-blue'])[2]")).click();
		Thread.sleep(2000);
		
	}
	
	public void Filtros () {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'g-filter__activator g-button circle purple active']")).click();
		
	}
	
	public void SelecionarGrupoEconomico ( String buscarGrupoEconomico ) {
		
		driver.findElement(By.xpath("(//div/button/div[@class = 'buttonLabel'])[1]")).click();
		driver.findElement(By.xpath("(//div/div/input[@class = 'inputFilter'])[1]")).clear();
		driver.findElement(By.xpath("(//div/div/input[@class = 'inputFilter'])[1]")).sendKeys(buscarGrupoEconomico);
		driver.findElement(By.xpath("//ul/li/span")).click();
		
	}
	
	public void SelecionarPeriodo ( String selecionarPeriodo )  {
		
		driver.findElement(By.xpath("//div/div/input[@placeholder = 'Selecione...']")).clear();
		driver.findElement(By.xpath("//div/div/input[@placeholder = 'Selecione...']")).sendKeys(selecionarPeriodo);
		driver.findElement(By.xpath("//div/div/input[@placeholder = 'Selecione...']")).sendKeys(Keys.TAB);
		
	}
	
	public void SelecionarGrupoEmpresas ( String selecionarGrupoEmpresas ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/button/div[@class = 'buttonLabel'])[2]")));
		driver.findElement(By.xpath("(//div/button/div[@class = 'buttonLabel'])[2]")).click();
		driver.findElement(By.xpath("(//div/div/input[@class = 'inputFilter'])[2]")).clear();
		driver.findElement(By.xpath("(//div/div/input[@class = 'inputFilter'])[2]")).sendKeys(selecionarGrupoEmpresas);
		driver.findElement(By.xpath("(//div/ul/li/span[text() = 'DASA'])[2]")).click();
		driver.findElement(By.xpath("(//div/button/div[@class = 'buttonLabel'])[2]")).click();
		
	}
	
	public void SelecionarUnidadeConsumo ( String selecionarUnidadeConsumo ) {
		
		driver.findElement(By.xpath("(//button/div/span[@class = 'caret'])[3]")).click();
		driver.findElement(By.xpath("(//input[@placeholder = 'Buscar...'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@placeholder = 'Buscar...'])[3]")).sendKeys(selecionarUnidadeConsumo);
		driver.findElement(By.xpath("//li/span[text() = 'D115-DA-ITAIM BIBI']")).click();
		driver.findElement(By.xpath("(//button/div/span[@class = 'caret'])[3]")).click();
				
	}
	
	public void Submercado ( String submercado ) {
		
		driver.findElement(By.xpath("(//button/div/span[@class = 'caret'])[4]")).click();
		driver.findElement(By.xpath("(//div/div/input[@placeholder = 'Buscar...'])[4]")).clear();
		driver.findElement(By.xpath("(//div/div/input[@placeholder = 'Buscar...'])[4]")).sendKeys(submercado);
		driver.findElement(By.xpath("//ul/li/span[@class = 'margin-left-20'][text() = 'SUDESTE/CENTRO-OESTE']")).click();
		driver.findElement(By.xpath("(//div/button/div[@class = 'buttonLabel'])[4]")).click();
	
	}
			
	public void Estado ( String estado ) {
		
		driver.findElement(By.xpath("(//div/button/div[@class = 'buttonLabel'])[5]")).click();
		driver.findElement(By.xpath("(//div/div/input[@class = 'inputFilter'])[5]")).clear();
		driver.findElement(By.xpath("(//div/div/input[@class = 'inputFilter'])[5]")).sendKeys(estado);
		driver.findElement(By.xpath("//div/ul/li/span[@class= 'margin-left-20'][text()= 'SÃO PAULO']")).click();
		driver.findElement(By.xpath("(//div/button/div[@class = 'buttonLabel'])[5]")).click();
		
	}
	
	public void Distribuidora ( String distribuidora ) {
		
		driver.findElement(By.xpath("(//button/div/span[@class = 'caret'])[6]")).click();
		driver.findElement(By.xpath("(//div/div/input[@class = 'inputFilter'])[6]")).clear();
		driver.findElement(By.xpath("(//div/div/input[@class = 'inputFilter'])[6]")).sendKeys(distribuidora);
		driver.findElement(By.xpath("//ul/li/span[text() = 'ENEL SP']")).click();
		driver.findElement(By.xpath("(//button/div/span[@class = 'caret'])[6]")).click();
		
	}
	
	public void Tensao ( String tensao ) {
		
		driver.findElement(By.xpath("(//div/button/div[@class = 'buttonLabel'])[7]")).click();
		driver.findElement(By.xpath("(//div/div/input[@class = 'inputFilter'])[7]")).clear();
		driver.findElement(By.xpath("(//div/div/input[@class = 'inputFilter'])[7]")).sendKeys(tensao);
		driver.findElement(By.xpath("(//div[@class = 'checkBoxContainer'])[7]/ul")).click();
		driver.findElement(By.xpath("(//div/button/div[@class = 'buttonLabel'])[7]")).click();
		
	}
	
	public void GerarRelatorio () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'g-button purple outline my-2 py-2']")).click();
				
	}
	
	public void WaitLoading () throws InterruptedException {
				
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'g-page__loading__wrapper']")));
		WebElement element = driver.findElement(By.xpath("//div[@class = 'g-page__loading__wrapper']"));
		String string = element.getAttribute("class");
				
		while (string.equalsIgnoreCase("g-page__loading__wrapper")) {
		
			try {

				WebElement element2 = driver.findElement(By.xpath("//div[@class = 'g-page__loading__wrapper']"));
				String string2 = element2.getAttribute("class");
				string = string2;
				
			} catch (Exception e) {

				string = "";
				
			}
						
		}
				
	}
		
	public String ValidaOtimizacaoEconomica () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div/div/span[@class = 'heading-3'])[1]")));
		Thread.sleep(1000);
		return driver.findElement(By.xpath("(//div/div/span[@class = 'heading-3'])[1]")).getText();
		
	}
	
	public String ValidaPenalidades () {
		
		return driver.findElement(By.xpath("(//div[@class = 'flex align-baseline']/span)[4]")).getText();
		
	}
	
	public String ValidaCustoEnergiaEletrica () {
		
		return driver.findElement(By.xpath("(//div[@class = 'flex align-baseline']/span)[6]")).getText();
		
	}
	
	public String ValidaConsumo () {
		
		return driver.findElement(By.xpath("(//div[@class = 'flex align-baseline']/span)[8]")).getText();
		
	}
	
	public void PowerView () throws InterruptedException {
		
		driver.findElement(By.xpath("//a/div/img[@src='/images/logo']")).click();
		Thread.sleep(2000);
		
	}
		
	public void PageUp () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript ("window.scrollBy (0,-700)");
		Thread.sleep(1000);		
		
	}
	
	public void Tabela () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/a/span[@class = 'caption'])[2]")).click();
		Thread.sleep(1000);
	}
	
	public String ValidaOtimizacaoEconomicaTabela () {
		
		return driver.findElement(By.xpath("( //div/div/span[@class = 'body-2'])[1]")).getText();
		
	}
	
	public String ValidaPenalidadesTabela () {
		
		return driver.findElement(By.xpath("( //div/div/span[@class = 'body-2'])[2]")).getText();
		
	}
	
	
	public String ValidaCustoEnergiaEletricaTabela () {
		
		return driver.findElement(By.xpath("( //div/div/span[@class = 'body-2'])[3]")).getText();
		
	}	
	
	public String ConsumoTabela () {
		
		return driver.findElement(By.xpath("( //div/div/span[@class = 'body-2'])[4]")).getText();
		
	}	
	
	public void Faturas () throws InterruptedException {
		
		driver.findElement(By.xpath("//a/span/i[@class = 'g-icon left fa fa-file']")).click();
		Thread.sleep(1000);
		
	}
	
	public String ValidaFaturasCapturadas () {
		
		return driver.findElement(By.xpath("(//div/div/span[@class ='heading-1'])[2]")).getText();
		
	}
		
	public String ValidaReativaExcedente () {
		
		return driver.findElement(By.xpath("(//div/div/span[@class = 'heading-1'])[4]")).getText();
		
	}
	
	public String ValidaGraficoControleFatura () {
		
		return driver.findElement(By.xpath("(//div/canvas[@id = 'bar-chart'])[2]")).getAttribute("id");
		
	}
	
	public String ValidaGraficoReativaExcedente () {
		
		return driver.findElement(By.xpath("(//div/canvas[@id = 'bar-chart'])[3]")).getAttribute("id");
			
	}
	
	public String ValidaTop5Unidades1 () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'flex column pa-auto ma-1'])[5]")).getAttribute("class");
		
	}
	
	public String ValidaTop5Unidades2 () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'flex column pa-auto ma-1'])[7]")).getAttribute("class");
		
	}

	public String ValidaTop5Unidades3 () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'flex column pa-auto ma-1'])[9]")).getAttribute("class");
		
	}
	
	public String ValidaUltrapassagem () {
		
		return driver.findElement(By.xpath("(//div/div/span[@class = 'heading-1'])[6]")).getText();
		
	}
	
	public String ValidaMultasJurosMonetaria () {
		
		return driver.findElement(By.xpath("(//div/div/span[@class = 'heading-1'])[8]")).getText();
		
	}
	
	public String ValidaAlertas () {
		
		return driver.findElement(By.xpath("(//div/div/span[@class = 'heading-1'])[10]")).getText();
		
	}
	
	public void PageDown () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (0,700)");
		Thread.sleep(1000);
		
	}
	
	
	public void MapaFaturas () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/a/span[@class = 'caption'])[2]")).click();
		Thread.sleep(1000);
		
	}
	
	public String EmpresaUnidade () {
		
		return driver.findElement(By.xpath("(//tbody/tr/td[4])[1]")).getText();
		
	}
	
	public String ValorFatura ( ) {
		
		return driver.findElement(By.xpath("//div/div/div[@class = 'flex column pa-auto ma-1']")).getAttribute("class");
		
	}

	public String DemandaPonta () {
		
		return driver.findElement(By.xpath("(//div/div/span[@class = 'title mr-1'])[1]")).getText();
		
	}
	
	public String DemandaForaPonta () {
		
		return driver.findElement(By.xpath("(//div/div/span[@class = 'title mr-1'])[2]")).getText();	
		
	}
	
	public String ConsumoPonta () {
		
		return driver.findElement(By.xpath("(//div/div/span[@class = 'title mr-1'])[3]")).getText();
		
	}
	
	public String ConsumoForaPonta () {
		
		return driver.findElement(By.xpath("(//div/div/span[@class = 'title mr-1'])[4]")).getText();	
		
	}
	
	public String ConsumoTotal () {
		
		return driver.findElement(By.xpath("(//div/div/span[@class = 'title mr-1'])[5]")).getText();		
	}
	
	public void Relatorios () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/a/span[@class = 'caption'])[2]")).click();
		Thread.sleep(2000);
		
	}
	
	public void Alarmes () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/a/span[@class = 'caption'])[3]")).click();
		Thread.sleep(2000);
		
	}
	
	public String ExtracaoMedicao () {
		
		return driver.findElement(By.xpath("//div/span/strong[text() = 'Extração Medição Horária']")).getText();
		
	}
	
	public void DemandaMaximaRegistradaDia () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/div/span[@class = 'caption'])[3]")).click();
		Thread.sleep(1000);
	}

	public void DemandaMaximaRegistradaSemana () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/div/span[@class = 'caption mx-1'])[1]")).click();
		Thread.sleep(1000);
	}
	
	public void DemandaMaximaRegistradaMes () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/div/span[@class = 'caption active'])[1]")).click();
		Thread.sleep(1000);
	}
	
	public void ConsumoDia () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/div/span[@class = 'caption'])[4]")).click();
		Thread.sleep(1000);
	}

	public void ConsumoSemana () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/div/span[@class = 'caption mx-1'])[2]")).click();
		Thread.sleep(1000);
	}
	
	public void ConsumoMes () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/div/span[@class = 'caption active'])[2]")).click();
		Thread.sleep(1000);
	}
	
	public String ValidaGraficoAuditoriaFaturas () {
		
		return driver.findElement(By.xpath("//canvas[@id = 'pie-chart']")).getAttribute("id");
		
	}
	
	public String ValidaGraficoTotalOcorrencias () {
		
		return driver.findElement(By.xpath("(//canvas[@id = 'bar-chart'])[1]")).getAttribute("id");
		
	}
	
	public String  ValidaGraficoDemanda () {
		
		return driver.findElement(By.xpath("(//div/canvas[@id = 'bar-chart'])[4]")).getAttribute("id");
		
	}
	
	public String ValidaGraficoMultaJurosMonetaria () {
		
		return driver.findElement(By.xpath("(//div/canvas[@id = 'bar-chart'])[4]")).getAttribute("id");
		
	}
	
	public void UpLoadFaturas () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/div/a[@href = '/gestaoenergiav2/cativo/faturas/upload-de-faturas']")).click();
		Thread.sleep(1000);
		
	}
	
	public String ValidaFaturas () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'flex column pa-auto ma-1'])[2]")).getAttribute("class");
		
	}
	
	public void RelatoriosFatura () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/a[@href='/gestaoenergiav2/cativo/faturas/relatorios']")).click();
		Thread.sleep(2000);
		
	}
	
	public String ValidaDocumentosFaltantes () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'g-panel__title flex grow pa-2'])[6]")).getAttribute("class");
		
	}
	
	public String ValidaDadosFatura () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'g-panel__title flex grow pa-2'])[7]")).getAttribute("class");
		
	}
	
	public void ExportarDocumentosFaltantes () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/div/span[@class = 'caption text--action'])[1]")).click();		
		
	}
		
	public void ExportaDadosFatura () throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div/div/span[@class = 'caption text--action'])[2]")).click();		
				
	}	
	
	public void ExportarAuditoriaEmMassa () throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div/div/span[@class = 'caption text--action'])[3]")).click();		
				
	}
	
	public void ExportarRelatorioLiminares () throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div/div/span[@class = 'caption text--action'])[4]")).click();
		
	}
	
	public String ValidaExportarDocumentosFaltantes () {
		
		return driver.findElement(By.xpath("//div/div/div[@class = 'flex column pa-auto ma-1']")).getAttribute("class");
		
	}
	
	public String ValidaExportaDadosFatura () {
		
		return driver.findElement(By.xpath("//div/div/div[@class = 'flex column pa-auto ma-1']")).getAttribute("class");
		
	}
	
}

