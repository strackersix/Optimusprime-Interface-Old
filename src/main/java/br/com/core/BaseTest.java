package br.com.core;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class BaseTest {
	@Rule
	public TestName testName = new TestName();
		
	@Before
	public void inicializa(){
	}
	
	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.driver;
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		Files.copy(arquivo, new File("target" + File.separator + "screenshot" +
				File.separator + testName.getMethodName() + ".jpg"));
			
	}
	
	public void assetTrue(boolean condition) {
		
		Assert.assertTrue(condition); 
	
	}
	
	
}


