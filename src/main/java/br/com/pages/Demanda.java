package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.deploy.uitoolkit.impl.fx.Utils;

import br.com.core.BasePage;


public class Demanda extends BasePage {
			
	
	public void Url ( String Url ) {

		driver.get(Url);

	}
	
	public void MinhaConta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[2]")).click();
	
	}
		
	public void GestaoDemandas() {
		
		driver.findElement(By.xpath("//li/a/span[@class= 'fa fa-plus-square-o fa-fw color-gray-blue']")).click();
	
	}
		
	public void Adicionar() {
		
		driver.findElement(By.cssSelector("i.fa.fa-plus")).click();
		
	}
		
	public void UsuarioDemanda( String usuarioDemanda) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-select_user-container")));
		driver.findElement(By.id("select2-select_user-container")).click();
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(usuarioDemanda);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(Keys.ENTER);
		
	}
	
	public void TituloDemanda ( String tituloDemanda ) {
		
		driver.findElement(By.id("demand__title")).sendKeys(tituloDemanda);
			
	}
	
	public void TratadoDemanda ( String tratadoDemanda ) {
		
		driver.findElement(By.id("demand__description")).sendKeys(tratadoDemanda);
		
	}
	
	public void TipoDemanda( String bug ) {
		
		selecionarCombo(By.id("demand__type"), bug);
	
	}
	
	public void EspecificacaoFuncional() {

		driver.findElement(By.id("demand__functional_specification")).click();
			
	}
	
	public void Evidencia() {
		
		driver.findElement(By.cssSelector("h2.color-lilac-dark")).click();
		
	}
	
	public void EvidenciaText( String evidenciaText ) {
		
		driver.findElement(By.id("demand__evidence")).clear();
		driver.findElement(By.id("demand__evidence")).sendKeys(evidenciaText);
		
	}
	
	public void Observacao() {
		
		driver.findElement(By.xpath("//div[3]/section/div/a/h2")).click();
		
	}
	
	public void ObservacaoText ( String observacaoText ) {
		
		driver.findElement(By.id("demand__note")).clear();
		driver.findElement(By.id("demand__note")).sendKeys(observacaoText);
		driver.findElement(By.id("demand__note")).sendKeys(Keys.PAGE_DOWN);
		
	}
	
	public void AumentoReceita ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
		
	public void ReducaoCusto ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void CustoEvitado ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void ReducaoInvestimento ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
			
	}
	
	public void RequisitosLegaisFiscais ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void OutrosBeneficios ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void BeneficiosText ( String beneficiosText ) {
		
		driver.findElement(By.id("be-becklog_other_benefits_justification_field")).clear();
		driver.findElement(By.id("be-becklog_other_benefits_justification_field")).sendKeys(beneficiosText);
		
	}
	
	
	public void Cadastrar () throws InterruptedException {
		
		driver.findElement(By.cssSelector("button.btn.btn-success.pull-right.btn-with-loading.js-demand-save > span")).click();
		Thread.sleep(9000);
		
	}
	
	public void ConsultarDemanda ( String consultarTituloDemanda ) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@type='search']")).clear();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(consultarTituloDemanda);
		Thread.sleep(2000);
		
	}
		
	public String ValidaDemanda () {
		
		return driver.findElement(By.xpath("//table[@id='demandTable']/tbody/tr/td[6]")).getText();
		
	}
	
	public void CancelarDemanda () throws InterruptedException {
		
		driver.findElement(By.xpath("//tbody/tr/td[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section/div/a[@class = 'btn btn-danger btn-block btn-modal-detail btn-with-loading js-demand-action-cancel']")).click();
		Thread.sleep(10000);
		
	}
	
	
	
}
