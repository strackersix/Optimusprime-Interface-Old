package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;

public class Certificados_UsuarioExterno extends BasePage {

	
	public void Url ( String Url ) throws InterruptedException {

		driver.get(Url);

	}

	public void MinhaConta() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[1]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[1]")).click();
		
	}
	
	public void Certificados () {
		
		driver.findElement(By.xpath("(//a[contains(text(),'Certificados')])[2]")).click();
		
	}
	
	public void VejaBeneficios () throws InterruptedException {
		
		driver.findElement(By.xpath("(//a[contains(@href, '#description')])[2]")).click();
		Thread.sleep(1000);		
	}
	
	
 // Gerar certificado e/ou relatório.	
	
	
	public void GerarCertificado () {
		
		driver.findElement(By.cssSelector("i.fa.fa-file-archive-o")).click();
			
	}
	
	public void Consolidado () throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='consolidated'])[2]")).click();
		
	}
	
	public void GrupoEconomico ( String grupoEconomico ) throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("token-input-economic_groups_wizard")).clear();
		driver.findElement(By.id("token-input-economic_groups_wizard")).sendKeys(grupoEconomico);
		Thread.sleep(10000);
		driver.findElement(By.id("token-input-economic_groups_wizard")).sendKeys(Keys.ENTER);
			
	}
	
	public void Next1 () {
		
		driver.findElement(By.cssSelector("i.fa.fa-arrow-circle-right.fa-2x")).click();	
		
	}
	
	public void GerarRelatorio () throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.className("checkbox-generate-relatory")).click();
		
	}
	
	public void Next2 () throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.cssSelector("i.fa.fa-arrow-circle-right.fa-2x")).click();
	}
	
	public void Portugues () throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.name("language_en")).click();
		Thread.sleep(1000);
		
	}
		
	public void Gerar () throws InterruptedException {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'btn btn-primary btn-block generate-button']")).click();
		
	}
	
	public void Close () throws InterruptedException {
		
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("div.modal-header.text-left > button.close > span")).click();

	}
	
		
 // Solicitar certificado físico.	
	
	
	public void SolicitarCertificado () throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Solicitar certificado físico")).click();
				
	}
	
	public void NomeGrupo ( String nomeGrupo ) throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("token-input-certificates-order-input-egroup")).clear();
		driver.findElement(By.id("token-input-certificates-order-input-egroup")).sendKeys(nomeGrupo);
		Thread.sleep(6000);
		driver.findElement(By.id("token-input-certificates-order-input-egroup")).sendKeys(Keys.ENTER);
		
	}
	
	public void Unidades () {
		
		driver.findElement(By.xpath("//input[@name='units_or_consolidated']")).click();
		
	}
	
	public void NomeGrupoUnidade ( String NomeGrupoUnidade ) throws InterruptedException {
		
		driver.findElement(By.id("token-input-units")).clear();
		driver.findElement(By.id("token-input-units")).sendKeys(NomeGrupoUnidade);
		Thread.sleep(6000);
		driver.findElement(By.id("token-input-units")).sendKeys(Keys.ENTER);
		
	}
	
	public void NomeRua ( String nomeRua ) {
		
		driver.findElement(By.name("street")).clear();
		driver.findElement(By.name("street")).sendKeys(nomeRua);
		driver.findElement(By.name("street")).sendKeys(Keys.ENTER);
		
	}
	
	public void Numero ( String numero ) {
		
		driver.findElement(By.id("number")).clear();
		driver.findElement(By.id("number")).sendKeys(numero);
		driver.findElement(By.id("number")).sendKeys(Keys.ENTER);
		
	}
	
	public void Cidade ( String cidade ) {
		
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys(cidade);
		driver.findElement(By.id("city")).sendKeys(Keys.ENTER);
	
	}
	
	public void Estado () {
		
		selecionarCombo(By.id("state"), "São Paulo");
		
	}
	
	public void Cep ( String cep ) {
		
		driver.findElement(By.id("zipcode")).clear();
		driver.findElement(By.id("zipcode")).sendKeys(cep);
		driver.findElement(By.id("zipcode")).sendKeys(Keys.ENTER);
		
	}
	
	public void Complemento ( String complemento ) {
		
		driver.findElement(By.id("complement")).clear();
		driver.findElement(By.id("complement")).sendKeys(complemento);
		driver.findElement(By.id("complement")).sendKeys(Keys.ENTER);
		
	}
	
	public void ResponsavelRecebimento ( String responsavelRecebimento ) {
		
		driver.findElement(By.id("responsible")).clear();
		driver.findElement(By.id("responsible")).sendKeys(responsavelRecebimento);
		driver.findElement(By.id("responsible")).sendKeys(Keys.ENTER);
	
	}
	
	public void Solicitar () throws InterruptedException {
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
	}
	
	
 // Verificar solicitação de certificado físico.
	
	
	public void VerificarSolicitacao ( ) throws InterruptedException {
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Verificar solicitação de certificado físico'])[1]/preceding::i[1]")).click();
		
	}
	
	public void ApenasSemRemessa () throws InterruptedException {
		
		Thread.sleep(2000);
		selecionarCombo(By.id("historic-tracker-select-filter"), "Apenas sem remessa");
		
	}
	
	public void EsperandoImpressao () {
		
		selecionarCombo(By.id("historic-tracker-select-filter"), "Esperando impressão");
		
	}
	
	public void EsperandoEmolduracao () {
		
		selecionarCombo(By.id("historic-tracker-select-filter"), "Esperando emolduração");
		
	}
	
	public void EsperandoEmpacotamento () {
		
		selecionarCombo(By.id("historic-tracker-select-filter"), "Esperando empacotamento");
		
	}
	
	public void Enviado () {
		
		selecionarCombo(By.id("historic-tracker-select-filter"), "Enviado");
		
	}
	
	public void Finalizado () {
		
		selecionarCombo(By.id("historic-tracker-select-filter"), "Finalizado");

	}
	
	public void CloseEmissoes () {
		
		driver.findElement(By.cssSelector("#modal-historic-tracking > div.modal-lg.modal-dialog.modal-dialog-centered > div.modal-content-2 > div.modal-header.text-left > button.close > span")).click();

	}
	
	
 // Solicitacoes em andamento de certificado físico.	
	
	
	public void Solicitacoes () throws InterruptedException {
		
		driver.findElement(By.xpath("//a/div/i[@class ='fa fa-search']")).click();
		Thread.sleep(1000);
		
	}
	
	public void CloseSolicitacoes () throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@id='modal-certificate-own-order']/div/div/div/button/span")).click();
		Thread.sleep(1000);
	
	}
	
	public void UploadCSV () throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Upload de CSV para atualização de dados")).click();
		
	}
	
	public void CloseCSV () throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#modal-certificate-upload-csv > div.modal-lg.modal-dialog.modal-dialog-centered > div.modal-content-2 > div.modal-header.text-left > button.close > span")).click();
		
	}

	public void PowerView () throws InterruptedException {
		
		driver.findElement(By.xpath("//a/div/img[@src = '/images/logo']")).click();
		Thread.sleep(2000);
	}
	
	
}
