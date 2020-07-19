package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;


public class PublicarCard extends BasePage {
	

	public void Url ( String Url ) throws InterruptedException {

		driver.get(Url);

	}	
	
 // Publicação do Card via Link.	
	
	public void Publicar () throws InterruptedException {
			
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("be-post-button")));
		driver.findElement(By.id("be-post-button")).click();
		Thread.sleep(1000);
		
	}
	
	public void Link ( String link) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("link-card-link")));
		driver.findElement(By.id("link-card-link")).clear();
		driver.findElement(By.id("link-card-link")).sendKeys(link);
		
	}
		
	public void Carregar () throws InterruptedException {
		
		driver.findElement(By.id("be-modal-post-load-link")).click();
		Thread.sleep(2000);
		
	}
	
	public void Categoria ( String categoria ) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@id = 'link-card-title']")));
		Thread.sleep(1000);
		WebElement xpath = driver.findElement(By.xpath("//select[@id = 'be-modal-post-link-select']"));
		Select combo = new Select(xpath);
		combo.selectByVisibleText(categoria);
		
	}
	
	public void ComentarioPost (String comentarioPost) {
		
		driver.findElement(By.name("comment")).clear();
		driver.findElement(By.name("comment")).sendKeys(comentarioPost);
		
	}
	
	public void Grupo () throws InterruptedException {
		
		Thread.sleep(2000);
		selecionarCombo(By.id("be-modal-post-link-group"), "Colaboradores");
		
	}

	public void Comentario () throws InterruptedException {
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class = 'checkbox checkbox-success pull-right'])[1]")).click();
		
	}
	
	public void PublicarCard (){
		
		driver.findElement(By.id("card-post-button")).click();
		
	}
		
	
 // Publicação do Card via Link.	
	
	
	public void TextosArquivos () throws InterruptedException {
		
		driver.findElement(By.id("be-modal-tab-title-text")).click();
		Thread.sleep(1000);
		
	}
	
	public void CategoriaTextos ( String categoriaTextos ) {
		
		WebElement element = driver.findElement(By.xpath("//select[@id = 'be-modal-post-text-select']"));
		Select combo = new Select(element);
		combo.selectByVisibleText(categoriaTextos);
		
	}
		
	public void TituloTexto ( String tituloTexto ) {
		
		driver.findElement(By.id("text-card-title")).clear();
		driver.findElement(By.id("text-card-title")).sendKeys(tituloTexto);
		
	}
	
	public void Texto ( String texto ) {
		
		driver.switchTo().frame("text-card-editor_ifr");
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys(texto);
		driver.switchTo().defaultContent();
		
	}
	
	public void GrupoTelaTexto () {
		
		selecionarCombo(By.id("be-modal-post-text-group"), "Colaboradores");
	
	}
	
	
 // publicação do Card via Link YouTube.
	
	
	public void Video () throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@id='modal-tabs']/li[3]/a/span")).click();
		
	}
	
	public void LinkYoutube ( String linkyoutube ) throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("link-card-link")).clear();
		driver.findElement(By.id("link-card-link")).sendKeys(linkyoutube);
		
	}
	
	public void CategoriaYoutube () throws InterruptedException {
		
		Thread.sleep(2000);
		selecionarCombo(By.id("be-modal-post-link-select"), "Doc88 Informa");
		
	}
	
	public void ComentPost ( String comentPost ) {
		
		driver.findElement(By.name("comment")).clear();
		driver.findElement(By.name("comment")).sendKeys(comentPost);
		
	}
	
	public void GrupoYoutube () {
		
		selecionarCombo(By.id("be-modal-post-link-group"), "Colaboradores");
		
	}
	
	
 // Metodos para validação do Teste.
	
	public String ConfirmaLink() {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'white-panel fade in r1 c0']/div/div[2]/h1/a[1][text() = 'DOC88 - Institucional']")));
		return driver.findElement(By.xpath("//div[@class = 'white-panel fade in r1 c0']/div/div[2]/h1/a[1][text() = 'DOC88 - Institucional']")).getText();
											
	}
	
	public String ConfirmaVideoYoutube () {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'white-panel fade in r1 c0']/div/div[2]/h1/a[1][text() = 'Doc Talking #5 Testes Automatizados - 9 de abril de 2019']")));
		return driver.findElement(By.xpath("//div[@class = 'white-panel fade in r1 c0']/div/div[2]/h1/a[1][text() = 'Doc Talking #5 Testes Automatizados - 9 de abril de 2019']")).getText();
											
	}
	
	public String ConfirmaTextoArquivos () {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'white-panel fade in r1 c0']/div/div[2]/h1/a[1][text() = 'Quality Assurance']")));
		return driver.findElement(By.xpath("//div[@class = 'white-panel fade in r1 c0']/div/div[2]/h1/a[1][text() = 'Quality Assurance']")).getText();
	
	}
		
  // Pesquisar Card Link 
	
	public void PesquisarCard () {
		
		driver.findElement(By.xpath("//button/span/span[@class = 'fa fa-search color-orange']")).click();
		
	}
	
	public void TodasCategorias ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void TodosGrupos ( By by, String valor ) {
		
		WebElement element = driver.findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
		
	}
	
	public void PesquisarConteudo ( String pesquisarConteudo ) {
		
		driver.findElement(By.id("filter-content")).clear();
		driver.findElement(By.id("filter-content")).sendKeys(pesquisarConteudo);
				
	}
	
	public void Pesquisar () {
		
		driver.findElement(By.xpath("//div/span/button[@id = 'filter-submit']")).click();
		
	}
	
	
	// Validar Pesquisa Card link
	
	
	public String ValidaCardLink () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/h1/a[@href = 'https://www.doc88.com.br/institucional']")));
		return driver.findElement(By.xpath("//div/h1/a[@href = 'https://www.doc88.com.br/institucional']")).getText();
		
	}
	
	public String ValidaCardYoutube () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/h1/a[1])[1][text() = 'Doc Talking #5 Testes Automatizados - 9 de abril de 2019']")));
		return driver.findElement(By.xpath("(//div/h1/a[1])[1][text() = 'Doc Talking #5 Testes Automatizados - 9 de abril de 2019']")).getText();
		
	}
	
	public String ValidaCardTexto () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/h1/a[1])[1][text() = 'Quality Assurance']")));
		return driver.findElement(By.xpath("(//div/h1/a[1])[1][text() = 'Quality Assurance']")).getText();
		
	}
	
	public void ExcluirCard1 () throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class = 'white-panel fade in r1 c0']/div/div/span/span/button/a/i[@class = 'fa fa-trash']")).click();
		driver.findElement(By.xpath("//div/a/i[@class = 'glyphicon glyphicon-ok']")).click();
		Thread.sleep(1000);
		
	}
	
	public void ExcluirCard2 () throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class = 'white-panel fade in r1 c0']/div/div/span/span/button/a/i[@class = 'fa fa-trash']")).click();
		driver.findElement(By.xpath("//div/a/i[@class = 'glyphicon glyphicon-ok']")).click();
		Thread.sleep(1000);
		
	}
	
	public void ExcluirCard3 () throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class = 'white-panel fade in r1 c0']/div/div/span/span/button/a/i[@class = 'fa fa-trash']")).click();
		driver.findElement(By.xpath("//div/a/i[@class = 'glyphicon glyphicon-ok']")).click();
		Thread.sleep(1000);
		
	}
	
	public void RefreshNavigate () {
		
		driver.navigate().refresh();
				
	}
	
	public String ValidaExclusao () {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'white-panel fade in r1 c0']/div/div[2]/h1/a[1]")));
		return driver.findElement(By.xpath("//div[@class = 'white-panel fade in r1 c0']/div/div[2]/h1/a[1]")).getText();
		
	}
	
			
}
