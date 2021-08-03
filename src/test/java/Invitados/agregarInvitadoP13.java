//Casos de prueba:
//1. AgregarUsuarioInvitadoNuevo
//2. AgregarOtroDoc8
//3. FirmarDocInicidor8

//4. PrecertificarInvitado8
//5. FirmarDocUsuarioInvitado8 
//6. ValidarQueSubaDocPerfil8

package Invitados;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.addInvitado13;

public class agregarInvitadoP13 {
	WebDriver driver = DriverSetup.setupDriver();
	addInvitado13 login = new addInvitado13(driver);
	
	
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
		 
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("Invitado Perfil 13-1");//ACTUALIZAR USUARIO
		driver.findElement(By.id("idInvitedSignerEmail")).click();
	    driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.p13-1@yopmail.com");
	    //login.login(variablesGlobales.NOMBRE_NUEVO_INVITADO13);
	    //login.login(variablesGlobales.EMAIL_NUEVO_INVITADO13);
		
		driver.findElement(By.cssSelector("#btnSearchInv > #iniciar")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();  
	}
	
	@Test(priority=2)
	  public void AgregarOtroDoc13() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("Invitado Perfil 13-1");//ACTUALIZAR USUARIO
		driver.findElement(By.id("idInvitedSignerEmail")).click();
	    driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.p13-1@yopmail.com");
		
	    //login.login(variablesGlobales.NOMBRE_NUEVO_INVITADO13);
	    //login.login(variablesGlobales.EMAIL_NUEVO_INVITADO13);
		
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
	 public void FirmarDocumentosDeIniciadorYDespuesPerfil13() throws InterruptedException {
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
	  public void PrecertificarInvitado9() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p13@yopmail.com");//ACTUALIZAR USUARIO
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("121212ee12Qw.");
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.cssSelector(".rowPass:nth-child(6)")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    
	    //ACTUALIZAR LLAVES
	    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\LoginPrecertificacionBloqueo\\Javier.cer");
	    driver.findElement(By.xpath("(//div[@id='divajuste2']/input[2])[2]")).sendKeys("C:\\\\Users\\\\cuaht\\\\.eclipse\\\\PortalFirma\\\\src\\\\test\\\\java\\\\LoginPrecertificacionBloqueo\\\\Javier.key");
	    driver.findElement(By.id("privateKeyPassword")).sendKeys("12345678a");
	    driver.findElement(By.id("iniciar")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    Thread.sleep(1000);
	}
	
	@Test(enabled=false)
	//@Test(priority=5)
	  public void FirmarDocumentosDeUsuarioInvitado9() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p9-1@yopmail.com");//ACTUALIZAR USUARIO
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(enabled=false)
	//@Test(priority=6)
	  public void ValidarQueSubaDocPerfil13() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p13@yopmail.com");//ACTUALIZAR USUARIO
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
		driver.findElement(By.xpath("//img[@title='Firmar documento']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();	  
	}
	
	 @AfterTest
	 public void closeDriver() {
	  driver.close();	
	}
 }	