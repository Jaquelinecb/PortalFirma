
package SubirDocumentos;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
public class SubirArchivoHP {
	WebDriver driver = DriverSetup.setupDriver();
	
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void subirArchivoHappyPath() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		driver.findElement(By.cssSelector("#divajuste2 > input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@name=\'employees\']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("iniciar")).click();
		

		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();   
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=2)
	  public void subirArchivoPreviamenteFirmado() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click(); // ESTA LINEA ES POR SI NO HUBIERA DOCUMENTOS PENDIENTES
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();   
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=3)
	  public void ArchivoDiferenteaPDF() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Doc Pruebas.docx");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();   
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}

	@Test(priority=4)
	  public void cargaMasivaTresDocumentos() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\Archivos\\\\PIE DE PÁGINA.pdf");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".addDocument > .label")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(2) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\PIE DE PÁGINA.pdf");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(2) .estilo > .label")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(3) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Hoja de respuestas - Examen Ximena.pdf");
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnAceptar")).click(); 
	    
	    //Validar estas lineas*
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();   
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	
	@Test(priority=5)
	  public void cargaMasivaLimiteDocumentosYEliminar() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.cssSelector(".ui-button-text")).click();
	   
	    driver.findElement(By.cssSelector("li > a > .selected")).click();
	    Thread.sleep(2000);
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
		driver.findElement(By.cssSelector(".addDocument > .label")).click();
	    //driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(2) #signAction_uploadDocument_uploadDoc")).click();
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(2) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(2) .estilo > .label")).click();
	    //driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(3) #signAction_uploadDocument_uploadDoc")).click();
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(3) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(3) .estilo > .label")).click();
	    //driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(4) #signAction_uploadDocument_uploadDoc")).click();
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(4) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(4) .estilo > .label")).click();
	    //driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(5) #signAction_uploadDocument_uploadDoc")).click();}
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(5) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(5) .estilo > .label")).click();
	    //driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(6) #signAction_uploadDocument_uploadDoc")).click();
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(6) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(6) .estilo > .label")).click();
	    //driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(7) #signAction_uploadDocument_uploadDoc")).click();
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(7) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(7) .estilo > .label")).click();
	    //driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(8) #signAction_uploadDocument_uploadDoc")).click();
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(8) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(8) .estilo > .label")).click();
	    //driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(9) #signAction_uploadDocument_uploadDoc")).click();
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(9) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(9) .estilo > .label")).click();
	    //driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(10) #signAction_uploadDocument_uploadDoc")).click();
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(10) #signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\PIE DE PÁGINA.pdf");
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(10) .estilo > .label")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(10) .deleteDocument > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".tableFileDocuments:nth-child(9) .estilo > .label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.linkText("Salir")).click();
	}
	
	@Test(priority=5)
	  public void RLInicio() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.cssSelector(".ui-button-text")).click(); //PorSiNo
	   
	    driver.findElement(By.cssSelector("li > a > .selected")).click();
	    Thread.sleep(2000);
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\PIE DE PÁGINA.pdf");
		
		
		//SELECCIONAR DE LA LISTA, LA RUTA CON RL AL INICIO
		
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		
		//SELECCIONAR DOCUMENTO Y FIRMARLO
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    
	    //VALIDAR EN DOCUMENTOS CONCLUIDOS
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=5)
	  public void RLFinal() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.cssSelector(".ui-button-text")).click(); //PorSiNo
	   
	    driver.findElement(By.cssSelector("li > a > .selected")).click();
	    Thread.sleep(2000);
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\PIE DE PÁGINA.pdf");
		
		
		//SELECCIONAR DE LA LISTA, LA RUTA CON RL AL FINAL
		
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		
		//SELECCIONAR DOCUMENTO Y FIRMARLO
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	    
	    //VALIDAR EN DOCUMENTOS CONCLUIDOS
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=5)
	  public void sinRLsoloFirmanteJaq() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.cssSelector(".ui-button-text")).click(); //PorSiNo
	   
	    driver.findElement(By.cssSelector("li > a > .selected")).click();
	    Thread.sleep(2000);
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\PIE DE PÁGINA.pdf");
		
		
		//SELECCIONAR DE LA LISTA, LA RUTA SIN RL, SOLO JAQ
		
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		
		//SELECCIONAR DOCUMENTO Y FIRMARLO
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.linkText("Salir")).click();
	    
	    //INICIAR SESIÓN DEL FIRMANTE EN LA LISTA DE LA RUTA
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Jaqueline");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    
	    //VALIDAR EN DOCUMENTOS CONCLUIDOS
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		
	}
	
	@Test(priority=5)
	  public void RLalInicioyFirmanteJaq() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.cssSelector(".ui-button-text")).click(); //PorSiNo
	   
	    driver.findElement(By.cssSelector("li > a > .selected")).click();
	    Thread.sleep(2000);
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
		
		
		//SELECCIONAR DE LA LISTA, LA RUTA CON RL AL INICIO + JAQ
		
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		
		//SELECCIONAR DOCUMENTO Y FIRMARLO
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.linkText("Salir")).click();
	    
	    //INICIAR SESIÓN DEL FIRMANTE EN LA LISTA DE LA RUTA
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Jaqueline");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    
	    //VALIDAR EN DOCUMENTOS CONCLUIDOS QUE EL RL SE ENCUENTRE AL INICIO.
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		
	}
	@Test(priority=5)
	  public void RLalFinalyFirmanteJaq() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.cssSelector(".ui-button-text")).click(); //PorSiNo
	   
	    driver.findElement(By.cssSelector("li > a > .selected")).click();
	    Thread.sleep(2000);
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
		
		
		//SELECCIONAR DE LA LISTA, LA RUTA CON RL AL FINAL + JAQ
		
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		
		//SELECCIONAR DOCUMENTO Y FIRMARLO
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.linkText("Salir")).click();
	    
	    //INICIAR SESIÓN DEL FIRMANTE EN LA LISTA DE LA RUTA
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Jaqueline");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    
	    //VALIDAR EN DOCUMENTOS CONCLUIDOS QUE EL RL SE ENCUENTRE AL FINAL.
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();	
	}
	
	@Test(priority=5)
	  public void firmaConcurrente() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");//Usuario1-SQL
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.cssSelector(".ui-button-text")).click(); //PorSiNo
	   
	    driver.findElement(By.cssSelector("li > a > .selected")).click();
	    Thread.sleep(2000);
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\94_739-anterior.pdf");
		
		
		//SELECCIONAR LA OPCIÓN CONCURRENTE
	    driver.findElement(By.id("signConcurrente")).click();
		
		//FIRMANTE1
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("USUARIO2");
	    
	    
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    {
	      WebElement element = driver.findElement(By.id("btnSearch"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }

	    driver.findElement(By.name("jqg_gridSearchSigner_1")).click();
	    
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.id("popup_prompt")).sendKeys("1");
	    driver.findElement(By.id("popup_ok")).click();
	    {
	      WebElement element = driver.findElement(By.id("popup_ok"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.id("popup_ok")).click();  
	    
	    //FIRMANTE2
	    driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario3");
	    
	    
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    {
	      WebElement element = driver.findElement(By.id("btnSearch"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }

	    driver.findElement(By.name("jqg_gridSearchSigner_1")).click();
	    
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.id("popup_prompt")).sendKeys("1");
	    driver.findElement(By.id("popup_ok")).click();
	    {
	      WebElement element = driver.findElement(By.id("popup_ok"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.id("popup_ok")).click(); 
	    

		 //FIRMANTE3
		driver.findElement(By.id("idSignerName")).click();
	    driver.findElement(By.id("idSignerName")).sendKeys("Usuario4");
	    
	    
	    driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	    {
	      WebElement element = driver.findElement(By.id("btnSearch"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	
	    driver.findElement(By.name("jqg_gridSearchSigner_1")).click();
	    
	    driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	    driver.findElement(By.id("popup_prompt")).sendKeys("1");
	    driver.findElement(By.id("popup_ok")).click();
	    {
	      WebElement element = driver.findElement(By.id("popup_ok"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.id("popup_ok")).click(); 
	    
	    
	    
	    //OBSERVADOR
	  	driver.findElement(By.id("idSignerEmail")).click();
	  	driver.findElement(By.id("idSignerEmail")).sendKeys("m.carmen@yopmail.com");
	  	    
	  	    
	  	driver.findElement(By.cssSelector("#btnSearch > #iniciar")).click();
	  	 {
	  	   WebElement element = driver.findElement(By.id("btnSearch"));
	  	   Actions builder = new Actions(driver);
	  	   builder.moveToElement(element).perform();
	  	 }
	  	
	  	 driver.findElement(By.name("jqg_gridSearchSigner_1")).click();
	  	    
	  	 driver.findElement(By.cssSelector("#btnAdd > #iniciar")).click();
	  	 driver.findElement(By.id("popup_prompt")).sendKeys("2");
	  	 driver.findElement(By.id("popup_ok")).click();
	  	 {
	  	   WebElement element = driver.findElement(By.id("popup_ok"));
	  	   Actions builder = new Actions(driver);
	  	   builder.moveToElement(element).perform();
	  	 }
	  	 driver.findElement(By.id("popup_ok")).click(); 
		
	    //INICIAR FLUJO DE FIRMA
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		
		//SELECCIONAR DOCUMENTO Y FIRMARLO - FIRMA 1 (INICIADOR)
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.linkText("Salir")).click();
	    
	   //INICIAR SESIÓN CUALQUIER FIRMANTE - FIRMA 2
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario2");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw..");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();	
		
		//INICIAR SESIÓN CUALQUIER FIRMANTE - FIRMA 3
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario3");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw..");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
		
		//INICIAR SESIÓN OBSERVADOR - OBSERVADOR 1
		driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("m.carmen@yopmail.com");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//img[@title=\'Observar documento\']")).click(); //VALIDAR CUAL ES EL BOTÓN DE OBSERVAR
	    Thread.sleep(5000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	    
		
		//INICIAR SESIÓN CUALQUIER FIRMANTE - FIRMA 4
	    driver.findElement(By.id("loginForm_user_login")).click();
	    driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario4");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw..");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(4) .selected")).click();
	    Thread.sleep(6000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 
	}
	
	 @AfterTest
	  public void closeDriver() {
		 driver.close();	
	  }
	 }	