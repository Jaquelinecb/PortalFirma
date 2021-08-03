package DocumentosCancelados;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.WebElement;
import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;

public class CancelarDocumentoHP {
	WebDriver driver = DriverSetup.setupDriver();
	
	@BeforeTest
	public void starWebDriver() throws InterruptedException {
		driver.get(variablesGlobales.HOME_PAGE);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	
	@Test(priority=1)
	  public void cancelarDocumentoHappyPath() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Documento de Prueba.pdf");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(1000);

	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idCancelDocument")).click();
	    driver.findElement(By.id("signAction_updateDocument_document_reasonCancellation")).click();
	    driver.findElement(By.id("signAction_updateDocument_document_reasonCancellation")).sendKeys("El documento no es correcto, favor de validar");
	    driver.findElement(By.id("btnCancelar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	
	@Test(priority=2)
	  public void sinIngresarMotivoDeCancelacion() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("li > a > .selected")).click();
		driver.findElement(By.id("signAction_uploadDocument_uploadDoc")).sendKeys("C:\\Users\\cuaht\\.eclipse\\PortalFirma\\src\\test\\java\\Archivos\\Documento de Prueba.pdf");
		driver.findElement(By.id("iniciar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector("li:nth-child(3) .selected")).click();
	    Thread.sleep(1000);

	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idCancelDocument")).click();
	    driver.findElement(By.id("signAction_updateDocument_document_reasonCancellation")).click();
	    //driver.findElement(By.id("signAction_updateDocument_document_reasonCancellation")).sendKeys("El documento no es correcto, favor de validar");
	    driver.findElement(By.id("btnCancelar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	}
	@Test(priority=3)
	  public void ingresarMotivoDeCancelacionConCaracteresEspeciales() throws InterruptedException {
		driver.findElement(By.id("loginForm_user_login")).click();
		driver.findElement(By.id("loginForm_user_login")).sendKeys("Usuario1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("loginForm_user_password")).click();
		driver.findElement(By.id("loginForm_user_password")).sendKeys("12121212Qw.");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".tooltip")).click();
	    driver.findElement(By.id("idCancelDocument")).click();
	    driver.findElement(By.id("signAction_updateDocument_document_reasonCancellation")).click();
	    driver.findElement(By.id("signAction_updateDocument_document_reasonCancellation")).sendKeys("La información del contrato #3123 no es correcta. Favor de verificar la información");
	    driver.findElement(By.id("btnCancelar")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".ui-button-text")).click();
	    driver.findElement(By.cssSelector(".toggle")).click();
	    driver.findElement(By.cssSelector(".negative > .label")).click();
	}

@AfterTest
public void closeDriver() {
	driver.close();	
 }
}	