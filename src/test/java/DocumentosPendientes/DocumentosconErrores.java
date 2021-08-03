package DocumentosPendientes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.firmaPerfil4;
import navPages.loginPage;

public class DocumentosconErrores {
	WebDriver driver = DriverSetup.setupDriver();
	loginPage LoginPerfil4 = new loginPage(driver);
	firmaPerfil4 firma4 = new firmaPerfil4(driver);

	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
	}
	/*
	@Test(priority=1)
	  public void CargaMasivaDocumentosConErrores() throws InterruptedException {
		LoginPerfil4.login(variablesGlobales.USER_LOGIN_PERFIL_4);
		LoginPerfil4.password(variablesGlobales.PASSWORD_LOGIN_PERFIL_4);
		Thread.sleep(1000);
		 driver.findElement(By.cssSelector("li > a > .selected")).click();
		 Thread.sleep(2000);
	     
		 driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\DOCS CON ERROR\\10DocErrorHoja ImpresaDeNavegador.pdf");
		 driver.findElement(By.cssSelector(".addDocument > .label")).click();
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(2) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\DOCS CON ERROR\\9Documento 2.pdf");
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(2) .estilo > .label")).click();
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(3) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\DOCS CON ERROR\\8Documento 1.pdf");
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(3) .estilo > .label")).click();
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(4) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\DOCS CON ERROR\\7DocErrorDocConRecuadros.pdf");
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(4) .estilo > .label")).click();
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(5) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\DOCS CON ERROR\\6DocErrorReporte final.pdf");
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(5) .estilo > .label")).click();
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(6) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\DOCS CON ERROR\\5DocErrorFormatoSAT.pdf");
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(6) .estilo > .label")).click();
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(7) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\DOCS CON ERROR\\4. DocErrorSolicitudResidencia.pdf");
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(7) .estilo > .label")).click();
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(8) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\DOCS CON ERROR\\3DocErrorINE.pdf");
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(8) .estilo > .label")).click();
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(9) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\DOCS CON ERROR\\2DocErrorNavistar2.pdf");
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(9) .estilo > .label")).click();
		 driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(10) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\DOCS CON ERROR\\1DocErrorNavistar1.pdf");
		 		 
		 driver.findElement(By.id("iniciar")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector(".ui-button-text")).click();
		 driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
		 driver.findElement(By.cssSelector(".toggle")).click();
		 driver.findElement(By.linkText("Salir")).click();
	}
	*/
	
	@Test(priority=2)
	  public void FirmarDocumento1() throws InterruptedException {
		LoginPerfil4.login(variablesGlobales.USER_LOGIN_PERFIL_4);
		LoginPerfil4.password(variablesGlobales.PASSWORD_LOGIN_PERFIL_4);
		firma4.firma4(variablesGlobales.Clave_Llave_Privada);
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@title=\'Descargar documento \']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=3)
	  public void FirmarDocumento2() throws InterruptedException {
		LoginPerfil4.login(variablesGlobales.USER_LOGIN_PERFIL_4);
		LoginPerfil4.password(variablesGlobales.PASSWORD_LOGIN_PERFIL_4);
		firma4.firma4(variablesGlobales.Clave_Llave_Privada);
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@title=\'Descargar documento \'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=4)
	  public void FirmarDocumento3() throws InterruptedException {
		LoginPerfil4.login(variablesGlobales.USER_LOGIN_PERFIL_4);
		LoginPerfil4.password(variablesGlobales.PASSWORD_LOGIN_PERFIL_4);
		firma4.firma4(variablesGlobales.Clave_Llave_Privada);
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@title=\'Descargar documento \'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=5)
	  public void FirmarDocumento4() throws InterruptedException {
		LoginPerfil4.login(variablesGlobales.USER_LOGIN_PERFIL_4);
		LoginPerfil4.password(variablesGlobales.PASSWORD_LOGIN_PERFIL_4);
		firma4.firma4(variablesGlobales.Clave_Llave_Privada);
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@title=\'Descargar documento \'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=6)
	  public void FirmarDocumento5() throws InterruptedException {
		LoginPerfil4.login(variablesGlobales.USER_LOGIN_PERFIL_4);
		LoginPerfil4.password(variablesGlobales.PASSWORD_LOGIN_PERFIL_4);
		firma4.firma4(variablesGlobales.Clave_Llave_Privada);
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@title=\'Descargar documento \'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=7)
	  public void FirmarDocumento6() throws InterruptedException {
		LoginPerfil4.login(variablesGlobales.USER_LOGIN_PERFIL_4);
		LoginPerfil4.password(variablesGlobales.PASSWORD_LOGIN_PERFIL_4);
		firma4.firma4(variablesGlobales.Clave_Llave_Privada);
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@title=\'Descargar documento \'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=8)
	  public void FirmarDocumento7() throws InterruptedException {
		LoginPerfil4.login(variablesGlobales.USER_LOGIN_PERFIL_4);
		LoginPerfil4.password(variablesGlobales.PASSWORD_LOGIN_PERFIL_4);
		firma4.firma4(variablesGlobales.Clave_Llave_Privada);
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@title=\'Descargar documento \'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=9)
	  public void FirmarDocumento8() throws InterruptedException {
		LoginPerfil4.login(variablesGlobales.USER_LOGIN_PERFIL_4);
		LoginPerfil4.password(variablesGlobales.PASSWORD_LOGIN_PERFIL_4);
		firma4.firma4(variablesGlobales.Clave_Llave_Privada);
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@title=\'Descargar documento \'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=10)
	  public void FirmarDocumento9() throws InterruptedException {
		LoginPerfil4.login(variablesGlobales.USER_LOGIN_PERFIL_4);
		LoginPerfil4.password(variablesGlobales.PASSWORD_LOGIN_PERFIL_4);
		firma4.firma4(variablesGlobales.Clave_Llave_Privada);
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@title=\'Descargar documento \'])[9]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=11)
	  public void FirmarDocumento10() throws InterruptedException {
		LoginPerfil4.login(variablesGlobales.USER_LOGIN_PERFIL_4);
		LoginPerfil4.password(variablesGlobales.PASSWORD_LOGIN_PERFIL_4);
		firma4.firma4(variablesGlobales.Clave_Llave_Privada);
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@title=\'Descargar documento \'])[10]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();	
	 }
}	