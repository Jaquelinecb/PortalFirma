package LoginPrecertificacionBloqueo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;

public class Login {
	WebDriver driver = DriverSetup.setupDriver();
	
	
		
	@BeforeTest
	public void starWebDriver() {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	@Test(priority=1)
	  public void IniciarSesionHP() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.xpath("//span[contains(.,\'Salir\')]")).click();
	}
	
	@Test(priority=2)
	//@Test (enabled = false)
	  public void IniciarSesionInvitadoHP() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("claudia.pruebas.vazquez@gmail.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Documento de Prueba.pdf");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();   
		
		driver.findElement(By.cssSelector(".tooltip")).click();
		
		Thread.sleep(1000);driver.findElement(By.id("fabBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("importedBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("filesystemBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.xpath("//span[contains(.,\'Salir\')]")).click();
	}
	
	@Test(priority=3)
	//@Test (enabled = false)
	  public void sinIngresarUsuario() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	}
	
	@Test(priority=4)
	//@Test (enabled = false)
	  public void IngresarUsuarioIncorrecto() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario no registrado");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	}
	
	@Test(priority=5)
	//@Test (enabled = false)
	  public void IngresarUsuarioRevocado() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("alejandro@seguridata.com"); // sql
		//driver.findElement(By.id("loginForm_user_login")).sendKeys("Julieta"); //ORACLE 
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	}
	
	@Test(priority=6)
	//@Test (enabled = false)
	public void IngresarUsuarioBloqueado() throws InterruptedException {
		
		
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("qapruebas859@gmail.com");//sql
		
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
		
	@Test(priority=7)
	//@Test (enabled = false)
	  public void ingresarClaveIncorrecta() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("1212121e32Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	}
	
	
	@Test(priority=8)
	//@Test (enabled = false)
	  public void sinIngresarClave() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-dialog-buttonset > button")).click();
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();	
	
	}
	
}	