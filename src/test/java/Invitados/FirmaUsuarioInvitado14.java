package Invitados;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
public class FirmaUsuarioInvitado14 {
	WebDriver driver = DriverSetup.setupDriver();
	
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	public void PrecertificarInvitado14() throws InterruptedException {
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("jbastida@seguridata.com");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("NgXKpelbyk56x&1");
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("iniciar")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		 }
	@Test (priority=2)
	public void FirmaFAB() throws InterruptedException {
	
		driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("jbastida@seguridata.com");//14-prueba@yopmail.com - SQL
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("jbastida.1Aa");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    //driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		 
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    
	    driver.findElement(By.id("fabBtn")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("#saveSignCapture > .label")).click();

	    Thread.sleep(3000);
	    
		 driver.findElement(By.cssSelector(".ui-button-text")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector(".toggle")).click();
		 driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test (priority=3)

	public void FirmaLlavesImportadas() throws InterruptedException {

	driver.findElement(By.id("loginForm_user_login")).click();
    driver.findElement(By.id("loginForm_user_login")).sendKeys("jbastida@seguridata.com");
    driver.findElement(By.id("btnLogin")).click();
    driver.findElement(By.id("loginForm_user_password")).click();
    driver.findElement(By.id("loginForm_user_password")).sendKeys("jbastida.1Aa");
    driver.findElement(By.id("btnLogin")).click();
    
    //driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	 
	driver.findElement(By.cssSelector("li > a > .selected")).click();
	driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
	driver.findElement(By.id("iniciar")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".ui-button-text")).click();
    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
    
    driver.findElement(By.cssSelector(".tooltip")).click();
    
    driver.findElement(By.id("importedBtn")).click();
    Thread.sleep(3000);
	 driver.findElement(By.id("txtPassword")).click();
	 driver.findElement(By.id("txtPassword")).sendKeys("12345678a");
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.cssSelector(".ui-button-text")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".toggle")).click();
	 driver.findElement(By.cssSelector(".negative > .label")).click();
   
}
	
	@Test (priority=3)
	public void sinIngresarClavePrivada() throws InterruptedException {
		
	
	}
	
	@Test (priority=3)
	public void ingresarClaveIncorrecta() throws InterruptedException {
	}
	
	@Test (priority=3)
	public void sinIngresarEmailImp() throws InterruptedException {
	}
	
	@Test (priority=3)
	public void ingresarEmailInvalidoImp() throws InterruptedException {
	}
	
	
	@Test (priority=3)
	public void enviaryFirmarConEmail() throws InterruptedException {
	}
	
	
	

//////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(priority=4)
	  public void FirmaLlavesExternasHP() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("jbastida.1Aa");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		 driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
		driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();  
		Thread.sleep(3000);
		 
		//driver.findElement(By.cssSelector(".tooltip")).click();
		    
		driver.findElement(By.id("filesystemBtn")).click();
		 
		driver.findElement(By.cssSelector("#keyFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='privkey_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.key");
			    
		driver.findElement(By.cssSelector("#certFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='certificate_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.cer");
			  
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212qw");
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		   
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		 
	}
	@Test(priority=5)
	  public void sinIngresarLlaves() throws InterruptedException {	
	
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("jbastida.1Aa");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
		
		driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.id("filesystemBtn")).click();
		//driver.findElement(By.cssSelector("#keyFile input:nth-child(2)")).click();
		//driver.findElement(By.xpath("//input[@id='privkey_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.key");
		//driver.findElement(By.cssSelector("#certFile input:nth-child(2)")).click();
		//driver.findElement(By.xpath("//input[@id='certificate_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.cer");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212qw");
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
}
	
	
	@Test(priority=5)
	  public void sinIngresarClaveDeLlavePrivada() throws InterruptedException {	
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("jbastida.1Aa");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.id("filesystemBtn")).click();
		driver.findElement(By.cssSelector("#keyFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='privkey_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.key");
		driver.findElement(By.cssSelector("#certFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='certificate_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.cer");
		//driver.findElement(By.id("txtPassword")).click();
		//driver.findElement(By.id("txtPassword")).sendKeys("12121212qw");
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
}
	
	
	@Test(priority=5)
	  public void ingresarClaveDeLlavePrivadaIncorrecta() throws InterruptedException {	
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("jbastida.1Aa");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.id("filesystemBtn")).click();
		driver.findElement(By.cssSelector("#keyFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='privkey_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.key");
		driver.findElement(By.cssSelector("#certFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='certificate_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.cer");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("141531617qQ.");
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
}
	
	
	@Test(priority=5)
	  public void ingresarArchivosDiferentesAcerYkey() throws InterruptedException {	
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("jbastida.1Aa");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.id("filesystemBtn")).click();
		driver.findElement(By.cssSelector("#keyFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='privkey_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\IDoc Pruebas.docx");
		driver.findElement(By.cssSelector("#certFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='certificate_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Doc Pruebas.docx");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212qw");
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
}
	
	
	@Test(priority=5)
	  public void ingresarArchivosDiferentesUsuarios() throws InterruptedException {	
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("jbastida.1Aa");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.id("filesystemBtn")).click();
		driver.findElement(By.cssSelector("#keyFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='privkey_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Importadas-CTF.key");
		driver.findElement(By.cssSelector("#certFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='certificate_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Angelina.cer");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212qw");
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
}
	
	
	@Test(priority=5)
	  public void ingresarArchivosOtraAC() throws InterruptedException {	
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("jbastida.1Aa");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.id("filesystemBtn")).click();
		driver.findElement(By.cssSelector("#keyFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='privkey_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Brenda.key");
		driver.findElement(By.cssSelector("#certFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='certificate_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\certificado (5).cer");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212qw");
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();

}
	
	//FALTA
	@Test(priority=5)
	  public void sinIngresarEmail() throws InterruptedException {	
}
	
	
	  @Test(priority=5)
	  public void ingresarEmailInvalido() throws InterruptedException {	
	  }
	
	  @Test(priority=5)
	  public void enviarEmailHappyPath() throws InterruptedException {	
	  }
	
	
	 @AfterTest
	  public void closeDriver() {
		 driver.close();	
	  }
	 }	