package br.com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;
import br.com.core.Parametros;

public class Historico_UsuarioExterno extends BasePage {

	public void Go() throws InterruptedException {

		Url(Parametros.UrlPowerView);
		MinhaConta();
		historico();
		DataInicial("Janeiro/2018");
		DataFinal("Maio/2019");
		GerarRelatorio();

		// Método para validar histórico.

		Assert.assertEquals("inside-pw-detail-pin-content", ValidarEconomiaPeriodo());
		Assert.assertEquals("inside-pw-detail-pin-content", ValidarEconomiaPercentual());
		Assert.assertEquals("inside-pw-detail-pin-content", ValidarEconomiaAcumulada());

		Icms();
		GerarRelatorio();

		// Método para validar histórico.

		Assert.assertEquals("inside-pw-detail-pin-content", ValidarEconomiaPeriodo());
		Assert.assertEquals("inside-pw-detail-pin-content", ValidarEconomiaPercentual());
		Assert.assertEquals("inside-pw-detail-pin-content", ValidarEconomiaAcumulada());

		DadosTabulados();

	}

	public void Url(String Url) throws InterruptedException {

		driver.get(Url);

	}

	public void PowerView() {

		driver.findElement(By.cssSelector("img")).click();

	}

	public void MinhaConta() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[1]")));
		driver.findElement(By.xpath("(//ul/li/a[@class = 'dropdown-toggle'])[1]")).click();

	}

	public void historico() {

		driver.findElement(By.xpath("//li/a/span[@class = 'fa fa-pie-chart fa-fw color-gray-blue']")).click();

	}

	public void SelecionarEmpresa(String selecionarEmpresa) throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.id("unit-search-input")).clear();
		driver.findElement(By.id("unit-search-input")).sendKeys(selecionarEmpresa);

	}

	public void Pesquisar() {

		driver.findElement(By.xpath("//button[@id='unit-search-button']/i")).click();

	}

	public void DataInicial(String dataInicial) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys(dataInicial);

	}

	public void DataFinal(String dataFinal) {

		driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys(dataFinal);

	}

	public void GerarRelatorio() throws InterruptedException {

		driver.findElement(By.id("hist-filter-button")).click();
		Thread.sleep(3000);

	}

	public void Icms() {

		driver.findElement(By.xpath("//form[@id='pw-form-filter']/div/div[3]/div/label/span")).click();

	}

	public void DadosTabulados() {

		driver.findElement(By.xpath("(//a[@id='be-modal-tab-title-text']/span)[3]")).click();

	}

	// Método para validar histórico.

	public String ValidarEconomiaPeriodo() {

		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[1]"))
				.getAttribute("class");

	}

	public String ValidarEconomiaPercentual() {

		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[2]"))
				.getAttribute("class");

	}

	public String ValidarEconomiaAcumulada() {

		return driver.findElement(By.xpath("(//div/div/div[@class = 'inside-pw-detail-pin-content'])[3]"))
				.getAttribute("class");

	}

	public String ValidaDadosTabulados() {

		return driver.findElement(By.xpath("//table[@id = 'historico-table']")).getAttribute("historico-table");

	}

}
