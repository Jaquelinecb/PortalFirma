//Casos de prueba:
//1. AgregarUsuarioInvitadoNuevo
//2. AgregarOtroDoc9
//3. FirmarDocInicidor9

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
import navPages.addInvitado9;
public class agregarInvitadoP9 {
	WebDriver driver = DriverSetup.setupDriver();
	addInvitado9 login = new addInvitado9(driver);
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void AgregarUsuarioInvitadoP9Nuevo() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
	
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		
		//AGREGAR USUARIO INVITADO CON TIPO DE FIRMA: LLAVES EXTERNAS
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("Invitado Perfil 9-1");//ACTUALIZAR USUARIO
		driver.findElement(By.id("idInvitedSignerEmail")).click();
	    driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.p9-1@yopmail.com");	
		//login.login(variablesGlobales.NOMBRE_NUEVO_INVITADO9);
		//login.login(variablesGlobales.EMAIL_NUEVO_INVITADO9);
		
		driver.findElement(By.cssSelector("#btnSearchInv > #iniciar")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).click();
		driver.findElement(By.xpath("//div[@id=\'dialog\']/input")).sendKeys("3");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button:nth-child(2) > .ui-button-text")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("iniciar")).click();
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click(); 
	}
	@Test(priority=2)
	  public void AgregarOtroDoc9() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		
		//VOLVER A AGREGAR DOCUMENTOS A USUARIO INVITADO CON TIPO DE FIRMA: LLAVES EXTERNAS
		driver.findElement(By.id("idInvitedSignerName")).click();
		driver.findElement(By.id("idInvitedSignerName")).sendKeys("Invitado Perfil 9-1");//ACTUALIZAR USUARIO
	    driver.findElement(By.id("idInvitedSignerEmail")).click();
	    driver.findElement(By.id("idInvitedSignerEmail")).sendKeys("invitado.p9-1@yopmail.com");
		//login.login(variablesGlobales.NOMBRE_NUEVO_INVITADO9);
		//login.login(variablesGlobales.EMAIL_NUEVO_INVITADO9);
	    
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
	 public void FirmarDocumentosDeIniciadorYDespuesPerfil9() throws InterruptedException {
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
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p9-1@yopmail.com");//ACTUALIZAR USUARIO
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("idShowPassword")).click();
		driver.findElement(By.id("idPasswordOld")).click();
		driver.findElement(By.id("idPasswordOld")).sendKeys("zh5D9ry+0Asz"); //ActualizarContraseña
		driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
        driver.findElement(By.id("idPasswordVerify")).click();
		driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
		driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\certificado (1).cer");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
		driver.findElement(By.cssSelector(".negative > .label")).click();
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
		 Thread.sleep(1000);
		
	     driver.findElement(By.cssSelector("#keyFile input:nth-child(2)")).click();
		 driver.findElement(By.xpath("//input[@id='privkey_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Angelina.key");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("#certFile input:nth-child(2)")).click();
		 driver.findElement(By.xpath("//input[@id='certificate_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Angelina.cer");
		 Thread.sleep(2000);
		 driver.findElement(By.id("txtPassword")).click();
		 driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
		 driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector(".ui-button-text")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector(".toggle")).click();
		 driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=3)
	  public void ValidarQueSubaDocPerfil9() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("invitado.p9-1@yopmail.com");//ACTUALIZAR USUARIO
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
		
	    driver.findElement(By.cssSelector("#keyFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='privkey_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Angelina.key");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#certFile input:nth-child(2)")).click();
		driver.findElement(By.xpath("//input[@id='certificate_file']")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Angelina.cer");
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("12121212Qw.");
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