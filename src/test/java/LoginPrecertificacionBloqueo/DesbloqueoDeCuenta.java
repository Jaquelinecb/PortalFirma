package LoginPrecertificacionBloqueo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.claveTemporalDesbloqueo;
import navPages.usuarioDesbloquear;

public class DesbloqueoDeCuenta {
	WebDriver driver = DriverSetup.setupDriver();
	usuarioDesbloquear bloquearUsuario = new usuarioDesbloquear(driver);
	claveTemporalDesbloqueo claveDesbloqueo = new claveTemporalDesbloqueo(driver);
	
	
	@BeforeTest
	public void starWebDriver() {
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}

	
	/*
	@Test(priority=1)
	public void VerCorreoEnYopmail() throws InterruptedException {
		driver.get(variablesGlobales.LIGA_YOPMAIL);
		driver.findElement(By.id("login")).click();
	    driver.findElement(By.id("login")).sendKeys("usuario.bloqUear-dos@yopmail.com"); // ACTUALIZAR CORREO ELECTRONICO EN CADA NUEVA PRUEBA
	    driver.findElement(By.cssSelector(".f36")).click();
	    Thread.sleep(5000);
	}
	
	*/
	@Test(priority=1)
	public void SinIngresarClaves() throws InterruptedException {
		driver.get(variablesGlobales.LIGA_DESBLOQUEO);//CAMBIAR ESTE VALOR EN ARCHIVO variablesGlobales
	    driver.findElement(By.id("idShowPass")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPasswordVerify")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnVerifyUnlock")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void IngresarClaveTemporalIncorrecta() throws InterruptedException {
		driver.get(variablesGlobales.LIGA_DESBLOQUEO);
	    driver.findElement(By.id("idShowPass")).click();
	    driver.findElement(By.id("idPasswordOld")).click();
	    driver.findElement(By.id("idPasswordOld")).sendKeys("CLAVE-INCORRECTA");//NO ACTUALIZAR. CLAVE INCORRECTA
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnVerifyUnlock")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void IngresarClavesNuevasDiferentes() throws InterruptedException {
		driver.get(variablesGlobales.LIGA_DESBLOQUEO);
	    driver.findElement(By.id("idShowPass")).click();
	    claveDesbloqueo.claveDesbloqueo(variablesGlobales.CLAVE_DESBLOQUEO);
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.123");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.456");
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnVerifyUnlock")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void IngresarClavesNuevasSinParametrosMinimos() throws InterruptedException {
		driver.get(variablesGlobales.LIGA_DESBLOQUEO);
	    driver.findElement(By.id("idShowPass")).click();
	    claveDesbloqueo.claveDesbloqueo(variablesGlobales.CLAVE_DESBLOQUEO);
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212qw");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212qw");
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnVerifyUnlock")).click();
		Thread.sleep(3000); 
	}
	
	@Test(priority=5)
	public void DesbloquearCuentaHappyPath() throws InterruptedException {
		driver.get(variablesGlobales.LIGA_DESBLOQUEO);
	    driver.findElement(By.id("idShowPass")).click();
	    claveDesbloqueo.claveDesbloqueo(variablesGlobales.CLAVE_DESBLOQUEO);
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnVerifyUnlock")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("btnCancelar")).click();
	    Thread.sleep(3000);
	}
	
	@Test(priority=6)
	public void IngresarClavesNuevasDentroDelHistorial() throws InterruptedException {
		driver.get(variablesGlobales.LIGA_DESBLOQUEO);
	    driver.findElement(By.id("idShowPass")).click();
	    claveDesbloqueo.claveDesbloqueo(variablesGlobales.CLAVE_DESBLOQUEO);
	    driver.findElement(By.id("idPassword")).click();
	    driver.findElement(By.id("idPassword")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("idPasswordVerify")).click();
	    driver.findElement(By.id("idPasswordVerify")).sendKeys("12121212Qw.");
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnVerifyUnlock")).click();
		Thread.sleep(3000); 
	}
	
	@Test(priority=7)
	public void iniciarSesionDespuesDesbloquear() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		bloquearUsuario.bloquearUsuario(variablesGlobales.USUARIO_A_BLOQUEAR);
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.id("loginForm_user_password")).click();
	    driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
	    driver.findElement(By.id("btnLogin")).click();
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.xpath("//span[contains(.,\'Salir\')]")).click();
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();	
	
	}
	
}	











