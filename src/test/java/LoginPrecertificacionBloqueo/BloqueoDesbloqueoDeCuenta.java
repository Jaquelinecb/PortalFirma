package LoginPrecertificacionBloqueo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.usuarioDesbloquear;

public class BloqueoDesbloqueoDeCuenta {
	WebDriver driver = DriverSetup.setupDriver();
	usuarioDesbloquear bloquearUsuario = new usuarioDesbloquear(driver);
	
	
	@BeforeTest
	public void starWebDriver() {
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	
	@Test(priority=1)
	public void AgregarUsuarioEnPortalAgente() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE_AGENTE);
	    driver.findElement(By.id("loginAction_authType_user_login")).click();
	    driver.findElement(By.id("loginAction_authType_user_login")).sendKeys("agente@seguridata.com");
	    driver.findElement(By.cssSelector(".label")).click();
	    driver.findElement(By.id("loginAction_authType_user_password")).click();
	    driver.findElement(By.id("loginAction_authType_user_password")).sendKeys("12121212Qw.");
	    driver.findElement(By.cssSelector("#btnLogin > .label")).click();
	    driver.findElement(By.cssSelector("li:nth-child(1) > div span")).click();
	    driver.findElement(By.cssSelector("li:nth-child(1) li:nth-child(2) span")).click();
	  
	    driver.findElement(By.id("employeeAction_addEmployee_employee_name")).click();
	    driver.findElement(By.id("employeeAction_addEmployee_employee_name")).sendKeys("Usuario con Caracteres Especiales");//ACTUALIZAR LOS DATOS CADA QUE SE VUELVA A EJECUTAR UNA NUEVA PRUEBA
	    driver.findElement(By.id("employeeAction_addEmployee_employee_email")).click();
	    driver.findElement(By.id("employeeAction_addEmployee_employee_email")).sendKeys("prueba-caracteres-1@yopmail.com");//ACTUALIZAR LOS DATOS CADA QUE SE VUELVA A EJECUTAR UNA NUEVA PRUEBA
	    driver.findElement(By.id("employeeAction_addEmployee_employee_login")).click();
	    driver.findElement(By.id("employeeAction_addEmployee_employee_login")).sendKeys("Pruebáñ-1-123!\\\"#$%&/()=?¡|°¿´+}¨*~]}`{[^-.,;:_<>@\");");//ACTUALIZAR LOS DATOS CADA QUE SE VUELVA A EJECUTAR UNA NUEVA PRUEBA
	    
	    driver.findElement(By.id("blPreCert")).click();
	    driver.findElement(By.id("blAddDocument")).click();
	    driver.findElement(By.id("employeeAction_addEmployee_employee_pwd")).click();
	    driver.findElement(By.id("employeeAction_addEmployee_employee_pwd")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("employeeAction_addEmployee_employee_confirmPwd")).click();
	    driver.findElement(By.id("employeeAction_addEmployee_employee_confirmPwd")).sendKeys("12121212Qw.");
		Thread.sleep(2000); 
	    driver.findElement(By.id("iniciar")).click();
		Thread.sleep(3000); 
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.linkText("Salir")).click();

	 }
	
	@Test(priority=2)
	public void precertificarUsuario() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
	    bloquearUsuario.bloquearUsuario(variablesGlobales.USUARIO_A_BLOQUEAR);
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("idShowPassword")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("privateKeyPassword")).click();
	    driver.findElement(By.id("privateKeyPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("confirmKeyPassword")).click();
	    driver.findElement(By.id("confirmKeyPassword")).sendKeys("12121212Qw.");
		Thread.sleep(2000); 
	    driver.findElement(By.id("iniciar")).click();
		Thread.sleep(3000); 
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=3)
	public void BloquearCuenta() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		bloquearUsuario.bloquearUsuario(variablesGlobales.USUARIO_A_BLOQUEAR);
	    driver.findElement(By.id("btnLogin")).click();
	    
	    
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("ClaveIncorrecta 1");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	    
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("ClaveIncorrecta 2");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();    
	    
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("ClaveIncorrecta 3");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();	    
		Thread.sleep(2000); 
		/*
	    driver.findElement(By.id("btnUnlok")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnCancelar")).click();
	    Thread.sleep(2000);
	    */
	}
	
	
	@Test(priority=4)
	public void GenerarSolicitudDesbloqueo() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		bloquearUsuario.bloquearUsuario(variablesGlobales.USUARIO_A_BLOQUEAR);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnUnlok")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnCancelar")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=5)
	public void CancelarSolicitudDesbloqueo() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		bloquearUsuario.bloquearUsuario(variablesGlobales.USUARIO_A_BLOQUEAR);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnCancelar")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void VerCorreoEnYopmail() throws InterruptedException {
		driver.get(variablesGlobales.LIGA_YOPMAIL);
		driver.findElement(By.id("login")).click();
	    driver.findElement(By.id("login")).sendKeys("prueba-caracteres-1@yopmail.com"); // ACTUALIZAR CORREO ELECTRONICO EN CADA NUEVA PRUEBA
	    driver.findElement(By.cssSelector(".f36")).click();
	    Thread.sleep(8000);
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();	
	
	}
	
}