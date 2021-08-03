//Casos de prueba:
//1. Subir documento
//2. Ingresar clave incorrecta
//3. Sin ingresar clave
//4. Sin ingresar correo
//5. Ingresar correo electronico incorrecto 
//6. Firma Happy Path

package DocumentosPendientes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
public class FirmaPerfil8 {
	WebDriver driver = DriverSetup.setupDriver();
	
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	
	@Test(priority=1)
	  public void FirmaPerfil8HP() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("flor@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		 
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    Thread.sleep(8000); //INGRESAR FIRMA BIOMETRICA
	    
	    driver.findElement(By.id("saveSignCaptureVerify")).click();
	    driver.findElement(By.id("firmanteName")).click();
	    driver.findElement(By.id("firmanteName")).sendKeys("FLOR DÍAZ LUNA");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button:nth-child(1)")).click();
	    //driver.findElement(By.xpath("(//button[@type=\'button\'])[6]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();    
	}
	
	
	@Test(priority=1)
	  public void sinIngresarEmail() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("flor@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		 
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    Thread.sleep(8000); //INGRESAR FIRMA BIOMETRICA
	    driver.findElement(By.id("idSendMail")).click();
	    driver.findElement(By.id("saveSignCaptureVerify")).click();
	    driver.findElement(By.id("firmanteName")).click();
	    driver.findElement(By.id("firmanteName")).sendKeys("FLOR DÍAZ LUNA");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button:nth-child(1)")).click();
	    //driver.findElement(By.xpath("(//button[@type=\'button\'])[6]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();    
	}
	@Test(priority=1)
	  public void ingresarEmailIncorrecto() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("flor@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		 
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Ley de nacionalización de bienes eclesiasticos.pdf");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//img[@title=\'Firmar documento\']")).click();
	    Thread.sleep(8000); //INGRESAR FIRMA BIOMETRICA
	    driver.findElement(By.id("idSendMail")).click();
	    driver.findElement(By.id("saveSignCaptureVerify")).click();
	    driver.findElement(By.id("firmanteName")).click();
	    driver.findElement(By.id("firmanteName")).sendKeys("FLOR DÍAZ LUNA");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button:nth-child(1)")).click();
	    //driver.findElement(By.xpath("(//button[@type=\'button\'])[6]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();    
	}
	
	@Test(priority=5)
	public void ingresarEmailInvalido() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("flor@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);   
		
		driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    
	    driver.findElement(By.id("idSendMail")).click();
	    
	    driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).click();
	    driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).sendKeys("correo.com");
	    
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	    
	}
	@Test(priority=6)
	public void firmarConEmailHP() throws InterruptedException {
	    
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("flor@yopmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);   
		
		driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("txtPass")).click();
	    driver.findElement(By.id("txtPass")).sendKeys("12121212Qw.");
	    
	    driver.findElement(By.id("idSendMail")).click();
	    
	    driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).click();
	    driver.findElement(By.id("signAction_updateDocument_employee_mailToSign")).sendKeys("jbastida@seguridata.com");
	    
	    driver.findElement(By.cssSelector("#btnFirmar > .label")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    Thread.sleep(2000);
	   
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@AfterTest
	public void closeDriver() {
		driver.close();	
	 }
	}