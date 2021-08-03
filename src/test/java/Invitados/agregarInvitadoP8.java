/*
 * NOTAS IMPORTANTES
 * SE DEBEN ACTUALIZAR LOS DATOS DE USUARIO
 */

package Invitados;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.addInvitado8;
public class agregarInvitadoP8 {
	WebDriver driver = DriverSetup.setupDriver();
	addInvitado8 login = new addInvitado8(driver);
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void AgregarUsuarioInvitadoNuevo() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		 
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		
		
		//AGREGAR USUARIO INVITADO CON TIPO DE FIRMA: FIRMA AUTÓGRAFA BIOMÉTRICA
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("USUARIO INVITADO 8");
		driver.findElement(By.id("idInvitedSignerEmail")).click();
	    driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.p8@yopmail.com");
	    //login.login(variablesGlobales.NOMBRE_NUEVO_INVITADO8);
	  	//login.login(variablesGlobales.EMAIL_NUEVO_INVITADO8);
		
		
		driver.findElement(By.cssSelector("#btnSearchInv > #iniciar")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(5000);
		/*driver.findElement(By.id("iniciar")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		*/
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();  
		
	}
	
	
	@Test(priority=2)
	  public void AgregarOtroDoc8() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		
		
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("USUARIO INVITADO OCHO");//ACTUALIZAR DATOS
		driver.findElement(By.id("idInvitedSignerEmail")).click();
	    driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.p8@yopmail.com");
	    //login.login(variablesGlobales.NOMBRE_NUEVO_INVITADO8);
	    //login.login(variablesGlobales.EMAIL_NUEVO_INVITADO8);
	    
		
	    driver.findElement(By.cssSelector("#btnSearchInv > #iniciar")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
	    driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("iniciar")).click();
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();   
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 
	}
	@Test(priority=3)
	 public void FirmarDocumentosDeIniciadorYDespuesPerfil8() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
		driver.findElement(By.id("idShowPassword")).click();
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		    
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	
	@Test(enabled=false)
	//@Test(priority=4)
	  public void PrecertificarInvitado8() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p8@yopmail.com");//ACTUALIZAR USUARIO
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("12345678Qw.");//ACTUALIZAR POR CLAVE NUEVA
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.cssSelector(".rowPass:nth-child(6)")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    Thread.sleep(8000);
	    
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();   
	}
	
	
	@Test(priority=2)//SOLO CUANDO ESTA LA CONFIGURACIÓN DE VERIFICAR EL NOMBRE
	  public void IngresarNombreIncorrecto() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p8@yopmail.com");//ACTUALIZAR USUARIO
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("idSendMail")).click();
		driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).click();
		driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("saveSignCaptureVerify")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("firmanteName")).click();
		driver.findElement(By.id("firmanteName")).sendKeys("USUARIO INVITADO INCORRECTO");
		Thread.sleep(1000);
		 
		driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\'button\'])[6]")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//body[@id=\'body\']/div[4]/div/button/span")).click();
		Thread.sleep(1000);

	    
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=3)//SOLO CUANDO ESTA LA CONFIGURACIÓN DE VERIFICAR EL NOMBRE
	  public void IngresarFirmaBiometricaDiferentee() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p8@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("idSendMail")).click();
		driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).click();
		driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("saveSignCaptureVerify")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("firmanteName")).click();
		driver.findElement(By.id("firmanteName")).sendKeys("USUARIO INVITADO OCHO");//ACTUALIZAR NOMBRE
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=4)//SOLO CUANDO ESTA LA CONFIGURACIÓN DE VERIFICAR EL NOMBRE
	  public void FirmarDocumentoCorrectamente() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p8@yopmail.com");//ACTUALIZAR USUARIO
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("idSendMail")).click();
		driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).click();
		driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).sendKeys("jbastida@seguridata.com");
		driver.findElement(By.id("saveSignCaptureVerify")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.id("firmanteName")).click();
		driver.findElement(By.id("firmanteName")).sendKeys("USUARIO INVITADO OCHO");//ACTUALIZAR NOMBRE
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	
	@Test(priority=5)
	  public void ValidarQueSubaDocPerfil8() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p8@yopmail.com");//ACTUALIZAR USUARIO
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("iniciar")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();   
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("saveSignCaptureVerify")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("firmanteName")).click();
		driver.findElement(By.id("firmanteName")).sendKeys("USUARIO INVITADO OCHO");//ACTUALIZAR NOMBRE
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type=\'button\'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 
	}
	
	 @AfterTest
	  public void closeDriver() {
	  driver.close();	
	  }
	 }	