package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;
import br.com.core.DriverFactory;

public class Certificados extends BasePage {
	
	
	public void Url ( String Url ) {

		driver.get(Url);

	}	
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
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
		Thread.sleep(6000);
		driver.findElement(By.id("token-input-economic_groups_wizard")).sendKeys(Keys.ENTER);
			
	}
	
	public void AnoCertificado ( String anoCertificado ) {
		
		WebElement element = driver.findElement(By.xpath("(//select[@class = 'select_years select2-hidden-accessible'])[1]"));
		Select combo = new Select(element);
		combo.selectByVisibleText(anoCertificado);

	}
	
	public void Next1 () {
		
		driver.findElement(By.xpath("//div/div/button[@class = 'btn forward-button']")).click();	
		
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
	
	}
		
	public void Gerar () throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='modal-download-certificate-wizard']/div/div/div[2]/div/div[4]/div[2]/button")).click();
		
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
		Thread.sleep(7000);
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
		
		driver.findElement(By.xpath("//a/div/i[@class = 'fa fa-hourglass-start']")).click();
		Thread.sleep(2000);
	
	}
	
	public void Pesquisar ( String pesquisar ) throws InterruptedException {
		
		driver.findElement(By.xpath("(//div/label/input[@type = 'search'])[2]")).clear();
		driver.findElement(By.xpath("(//div/label/input[@type = 'search'])[2]")).sendKeys(pesquisar);
		Thread.sleep(1000);
	}
	
	public String ValidaPesquisar () {
		
		return driver.findElement(By.xpath("(//tbody/tr/td)[3]")).getText();
				
	}
			
	public void CloseEmissoes () throws InterruptedException {
		
		driver.findElement(By.cssSelector("#modal-historic-tracking > div.modal-lg.modal-dialog.modal-dialog-centered > div.modal-content-2 > div.modal-header.text-left > button.close > span")).click();
		Thread.sleep(2000);
		
	}
	
	
 // Solicitacoes em andamento de certificado físico.	
	
	
	public void Solicitacoes () {
		
		driver.findElement(By.xpath("//li/a/span[text() = 'Solicitações em andamento de certificado físico']")).click();
		
	}
	
	public String ValidaSolicitacoes () {
		
		return driver.findElement(By.xpath("(//div/div[@class = 'modal-body'])[9]")).getAttribute("class");
		
	}
 	
	public void CloseSolicitacoes () throws InterruptedException {
		
		Thread.sleep(1000);
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
		Thread.sleep(2000);
		
	}
	
	public void PowerView () {
		
		driver.findElement(By.xpath("//a/div/img[@src = '/images/logo']")).click();
	
	}
	
	public void StatusEmissoes ( String text ) {
		
		driver.findElement(By.xpath("//button[@data-id = 'historic-tracker-select-filter']")).click();
		WebElement ClicaItem = driver.findElement(By.xpath("//span[. = '"+text+"']"));
		Actions ClicaItemLista = new Actions(driver).click(ClicaItem);
		ClicaItemLista.build().perform();
		
	}
	
	public void Ajuda () throws InterruptedException {
		
		driver.findElement(By.xpath("//li/a/span[text() = 'Ajuda']")).click();
		Thread.sleep(1000);
	}
	
	public String ValidaAjuda () {
		
		return driver.findElement(By.xpath("(//div/div/div[@class = 'modal-header text-left'])[9]")).getAttribute("class");
		
	}
	
	public void Ok () {

		driver.findElement(By.xpath("//div/button[text() = 'Ok']")).click();
		
	}
	
    public void UploadArquivo() {

    	WebElement Upload =  driver.findElement(By.xpath("(//div/input[@type = 'file'])[2]"));
	    Upload.sendKeys("C:\\Users\\gabriel.souza\\Downloads\\GEE_Evitadas_2018_v2-1.csv");
	
	}
    
    public void Carregar () {
    	
    	WebDriverWait wait = new WebDriverWait(driver, 5);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/input[@class = 'btn btn-primary']")));
    	driver.findElement(By.xpath("//form/input[@class = 'btn btn-primary']")).click();
    	
    }
            
    public String ValidaImportacaoCSV () {
    	
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'swal2-confirm swal2-styled'][text() = 'OK']")));
    	return driver.findElement(By.xpath("//button[@class = 'swal2-confirm swal2-styled'][text() = 'OK']")).getAttribute("class");
    	
    }
    
    public void OkImportacao () {
    	
    	driver.findElement(By.xpath("//div/div/button[@class = 'swal2-confirm swal2-styled']")).click();
    	
    }
    
    public void ConsultaDados () {
    	
    	WebDriverWait wait = new WebDriverWait(driver, 5);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/a/span[text() = 'Consulta dos dados']")));
    	driver.findElement(By.xpath("//li/a/span[text() = 'Consulta dos dados']")).click();
    	
    }
    
    public void SelecionarAno ( String ano ) {
    	
    	WebDriverWait wait = new WebDriverWait(driver, 5);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//select[@id = 'certificates-select-year']")));
    	WebElement element = driver.findElement(By.xpath("//div//select[@id = 'certificates-select-year']"));
    	Select Select = new Select(element);
    	Select.selectByVisibleText(ano);
    	
    }
    
    public void Nome ( String nome ) {
    	
    	driver.findElement(By.xpath("//div/div/input[@id = 'certificates-filter-name']")).sendKeys(nome);
        	
    }
    
    public void Consultar () {
    	
    	driver.findElement(By.xpath("//div/div/button[@class = 'btn btn-default certificate-consultar']")).click();
    	
    }
    
    public String ValidaConsulta () {
    	
    	WebDriverWait wait = new WebDriverWait(driver, 5);
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//tbody/tr/td[text() = '355-FRIG.AVES-SUINOS TOLEDO']")));
    	return driver.findElement(By.xpath("//tbody/tr/td[text() = '355-FRIG.AVES-SUINOS TOLEDO']")).getText();
    	
    }
    
    public void Closed () {
    	
    	driver.findElement(By.xpath("(//div/button[@class = 'close'])[16]")).click();
    	
    }
    
    
    
    
    
    
    

}